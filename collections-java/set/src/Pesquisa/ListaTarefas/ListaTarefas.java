package Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefasSet;

    public ListaTarefas(){
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                }
            }
        }else{
            throw new RuntimeException("A collection está vazia!");
        }
        tarefasSet.remove(tarefaParaRemover);
        System.out.println("Tarefa removida: " + tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getTarefaConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }else{
            throw new RuntimeException("A collection está vazia!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(!t.getTarefaConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }else{
            throw new RuntimeException("A collection está vazia!");
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setTarefaConcluida(true);
                }
            }
        }else{
            throw new RuntimeException("A collection está vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setTarefaConcluida(false);
                }
            }
        }else{
            throw new RuntimeException("A collection está vazia!");
        }
    }

    public void limparListaTarefas(){
        tarefasSet.removeAll(tarefasSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar a louça");
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Dar banho no cachorro");
        listaTarefas.adicionarTarefa("Descansar");

        listaTarefas.exibirTarefas();
        System.out.println("Número de tarefas na lista: " + listaTarefas.contarTarefas());
        
        System.out.println("\nMarcando tarefa como concluida");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Descansar");

        System.out.println("\nRetornando tarefas concluídas");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println("\nRetornando tarefas pendentes");
        System.out.println(listaTarefas.obterTarefasPendentes());

        System.out.println("\nRemovendo uma tarefa");
        listaTarefas.removerTarefa("Lavar a louça");

        System.out.println("\nMarcando tarefa como pendente");
        listaTarefas.marcarTarefaPendente("Descansar");
        
        System.out.println("\nTarefas:");
        listaTarefas.exibirTarefas();

        System.out.println("\nLimpando lista de tarefas");
        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();

    
    }
}
