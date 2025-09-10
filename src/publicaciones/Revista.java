package publicaciones;

public class Revista extends Publicacion {
    private int numero;

    public Revista(String titulo, String autor, int anio, int numero) {
        super(titulo, autor, anio);
        this.numero = numero;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista: " + getTitulo() + " (" + getAnio() + "), Número: " + numero);
    }
}
