package T.PN1;

public class Main {

public static void main(String[] args) {

Auto auto = new Auto("Toyota", "Corolla", 180, 4, "Nafta");

Moto moto = new Moto("Honda", "CBR", 220, 150, true);

Camion camion = new Camion("Volvo", "FH16", 120, 20.5, 4);


System.out.println("Autonomía del auto: " + auto.calcularLitros(50, 12) + " km");

if (moto.llevarAcompaniante()) {

System.out.println("La moto puede llevar acompañante.");

} else {

System.out.println("La moto NO puede llevar acompañante.");

}

System.out.println("Peso total permitido del camión: " + camion.calcularPesoPermitido() + " toneladas");


double pesoAtransportar = 60.0;

if (pesoAtransportar <= camion.calcularPesoPermitido()) {

System.out.println("El camión puede transportar " + pesoAtransportar + " toneladas.");

} else {

System.out.println("El camión NO puede transportar " + pesoAtransportar + " toneladas, supera el límite.");

}


Vehiculo[] flota = { auto, moto, camion };

System.out.println("\n=== Demostración de polimorfismo con mover() ===");

	for (Vehiculo v : flota) {

		v.mover();

		}

	}

}