public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: " + titulo + " | Criador: " + autor;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o vídeo \"" + titulo + "\"...");
    }

    @Override
    public void visualizar() {
        System.out.println("Reproduzindo o vídeo \"" + titulo + "\"...");
    }
}
