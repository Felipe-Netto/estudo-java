public class Pessoa {
    private String nome;
    private String cpf;
    private String edereco;

    

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEdereco() {
        return edereco;
    }
    public void setEdereco(String edereco) {
        this.edereco = edereco;
    }

    
    
}
