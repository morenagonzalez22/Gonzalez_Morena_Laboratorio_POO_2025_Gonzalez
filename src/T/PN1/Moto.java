package T.PN1;

public class Moto extends Vehiculo{

private int cilindrada;

private boolean tieneBaul;


public Moto(String marca, String modelo, int velocidadMaxima, int cilindrada, boolean tieneBaul) {

super(marca, modelo, velocidadMaxima);

this.cilindrada = cilindrada;

this.tieneBaul = tieneBaul;

}


public int getCilindrada() {

return cilindrada;

}


public boolean getTieneBaul() {

return tieneBaul;

}


public void setCilindrada(int cilindrada) {

this.cilindrada = cilindrada;

}


public void setTieneBaul(boolean tieneBaul) {

this.tieneBaul = tieneBaul;

}


public boolean llevarAcompaniante() {

return cilindrada >= 125;

}


public void mover() {

System.out.println("La moto " + getMarca() + "modelo: " + getModelo() + "esta circulando" );

}


}