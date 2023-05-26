package org.example;

import org.example.controlador.ControladrCompu;
import org.example.vista.VentanaComputadora;

public class Main {
    public static void main(String[] args) {
        VentanaComputadora ventanaComputadora = new VentanaComputadora("Prueba");
        //Nuevo
        ControladrCompu controller = new ControladrCompu(ventanaComputadora);
    }
}