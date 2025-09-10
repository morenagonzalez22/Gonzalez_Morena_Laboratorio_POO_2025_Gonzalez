package multimedia;

public class Main {
    public static void main(String[] args) {
        ArchivoMultimedia cancion = new Cancion("Imagine", 3.5, "John Lennon");
        ArchivoMultimedia video = new Video("Documental", 45, "1080p");
        ArchivoMultimedia podcast = new Podcast("Historia Argentina", 60, 12);

        ArchivoMultimedia[] lista = { cancion, video, podcast };
        for (ArchivoMultimedia a : lista) {
            a.reproducir();
        }
    }
}
