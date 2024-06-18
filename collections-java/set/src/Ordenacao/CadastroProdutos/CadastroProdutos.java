package Ordenacao.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    // Utilizando Comparable
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet); // TreeSet permite a organização
        return produtoPorNome;
    }

    // Utilizando Comparator
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(123456789, "Iphone 15", 6999.99, 10);
        cadastroProdutos.adicionarProduto(987654321, "Samsung S24 plus", 4990.90, 14);
        cadastroProdutos.adicionarProduto(123459876, "Smart TV Samsung 60 pol", 8990.99, 4);
        cadastroProdutos.adicionarProduto(987651234, "Computador r5 5600 RTX 3060 12gb 16gb RAM", 5990.90, 1);
        cadastroProdutos.adicionarProduto(543216789, "Headset Redragon Lamia", 299.90, 20);

        System.out.println("Exibindo produtos por nome");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("\n");

        System.out.println("Exibindo produtos por preço");
        System.out.println(cadastroProdutos.exibirPorPreco());
        System.out.println("\n");

    }
}
