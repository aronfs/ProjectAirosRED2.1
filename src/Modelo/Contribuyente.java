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
public class Contribuyente {

    private String ruc;
    private float ingresosAnuales;
    private String ciudad;
    private String nombreComercial;
    private String telefono;
    private String estadoContribuyente;
    private String cedula;

    public Contribuyente() {
    }

    public Contribuyente(String ruc, float ingresosAnuales, String ciudad, String nombreComercial, String telefono, String estadoContribuyente, String cedula) {
        this.ruc = ruc;
        this.ingresosAnuales = ingresosAnuales;
        this.ciudad = ciudad;
        this.nombreComercial = nombreComercial;
        this.telefono = telefono;
        this.estadoContribuyente = estadoContribuyente;
        this.cedula = cedula;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public float getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(float ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstadoContribuyente() {
        return estadoContribuyente;
    }

    public void setEstadoContribuyente(String estadoContribuyente) {
        this.estadoContribuyente = estadoContribuyente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
