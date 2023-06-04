package org.example.Vista;

import org.example.Modelo.ModeloTablaIA;

import javax.swing.*;
import java.awt.*;

public class VentanaIA extends JFrame {
    private JLabel lblId;
    private JLabel lblNombreIA;
    private JLabel lblDesarrollador;
    private JLabel lblUtilidad;
    private JLabel lblPlataforma;
    private JLabel lblUrlFoto;
    private JTextField txtId;
    private JTextField txtNombreIA;
    private JTextField txtDesarrollador;
    private JTextField txtUtilidad;
    private JTextField txtPlataforma;
    private JTextField txtUrlFoto;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private GridLayout layout;
    private JTable tblTabla;
    private JScrollPane scroll;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private ModeloTablaIA modelo;
    private JLabel lblImagenIA;
    private JLabel lblId2;
    private JLabel lblNombreIA2;
    private JLabel lblDesarrollador2;
    private JLabel lblUtilidad2;
    private JLabel lblPlataforma2;
    private JLabel lblUrlFoto2;
    private JTextField txtId2;
    private JTextField txtNombreIA2;
    private JTextField txtDesarrollador2;
    private JTextField txtUtilidad2;
    private JTextField txtPlataforma2;
    private JTextField txtUrlFoto2;
    private JLabel lblAgregar;
    private JLabel lblEliminarId;
    private JTextField txtElminarId;
    private JLabel lblSeparacion;

    public VentanaIA(String title) throws HeadlessException {
        super(title);
        this.setSize(1500,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(164,241,240));
        this.getContentPane().add(panel1,0);

        lblId = new JLabel("ID:");
        txtId = new JTextField(4);
        txtId.setText("0");
        txtId.setEnabled(false);
        panel1.add(lblId);
        panel1.add(txtId);

        lblNombreIA = new JLabel("Nombre IA:");
        txtNombreIA = new JTextField(12);
        panel1.add(lblNombreIA);
        panel1.add(txtNombreIA);

        lblDesarrollador = new JLabel("Desarrollador:");
        txtDesarrollador = new JTextField(12);
        panel1.add(lblDesarrollador);
        panel1.add(txtDesarrollador);

        lblUtilidad = new JLabel("Utilidad:");
        txtUtilidad = new JTextField(17);
        panel1.add(lblUtilidad);
        panel1.add(txtUtilidad);

        lblPlataforma = new JLabel("Plataforma:");
        txtPlataforma = new JTextField(17);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);

        lblUrlFoto = new JLabel("URL:");
        txtUrlFoto = new JTextField(35);
        panel1.add(lblUrlFoto);
        panel1.add(txtUrlFoto);

        btnAgregar = new JButton("Agregar");
        panel1.add(btnAgregar);


        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(130, 222, 218));
        this.getContentPane().add(panel2,1);
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);

        tblTabla = new JTable();
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);


        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(111, 155, 153));
        this.getContentPane().add(panel3,2);
        lblImagenIA = new JLabel("Aqui va la foto :)");
        this.panel3.add(lblImagenIA);


        //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(46, 128, 125));
        this.getContentPane().add(panel4,3);

        lblId2 = new JLabel("ID por modificar:");
        txtId2 = new JTextField(4);
        panel4.add(lblId2);
        panel4.add(txtId2);

        lblNombreIA2 = new JLabel("Nuevo nombre IA:");
        txtNombreIA2 = new JTextField(17);
        panel4.add(lblNombreIA2);
        panel4.add(txtNombreIA2);

        lblDesarrollador2 = new JLabel("Nuevo desarrollador:");
        txtDesarrollador2 = new JTextField(17);
        panel4.add(lblDesarrollador2);
        panel4.add(txtDesarrollador2);

        lblUtilidad2 = new JLabel("Nueva utilidad:");
        txtUtilidad2 = new JTextField(26);
        panel4.add(lblUtilidad2);
        panel4.add(txtUtilidad2);

        lblPlataforma2 = new JLabel("Nueva plataforma:");
        txtPlataforma2 = new JTextField(26);
        panel4.add(lblPlataforma2);
        panel4.add(txtPlataforma2);

        lblUrlFoto2 = new JLabel("Nuevo URL:");
        txtUrlFoto2 = new JTextField(52);
        panel4.add(lblUrlFoto2);
        panel4.add(txtUrlFoto2);

        btnActualizar = new JButton("Actualizar datos");
        panel4.add(btnActualizar);

        lblSeparacion = new JLabel("------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------------------------------------------");
        panel4.add(lblSeparacion);

        lblEliminarId = new JLabel("ID por eliminar");
        txtElminarId = new JTextField(4);
        panel4.add(lblEliminarId);
        panel4.add(txtElminarId);

        btnEliminar = new JButton("Eliminar");
        panel4.add(btnEliminar);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombreIA() {
        return lblNombreIA;
    }

    public void setLblNombreIA(JLabel lblNombreIA) {
        this.lblNombreIA = lblNombreIA;
    }

    public JLabel getLblDesarrollador() {
        return lblDesarrollador;
    }

    public void setLblDesarrollador(JLabel lblDesarrollador) {
        this.lblDesarrollador = lblDesarrollador;
    }

    public JLabel getLblUtilidad() {
        return lblUtilidad;
    }

    public void setLblUtilidad(JLabel lblUtilidad) {
        this.lblUtilidad = lblUtilidad;
    }

    public JLabel getLblPlataforma() {
        return lblPlataforma;
    }

    public void setLblPlataforma(JLabel lblPlataforma) {
        this.lblPlataforma = lblPlataforma;
    }

    public JLabel getLblUrlFoto() {
        return lblUrlFoto;
    }

    public void setLblUrlFoto(JLabel lblUrlFoto) {
        this.lblUrlFoto = lblUrlFoto;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombreIA() {
        return txtNombreIA;
    }

    public void setTxtNombreIA(JTextField txtNombreIA) {
        this.txtNombreIA = txtNombreIA;
    }

    public JTextField getTxtDesarrollador() {
        return txtDesarrollador;
    }

    public void setTxtDesarrollador(JTextField txtDesarrollador) {
        this.txtDesarrollador = txtDesarrollador;
    }

    public JTextField getTxtUtilidad() {
        return txtUtilidad;
    }

    public void setTxtUtilidad(JTextField txtUtilidad) {
        this.txtUtilidad = txtUtilidad;
    }

    public JTextField getTxtPlataforma() {
        return txtPlataforma;
    }

    public void setTxtPlataforma(JTextField txtPlataforma) {
        this.txtPlataforma = txtPlataforma;
    }

    public JTextField getTxtUrlFoto() {
        return txtUrlFoto;
    }

    public void setTxtUrlFoto(JTextField txtUrlFoto) {
        this.txtUrlFoto = txtUrlFoto;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JTable getTblTabla() {
        return tblTabla;
    }

    public void setTblTabla(JTable tblTabla) {
        this.tblTabla = tblTabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public ModeloTablaIA getModelo() {
        return modelo;
    }

    public void setModelo(ModeloTablaIA modelo) {
        this.modelo = modelo;
    }

    public JLabel getLblImagenIA() {
        return lblImagenIA;
    }

    public void setLblImagenIA(JLabel lblImagenIA) {
        this.lblImagenIA = lblImagenIA;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JLabel getLblId2() {
        return lblId2;
    }

    public void setLblId2(JLabel lblId2) {
        this.lblId2 = lblId2;
    }

    public JLabel getLblNombreIA2() {
        return lblNombreIA2;
    }

    public void setLblNombreIA2(JLabel lblNombreIA2) {
        this.lblNombreIA2 = lblNombreIA2;
    }

    public JLabel getLblDesarrollador2() {
        return lblDesarrollador2;
    }

    public void setLblDesarrollador2(JLabel lblDesarrollador2) {
        this.lblDesarrollador2 = lblDesarrollador2;
    }

    public JLabel getLblUtilidad2() {
        return lblUtilidad2;
    }

    public void setLblUtilidad2(JLabel lblUtilidad2) {
        this.lblUtilidad2 = lblUtilidad2;
    }

    public JLabel getLblPlataforma2() {
        return lblPlataforma2;
    }

    public void setLblPlataforma2(JLabel lblPlataforma2) {
        this.lblPlataforma2 = lblPlataforma2;
    }

    public JLabel getLblUrlFoto2() {
        return lblUrlFoto2;
    }

    public void setLblUrlFoto2(JLabel lblUrlFoto2) {
        this.lblUrlFoto2 = lblUrlFoto2;
    }

    public JTextField getTxtId2() {
        return txtId2;
    }

    public void setTxtId2(JTextField txtId2) {
        this.txtId2 = txtId2;
    }

    public JTextField getTxtNombreIA2() {
        return txtNombreIA2;
    }

    public void setTxtNombreIA2(JTextField txtNombreIA2) {
        this.txtNombreIA2 = txtNombreIA2;
    }

    public JTextField getTxtDesarrollador2() {
        return txtDesarrollador2;
    }

    public void setTxtDesarrollador2(JTextField txtDesarrollador2) {
        this.txtDesarrollador2 = txtDesarrollador2;
    }

    public JTextField getTxtUtilidad2() {
        return txtUtilidad2;
    }

    public void setTxtUtilidad2(JTextField txtUtilidad2) {
        this.txtUtilidad2 = txtUtilidad2;
    }

    public JTextField getTxtPlataforma2() {
        return txtPlataforma2;
    }

    public void setTxtPlataforma2(JTextField txtPlataforma2) {
        this.txtPlataforma2 = txtPlataforma2;
    }

    public JTextField getTxtUrlFoto2() {
        return txtUrlFoto2;
    }

    public void setTxtUrlFoto2(JTextField txtUrlFoto2) {
        this.txtUrlFoto2 = txtUrlFoto2;
    }

    public JLabel getLblAgregar() {
        return lblAgregar;
    }

    public void setLblAgregar(JLabel lblAgregar) {
        this.lblAgregar = lblAgregar;
    }

    public JLabel getLblEliminarId() {
        return lblEliminarId;
    }

    public void setLblEliminarId(JLabel lblEliminarId) {
        this.lblEliminarId = lblEliminarId;
    }

    public JTextField getTxtElminarId() {
        return txtElminarId;
    }

    public void setTxtElminarId(JTextField txtElminarId) {
        this.txtElminarId = txtElminarId;
    }

    public JLabel getLblSeparacion() {
        return lblSeparacion;
    }

    public void setLblSeparacion(JLabel lblSeparacion) {
        this.lblSeparacion = lblSeparacion;
    }

    public void limpiar(){
        txtNombreIA.setText("");
        txtDesarrollador.setText("");
        txtUtilidad.setText("");
        txtPlataforma.setText("");
        txtUrlFoto.setText("");
    }
    public void limpiar2(){
        txtNombreIA2.setText("");
        txtDesarrollador2.setText("");
        txtUtilidad2.setText("");
        txtPlataforma2.setText("");
        txtUrlFoto2.setText("");
        txtId2.setText("");
        txtElminarId.setText("");
    }
}
