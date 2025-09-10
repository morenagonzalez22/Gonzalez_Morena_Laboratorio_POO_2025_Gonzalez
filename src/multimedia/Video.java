package multimedia;

public class Video extends ArchivoMultimedia {
    private String resolucion;

    public Video(String nombre, double duracion, String resolucion) {
        super(nombre, duracion);
        this.resolucion = resolucion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo video: " + getNombre() + " en resolución " + resolucion);
    }
}
 	