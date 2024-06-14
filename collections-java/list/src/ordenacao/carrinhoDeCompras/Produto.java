package ordenacao.carrinhoDeCompras;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }
    
    public String toString() {
        return "Produto: " + nome +  " - Preco: " + preco + " - Quantidade: " + quantidade + "\n";
    }

    @Override
    public int compareTo(Produto p) {
        return Double.compare(preco, p.preco);
    }
    
}
