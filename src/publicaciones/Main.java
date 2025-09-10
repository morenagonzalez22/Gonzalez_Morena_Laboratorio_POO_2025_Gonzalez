package publicaciones;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "L001");
        Diario diario = new Diario("La Nación", "Redacción", 2024, "Grupo Nación");
        Revista revista = new Revista("National Geographic", "NatGeo", 2023, 150);

        Publicacion[] lista = { libro, diario, revista };
        for (Publicacion p : lista) {
            p.mostrarInformacion();
        }
    }
}
