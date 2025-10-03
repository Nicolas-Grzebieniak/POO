import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livrosDisponiveis = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void listarLivros() {
        if (livrosDisponiveis.isEmpty()) {
            System.out.println("Nenhum livro disponível na biblioteca.");
            return;
        }
        System.out.println("📚 Livros disponíveis na biblioteca:");
        for (int i = 0; i < livrosDisponiveis.size(); i++) {
            System.out.print((i + 1) + ". ");
            livrosDisponiveis.get(i).exibirInfo();
        }
    }

    public Livro getLivro(int index) {
        if (index >= 0 && index < livrosDisponiveis.size()) {
            return livrosDisponiveis.get(index);
        }
        return null;
    }
}
