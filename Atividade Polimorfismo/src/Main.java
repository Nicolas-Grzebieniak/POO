public class Main {
    public static void main(String[] args) {

        Pai f1 = new Filho1("Ana", 20, "Engenheira", "Engenharia Civil");
        Pai f2 = new Filho2("Carlos", 25, "Professor", "Futebol");
        Pai f3 = new Filho3("Beatriz", 30, "Designer", "Pintar");


        f1.trabalhar();
        f2.trabalhar();
        f3.trabalhar();

        System.out.println("-------------------");

        // Usando instanceof e type cast para acessar métodos exclusivos dos filhos
        if (f1 instanceof Filho1) {
            ((Filho1) f1).estudar();
        }
        if (f2 instanceof Filho2) {
            ((Filho2) f2).treinar();
        }
        if (f3 instanceof Filho3) {
            ((Filho3) f3).relaxar();
        }
    }
}
