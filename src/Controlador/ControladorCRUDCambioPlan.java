/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FormularioCambioPlan;
import Vista.VentanaCambioPlan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aaron
 */
public class ControladorCRUDCambioPlan implements ActionListener {

    private VentanaCambioPlan ventanaCambioPlan;
    private FormularioCambioPlan formualCambioPlan;

    public ControladorCRUDCambioPlan(VentanaCambioPlan ventanaCambioPlan, FormularioCambioPlan formualCambioPlan) {
        this.ventanaCambioPlan = ventanaCambioPlan;
        this.formualCambioPlan = formualCambioPlan;
    }

    public ControladorCRUDCambioPlan() {
    }

    public void Iniciar() {
        ventanaCambioPlan.setVisible(true);
        ventanaCambioPlan.setLocation(150, 30);
    }

    public void IniciaControl(){
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
