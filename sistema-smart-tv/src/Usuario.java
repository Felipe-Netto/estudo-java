import java.util.Scanner;

public class Usuario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SmartTv smartTv = new SmartTv();

        int op;
        int novoCanal;

        System.out.print("Press 1 to turn the TV on: ");
        op = scanner.nextInt();

        while(op != 1){
            System.out.print("Press 1 to turn the TV on: ");
            op = scanner.nextInt();
        }
        op = 0;
        smartTv.ligar();

        System.out.println("TV ligada");
        
        while (op != 1) {
            System.out.println("===== Controle =====");
            System.out.println("1 - Turn the TV off");
            System.out.println("2 - Next channel");
            System.out.println("3 - Previous channel");
            System.out.println("4 - Choose the channel");
            System.out.println("5 - Turn up the volume");
            System.out.println("6 - Turn down the volume");
            System.out.println("7 - Info");
            System.out.print("Option: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("TV is off!");
                    break;

                case 2:
                    smartTv.aumentarCanal();
                    break;
                
                case 3:
                    smartTv.diminuirCanal();
                    break;
                
                case 4:
                    System.out.print("Choose the channel: ");
                    novoCanal = scanner.nextInt();
                    smartTv.mudarCanal(novoCanal);
                    break;

                case 5:
                    smartTv.aumentarVolume();
                    break;

                case 6:
                    smartTv.diminuirVolume();
                    break;

                case 7:
                    System.out.println("\n| TV is on ? " + smartTv.ligada);
                    System.out.println("| Channel: " + smartTv.canal);
                    System.out.println("| Volume: " + smartTv.volume);
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Invalid number!");
                    break;
            }
        }

        smartTv.desligar();
        scanner.close();
        
    }
}
