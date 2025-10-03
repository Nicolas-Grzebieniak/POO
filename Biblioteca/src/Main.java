import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();
        Admin admin = new Admin("Carlos", "admin@biblioteca.com", "1234", biblioteca);
        Usuario usuario = new Usuario("Ana", "ana@email.com", "4321");

        System.out.println("==== Bem-vindo à Biblioteca Digital ====");

        boolean executando = true;
        while (executando) {

            Pessoa pessoaLogada = null;
            while (pessoaLogada == null && executando) {
                System.out.println("\n=== Tela de Login ===");
                System.out.println("1. Fazer login");
                System.out.println("2. Sair do sistema");
                System.out.print("Escolha: ");
                int escolha = sc.nextInt();
                sc.nextLine();

                if (escolha == 1) {
                    System.out.print("Digite seu email: ");
                    String email = sc.nextLine();
                    System.out.print("Digite sua senha: ");
                    String senha = sc.nextLine();

                    if (admin.autenticar(email, senha)) {
                        pessoaLogada = admin;
                        System.out.println("✅ Login realizado como Admin.");
                    } else if (usuario.autenticar(email, senha)) {
                        pessoaLogada = usuario;
                        System.out.println("✅ Login realizado como Usuário.");
                    } else {
                        System.out.println("❌ Email ou senha inválidos.");
                    }
                } else if (escolha == 2) {
                    System.out.println("👋 Encerrando o sistema... Até logo!");
                    executando = false;
                } else {
                    System.out.println("Opção inválida.");
                }
            }


            if (pessoaLogada instanceof Admin) {
                Admin a = (Admin) pessoaLogada;
                int opcao;
                do {
                    System.out.println("\n=== Menu Admin ===");
                    System.out.println("1. Adicionar livro à biblioteca");
                    System.out.println("2. Listar livros da biblioteca");
                    System.out.println("0. Logout");
                    System.out.print("Escolha: ");
                    opcao = sc.nextInt();
                    sc.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.print("Título do livro: ");
                            String titulo = sc.nextLine();
                            System.out.print("Autor do livro: ");
                            String autor = sc.nextLine();
                            a.adicionarLivroBiblioteca(new Livro(titulo, autor));
                            break;
                        case 2:
                            a.listarLivrosBiblioteca();
                            break;
                        case 0:
                            System.out.println("🔒 Logout do Admin...");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opcao != 0);

            } else if (pessoaLogada instanceof Usuario) {
                Usuario u = (Usuario) pessoaLogada;
                int opcao;
                do {
                    System.out.println("\n=== Menu Usuário ===");
                    System.out.println("1. Listar livros da biblioteca");
                    System.out.println("2. Adicionar livro à estante");
                    System.out.println("3. Listar minha estante");
                    System.out.println("0. Logout");
                    System.out.print("Escolha: ");
                    opcao = sc.nextInt();
                    sc.nextLine();

                    switch (opcao) {
                        case 1:
                            biblioteca.listarLivros();
                            break;
                        case 2:
                            biblioteca.listarLivros();
                            System.out.print("Escolha o número do livro: ");
                            int escolha = sc.nextInt();
                            sc.nextLine();
                            Livro livroEscolhido = biblioteca.getLivro(escolha - 1);
                            if (livroEscolhido != null) {
                                u.adicionarLivro(livroEscolhido);
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;
                        case 3:
                            u.listarEstante();
                            break;
                        case 0:
                            System.out.println("🔒 Logout do Usuário...");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opcao != 0);
            }
        }

        sc.close();
    }
}
