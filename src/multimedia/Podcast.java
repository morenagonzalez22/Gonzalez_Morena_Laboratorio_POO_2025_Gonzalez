package multimedia;

public class Podcast extends ArchivoMultimedia {
    private int episodio;

    public Podcast(String nombre, double duracion, int episodio) {
        super(nombre, duracion);
        this.episodio = episodio;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo podcast: " + getNombre() + " Episodio #" + episodio);
    }
}
