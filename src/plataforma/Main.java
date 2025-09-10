package plataforma;

public class Main {
    public static void main(String[] args) {
        Usuario e = new Estudiante("Ana", "ana@mail.com", "1234", "Programación");
        Usuario d = new Docente("Luis", "luis@mail.com", "abcd", "Matemática");
        Usuario a = new Administrador("Carla", "carla@mail.com", "root", true);

        Usuario[] lista = { e, d, a };
        for (Usuario u : lista) {
            u.acceder();
        }
    }
}
