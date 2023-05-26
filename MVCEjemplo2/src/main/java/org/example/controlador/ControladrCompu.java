package org.example.controlador;

import org.example.modelo.Computadora;
import org.example.modelo.ModeloTablaCompu;
import org.example.vista.VentanaComputadora;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladrCompu extends MouseAdapter {
    private VentanaComputadora view;
    private ModeloTablaCompu modelo;

    public ControladrCompu(VentanaComputadora view) {
        this.view = view;
        view.getBtnAgregar().addMouseListener(this);
        view.getTblComputadora().addMouseListener(this);
        modelo = new ModeloTablaCompu();
        view.getTblComputadora().setModel(modelo);
    }

    //clic
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnAgregar()){
            System.out.println("Se dio click en el botón");
            Computadora temp = new Computadora();
            temp.setMarca(view.getTxtMarca().getText());
            temp.setModelo(view.getTxtModelo().getText());
            temp.setFrecuenciaProcesador(Double.parseDouble(view.getTxtFrecuencia().getText()));
            temp.setUrlFoto(view.getTxtUrlFoto().getText());

            modelo.agregarComputadora(temp);
            view.getTblComputadora().updateUI();
        }

        if (e.getSource() == view.getTblComputadora()){
            System.out.println("Click sobre la tabla");
            int rowIndex = view.getTblComputadora().getSelectedRow();
            modelo.obtenerComputadora(rowIndex);
            Computadora temp = modelo.obtenerComputadora(rowIndex);
            view.getLblImagenCompu().setText("");
            view.getLblImagenCompu().setIcon(temp.createIcon());
        }
    }
}
