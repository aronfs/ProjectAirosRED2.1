/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FormularioFactura;
import Vista.VentanaFacturas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aaron
 */
public class ControladorVistaVentanas implements ActionListener {

    private VentanaFacturas ventanaFac;

    public ControladorVistaVentanas(VentanaFacturas ventanaFac) {
        this.ventanaFac = ventanaFac;
    }

    public void IniciaControlVentana() {
        ventanaFac.getBtnNuevoVentanaFactura().addActionListener(this);
    }

 

    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource() == ventanaFac.getBtnNuevoVentanaFactura()){
           FormularioFactura f = new FormularioFactura();
           f.setVisible(true);
       }
    }

}