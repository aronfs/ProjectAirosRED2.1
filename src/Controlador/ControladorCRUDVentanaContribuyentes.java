/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Modelo.PersonaDB;
import Vista.FormularioContribuyentes;
import Vista.Login;
import Vista.MenuInicio2_0;
import Vista.VentanaContribuentes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaContribuyentes implements ActionListener {

    private final VentanaContribuentes ventanaContribuyentes;
    private final FormularioContribuyentes formularioContribuyentes;
    private final PersonaDB persona;
    private final MenuInicio2_0 menu;
    private final Login login;

    public ControladorCRUDVentanaContribuyentes(VentanaContribuentes ventanaContribuyentes, FormularioContribuyentes formularioContribuyentes, PersonaDB persona, MenuInicio2_0 menu, Login login) {
        this.ventanaContribuyentes = ventanaContribuyentes;
        this.formularioContribuyentes = formularioContribuyentes;
        this.persona = persona;
        this.menu = menu;
        this.login = login;
    }

    public void iniciar() {
        ventanaContribuyentes.setVisible(true);
        ventanaContribuyentes.setLocation(150, 30);
    }

    public void iniciaControl() {
        ventanaContribuyentes.getVentanaContribuyente_BntNuevo().addActionListener(i -> mostrarFormulario());
    }

    public void mostrarFormulario() {
        String cedula = login.getTxtContrasenaLogin().getText();
        List<Persona> listap = persona.mostrarDatos(cedula);
        listap.forEach((t) -> {
            formularioContribuyentes.getTxtCedula().setText(t.getCedula());
        });
        formularioContribuyentes.setVisible(true);
        //  formularioContribuyentes.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
