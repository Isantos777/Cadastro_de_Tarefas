Objetivo:
Praticar o uso de JFrame com layouts organizados (como BorderLayout, FlowLayout,
GridLayout, etc), orientação a objetos e acesso a banco de dados, criando um aplicativo
desktop.

ETAPA 1 – Estrutura do Projeto
Crie a seguinte estrutura:
/ProjetoTarefa/
│
├── Tarefa.java ← Classe modelo (POJO)
├── TarefaDAO.java ← Classe de acesso ao banco
└── TarefaForm.java ← Tela principal com JFrame
Dica: Use uma IDE como NetBeans. Crie o projeto como Aplicação Java (sem Maven).

ETAPA 2 – Interface Gráfica (GUI)
Conceitos abordados: layouts, componentes Swing, organização visual.
1. Crie a classe TarefaForm que herda de JFrame.
2. Adicione os campos:
o JTextField para título e descrição.
o JComboBox para prioridade.
o JList para exibir tarefas.

3. Organize os elementos com layouts, como por exemplo:
o Use GridLayout ou GridBagLayout para o formulário.
o Use FlowLayout para os botões.
o Use BorderLayout para distribuir as seções (formulário no NORTH, lista
no CENTER, botões no SOUTH).

4. Teste o layout com dados simulados antes de integrar com banco.

ETAPA 3 – Banco de Dados
Conceitos abordados: SQLite, PreparedStatement, conexão, SQL.
1. Crie o banco (SQLite).
2. Crie a classe TarefaDAO:
o Método inserir(Tarefa tarefa)
o Método listar()
o Método excluir(int id)
3. Faça a conexão

ETAPA 4 – Classe Modelo
1. Crie a classe Tarefa.java com:
o Atributos: id, titulo, descricao, prioridade.
o Getters e setters.

ETAPA 5 – Integração Interface + DAO
1. No TarefaForm, instancie TarefaDAO.
2. No botão Salvar:
o Pegue os dados dos campos.
o Crie objeto Tarefa.

o Use dao.inserir() e atualize a lista.

3. No botão Excluir:
o Pegue a tarefa selecionada da lista.
o Use dao.excluir() e atualize a lista.
4. Crie método carregarTarefas() para popular a lista com dao.listar().

ETAPA 6 – Testes e Aprimoramentos
• Testar a inserção, listagem e exclusão.
• Verificar se a tela está organizada.
• Propor pequenas melhorias:
o Mensagem de sucesso ou erro.
o Limpar os campos após salvar.

Distribuição da Atividade
1 Estrutura do projeto + Classe Tarefa
2 Construção da interface gráfica com layout
3 Banco de dados e classe TarefaDAO
4 Integração GUI + DAO + testes
5 Revisão + Aprimoramentos + Entrega do exercício
