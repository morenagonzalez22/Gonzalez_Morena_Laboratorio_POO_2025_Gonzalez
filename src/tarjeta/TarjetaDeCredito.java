package tarjeta;

public class TarjetaDeCredito {
    private int numeroTarjeta;
    private String titular;
    private double limiteCredito;
    private double saldoActual;

    public TarjetaDeCredito(int numeroTarjeta, String titular, double limiteCredito) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldoActual = limiteCredito;
    }

    public double getLimiteCredito() { return limiteCredito; }
    public double getSaldoActual() { return saldoActual; }

    public void comprar(double monto) {
        if (monto <= saldoActual) {
            saldoActual -= monto;
            System.out.println("Compra realizada. Saldo disponible: " + saldoActual);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void pagar(double monto) {
        saldoActual += monto;
        if (saldoActual > limiteCredito) {
            saldoActual = limiteCredito;
        }
        System.out.println("Pago registrado. Saldo actual: " + saldoActual);
    }
}
