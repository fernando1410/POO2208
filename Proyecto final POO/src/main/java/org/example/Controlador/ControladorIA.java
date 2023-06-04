package org.example.Controlador;

import org.example.Modelo.InteligenciaArtificial;
import org.example.Modelo.ModeloTablaIA;
import org.example.Vista.VentanaIA;
import org.example.persistencia.ConexionSingleton;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorIA extends MouseAdapter {
    private VentanaIA view;
    private ModeloTablaIA modelo;

    public ControladorIA(VentanaIA view) {
        this.view = view;
        modelo = new ModeloTablaIA();
        this.view.getTblTabla().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblTabla().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {
            modelo.cargarDatos();
            this.view.getTblTabla().setModel(modelo);
            this.view.getTblTabla().updateUI();

        }

        if (e.getSource() == this.view.getBtnAgregar()) {
            InteligenciaArtificial temp = new InteligenciaArtificial();
            temp.setId(0);
            temp.setNombreIa(this.view.getTxtNombreIA().getText());
            temp.setDesarrollador(this.view.getTxtDesarrollador().getText());
            temp.setUtilidad(this.view.getTxtUtilidad().getText());
            temp.setPlataforma(this.view.getTxtPlataforma().getText());
            temp.setUrlFoto(this.view.getTxtUrlFoto().getText());

            if (modelo.agregarIA(temp)) {
                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblTabla().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Por favor revise su conexion", "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }

        if (e.getSource() == this.view.getBtnEliminar()) {
            int respuesta = JOptionPane.showConfirmDialog(view, "Estas seguro de borrar el registro?", "Eliminar", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                String sqlDelete = "DELETE FROM inteligencia WHERE id=?;";
                PreparedStatement pstm = null;
                try {
                    pstm = ConexionSingleton.getInstance("intaDB.db").getConnection().prepareStatement(sqlDelete);
                } catch (SQLException sqle) {
                    throw new RuntimeException(sqle);
                }
                try {
                    pstm.setInt(1, Integer.parseInt(this.view.getTxtElminarId().getText()));
                    this.view.getTblTabla().updateUI();
                    JOptionPane.showMessageDialog(view, "Se elimino correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(view, "Error al eliminar", "Aviso", JOptionPane.ERROR_MESSAGE);
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                try {
                    pstm.executeUpdate();
                } catch (SQLException sqle) {
                    JOptionPane.showMessageDialog(view, "Error en Id", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    throw new RuntimeException(sqle);
                } finally {
                    this.view.limpiar2();
                }

            }
        }

        if (e.getSource() == this.view.getBtnActualizar()) {
            int respuesta = JOptionPane.showConfirmDialog(view, "Estas seguro de actualizar el registro?", "Actualizar datos", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                InteligenciaArtificial inteligenciaArtificial = new InteligenciaArtificial();
                inteligenciaArtificial.setId(Integer.parseInt((String) this.view.getTxtId2().getText()));
                inteligenciaArtificial.setNombreIa(this.view.getTxtNombreIA2().getText());
                inteligenciaArtificial.setDesarrollador(this.view.getTxtDesarrollador2().getText());
                inteligenciaArtificial.setUtilidad(this.view.getTxtUtilidad2().getText());
                inteligenciaArtificial.setPlataforma(this.view.getTxtPlataforma2().getText());
                inteligenciaArtificial.setUrlFoto(this.view.getTxtUrlFoto2().getText());
                this.view.getTblTabla().updateUI();
                if (modelo.actualizarIA(inteligenciaArtificial)) {
                    JOptionPane.showMessageDialog(view, "Se actualizo correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.view.getTblTabla().updateUI();
                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo actualizar", "Aviso", JOptionPane.ERROR_MESSAGE);

                }
                this.view.limpiar2();
            }else {
                this.view.limpiar2();
            }
        }

        if (e.getSource() == this.view.getTblTabla()) {
            int rowIndex = this.view.getTblTabla().getSelectedRow();
            modelo.obtenerIA(rowIndex);
            InteligenciaArtificial temp = modelo.obtenerIA(rowIndex);
            this.view.getLblImagenIA().setText("");
            this.view.getLblImagenIA().setIcon(temp.createIcon());
        }
    }
}