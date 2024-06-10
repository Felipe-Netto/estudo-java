public class TiposVariaveis {
    public static void main(String[] args){
        double salario = 2500.33;

        System.out.println("Salário: " + salario);

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.1415; // usando o final, não pode mudar o valor da variavel 

        System.out.println(VALOR_DE_PI);

        String nome = "Felipe";
        String sobrenome = "Netto";

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println(nomeCompleto);
    }
}
