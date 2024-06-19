package Functional_Interface.Examples;

import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        // Representa uma operação que recebe dois argumentos do tipo T e retorna um resultado do mesmo tipo T

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // utilizando o reduce, o primeiro elemento, no caso 0 é como se fosse a variável temporária de um loop de repetição
        // exemplo = total += num1 + num2;
        int resultado = numeros.stream()
                .reduce(0, Integer::sum); // method reference
        // lambda .reduce(0, (num1, num2) -> num1 + num2);

        System.out.println("O resultado da soma é: " + resultado);
    }
}
