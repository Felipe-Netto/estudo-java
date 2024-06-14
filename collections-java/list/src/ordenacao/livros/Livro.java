package ordenacao.livros;
import java.util.Comparator;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public int compareTo(Livro l) {
        return this.titulo.compareTo(l.getTitulo());
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }

    public String toString() {
        return "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nAno de publicação: " + anoDePublicacao + "\n";
    }

}

class ComparatorPorAutor implements Comparator<Livro>{
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}
