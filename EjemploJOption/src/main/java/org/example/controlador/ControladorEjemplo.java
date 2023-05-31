package org.example.controlador;

import org.example.vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorEjemplo extends MouseAdapter {
    private Ventana view;

    public ControladorEjemplo(Ventana view) {
        this.view = view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnMensaje()){
            ImageIcon icono = new ImageIcon("Like.png");
            JOptionPane.showMessageDialog(view,"Hola desde la computadora","Mensaje",JOptionPane.INFORMATION_MESSAGE,icono);
        }

        if (e.getSource() == view.getBtnEntrada()){
            String datos = JOptionPane.showInputDialog(view,"Ejemplo de entrada","Entrada libre",JOptionPane.QUESTION_MESSAGE);
            this.view.getLblResultado().setText(datos);
        }

        if (e.getSource() == view.getBtnOpcion()){
            int respuesta = JOptionPane.showConfirmDialog(view,"¿Estas seguro de borrar la base de datos?","Confirmacion",JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_NO_OPTION){
                view.getLblResultado().setText("Elegiste opcion SI");
            }else {
                view.getLblResultado().setText("Elegiste opcion NO");
            }
        }
    }
}
