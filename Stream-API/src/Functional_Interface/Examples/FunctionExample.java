package Functional_Interface.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionExample {
    public static void main(String[] args) {
        // Representa uma função que recebe um argumento do tipo T e retorna um resultado do tipo R
        // É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        // o primeiro tipo é o tipo de dado que vai entrar na função, o segundo tipo é o tipo de dado que vai retornar
        // neste exemplo vão entrar números inteiros e retornar números inteiros, mas poderia ser outros tipos
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        // method reference
        numerosDobrados.forEach(System.out::println);
        // lambda
        //numerosDobrados.forEach( n -> System.out.println(n));

        // utilizando lambda

        System.out.println("\n Numeros dobrados com lambda");
        List<Integer> numerosDobradosLambda = numeros.stream()
                .map(n -> n * 2)
                .toList();

        numerosDobradosLambda.forEach(System.out::println);
    }
}
