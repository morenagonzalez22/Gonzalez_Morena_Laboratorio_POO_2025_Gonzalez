package biblioteca;

public class Libro extends Material {
    private String isbn;

    public Libro(String titulo, String autor, int anioPublicacion, String isbn) {
        super(titulo, autor, anioPublicacion);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    
    public void mostrarInfo() {
        System.out.println("=== Libro ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año: " + getAnioPublicacion());
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }
}
