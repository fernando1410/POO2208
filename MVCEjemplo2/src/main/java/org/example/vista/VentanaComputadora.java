package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaComputadora extends JFrame {
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblFrecuencia;
    private JLabel lblUrlFoto;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtFrecuencia;
    private JTextField txtUrlFoto;
    private JButton btnAgregar;
    private GridLayout layout;
    private JTable tblComputadora;
    private JScrollPane scrTabla;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel lblImagenCompu;

    public VentanaComputadora(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(224, 176, 224));
        lblMarca = new JLabel("Marca:");
        lblModelo = new JLabel("Modelo");
        lblFrecuencia = new JLabel("Frecuencia (GHz):");
        lblUrlFoto = new JLabel("URL Foto:");
        txtMarca = new JTextField(10);
        txtModelo = new JTextField(10);
        txtFrecuencia = new JTextField(5);
        txtUrlFoto = new JTextField(30);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblModelo);
        panel1.add(txtModelo);
        panel1.add(lblFrecuencia);
        panel1.add(txtFrecuencia);
        panel1.add(lblUrlFoto);
        panel1.add(txtUrlFoto);
        btnAgregar = new JButton("Agregar");
        panel1.add(btnAgregar);
        this.getContentPane().add(panel1,0);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(181, 224, 176));
        this.getContentPane().add(panel2,1);
        tblComputadora = new JTable();
        scrTabla = new JScrollPane(tblComputadora);
        panel2.add(scrTabla);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(176, 224, 220));
        this.getContentPane().add(panel3,2);
        lblImagenCompu = new JLabel("...");
        this.panel3.add(lblImagenCompu);

        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(215, 224, 176));
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    //Getters and Setters de TODOS LISTO
    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public void setLblModelo(JLabel lblModelo) {
        this.lblModelo = lblModelo;
    }

    public JLabel getLblFrecuencia() {
        return lblFrecuencia;
    }

    public void setLblFrecuencia(JLabel lblFrecuencia) {
        this.lblFrecuencia = lblFrecuencia;
    }

    public JLabel getLblUrlFoto() {
        return lblUrlFoto;
    }

    public void setLblUrlFoto(JLabel lblUrlFoto) {
        this.lblUrlFoto = lblUrlFoto;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JTextField getTxtFrecuencia() {
        return txtFrecuencia;
    }

    public void setTxtFrecuencia(JTextField txtFrecuencia) {
        this.txtFrecuencia = txtFrecuencia;
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

    public JTable getTblComputadora() {
        return tblComputadora;
    }

    public void setTblComputadora(JTable tblComputadora) {
        this.tblComputadora = tblComputadora;
    }

    public JScrollPane getScrTabla() {
        return scrTabla;
    }

    public void setScrTabla(JScrollPane scrTabla) {
        this.scrTabla = scrTabla;
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

    public JLabel getLblImagenCompu() {
        return lblImagenCompu;
    }

    public void setLblImagenCompu(JLabel lblImagenCompu) {
        this.lblImagenCompu = lblImagenCompu;
    }
}
