/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author aaron
 */
public class TipoPersonaDB extends TipoPersona {

    ConnectPG conecta = new ConnectPG();

    public TipoPersonaDB() {
    }

    public TipoPersonaDB(String Id_Persona, String tipo_persona, String estado_persona, String cedula) {
        super(Id_Persona, tipo_persona, estado_persona, cedula);
    }

    public boolean IngresarTipoPersona() {
        String sql = "INSERT INTO public.tipopersona(\n"
                + "	id_persona, tipo_persona, estado_persona, cedula)\n"
                + "	VALUES ('" + getId_Persona() + "', '" + getTipo_persona() + "', '" + getEstado_persona() + "', '" + getCedula() + "');";

        if (conecta.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }

    }

}
