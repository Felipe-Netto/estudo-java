package Functional_Interface.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    // Consumer não retorna nem modifica valores
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /*numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if(n % 2 == 0){
                    System.out.println(n);
                }
            }
        });*/

        // passando para lambda

        /*numeros.forEach( n -> {
            if(n % 2 == 0){ System.out.println(n);
            }
        });*/

        // Melhorando com o Predicate

        numeros.stream()
                .filter( n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
