package publicaciones;

public class Diario extends Publicacion {
    private String editor;

    public Diario(String titulo, String autor, int anio, String editor) {
        super(titulo, autor, anio);
        this.editor = editor;
    }

    public String getEditor() { return editor; }
    public void setEditor(String editor) { this.editor = editor; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Diario: " + getTitulo() + " (" + getAnio() + "), Editor: " + editor);
    }
}
