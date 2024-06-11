public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa felipe = new Pessoa("Felipe", "123-456-789-12");
        // construtor: atributos relevantes para a existência de um objeto

        felipe.setEdereco("Rua bla bla, numero 123");

        System.out.println(felipe.getNome() + " - " + felipe.getCpf() + " - " + felipe.getEdereco());
    }
}
