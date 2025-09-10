package transporte;

public abstract class Transporte {
    private int velocidad;
    private int capacidad;
    private String placa;

    public Transporte(int velocidad, int capacidad, String placa) {
        this.velocidad = velocidad;
        this.capacidad = capacidad;
        this.placa = placa;
    }

    public int getVelocidad() { return velocidad; }
    public int getCapacidad() { return capacidad; }
    public String getPlaca() { return placa; }

    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    public void setPlaca(String placa) { this.placa = placa; }

    public abstract void mover();
}
