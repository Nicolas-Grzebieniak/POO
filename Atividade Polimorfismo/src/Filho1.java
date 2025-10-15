public class Filho1 extends Pai {
    private String curso;

    public Filho1(String nome, int idade, String profissao, String curso) {
        super(nome, idade, profissao);
        this.curso = curso;
    }


    @Override
    public void trabalhar() {
        System.out.println(nome + " está estudando para se tornar " + profissao + ".");
    }


    public void estudar() {
        System.out.println(nome + " está cursando " + curso + ".");
    }
}
