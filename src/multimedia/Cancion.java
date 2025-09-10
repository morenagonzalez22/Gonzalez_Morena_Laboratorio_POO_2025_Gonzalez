package multimedia;

public class Cancion extends ArchivoMultimedia {
    private String artista;

    public Cancion(String nombre, double duracion, String artista) {
        super(nombre, duracion);
        this.artista = artista;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo canción: " + getNombre() + " de " + artista);
    }
}
