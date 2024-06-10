public class For { 
    public static void main(String[] args){
        String nomes[] = {"Felipe", "Suzan", "Karin", "Carlo", "Natalia"};

        for(int i=0; i<nomes.length; i++){
            System.out.println("Nome: " + nomes[i]);
        }

        System.out.println("\n Nomes utilizando o for each:\n");
        // for each

        for(String nome : nomes){
            System.out.println("Nome: " + nome);
        }
    }
}
