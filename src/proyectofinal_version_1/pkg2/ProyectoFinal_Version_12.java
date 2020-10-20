/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_version_1.pkg2;

import Controlador.ControladorLogin;
import Controlador.ControladorVistaPrincipal;
import Modelo.PersonaDB;

import Vista.*;

/**
 *
 * @author aaron
 */
public class ProyectoFinal_Version_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaDB cliente = new PersonaDB();
        Login login = new Login();
        ControladorLogin control = new ControladorLogin(login, cliente);
        control.IniciaControl();

    }

}
