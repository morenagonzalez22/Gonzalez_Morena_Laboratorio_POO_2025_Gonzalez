package plataforma;

public class Administrador extends Usuario {
    private boolean permisosTotales;

    public Administrador(String nombre, String email, String password, boolean permisosTotales) {
        super(nombre, email, password);
        this.permisosTotales = permisosTotales;
    }

    @Override
    public void acceder() {
        System.out.println("Administrador " + getNombre() + " accede con permisos totales: " + permisosTotales);
    }
}
