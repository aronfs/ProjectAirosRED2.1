/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaCasosSoporte;

/**
 *
 * @author aaron
 */
public class ControladorCRUDCasosSoporte {

    private VentanaCasosSoporte ventanaCasosSoporte;

    public ControladorCRUDCasosSoporte(VentanaCasosSoporte ventanaCasosSoporte) {
        this.ventanaCasosSoporte = ventanaCasosSoporte;
    }

    public ControladorCRUDCasosSoporte() {
    }

    public void Iniciar() {
        ventanaCasosSoporte.setVisible(true);
        ventanaCasosSoporte.setLocation(150, 30);
    }

}
