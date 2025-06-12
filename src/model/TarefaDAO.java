
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAO {
     private Connection conectar() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:tarefas.db");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public TarefaDAO() {
        try (Connection conn = conectar()) {
            String sql = "CREATE TABLE IF NOT EXISTS tarefa (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "titulo TEXT NOT NULL, " +
                    "descricao TEXT, " +
                    "prioridade TEXT)";
            conn.createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // CREATE
    public boolean inserir(Tarefa tarefa) {
        String sql = "INSERT INTO tarefa (titulo, descricao, prioridade) VALUES (?, ?, ?)";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tarefa.getTitulo());
            stmt.setString(2, tarefa.getDescricao());
            stmt.setString(3, tarefa.getPrioridade());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // READ (listar todos)
    public List<Tarefa> listar() {
        List<Tarefa> lista = new ArrayList<>();
        String sql = "SELECT * FROM tarefa";
        try (Connection conn = conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Tarefa t = new Tarefa(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("descricao"),
                        rs.getString("prioridade")
                );
                lista.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // DELETE
    public boolean excluir(int id) {
        String sql = "DELETE FROM tarefa WHERE id = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
