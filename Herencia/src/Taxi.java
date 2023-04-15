import java.awt.*;

public class Taxi extends Automovil{
    private java.awt.Color Color;
    private Double tarifa;
    private int Numpasajeros;

    public Taxi() {
    }

    public Taxi(String tipo, String marca, String submarca, String tamaño, String modelo, int caballosdepotencia, java.awt.Color color, Double tarifa, int numpasajeros) {
        super(tipo, marca, submarca, tamaño, modelo, caballosdepotencia);
        Color = color;
        this.tarifa = tarifa;
        Numpasajeros = numpasajeros;
    }

    public java.awt.Color getColor() {
        return Color;
    }

    public void setColor(java.awt.Color color) {
        Color = color;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public int getNumpasajeros() {
        return Numpasajeros;
    }

    public void setNumpasajeros(int numpasajeros) {
        Numpasajeros = numpasajeros;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Color=" + Color +
                ", tarifa=" + tarifa +
                ", Numpasajeros=" + Numpasajeros +
                ", Tamaño='" + Tamaño + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Caballosdepotencia=" + Caballosdepotencia +
                ", Tipo='" + Tipo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Submarca='" + Submarca + '\'' +
                '}';
    }

    public void SubirPasaje(){
        System.out.println("El taxi está subiendo pasaje");
    }
    public void Cobrar(){
        System.out.println("El chofer del taxi tenía alterado el taximetro");
    }
}
