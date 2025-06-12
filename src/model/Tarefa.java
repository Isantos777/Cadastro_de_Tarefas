
package model;


public class Tarefa {
     private int id;
    private String titulo;
    private String descricao;
    private String prioridade;

    // Construtor vazio - NÃO lança exceção
    public Tarefa() {
    }

    // Construtor com parâmetros
    public Tarefa(int id, String titulo, String descricao, String prioridade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

}
