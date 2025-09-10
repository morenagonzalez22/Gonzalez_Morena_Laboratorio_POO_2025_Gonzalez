package biblioteca;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema Biblioteca Digital - Inicio ===\n");

        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "978-0307474728");
        Revista revista = new Revista("National Geographic", "Redacción NG", 2024, 3);

        Material[] inventario = { libro, revista };
        System.out.println("=== Mostrando materiales (polimorfismo) ===");
        for (Material m : inventario) {
            m.mostrarInfo();  
        }

        Usuario usuario = new Usuario("María Pérez", "12345678");

        Prestamo prestamo = new Prestamo(usuario, libro, 7);
        prestamo.mostrarPrestamo();

        int diasRetraso = 4;
        double multa = prestamo.calcularMulta(diasRetraso);
        System.out.println("El usuario " + usuario.getNombre() + " tiene un retraso de " +
                diasRetraso + " días. Multa a pagar: $" + multa + "\n");

        int diasParaRevista = 3;
        Prestamo prestamoRevista = new Prestamo(usuario, revista, diasParaRevista);
        if (prestamoRevista.getDiasPrestamo() < 5) {
            System.out.println("Préstamo de revista por " + prestamoRevista.getDiasPrestamo() +
                    " días. (Plazo corto recomendado para revistas).");
        }

        System.out.println("\n=== Sistema Biblioteca Digital - Fin ===");
    }
}
