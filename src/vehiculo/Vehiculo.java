package vehiculo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double velocidadActual;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getVelocidadActual() { return velocidadActual; }

    public void acelerar(double aumento) {
        velocidadActual += aumento;
    }

    public void frenar() {
        velocidadActual = 0;
    }
}
