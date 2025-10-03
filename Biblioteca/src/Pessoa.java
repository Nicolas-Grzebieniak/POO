public class Pessoa {
    protected String nome;
    protected String email;
    protected String senha;

    public Pessoa(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public boolean autenticar(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public void exibirInfo() {
        System.out.println(nome + " (" + email + ")");
    }
}
