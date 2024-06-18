package OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    final private Map<String, Integer> agendaContatos;

    public AgendaContatos(){
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatos.isEmpty()){
            if(agendaContatos.containsKey(nome)){
                agendaContatos.remove(nome);
            }else{
                throw new RuntimeException("Contato não encontrado!");
            }
        }else{
            throw new RuntimeException("A collection map está vazia!");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome;
        if(!agendaContatos.isEmpty()){
            if(agendaContatos.containsKey(nome)){
                numeroPorNome = agendaContatos.get(nome);
            }else{
                throw new RuntimeException("Contato não encontrado!");
            }
        }else{
            throw new RuntimeException("A collection map está vazia!");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Felipe", 123456789);
        // o map substitui o valor antigo pelo novo valor quando possuem a mesma key
        agendaContatos.adicionarContato("Felipe", 543219876);
        agendaContatos.adicionarContato("Suzan", 987654321);
        agendaContatos.adicionarContato("Natalia", 123459876);
        agendaContatos.adicionarContato("Karin", 987612345);
        agendaContatos.adicionarContato("Carlo", 543216789);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Natalia");

        agendaContatos.exibirContatos();

        System.out.println("Contato encontrado: " + agendaContatos.pesquisarPorNome("Felipe"));

    }
}
