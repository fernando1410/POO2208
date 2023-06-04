package org.example.persistencia;

import org.example.Modelo.InteligenciaArtificial;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class IADAO implements InterfazDAO{

    public IADAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO inteligencia(nombre,desarrollador,utilidad,plataforma,url) VALUES(?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("intaDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((InteligenciaArtificial)obj).getNombreIa());
        pstm.setString(2,((InteligenciaArtificial)obj).getDesarrollador());
        pstm.setString(3,((InteligenciaArtificial)obj).getUtilidad());
        pstm.setString(4,((InteligenciaArtificial)obj).getPlataforma());
        pstm.setString(5,((InteligenciaArtificial)obj).getUrlFoto());
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE inteligencia SET nombre = ?, desarrollador = ?, utilidad = ?, plataforma = ?, url = ? WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("intaDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((InteligenciaArtificial)obj).getNombreIa());
        pstm.setString(2,((InteligenciaArtificial)obj).getDesarrollador());
        pstm.setString(3,((InteligenciaArtificial)obj).getUtilidad());
        pstm.setString(4,((InteligenciaArtificial)obj).getPlataforma());
        pstm.setString(5,((InteligenciaArtificial)obj).getUrlFoto());
        pstm.setInt(6,((InteligenciaArtificial)obj).getId());
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM inteligencia WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("intaDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM inteligencia";
        ArrayList<InteligenciaArtificial> resultado = new ArrayList<>();

            Statement stm = ConexionSingleton.getInstance("intaDB.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new InteligenciaArtificial(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
            }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM inteligencia WHERE id = ?; ";
        InteligenciaArtificial inteligenciaArtificial = null;

            PreparedStatement pstm = ConexionSingleton.getInstance("intaDB.db").getConnection().prepareStatement(sql);
            pstm.setInt(1,Integer.parseInt(id));
            ResultSet rst = pstm.executeQuery();
            if (rst.next()){
                inteligenciaArtificial = new InteligenciaArtificial(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
                return inteligenciaArtificial;
            }

        return null;
    }
}
