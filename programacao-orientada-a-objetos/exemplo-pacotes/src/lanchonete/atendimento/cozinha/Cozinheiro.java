package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    boolean gas = true;
    boolean ingredientes = true;

    public void adicionarLancheNoBalcao(){
        prepararLanche();
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }

    public void adicionarSucoNoBalcao(){
        prepararSuco();
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE");
    }

    private void prepararSuco(){
        System.out.println("PREPARANDO SUCO");
    }

    // Cozinheiro não está mais autorizado a pedir pro atendente trocar o gás, pois não estão no mesmo package
    // public void pedirParaTrocarGas(Atendente meuAmigo){
    //     meuAmigo.trocarGas();
    // }

    // cozinheiro sabe que almoxerife está entregando ingredientes ou trocando o gás, pois estão no mesmo packege

    private void pedirParaTrocarGas(Almoxerife almoxerife){
        almoxerife.trocarGas();
    }

    private void pedirIngredientes(Almoxerife almoxerife){
        almoxerife.entregarIngredientes();
    }
}
