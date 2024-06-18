package OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    final private Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            if(dicionario.containsKey(palavra)){
                dicionario.remove(palavra);
            }else{
                throw new RuntimeException("Palavra não encontrada!");
            }
        }else{
            throw new RuntimeException("A collection map está vazia!");
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        if(!dicionario.isEmpty()){
            if(dicionario.containsKey(palavra)){
                return dicionario.get(palavra);
            }else{
                throw new RuntimeException("Palavra não encontrada!");
            }
        }else{
            throw new RuntimeException("A collection map está vazia!");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Comer", "Consumir alimentos");
        dicionario.adicionarPalavra("Beber", "Consumir bebidas");
        dicionario.adicionarPalavra("Andar", "Se locomover");
        dicionario.adicionarPalavra("Correr", "Se locomover rapidamente");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("Beber");
        dicionario.exibirPalavras();

        System.out.println("Definição: " + dicionario.pesquisarPorPalavra("Correr"));
    }
}
