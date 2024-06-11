package lanchonete.atendimento.cozinha;

public class Almoxerife {
    private void controlarEntrada(){
        System.out.println("CONTROLANDO ENTRADA");
    }

    private void controlarSaida(){
        System.out.println("CONTROLANDO SAIDA");
    }

    void trocarGas(){
        System.out.println("ALMOXERIFE TROCANDO O GÁS");
    }

    void entregarIngredientes(){
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }
}
