import java.util.Scanner;

public class TareaCad {

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la cadena
        System.out.println("Ingrese una cadena con nombre, profesión y nacionalidad: ");
        String cadena = scanner.nextLine();

        // Dividir la cadena en sus partes usando el método split() de la clase String
        String[] partes = cadena.split(" ");

        // Extraer las partes relevantes de la cadena
        String nombre = partes[0];
        String profesion = partes[1];
        String nacionalidad = partes[2];

        // Procesar las partes relevantes de la cadena usando los métodos de la clase String
        nombre = nombre.toUpperCase();
        profesion = profesion.toUpperCase();
        nacionalidad = nacionalidad.toUpperCase();

        // Mostrar la salida deseada al usuario
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesión: " + profesion);
        System.out.println("Nacionalidad: " + nacionalidad);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}