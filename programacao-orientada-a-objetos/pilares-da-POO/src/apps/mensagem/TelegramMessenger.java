package apps.mensagem;
public class TelegramMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram...");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram...");
    }
    void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem...");
    }
}
