package biblioteca;

public class Prestamo {
    private Usuario usuario;
    private Material material;
    private int diasPrestamo;

    public Prestamo(Usuario usuario, Material material, int diasPrestamo) {
        this.usuario = usuario;
        this.material = material;
        this.diasPrestamo = diasPrestamo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Material getMaterial() {
        return material;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public double calcularMulta(int diasRetraso) {
        if (diasRetraso <= 0) {
            return 0.0;
        }
        return diasRetraso * 10.0;
    }

    public void mostrarPrestamo() {
        System.out.println("----- Préstamo -----");
        usuario.mostrarInfo();
        material.mostrarInfo();
        System.out.println("Días permitidos: " + diasPrestamo);
        System.out.println("--------------------\n");
    }
}
