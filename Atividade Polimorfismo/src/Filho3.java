public class Filho3 extends Pai {
    private String hobby;

    public Filho3(String nome, int idade, String profissao, String hobby) {
        super(nome, idade, profissao);
        this.hobby = hobby;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " trabalha como " + profissao + " e gosta de " + hobby + ".");
    }


    public void relaxar() {
        System.out.println(nome + " está relaxando com seu hobby: " + hobby + ".");
    }
}
