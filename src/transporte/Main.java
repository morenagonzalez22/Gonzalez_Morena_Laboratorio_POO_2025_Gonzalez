package transporte;

public class Main {
    public static void main(String[] args) {
        Transporte auto = new Auto(120, 5, "AAA123", "Nafta");
        Transporte avion = new Avion(900, 180, "BBB456", 12000);
        Transporte bici = new Bicicleta(25, 1, "CCC789", 29);

        Transporte[] lista = { auto, avion, bici };
        for (Transporte t : lista) {
            t.mover();
        }
    }
}
