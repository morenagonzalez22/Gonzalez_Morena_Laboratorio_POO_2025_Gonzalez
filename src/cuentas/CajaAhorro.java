package cuentas;

public class CajaAhorro extends Cuenta {

    public CajaAhorro(int numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void realizarExtraccion(double monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            System.out.println("Extracción exitosa. Nuevo saldo: " + getSaldo());
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
