package org.example.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class InteligenciaArtificial {
    private int Id;
    private String NombreIa;
    private String Desarrollador;
    private String Utilidad;
    private String Plataforma;
    private String urlFoto;

    public InteligenciaArtificial() {
    }

    public InteligenciaArtificial(int id, String nombreIa, String desarrollador, String utilidad, String plataforma, String urlFoto) {
        Id = id;
        NombreIa = nombreIa;
        Desarrollador = desarrollador;
        Utilidad = utilidad;
        Plataforma = plataforma;
        this.urlFoto = urlFoto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombreIa() {
        return NombreIa;
    }

    public void setNombreIa(String nombreIa) {
        NombreIa = nombreIa;
    }

    public String getDesarrollador() {
        return Desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        Desarrollador = desarrollador;
    }

    public String getUtilidad() {
        return Utilidad;
    }

    public void setUtilidad(String utilidad) {
        Utilidad = utilidad;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String plataforma) {
        Plataforma = plataforma;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "InteligenciaArtificial{" +
                "Id=" + Id +
                ", NombreIa='" + NombreIa + '\'' +
                ", Desarrollador='" + Desarrollador + '\'' +
                ", Utilidad='" + Utilidad + '\'' +
                ", Plataforma='" + Plataforma + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }
    public ImageIcon createIcon(){
        ImageIcon resultado = null;
        try{
            URL urlImagen = new URL(this.urlFoto);
            resultado = new ImageIcon(urlImagen);
        }catch (MalformedURLException mue){
            System.out.println(mue.toString());
        }
        return resultado;
    }
}
