package cuentas;

public class Main {
    public static void main(String[] args) {
        Cuenta ahorro = new CajaAhorro(1001, 5000);
        Cuenta corriente = new CuentaCorriente(1002, 3000, 1000);
        Cuenta cripto = new CuentaCripto(1003, 2.5, "claveXYZ");

        ahorro.realizarExtraccion(2000);
        corriente.realizarExtraccion(3500);
        cripto.realizarExtraccion(1.0);
    }
}
