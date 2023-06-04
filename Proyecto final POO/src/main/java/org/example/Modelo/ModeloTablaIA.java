package org.example.Modelo;

import org.example.persistencia.IADAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaIA implements TableModel {
    public static final int COLS = 6;
     private ArrayList<InteligenciaArtificial> datos;
     private IADAO iadao;
     public ModeloTablaIA() {
        iadao = new IADAO();
        datos = new ArrayList<>();
    }
    public ModeloTablaIA(ArrayList<InteligenciaArtificial> datos) {
        this.datos = datos;
        iadao = new IADAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "ID";
            case 1:
                return "Nombre IA";
            case 2:
                return "Desarrollador";
            case 3:
                return "Utilidad";
            case 4:
                return "Plataforma";
            case 5:
                return "URL";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InteligenciaArtificial tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombreIa();
            case 2:
                return tmp.getDesarrollador();
            case 3:
                return tmp.getUtilidad();
            case 4:
                return tmp.getPlataforma();
            case 5:
                return tmp.getUrlFoto();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId((Integer)aValue);
                break;
            case 1:
                datos.get(rowIndex).setNombreIa((String)aValue);
                break;
            case 2:
                datos.get(rowIndex).setDesarrollador((String)aValue);
                break;
            case 3:
                datos.get(rowIndex).setUtilidad((String)aValue);
                break;
            case 4:
                datos.get(rowIndex).setPlataforma((String)aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrlFoto((String)aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public boolean agregarIA(InteligenciaArtificial IA){
         boolean resultado = false;
         try {
             if (iadao.insertar(IA)){
                 datos.add(IA);
                 resultado = true;
             }else {
                 resultado = false;
             }
         }catch (SQLException sqle){
             System.out.println(sqle.getMessage());
         }
         return resultado;
    }

        public boolean eliminarIA(InteligenciaArtificial ia){
        boolean resultado = false;
        try {
            if (iadao.delete(String.valueOf(ia))){
                datos.add(ia);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean actualizarIA(InteligenciaArtificial ia){
         boolean resultado = false;
         try {
             if (iadao.update(ia)){
                 datos.add(ia);
                 resultado = true;
             }else {
                 resultado = false;
             }
         }catch (SQLException sqle){
             System.out.println(sqle.getMessage());
         }
         return resultado;
    }

    public InteligenciaArtificial obtenerIA(int rowIndex){
        return datos.get(rowIndex);
    }
    public void cargarDatos(){
         try {
             ArrayList<InteligenciaArtificial> tirar = iadao.obtenerTodo();
             System.out.println(tirar);
             datos = iadao.obtenerTodo();
         }catch (SQLException sqle){
             System.out.println(sqle.getMessage());
         }
    }
}
