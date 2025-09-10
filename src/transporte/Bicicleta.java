package transporte;

public class Bicicleta extends Transporte {
    private int tamanoRuedas;

    public Bicicleta(int velocidad, int capacidad, String placa, int tamanoRuedas) {
        super(velocidad, capacidad, placa);
        this.tamanoRuedas = tamanoRuedas;
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta con placa " + getPlaca() + " avanza con ruedas de tamaño " + tamanoRuedas);
    }
}
