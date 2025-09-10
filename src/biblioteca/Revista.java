package biblioteca;

public class Revista extends Material {
    private int numero;

    public Revista(String titulo, String autor, int anioPublicacion, int numero) {
        super(titulo, autor, anioPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Revista ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor/Editor: " + getAutor());
        System.out.println("Año: " + getAnioPublicacion());
        System.out.println("Número/Edición: " + numero);
        System.out.println();
    }
}
