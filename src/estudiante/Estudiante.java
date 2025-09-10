package estudiante;

public class Estudiante {
    private String nombre;
    private int dni;
    private float promedio;

    public Estudiante(String nombre, int dni, float promedio) {
        this.nombre = nombre;
        this.dni = dni;
        this.promedio = promedio;
    }

    public String getNombre() { return nombre; }
    public float getPromedio() { return promedio; }
}
