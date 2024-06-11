package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.area.cliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        // Ações que não precisam estar disponíveis para toda a aplicação
        // Métodos privados
        // cozinheiro.prepararLanche();
        // cozinheiro.prepararSuco();

        // Ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        // Almoxerife almoxerife = new Almoxerife(); Estabelecimento não tem acesso ao almoxerife

        // Ações que não precisam estar disponíveis para toda a aplicação
        // Métodos privados
        // almoxerife.controlarEntrada();
        // almoxerife.controlarSaida();

        // Ações que somente o pacote cozinha precisa conhecer (default)
        // almoxerife.entregarIngredientes();
        // almoxerife.trocarGas();
        //Estabelecimento não sabe mais que o almoxerife está entregando ingredientes nem trocando o gás

        Atendente atendente = new Atendente();
        
        // atendente.pegarLancheCozinha(); não veem mais o atendente pegando o lanche na cozinha
        atendente.servindoMesa();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        /*Não deveria, mas o estabelecimento ainda não definiu normas de atendimento */
        // cliente.pegarPedidoBalcao(); não pega mais


        // Essa ação é muito sigilosa, que tal ser privada?
        // cliente.consultarSaldoAplicativo(); método privado

        // Já pensou os clientes ouvindo que o gás acabou?
        // cozinheiro.pedirParaTrocarGas(almoxerife); método privado


    }
}
