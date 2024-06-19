package Functional_Interface.Examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    // não aceita argumento e retorna um resultado do tipo T
    // comumente usado para criar ou fornecer novos objetos de um determinado tipo

    public static void main(String[] args) {

        System.out.println("Declarando o Supplier fora do generate");
        Supplier<String> saudacao = () -> "Hello World!";

        List<String> listaSaudacao = Stream.generate(saudacao)
                .limit(3)
                .toList();

        // utilizando method reference
        listaSaudacao.forEach(System.out::println);
        // utilizando lambda
        // listaSaudacao.forEach( s -> System.out.println(s));

        // passando o Supplier diretamente no generate
        System.out.println("\nDeclarando o Supplier dentro do generate");
        List<String> listaSaudacaoDentroGenerate = Stream.generate(() -> "Hello World")
                .limit(3)
                .toList();

        listaSaudacaoDentroGenerate.forEach(System.out::println);

        System.out.println("\nDireto no forEach");
        Stream.generate(() -> "Hello World")
                .limit(3)
                .forEach(System.out::println);
    }
}
