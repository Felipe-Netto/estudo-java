package Ordenacao.LivrariaOnline;

import Ordenacao.AgendaEventos.Evento;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String isbn, String titulo, String autor, double preco) {
        livrariaMap.put(isbn, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        if(!livrariaMap.isEmpty()){
            for(Map.Entry<String, Livro> livro : livrariaMap.entrySet()){
                if(livro.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    chavesRemover.add(livro.getKey());
                }
            }
            for(String chave : chavesRemover){
                livrariaMap.remove(chave);
            }
        }else{
            throw new RuntimeException("O map está vazio!");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaMap.entrySet());

        livrosParaOrdenarPorPreco.sort(new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String,Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrariaMap.entrySet());

        livrosParaOrdenarPorAutor.sort(new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivroPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if(entry.getValue().getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.put(entry.getKey(), entry.getValue());
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivrosMaisCaros() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double maiorValor = Double.MIN_VALUE;
        if(!livrariaMap.isEmpty()){
            for(Livro l : livrariaMap.values()){
                if(l.getPreco() > maiorValor){
                    maiorValor = l.getPreco();
                }
            }
        }else{
            throw new RuntimeException("O map esta vazio!");
        }

        for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if(entry.getValue().getPreco() == maiorValor) {
                Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    public List<Livro> obterLivrosMaisBaratos(){
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double menorValor = Double.MAX_VALUE;
        for(Livro l : livrariaMap.values()){
            if(l.getPreco() < menorValor){
                menorValor = l.getPreco();
            }
        }

        for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if(entry.getValue().getPreco() == menorValor){
                Livro livroMaisBarato = livrariaMap.get(entry.getKey());
                livrosMaisBaratos.add(livroMaisBarato);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun","A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6","Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk","Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L","E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4","Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivroPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivrosMaisCaros());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivrosMaisBaratos());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livrariaMap);

    }


}
