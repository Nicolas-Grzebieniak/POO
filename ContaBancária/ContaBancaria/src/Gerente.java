import java.util.ArrayList;
class Gerente {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Gerente(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente associado a este gerente.");
        } else {
            System.out.println("Clientes do gerente " + nome + ":");
            for (Cliente c : clientes) {
                System.out.println("- " + c.getNome() + " (CPF: " + c.getCpf() + ")");
            }
        }
    }
}
