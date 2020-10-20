/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.PersonaDB;
import Modelo.TipoPersonaDB;
import Vista.FormularioRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class ControladorCRUDRegistro implements ActionListener {

    private FormularioRegistro formularioregistro;
    private PersonaDB cliente;
    private TipoPersonaDB tipoPersona;
    private String num = "";

    public ControladorCRUDRegistro() {
    }

    public ControladorCRUDRegistro(FormularioRegistro formularioregistro, PersonaDB cliente, TipoPersonaDB tipoPersona) {
        this.formularioregistro = formularioregistro;
        this.cliente = cliente;
        this.tipoPersona = tipoPersona;
    }

    public void IniciaControlRegistro() {

        formularioregistro.getTxtCodigo().setText(cliente.Codigo());
        formularioregistro.getBtnRegistrar().addActionListener(i -> IngresarPersona());
        formularioregistro.getBtnCancelar().addActionListener(i -> SalirVentana());
    }

    public void SalirVentana() {
        limpiarFormulario();
        formularioregistro.setVisible(false);
    }

    public void IngresarPersona() {

        String cedula = formularioregistro.getTxtCedula().getText();
        String nombre = formularioregistro.getTxtNombre().getText();
        String apellido = formularioregistro.getTxtApellido().getText();
        String telefono = formularioregistro.getTxtTelefono().getText();
        String direccion = formularioregistro.getTxtDireccion().getText();
        String email = formularioregistro.getTxtEmail().getText();
        Instant instant = formularioregistro.getTxtEdad().getDate().toInstant();
        ZoneId zid = ZoneId.of("America/Guayaquil");
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, zid);
        Date edad = Date.valueOf(zdt.toLocalDate());
        String id_Persona = formularioregistro.getTxtCodigo().getText();
        String tipo = (String) formularioregistro.getCbxTipoPersona().getSelectedItem();
        String estadoPersona = (String) formularioregistro.getCbxEstadoPersona().getSelectedItem();
        PersonaDB cliente = new PersonaDB(cedula, nombre, apellido, telefono, direccion, email, edad);
        TipoPersonaDB tipoPersona = new TipoPersonaDB(id_Persona, tipo, estadoPersona, cedula);
        cliente.InsertarPersona();
        tipoPersona.IngresarTipoPersona();
        formularioregistro.setVisible(false);
        limpiarFormulario();

    }

    public void limpiarFormulario() {
        Instant instant = Instant.parse("2000-02-03T10:37:30.00Z");
        ZoneId zid = ZoneId.of("America/Guayaquil");
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, zid);
        Date date = Date.valueOf(zdt.toLocalDate());
        formularioregistro.getTxtNombre().setText("");
        formularioregistro.getTxtCedula().setText("");
        formularioregistro.getTxtApellido().setText("");
        formularioregistro.getTxtDireccion().setText("");
        formularioregistro.getTxtTelefono().setText("");
        //formularioregistro.getTxtContrasena().setText("");
        formularioregistro.getTxtEdad().setDate(date);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
