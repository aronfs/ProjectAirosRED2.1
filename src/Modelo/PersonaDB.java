/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaron
 */
public class PersonaDB extends Persona {

    ConnectPG conecta = new ConnectPG();

    String num = "";

    public PersonaDB() {
    }

    public PersonaDB(String Cedula, String Nombre) {
        super(Cedula, Nombre);
    }

    public PersonaDB(String Cedula, String Nombre, String Apellido, String Telefono, String direccion, String email, Date edad) {
        super(Cedula, Nombre, Apellido, Telefono, direccion, email, edad);
    }

    public boolean InsertarPersona() {
        
        
        String sql;
        sql = "INSERT INTO public.persona(\n"
                + "	cedula, nombre, apellido, telefono, direccion, email, \"fechaNacimiento\")\n"
                + "	VALUES ('" + getCedula() + "', '" + getNombre() + "', '" + getApellido() + "', '" + getTelefono() + "', '" + getDireccion() + "', '" + getEmail() + "', '" + getEdad() + "');";

        if (conecta.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
        

    }

    public boolean IngresarPersona() {
        String sql;
        sql = "SELECT cedula, nombre, apellido, telefono, direccion, email, \"fechaNacimiento\"\n"
                + "	FROM public.persona where cedula='" + getCedula() + "' and nombre='" + getNombre() + "';";

        if (conecta.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

    public List<Persona> mostrarDatos(String Cedula) {
        String sql = "SELECT cedula, nombre, apellido, telefono, direccion, email, \"fechaNacimiento\"\n"
                + "	FROM public.persona where cedula='" + Cedula + "' ;";
        ResultSet rs = conecta.query(sql);
        List<Persona> listaPersona = new ArrayList<>();
        try {
            while (rs.next()) {
                Persona p = new Persona();
                p.setCedula(rs.getString("cedula"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                listaPersona.add(p);
            }
            rs.close();
            return listaPersona;
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String Codigo() {
        int j;
        String num = "";
        String c = "";
        String SQL = "select max(cedula) from persona";
        try {

            ResultSet rs = conecta.query(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                String codigo = "CD0001";
                return codigo;
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                String r = "";
                r = "" + r1 + r2 + r3 + r4;

                j = Integer.parseInt(r);
                generar(j);
                String codigo = "CD" + serie();
                return codigo;
            }

        } catch (Exception e) {
            return null;
        }

    }

    public void generar(int dato) {
        int cont = 1;

        if ((dato >= 1000) || (dato < 1000)) {
            int can = cont + dato;
            num = "" + can;
        }
        if ((dato >= 100) || (dato < 100)) {
            int can = cont + dato;
            num = "0" + can;
        }
        if ((dato >= 9) || (dato < 100)) {
            int can = cont + dato;
            num = "00" + can;
        }
        if (dato < 9) {
            int can = cont + dato;
            num = "000" + can;
        }

    }

    public String serie() {
        return this.num;
    }
}
