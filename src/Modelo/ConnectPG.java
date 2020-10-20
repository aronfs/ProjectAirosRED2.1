/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaron
 */
public class ConnectPG {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    private String MiConexion = "jdbc:postgresql://localhost:5432/BaseDeDatosAirosRed2.0";
    private String usuarioPG = "postgres";
    private String contrasenaPG = "root";

    public ConnectPG() {
//Cargar driver de base de datos
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectPG.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Driver");
        }

        try {
            // conexion
            con = DriverManager.getConnection(MiConexion, usuarioPG, contrasenaPG);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectPG.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet query(String sql) {
        try {
            st = con.createStatement();

            ResultSet resultado = st.executeQuery(sql);
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectPG.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public SQLException noQuery(String nqry) {

        try {
            st = con.createStatement();
            st.execute(nqry);
            st.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectPG.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }

    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

}
