package pesquisa.livros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
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
