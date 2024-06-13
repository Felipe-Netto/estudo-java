import apps.mensagem.*; // * importa todas as classes do package apps.mensagens


public class Usuario {
    public static void main(String[] args) {

        // Encapsulamento - algumas coisas não devem ser vistas pelo usuário (métodos privados)
        // Herança - Reaproveitamento de código para os 3 serviços de mensagem com classe genérica
        // Abstração - Com a herança todas as classes usavam o mesmo método do mesmo jeito, com a abstração, cada classe implementa o método como o necessário
        // Polimorfismo - não sabe o app, mas qualquer um deverá enviar e receber mensagem

        ServicoMensagemInstantanea smi = null; // define smi com um valor vazio

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("Facebook")){
            smi = new FacebookMessenger();
        }else if(appEscolhido.equals("Telegram")){
            smi = new TelegramMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
