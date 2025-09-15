import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gerente> gerentes = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Cliente e Gerente");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Extrato");
            System.out.println("5. Alterar Informações Cadastrais");
            System.out.println("6. Listar clientes por gerente");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do cliente: ");
                String nomeCliente = sc.nextLine();
                System.out.print("CPF do cliente: ");
                String cpf = sc.nextLine();
                Cliente cliente = new Cliente(nomeCliente, cpf);

                System.out.print("Nome do gerente responsável: ");
                String nomeGerente = sc.nextLine();


                Gerente gerenteExistente = null;
                for (Gerente g : gerentes) {
                    if (g.getNome().equalsIgnoreCase(nomeGerente)) {
                        gerenteExistente = g;
                        break;
                    }
                }

                if (gerenteExistente == null) {
                    gerenteExistente = new Gerente(nomeGerente);
                    gerentes.add(gerenteExistente);
                }

                gerenteExistente.adicionarCliente(cliente);
                System.out.println("Cliente cadastrado e associado ao gerente " + nomeGerente + "!");

            } else if (opcao == 2) {
                System.out.print("CPF do cliente: ");
                String cpf = sc.nextLine();
                Cliente cliente = buscarCliente(gerentes, cpf);
                if (cliente != null) {
                    System.out.print("Valor do saque: ");
                    double valor = sc.nextDouble();
                    cliente.getConta().sacar(valor);
                } else {
                    System.out.println("Cliente não encontrado!");
                }

            } else if (opcao == 3) {
                System.out.print("CPF do cliente: ");
                String cpf = sc.nextLine();
                Cliente cliente = buscarCliente(gerentes, cpf);
                if (cliente != null) {
                    System.out.print("Valor do depósito: ");
                    double valor = sc.nextDouble();
                    cliente.getConta().depositar(valor);
                } else {
                    System.out.println("Cliente não encontrado!");
                }

            } else if (opcao == 4) {
                System.out.print("CPF do cliente: ");
                String cpf = sc.nextLine();
                Cliente cliente = buscarCliente(gerentes, cpf);
                if (cliente != null) {
                    cliente.getConta().extrato();
                } else {
                    System.out.println("Cliente não encontrado!");
                }

            } else if (opcao == 5) {
                System.out.print("CPF do cliente: ");
                String cpf = sc.nextLine();
                Cliente cliente = buscarCliente(gerentes, cpf);
                if (cliente != null) {
                    System.out.print("Novo nome do cliente: ");
                    String novoNome = sc.nextLine();
                    cliente.setNome(novoNome);
                    System.out.println("Nome alterado com sucesso!");
                } else {
                    System.out.println("Cliente não encontrado!");
                }

            } else if (opcao == 6) {
                System.out.print("Nome do gerente: ");
                String nomeGerente = sc.nextLine();
                Gerente gerente = null;
                for (Gerente g : gerentes) {
                    if (g.getNome().equalsIgnoreCase(nomeGerente)) {
                        gerente = g;
                        break;
                    }
                }
                if (gerente != null) {
                    gerente.listarClientes();
                } else {
                    System.out.println("Gerente não encontrado!");
                }

            } else if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }


    public static Cliente buscarCliente(ArrayList<Gerente> gerentes, String cpf) {
        for (Gerente g : gerentes) {
            for (Cliente c : g.getClientes()) {
                if (c.getCpf().equals(cpf)) {
                    return c;
                }
            }
        }
        return null;
    }
}