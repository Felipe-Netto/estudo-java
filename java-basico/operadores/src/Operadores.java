public class Operadores {
    public static void main(String[] args){
        int idade = 21; // = atribuição
        System.out.println("Idade: " + idade);

        // operadores aritméticos: + adição, - subtração, * multiplicação, / divisão, % modulo

        int soma = 10 + 5;
        int subtração = 20 - 15;
        int multiplicacao = 10 * 2;
        double divisao = 10 / 2;
        double modulo = 10 % 3;
        double resultado = (10 * 5) + (20 / 3);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtração);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        System.out.println("Resultado: " + resultado);

        // variavel ++ (incremento) variavel -- (decremento)

        int numero = 10;

        numero ++;
        System.out.println(numero);

        numero --;
        System.out.println(numero);

        // ! negação

        boolean verdadeiroFalso = true;
        System.err.println(verdadeiroFalso);
        System.out.println(!verdadeiroFalso); // nega a variavel, o que era true agora é false

        // comparação == verifica se algo é igual a outro

        int a = 6;
        int b = 3;

        int res = a == b ? 1 : 0; // se a for igual a b verifica = 1, se não verifica = 0

        System.out.println(res);

        // != diferente

        boolean simNao = a != b;
        System.out.println(simNao);     
        
        // > maior que | < menor que
        simNao = a > b;
        System.out.println(simNao); 

        // condição && e || ou

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições são verdadeiras");
        }

    }
}
