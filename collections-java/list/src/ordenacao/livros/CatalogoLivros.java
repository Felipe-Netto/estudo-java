package ordenacao.livros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoLivros {
    
    List<Livro> livrosList;

    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        livrosList.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosIntervaloAno = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
                    livrosIntervaloAno.add(l);
                }
            }
        }
        return livrosIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro primeiroTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    primeiroTitulo = l;
                    break;
                }
            }
        }
        return primeiroTitulo;
    }

    public List<Livro> ordenarPorTitulo(){
        List<Livro> livrosPorTitulo = new ArrayList<>(livrosList);
        Collections.sort(livrosPorTitulo);
        return livrosPorTitulo;
    }

    public List<Livro> ordenarPorAutor(){
        List<Livro> livrosPorAutor = new ArrayList<>(livrosList);
        Collections.sort(livrosPorAutor, new ComparatorPorAutor());
        return livrosPorAutor;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 2", "Felipe Netto", 2002);
        catalogoLivros.adicionarLivro("Livro 4", "Felipe Netto", 2005);
        catalogoLivros.adicionarLivro("Livro 6", "Suzan Keitty", 2000);
        catalogoLivros.adicionarLivro("Livro 3", "Natalia Netto", 1997);
        catalogoLivros.adicionarLivro("Livro 2", "Karin Netto", 1979);
        catalogoLivros.adicionarLivro("Livro 1", "Carlo Netto", 1972);

        System.out.println(catalogoLivros.pesquisarPorAutor("Felipe Netto"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 3"));
        System.out.println(catalogoLivros.pesquisarIntervaloAno(2000, 2005));

        // System.out.println("Livros ordenados por titulo:");
        // System.out.println(catalogoLivros.ordenarPorTitulo());

        System.out.println("Livros ordenados por autor:");
        System.out.println(catalogoLivros.ordenarPorAutor());

    }

}
