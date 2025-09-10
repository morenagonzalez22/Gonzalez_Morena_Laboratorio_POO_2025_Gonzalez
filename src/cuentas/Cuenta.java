package cuentas;

public abstract class Cuenta {
    private double saldo;
    private int numeroCuenta;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public double getSaldo() { return saldo; }
    public int getNumeroCuenta() { return numeroCuenta; }

    public void setSaldo(double saldo) { this.saldo = saldo; }
    public void setNumeroCuenta(int numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public abstract void realizarExtraccion(double monto);
}
