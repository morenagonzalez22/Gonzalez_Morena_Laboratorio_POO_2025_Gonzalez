package cuentas;

public class CuentaCripto extends Cuenta {
    private String claveBlockchain;

    public CuentaCripto(int numeroCuenta, double saldo, String claveBlockchain) {
        super(numeroCuenta, saldo);
        this.claveBlockchain = claveBlockchain;
    }

    @Override
    public void realizarExtraccion(double monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            System.out.println("Extracción en criptomonedas exitosa. Nuevo saldo: " + getSaldo());
        } else {
            System.out.println("Fondos cripto insuficientes.");
        }
    }
}
