package operacoesBasicas.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        // criando um novo array, pois pode acontecer de ter tarefas repetidas no array original
        // logo em seguida iteramos o array original, e se t for igual a algum elemento do array, ele é adicionado no array tarefaParaRemover
        // depois de adicionar todas as tarefas para remover, utilizamos o removeALll(tarefaParaRemover) para remover todas as tarefas com essa descrição

        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getTarefa().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 1");
        // listaTarefa.removerTarefa("Tarefa 1");

        System.out.println("O número total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }

}
