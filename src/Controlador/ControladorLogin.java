/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.PersonaDB;
import Modelo.Persona;
import Modelo.TipoPersonaDB;
import Vista.FormularioRegistro;
import Vista.Login;
import Vista.MenuInicio2_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class ControladorLogin implements ActionListener {

    private Login login;
    private PersonaDB cliente;

    public ControladorLogin(Login login, PersonaDB cliente) {
        this.login = login;
        this.cliente = cliente;
    }

    public void IniciaControl() {
        login.setVisible(true);
        login.setLocationRelativeTo(null);

        login.getBtnRegistrarse().addActionListener(i -> IniciaRegistro());
        login.getBtnIngresar().addActionListener(i -> Ingresar());
    }

    public void Ingresar() {

        String nombre = login.getTxtCedulaLogin().getText();
        String cedula = login.getTxtContrasenaLogin().getText();
        PersonaDB cliente = new PersonaDB(cedula, nombre);
        if (cliente.IngresarPersona()) {
            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Administracion AirosRED");
            MenuInicio2_0 Vista = new MenuInicio2_0();
            ControladorVistaPrincipal control = new ControladorVistaPrincipal(Vista);
            control.InioiaControladorMenuInicio();

            List<Persona> listap = cliente.mostrarDatos(cedula);
            listap.forEach((t) -> {
                Vista.getLblCedula().setText(t.getCedula());
                Vista.getLblNombreUsuario().setText("  " + t.getNombre() + "  " + t.getApellido());
            });

            login.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Datos no validos");
        }

    }

    public void IniciaRegistro() {
        FormularioRegistro formulario = new FormularioRegistro();
        PersonaDB cliente = new PersonaDB();
        TipoPersonaDB tipopersona = new TipoPersonaDB();
        ControladorCRUDRegistro control = new ControladorCRUDRegistro(formulario, cliente, tipopersona);
        control.IniciaControlRegistro();
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
