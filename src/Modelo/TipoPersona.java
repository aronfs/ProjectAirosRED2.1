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
public class TipoPersona {

    private String Id_Persona;
    private String tipo_persona;
    private String estado_persona;
    private String cedula;

    public TipoPersona() {
    }

    public TipoPersona(String Id_Persona, String tipo_persona, String estado_persona, String cedula) {
        this.Id_Persona = Id_Persona;
        this.tipo_persona = tipo_persona;
        this.estado_persona = estado_persona;
        this.cedula = cedula;
    }

    public String getId_Persona() {
        return Id_Persona;
    }

    public void setId_Persona(String Id_Persona) {
        this.Id_Persona = Id_Persona;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public String getEstado_persona() {
        return estado_persona;
    }

    public void setEstado_persona(String estado_persona) {
        this.estado_persona = estado_persona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
