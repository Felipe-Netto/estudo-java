package ordenacao.ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoaList = new OrdenacaoPessoas();

        pessoaList.adicionarPessoa("Carlo", 51, 1.72);
        pessoaList.adicionarPessoa("Felipe", 21, 1.83);
        pessoaList.adicionarPessoa("Suzan", 24, 1.55);
        pessoaList.adicionarPessoa("Natalia", 26, 1.64);
        pessoaList.adicionarPessoa("Karin", 44, 1.63);
        
        System.out.println("Pessoas ordenadas por idade");
        System.out.println(pessoaList.ordenarPorIdade());
        System.out.println("\n");
        System.out.println("Pessoas ordenadas por altura");
        System.out.println(pessoaList.ordenarPorAltura());
    }
}
