package transporte;

public class Auto extends Transporte {
    private String tipoCombustible;

    public Auto(int velocidad, int capacidad, String placa, String tipoCombustible) {
        super(velocidad, capacidad, placa);
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mover() {
        System.out.println("El auto con placa " + getPlaca() + " se mueve por carretera usando " + tipoCombustible);
    }
}
