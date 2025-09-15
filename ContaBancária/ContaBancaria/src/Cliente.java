class Cliente {
    private String nome;
    private String cpf;
    private ContaBancaria conta;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new ContaBancaria();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}