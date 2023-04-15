import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Taxi tax = new Taxi("Carro","Nissan","Tsuru tuneado","Mediano","2000",105, Color.white,13.80,4);
        System.out.println(tax);
        tax.Encender();
        tax.Apagar();
        tax.Chocar();
        tax.Acelerar();
        tax.SubirPasaje();
        tax.Cobrar();
    }
}
