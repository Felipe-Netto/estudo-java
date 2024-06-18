package Pesquisa.ListaTarefas;

public class Tarefa {
    private String descricao;
    private boolean tarefaConcluida = false;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean getTarefaConcluida(){
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida){
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

    public String toString(){
        return "{Descrição: " + descricao + " - Concluida? " + tarefaConcluida;
    }
}
