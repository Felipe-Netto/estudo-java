package Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatoSet;

    public AgendaContatos(){
        contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for(Contato c : contatoSet){
                if(c.getNome().startsWith(nome)){
                    contatoPorNome.add(c);
                }
            }
        }else{
            throw new RuntimeException("A collection está vazia!");
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        if(!contatoSet.isEmpty()){
            for(Contato c : contatoSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(numero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }else{
            throw new RuntimeException("A collection está vazia!");
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Felipe Netto", 111111111);
        agendaContatos.adicionarContato("Felipe Guerrera", 222222222);
        agendaContatos.adicionarContato("Suzan Orteiro", 333333333);
        agendaContatos.adicionarContato("Natalia Netto", 444444444);

        System.out.println("Pesquisando por nome");
        System.out.println(agendaContatos.pesquisarPorNome("Felipe"));

        System.out.println("\nAtualizando número");
        System.out.println(agendaContatos.atualizarNumeroContato("Felipe Netto", 123456789));

        System.out.println("\nExibindo contatos");
        agendaContatos.exibirContatos();
    }
}
