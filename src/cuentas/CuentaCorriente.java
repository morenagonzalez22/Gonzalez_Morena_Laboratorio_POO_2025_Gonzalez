package cuentas;

public class CuentaCorriente extends Cuenta {
    private double limiteDescubierto;

    public CuentaCorriente(int numeroCuenta, double saldo, double limiteDescubierto) {
        super(numeroCuenta, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void realizarExtraccion(double monto) {
        if (monto <= getSaldo() + limiteDescubierto) {
            setSaldo(getSaldo() - monto);
            System.out.println("Extracción con descubierto. Nuevo saldo: " + getSaldo());
        } else {
            System.out.println("No se puede extraer: supera el descubierto.");
        }
    }
}
