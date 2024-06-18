package Pesquisa.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras(){
        palavrasMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        }else{
            throw new RuntimeException("O map está vazio!");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for(int contagem : palavrasMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : palavrasMap.entrySet()){
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
