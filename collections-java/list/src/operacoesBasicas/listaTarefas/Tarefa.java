package operacoesBasicas.listaTarefas;

public class Tarefa {
    
    // atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getTarefa() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

}
