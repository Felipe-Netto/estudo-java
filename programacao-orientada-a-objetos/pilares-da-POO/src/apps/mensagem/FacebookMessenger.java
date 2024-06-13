package apps.mensagem;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook...");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook...");
    }
    void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem...");
    }
}
