package transporte;

public class Avion extends Transporte {
    private int altitudMaxima;

    public Avion(int velocidad, int capacidad, String placa, int altitudMaxima) {
        super(velocidad, capacidad, placa);
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public void mover() {
        System.out.println("El avión con placa " + getPlaca() + " vuela a una altitud de " + altitudMaxima + " metros.");
    }
}
