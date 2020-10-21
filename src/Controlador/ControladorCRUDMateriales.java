/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaMateriales;

/**
 *
 * @author aaron
 */
public class ControladorCRUDMateriales {
    
    private final VentanaMateriales ventanaMateriales;
    
    public ControladorCRUDMateriales(VentanaMateriales ventanaMateriales) {
        this.ventanaMateriales = ventanaMateriales;
    }
    
    public void iniciar() {
        ventanaMateriales.setTitle("Ventana Materiales");
        ventanaMateriales.setVisible(true);
        ventanaMateriales.setLocation(150, 30);
        
    }
    
}
