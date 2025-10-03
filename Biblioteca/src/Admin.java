public class Admin extends Pessoa {
    private Biblioteca biblioteca;

    public Admin(String nome, String email, String senha, Biblioteca biblioteca) {
        super(nome, email, senha);
        this.biblioteca = biblioteca;
    }

    public void adicionarLivroBiblioteca(Livro livro) {
        biblioteca.adicionarLivro(livro);
        System.out.println("Admin " + nome + " adicionou " + livro.getTitulo() + " à biblioteca.");
    }

    public void listarLivrosBiblioteca() {
        biblioteca.listarLivros();
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
}

