package ordenacao.ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numerosList;

    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()){
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            System.out.println(numerosList);
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(13);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(37);
        ordenacaoNumeros.adicionarNumero(52);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(29);
        ordenacaoNumeros.adicionarNumero(44);
        ordenacaoNumeros.adicionarNumero(12);
        ordenacaoNumeros.adicionarNumero(21);

        System.out.println("Numeros");
        ordenacaoNumeros.exibirNumeros();
        System.out.println("Numeros ascendentes");
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println("Numeros descendentes");
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }

    
}
