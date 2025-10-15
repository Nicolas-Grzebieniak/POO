public class Pai {
    protected String nome;
    protected int idade;
    protected String profissao;


    public Pai() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.profissao = "Desempregado";
    }


    public Pai(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }


    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e sou " + profissao + ".");
    }


    public void trabalhar() {
        System.out.println("Trabalhando como uma pessoa genérica.");
    }
}

