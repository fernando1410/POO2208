public class Vehiculo {
    protected String Tipo;
    protected String Marca;
    protected String Submarca;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String marca, String submarca) {
        Tipo = tipo;
        Marca = marca;
        Submarca = submarca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getSubmarca() {
        return Submarca;
    }

    public void setSubmarca(String submarca) {
        Submarca = submarca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Tipo='" + Tipo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Submarca='" + Submarca + '\'' +
                '}';
    }

    public void Encender(){
        System.out.println("Encendiendo el vehículo....");
    }
    public void Apagar(){
        System.out.println("Apagando el vehículo....");
    }

}
