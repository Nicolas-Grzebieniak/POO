import java.util.ArrayList;

public class Usuario extends Pessoa {
    private ArrayList<Livro> estante = new ArrayList<>();

    public Usuario(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void adicionarLivro(Livro livro) {
        estante.add(livro);
        System.out.println(livro.getTitulo() + " adicionado à estante de " + nome);
    }

    public void listarEstante() {
        if (estante.isEmpty()) {
            System.out.println("A estante está vazia.");
            return;
        }
        System.out.println("📚 Estante de " + nome + ":");
        for (Livro l : estante) {
            l.exibirInfo();
        }
    }
}

