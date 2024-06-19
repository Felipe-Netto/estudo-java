package Functional_Interface.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate - aceita um argumento do tipo T e retorna um valor booleano

        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

        // fazendo Predicate com lambda
        // não é necessário colocar as palavras dentro de uma List, pode utilizar o forEach direto
        //List<String> palavrasMaisDeCinco = palavras.stream()
        palavras.stream()
                .filter(p -> p.length() > 5)
                //.toList();
                .forEach(System.out::println);

        //palavrasMaisDeCinco.forEach(System.out::println);
    }
}
