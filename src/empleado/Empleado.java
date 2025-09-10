package empleado;

public class Empleado {
    private String nombre;
    private int dni;
    private float salario;

    public Empleado(String nombre, int dni, float salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
    }

    public String getNombre() { return nombre; }

    public void setSalario(float porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    public float getSalario() {
        return salario;
    }
}
