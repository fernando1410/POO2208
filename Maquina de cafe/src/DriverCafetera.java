import java.util.Scanner;

public class DriverCafetera {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("\n¿Que tipo de cafe quieres?\nTenemos disponible americano, expresso y capuchino\n");
            String tipo = entrada.nextLine();

            if (tipo.equals("salir")) {
                break;
            }

            cafetera.hacerCafe(tipo);
        }
    }
}
