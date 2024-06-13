package apps.mensagem;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    abstract void salvarHistoricoMensagem();

    // protected - apenas os filhos de ServicoMensagemInstantanea tem acesso ao método
    // quem está no mesmo pacote também consegue ter acesso, então é necessário administrar os pacotes
    protected void validarConectadoInternet(){ 
        System.out.println("Validando se está conectado...");
    }

}
