package apps.mensagem;
public class MSNMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN...");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN...");
    }
    void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem...");
    }
}
