package pesquisa.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumeros(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int valorTotal = 0;
        for(Integer n : numeros){
            valorTotal += n;
        }
        return valorTotal;
    }

    public int encontrarMaiorNumero(){
        int maiorValor = 0;
        if(!numeros.isEmpty()){
            for(int n : numeros){
                if(maiorValor < n){
                    maiorValor = n;
                }
            }
            return maiorValor;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        
    }

    public int encontrarMenorNumero(){
        int menorValor = encontrarMaiorNumero();

        if(!numeros.isEmpty()){
            for(int n : numeros){
                if(menorValor > n){
                    menorValor = n;
                }
            }
            return menorValor;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        
    }
    
    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(numeros);
        }else{
            System.out.println("A lista está vazia!");
        }
        
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumeros(2);
        somaNumeros.adicionarNumeros(13);
        somaNumeros.adicionarNumeros(9);
        somaNumeros.adicionarNumeros(20);
        somaNumeros.adicionarNumeros(22);
        somaNumeros.adicionarNumeros(4);
        somaNumeros.adicionarNumeros(17);
        somaNumeros.adicionarNumeros(14);
        somaNumeros.adicionarNumeros(8);
        somaNumeros.adicionarNumeros(5);

        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        

    }
}
