public class Automovil extends Vehiculo {
    protected String Tamaño;
    protected String Modelo;
    protected int Caballosdepotencia;

    public Automovil() {
    }

    public Automovil(String tipo, String marca, String submarca, String tamaño, String modelo, int caballosdepotencia) {
        super(tipo, marca, submarca);
        Tamaño = tamaño;
        Modelo = modelo;
        Caballosdepotencia = caballosdepotencia;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getCaballosdepotencia() {
        return Caballosdepotencia;
    }

    public void setCaballosdepotencia(int caballosdepotencia) {
        Caballosdepotencia = caballosdepotencia;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "Tamaño='" + Tamaño + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Caballosdepotencia=" + Caballosdepotencia +
                ", Tipo='" + Tipo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Submarca='" + Submarca + '\'' +
                '}';
    }

    public void Chocar(){
        System.out.println("El automovil chocó");
    }
    public void Acelerar(){
        System.out.println("El automovil está acelerando");
    }
}
