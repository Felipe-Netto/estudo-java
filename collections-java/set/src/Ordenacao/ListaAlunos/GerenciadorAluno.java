package Ordenacao.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
    Set<Aluno> alunoSet;

    public GerenciadorAluno(){
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno removerPorMatricula = null;
        if(!alunoSet.isEmpty()){
            for(Aluno a : alunoSet){
                if(a.getMatricula() == matricula){
                    removerPorMatricula = a;
                }
            }
        }else{
            throw new RuntimeException("A collection está vazia!");
        }
        alunoSet.remove(removerPorMatricula);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();

        gerenciadorAluno.adicionarAluno("Felipe", 123456789, 10);
        gerenciadorAluno.adicionarAluno("Suzan", 987654321, 6);
        gerenciadorAluno.adicionarAluno("Natalia", 123459876, 7);
        gerenciadorAluno.adicionarAluno("Karin", 987651234, 8);
        gerenciadorAluno.adicionarAluno("Carlo", 543216789, 9);
        
        gerenciadorAluno.removerAluno(987654321);

        System.out.println("Exibindo alunos por nome");
        System.out.println(gerenciadorAluno.exibirAlunosPorNome());

        System.out.println("\nExibindo alunos por nota");
        System.out.println(gerenciadorAluno.exibirAlunosPorNota());
        
        System.out.println("\nExibindo alunos");
        gerenciadorAluno.exibirAlunos();


    }
}
