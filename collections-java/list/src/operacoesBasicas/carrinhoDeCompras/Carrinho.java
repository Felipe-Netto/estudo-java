package operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtoCarrinho;

    public Carrinho(){
        this.produtoCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        produtoCarrinho.add(new Produto(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Produto> produtosParaRemover= new ArrayList<>();
        for(Produto p : produtoCarrinho){
            if(p.getNome().equalsIgnoreCase(nome)){
            produtosParaRemover.add(p);
            }
        }
        produtoCarrinho.removeAll(produtosParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Produto p : produtoCarrinho){
            double totalProduto = p.getPreco() * p.getQuantidade();
            valorTotal += totalProduto;
        }
        return valorTotal;
    }

    public void exibirItens(){
        for(Produto p : produtoCarrinho){
            System.out.println("Nome: " + p.getNome() + 
                            " - Preço: " + p.getPreco() + 
                            " - Quantidade: " + p.getQuantidade());
        }
    }

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        System.out.println(carrinho.calcularValorTotal());

        carrinho.adicionarItem("Iphone", 5000.99, 3);
        carrinho.adicionarItem("Macbook AIR PRO", 15000.35, 1);
        carrinho.adicionarItem("TV Samsung 60 polegadas", 5990.90, 2);
        carrinho.adicionarItem("Teclado mecânico Redragon", 200.50, 1);

        carrinho.removerItem("Iphone");
        carrinho.exibirItens();

        System.out.println("Total: R$" + carrinho.calcularValorTotal());

    }
}
