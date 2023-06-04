package org.example;

import org.example.Controlador.ControladorIA;
import org.example.Modelo.InteligenciaArtificial;
import org.example.Vista.VentanaIA;
import org.example.persistencia.IADAO;

import java.sql.SQLException;

public class DriverIA {
    public static void main(String[] args) {
        VentanaIA view = new VentanaIA("Inteligencia Artificial");
        ControladorIA controller = new ControladorIA(view);
    }
}