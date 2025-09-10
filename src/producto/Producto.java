package producto;

public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;

    public Producto(int codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void mostrarPrecio() {
        System.out.println("Precio: " + precio);
    }

    public String accederDescripcion() {
        return descripcion;
    }

    public void actualizarPrecio(float nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}
