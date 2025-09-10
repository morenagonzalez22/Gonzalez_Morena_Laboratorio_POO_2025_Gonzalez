package publicaciones;

public class Libro extends Publicacion {
    private String codigo;

    public Libro(String titulo, String autor, int anio, String codigo) {
        super(titulo, autor, anio);
        this.codigo = codigo;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro: " + getTitulo() + " (" + getAnio() + "), Autor: " + getAutor() + ", Código: " + codigo);
    }
}
