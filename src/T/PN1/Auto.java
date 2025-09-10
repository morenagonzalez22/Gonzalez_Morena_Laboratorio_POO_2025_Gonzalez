package T.PN1;

public class Auto extends Vehiculo {

private int cantPuertas;

private String tipoCombustible;


public Auto(String marca, String modelo, int velocidadMaxima, int cantPuertas, String tipoCombustible) {

super(marca, modelo, velocidadMaxima);

this.cantPuertas = cantPuertas;

this.tipoCombustible = tipoCombustible;

}


public int getCantPuertas() {

return cantPuertas;

}


public String getTipoCombustible() {

return tipoCombustible;

}


public void setCantPuertas(int cantPuertas) {

this.cantPuertas = cantPuertas;

}


public void setTipoCombustible(String tipoCombustible) {

this.tipoCombustible = tipoCombustible;

}


public double calcularLitros(double litrosCombustible, double consumoLitroKM) {

return litrosCombustible * consumoLitroKM; }


public void mover() {

System.out.println("El auto " + getMarca() + "modelo: " + getModelo() + "esta circulando");

}



}



