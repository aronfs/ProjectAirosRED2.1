/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.PersonaDB;

import Vista.FormularioContribuyentes;
import Vista.FormularioFactura;
import Vista.Login;
import Vista.MenuInicio2_0;
import Vista.OrdenesTrabajo;

import Vista.VentanaCasosSoporte;

import Vista.VentanaContratos;
import Vista.VentanaContribuentes;
import Vista.VentanaFacturas;
import Vista.VentanaMateriales;

import Vista.VentanaMotivosSoporte;

import Vista.VentanaPlanesInternet;

import Vista.VentanaSuspension;

import Vista.VentanaVelocidades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author aaron
 */
public class ControladorVistaPrincipal implements MouseListener, ActionListener {

    private final MenuInicio2_0 Vista;

    public ControladorVistaPrincipal(MenuInicio2_0 Vista) {
        this.Vista = Vista;
        Vista.setLocationRelativeTo(null);
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
        Vista.getLblFactura().setVisible(false);
        Vista.getLbltipoContratos().setVisible(false);
        Vista.getLbltipoOrdenes().setVisible(false);
        Vista.getLblContribuyentes().setVisible(false);
        Vista.getLblItems().setVisible(false);

        Vista.getLblTarifaInstalacion().setVisible(false);
        Vista.getLbltipoCliente().setVisible(false);

        Vista.getLblCasosSoporte().setVisible(false);
        Vista.getLblMotivoSoporte().setVisible(false);

        // Vista.getLblSeries().setVisible(false);
    }

    public void InioiaControladorMenuInicio() {
        Vista.getBtnFacturas().addMouseListener(this);
        Vista.getLblVentas().addMouseListener(this);
        Vista.getBtnSalir().addMouseListener(this);

        Vista.getBtnContribuyentes().addMouseListener(this);
        Vista.getBtnItems().addMouseListener(this);

        Vista.getBtnReportes().addMouseListener(this);

        Vista.getBtnPlaneInternet().addMouseListener(this);

        Vista.getBtnSuspension().addMouseListener(this);

        Vista.getBtnContratos().addMouseListener(this);
        Vista.getBtnOrdenesTrabajo().addMouseListener(this);
        Vista.getBtnCasosSoporte().addMouseListener(this);
        Vista.getBtnMotivosSoporte().addMouseListener(this);

        Vista.getLblInventario().addMouseListener(this);
        Vista.getLblDirectorio().addMouseListener(this);
        Vista.getLblProvServiciosInternet().addMouseListener(this);
        Vista.getLblRegistroLlamadas().addMouseListener(this);
        Vista.getBtnOrdenesTrabajo().addMouseListener(this);
        Vista.getBtnContratos().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        if (me.getSource() == Vista.getBtnFacturas()) {
            mostrarVentanaFactura();
        }

        if (me.getSource() == Vista.getBtnContribuyentes()) {
            mostrarVentanaContribuyentes();
        }

        if (me.getSource() == Vista.getBtnPlaneInternet()) {
            mostrarVentanaPlanesInternet();
        }

        if (me.getSource() == Vista.getBtnCasosSoporte()) {
            mostrarVentanaCasosSoporte();
        }
        if (me.getSource() == Vista.getBtnMotivosSoporte()) {
            mostrarVentanaMotivosSoporte();
        }

        if (me.getSource() == Vista.getBtnOrdenesTrabajo()) {
            mostrarVenantaOrdenesTrabajo();
        }

        if (me.getSource() == Vista.getBtnContratos()) {
            mostrarVentanaContratos();
        }

        if (me.getSource() == Vista.getBtnMateriales()) {
            mostrarVentanaMateriales();
        }

        if (me.getSource() == Vista.getBtnSuspension()) {
            mostrarVentanaSuspension();
        }

        if (me.getSource() == Vista.getBtnSalir()) {
            System.exit(0);
        }

        if (me.getSource() == Vista.getLblVentas()) {
            Vista.getLblFactura().setVisible(false);
        }

        if (me.getSource() == Vista.getLblDirectorio()) {
            Vista.getLblContribuyentes().setVisible(false);
        }
        if (me.getSource() == Vista.getLblInventario()) {
            Vista.getLblItems().setVisible(false);
            //Vista.getLblSeries().setVisible(true);
        }

        if (me.getSource() == Vista.getLblProvServiciosInternet()) {

            Vista.getLblTarifaInstalacion().setVisible(false);
            Vista.getLbltipoCliente().setVisible(false);
            Vista.getLbltipoContratos().setVisible(false);
            Vista.getLbltipoOrdenes().setVisible(false);
        }

//        if (me.getSource() == Vista.getBtnSolicitudes()) {
//            
//        }
        if (me.getSource() == Vista.getLblRegistroLlamadas()) {
            Vista.getLblCasosSoporte().setVisible(false);
            Vista.getLblMotivoSoporte().setVisible(false);

        }

    }

    @Override
    public void mousePressed(MouseEvent me) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (me.getSource() == Vista.getLblVentas()) {
            Vista.getLblFactura().setVisible(true);

        }

        if (me.getSource() == Vista.getLblDirectorio()) {
            Vista.getLblContribuyentes().setVisible(true);
        }
        if (me.getSource() == Vista.getLblInventario()) {
            Vista.getLblItems().setVisible(true);
            //Vista.getLblSeries().setVisible(true);
        }

        if (me.getSource() == Vista.getLblProvServiciosInternet()) {

            Vista.getLblTarifaInstalacion().setVisible(true);
            Vista.getLbltipoCliente().setVisible(true);
            Vista.getLbltipoContratos().setVisible(true);
            Vista.getLbltipoOrdenes().setVisible(true);

        }

        if (me.getSource() == Vista.getLblRegistroLlamadas()) {
            Vista.getLblCasosSoporte().setVisible(true);
            Vista.getLblMotivoSoporte().setVisible(true);

        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mostrarVentanaFactura() {
        VentanaFacturas ventanaFactura = new VentanaFacturas();
        FormularioFactura formuilarioFactura = new FormularioFactura();
        Vista.getEscritorio().add(ventanaFactura);
        ControladorCRUDVentanaFacturas control = new ControladorCRUDVentanaFacturas(ventanaFactura, formuilarioFactura);
        control.IniciaControlVentanaFactura();
        control.iniciar();
    }

    public void mostrarVentanaContribuyentes() {
        VentanaContribuentes ventanaContribuentes = new VentanaContribuentes();
        FormularioContribuyentes formulario = new FormularioContribuyentes();
        MenuInicio2_0 menu = new MenuInicio2_0();
        PersonaDB persona = new PersonaDB();
        Login login = new Login();
        Vista.getEscritorio().add(ventanaContribuentes);
        Vista.getEscritorio().add(formulario);
        ControladorCRUDVentanaContribuyentes control = new ControladorCRUDVentanaContribuyentes(ventanaContribuentes, formulario, persona, menu, login);
        control.iniciar();
        control.iniciaControl();

    }

    public void mostrarVentanaVelocidades() {
        VentanaVelocidades ventanaVelocidades = new VentanaVelocidades();
        Vista.getEscritorio().add(ventanaVelocidades);
        ControladorCRUDVentanaVelocidadesPlan control = new ControladorCRUDVentanaVelocidadesPlan(ventanaVelocidades);
        control.Iniciar();

    }

    public void mostrarVentanaPlanesInternet() {
        VentanaPlanesInternet ventanaPlanesInternet = new VentanaPlanesInternet();
        Vista.getEscritorio().add(ventanaPlanesInternet);
        ControladorCRUDVentanaPlanesInternet control = new ControladorCRUDVentanaPlanesInternet(ventanaPlanesInternet);
        control.Iniciar();

    }

    public void mostrarVentanaSuspension() {
        VentanaSuspension ventanaSuspension = new VentanaSuspension();
        Vista.getEscritorio().add(ventanaSuspension);
        ControladorCRUDVentanaSuspension control = new ControladorCRUDVentanaSuspension(ventanaSuspension);
        control.Iniciar();
    }

    public void mostrarVentanaCasosSoporte() {
        VentanaCasosSoporte ventanaCasosSoporte = new VentanaCasosSoporte();
        Vista.getEscritorio().add(ventanaCasosSoporte);
        ControladorCRUDCasosSoporte control = new ControladorCRUDCasosSoporte(ventanaCasosSoporte);
        control.Iniciar();
    }

    public void mostrarVentanaMotivosSoporte() {
        VentanaMotivosSoporte ventanaMotivosSoporte = new VentanaMotivosSoporte();
        Vista.getEscritorio().add(ventanaMotivosSoporte);
        ControladorCRUDMotivosSoporte control = new ControladorCRUDMotivosSoporte(ventanaMotivosSoporte);
        control.Iniciar();
    }

    public void mostrarVenantaOrdenesTrabajo() {
        OrdenesTrabajo ordenesTrabajo = new OrdenesTrabajo();
        Vista.getEscritorio().add(ordenesTrabajo);
        ControladorCRUDVentanaOrdenesTrabajo control = new ControladorCRUDVentanaOrdenesTrabajo(ordenesTrabajo);
        control.Iniciar();
    }

    public void mostrarVentanaContratos() {
        VentanaContratos ventanaContratos = new VentanaContratos();
        Vista.getEscritorio().add(ventanaContratos);
        ControladorCRUDVentanaContratos control = new ControladorCRUDVentanaContratos(ventanaContratos);
        control.Iniciar();
    }

    public void mostrarVentanaMateriales() {
        VentanaMateriales ventana = new VentanaMateriales();
        Vista.getEscritorio().add(ventana);
        ControladorCRUDMateriales control = new ControladorCRUDMateriales(ventana);
        control.iniciar();

    }

}
