package T.PN1;

public class Camion extends Vehiculo{

private double capacidadCarga;

private int cantEjes;


public Camion(String marca, String modelo, int velocidadMaxima, double capacidadCarga, int cantEjes) {

super(marca, modelo, velocidadMaxima);

this.capacidadCarga = capacidadCarga;

this.cantEjes = cantEjes;}


public double getCapacidadCarga() {

return capacidadCarga;

}


public int getCantEjes() {

return cantEjes;

}


public void setCapacidadCarga(double capacidadCarga) {

this.capacidadCarga = capacidadCarga;


}


public void setCantEjes(int cantEjes) {

this.cantEjes = cantEjes;

}


public double calcularPesoPermitido() {

return capacidadCarga * cantEjes;

}


public void mover() {

System.out.println("El camion " + getMarca() + "modelo: " + getModelo() + "Circula con carga pesada" );

}

}

