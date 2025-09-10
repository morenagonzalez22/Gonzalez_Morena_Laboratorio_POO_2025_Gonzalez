package plataforma;

public class Docente extends Usuario {
    private String materiaAsignada;

    public Docente(String nombre, String email, String password, String materiaAsignada) {
        super(nombre, email, password);
        this.materiaAsignada = materiaAsignada;
    }

    @Override
    public void acceder() {
        System.out.println("Docente " + getNombre() + " accede a la materia: " + materiaAsignada);
    }
}
