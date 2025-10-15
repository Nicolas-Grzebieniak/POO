public class Filho2 extends Pai {
    private String esporte;

    public Filho2(String nome, int idade, String profissao, String esporte) {
        super(nome, idade, profissao);
        this.esporte = esporte;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " trabalha como " + profissao + " e treina " + esporte + " nas horas vagas.");
    }


    public void treinar() {
        System.out.println(nome + " está treinando " + esporte + ".");
    }
}
