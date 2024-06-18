package Pesquisa.EstoqueProdutos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Estoque {
    final private Map<Long, Produto> estoqueProdutosMap;

    public Estoque() {
        estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double total = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                total += p.getPreco() * p.getQuantidade();
            }
        }else{
            throw new RuntimeException("A collection map está vazia!");
        }
        return total;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorValor = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorValor){
                    maiorValor = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }else{
            throw new RuntimeException("A collection map está vazia!");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorValor = obterProdutoMaisCaro().getPreco();
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorValor){
                    menorValor = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }else{
            throw new RuntimeException("A collection map esta vazia!");
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotal = null;
        double valorMaior = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if((p.getPreco() * p.getQuantidade()) > valorMaior){
                    valorMaior = (p.getPreco() * p.getQuantidade());
                    produtoMaiorQuantidadeValorTotal = p;
                }
            }
        }else{
            throw new RuntimeException("A collection map esta vazia!");
        }
        return produtoMaiorQuantidadeValorTotal;
    }

    public static void main(String[] args) {
        Estoque estoqueProdutos = new Estoque();

        estoqueProdutos.adicionarProduto(123456789, "prod 1", 5, 12.5);
        estoqueProdutos.adicionarProduto(987654321, "prod 2", 3, 23.90);
        estoqueProdutos.adicionarProduto(543219876, "prod 3", 8, 12.90);
        estoqueProdutos.adicionarProduto(543216789, "prod 4", 4, 5.50);
        estoqueProdutos.adicionarProduto(987612345, "prod 5", 2, 32.90);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total: " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("produto que está em maior quantidade no estoque, considerando " +
                "\no valor total de cada produto: " +
                estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
