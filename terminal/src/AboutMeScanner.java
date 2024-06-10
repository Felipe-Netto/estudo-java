import java.util.InputMismatchException;
import java.util.Locale; // serve para utilizar algum padrão de linguagem, neste caso, o americano
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args){

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");

        scanner.close();
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura devem ser numéricos");
        }

    }
}
