package cuenta;

public class CuentaBancaria {
    private int numeroCuenta;
    private String titular;
    private float saldo;

    public CuentaBancaria(int numeroCuenta, String titular, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }

    public void depositarSalario(float monto) {
        saldo += monto;
    }

    public void retirarSalario(float monto) {
        if (monto <= saldo) {
            saldo -= monto;
        }
    }
}
 	