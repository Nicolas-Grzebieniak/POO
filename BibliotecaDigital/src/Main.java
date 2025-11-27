public class Main {
    public static void main(String[] args) {

        Ebook ebook1 = new Ebook("Crime e Castigo", "Fiódor Dostoiévski");
        Ebook ebook2 = new Ebook("O Chamado de Cthulhu", "H. P. Lovecraft");

        VideoDigital video1 = new VideoDigital("Curso de Java", "Tech Channel");
        VideoDigital video2 = new VideoDigital("Padrões de Projeto", "DevMaster");

        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());
        System.out.println(video1.descricao());
        System.out.println(video2.descricao());
        System.out.println();

        ebook1.baixar();
        ebook2.baixar();

        System.out.println();

        video1.baixar();
        video1.visualizar();

        System.out.println();

        video2.baixar();
        video2.visualizar();
    }
}
