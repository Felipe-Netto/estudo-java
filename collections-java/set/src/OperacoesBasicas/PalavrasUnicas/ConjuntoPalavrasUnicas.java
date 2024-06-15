package OperacoesBasicas.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for(String p : palavrasUnicas){
            if(p == palavra){
                palavraParaRemover = p;
                break;
            }
        }
        if(palavraParaRemover != null){
            palavrasUnicas.remove(palavraParaRemover);
        }else{
            throw new RuntimeException("Essa palavra não existe no conjunto!");
        }
    }

    public boolean palavraPresente(String palavra){
        for(String p : palavrasUnicas){
            if(p == palavra){
                return true;
            }
        }
        return false;
    }

    public void verificarPalavra(String palavra){
        boolean palavraPresente = palavraPresente(palavra);
        if(palavraPresente){
            System.out.println("Essa palavra está presente no conjunto");
        }else{
            System.out.println("Essa palavra não está presente no conjunto");
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasUnicas == null) ? 0 : palavrasUnicas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasUnicas == null) {
            if (other.palavrasUnicas != null)
                return false;
        } else if (!palavrasUnicas.equals(other.palavrasUnicas))
            return false;
        return true;
    }

    public void exibirPalavrasUnicas(){
        for(String p : palavrasUnicas){
            System.out.println(p + " ");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Batata");
        conjuntoPalavrasUnicas.adicionarPalavra("Polvilho");
        conjuntoPalavrasUnicas.adicionarPalavra("Refrigerante");
        conjuntoPalavrasUnicas.adicionarPalavra("Refrigerante");
        conjuntoPalavrasUnicas.adicionarPalavra("Cerveja");

        conjuntoPalavrasUnicas.removerPalavra("Refrigerante");
        conjuntoPalavrasUnicas.verificarPalavra("Refrigerante");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }

}
