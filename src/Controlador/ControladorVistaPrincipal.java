/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.PersonaDB;
import Vista.FormularioCambioPlan;
import Vista.FormularioContribuyentes;
import Vista.FormularioFactura;
import Vista.Login;
import Vista.MenuInicio2_0;
import Vista.OrdenesTrabajo;
import Vista.VentanaCambioDireccion;
import Vista.VentanaCambioPlan;
import Vista.VentanaCancelacionDeServicio;
import Vista.VentanaCasosSoporte;
import Vista.VentanaCompras;
import Vista.VentanaContratos;
import Vista.VentanaContribuentes;
import Vista.VentanaFacturas;
import Vista.VentanaItems;
import Vista.VentanaMotivosSoporte;
import Vista.VentanaNombresTecnicos;
import Vista.VentanaOperarioSoporte;
import Vista.VentanaPlanesInternet;
import Vista.VentanaReactivacion;
import Vista.VentanaReportes;
import Vista.VentanaSeries;
import Vista.VentanaServicio;
import Vista.VentanaSuspension;
import Vista.VentanaTarifasInstalacion;
import Vista.VentanaTipoCliente;
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
        Vista.getLblComprasPanel().setVisible(false);
        Vista.getLblContribuyentes().setVisible(false);
        Vista.getLblItems().setVisible(false);
        Vista.getLblReportesStock().setVisible(false);
        Vista.getLblNombresTecnicos().setVisible(false);
        Vista.getLblTarifaInstalacion().setVisible(false);
        Vista.getLbltipoCliente().setVisible(false);
        Vista.getLblVelocidades().setVisible(false);
        Vista.getLblPlanesInternet().setVisible(false);
        Vista.getLblSolicitudes().setVisible(false);
        Vista.getLblContratos().setVisible(false);
        Vista.getLblOrdenesTrabajo().setVisible(false);
        Vista.getLblServicio().setVisible(false);
        Vista.getLblCambioPlan().setVisible(false);
        Vista.getLblSuspension().setVisible(false);
        Vista.getLblCancelacionServicio().setVisible(false);
        Vista.getLblCambioDireccion().setVisible(false);
        Vista.getLblReactivacion().setVisible(false);
        Vista.getLblCasosSoporte().setVisible(false);
        Vista.getLblMotivoSoporte().setVisible(false);
        Vista.getLblOperariosSoporte().setVisible(false);
        // Vista.getLblSeries().setVisible(false);
        Vista.getLblComprasPanel().setVisible(false);
    }

    public void InioiaControladorMenuInicio() {
        Vista.getBtnFacturas().addMouseListener(this);
        Vista.getLblVentas().addMouseListener(this);
        Vista.getBtnSalir().addMouseListener(this);
        Vista.getBtnCompras().addMouseListener(this);
        Vista.getBtnContribuyentes().addMouseListener(this);
        Vista.getBtnItems().addMouseListener(this);
        Vista.getBtnSeries().addMouseListener(this);
        Vista.getBtnReportes().addMouseListener(this);
        Vista.getBtnNombresTecnicos().addMouseListener(this);
        Vista.getBtnTarifasInstalacion().addMouseListener(this);
        Vista.getBtnTipoCliente().addMouseListener(this);
        Vista.getBtnVelocidadesPlan().addMouseListener(this);
        Vista.getBtnPlaneInternet().addMouseListener(this);
        Vista.getBtnSolicitudes().addMouseListener(this);
        Vista.getBtnServicio().addMouseListener(this);
        Vista.getBtnCambioPlan().addMouseListener(this);
        Vista.getBtnSuspension().addMouseListener(this);
        Vista.getBtnCancelacionServicio().addMouseListener(this);
        Vista.getBtnCambioDireccion().addMouseListener(this);
        Vista.getBtnReactivacion().addMouseListener(this);
        Vista.getBtnContratos().addMouseListener(this);
        Vista.getBtnOrdenesTrabajo().addMouseListener(this);
        Vista.getBtnCasosSoporte().addMouseListener(this);
        Vista.getBtnMotivosSoporte().addMouseListener(this);
        Vista.getBtnOperarioSoporte().addMouseListener(this);
        Vista.getLblCompras().addMouseListener(this);
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

        if (me.getSource() == Vista.getBtnCompras()) {
            mostrarVentanaCompras();
        }

        if (me.getSource() == Vista.getBtnContribuyentes()) {
            mostrarVentanaContribuyentes();
        }
        if (me.getSource() == Vista.getBtnItems()) {
            mostrarVentanaitems();
        }
        if (me.getSource() == Vista.getBtnSeries()) {
            mostrarVentanaSeries();
        }
        if (me.getSource() == Vista.getBtnSeries()) {
            mostrarVentanaSeries();
        }
        if (me.getSource() == Vista.getBtnReportes()) {
            mostrarVentanaReportes();
        }
        if (me.getSource() == Vista.getBtnNombresTecnicos()) {
            mostrarVentanaNombresTecnicos();
        }
        if (me.getSource() == Vista.getBtnTarifasInstalacion()) {
            mostrarVentanaTarifasInstalacion();
        }
        if (me.getSource() == Vista.getBtnTipoCliente()) {
            mostrarVentanatiposCliente();
        }
        if (me.getSource() == Vista.getBtnVelocidadesPlan()) {
            mostrarVentanaVelocidades();
        }
        if (me.getSource() == Vista.getBtnPlaneInternet()) {
            mostrarVentanaPlanesInternet();
        }
        if (me.getSource() == Vista.getBtnServicio()) {
            mostrarVentanaServicio();
        }
        if (me.getSource() == Vista.getBtnCambioPlan()) {
            mostrarCambioPlan();
        }
        if (me.getSource() == Vista.getBtnSuspension()) {
            mostrarVentanaSuspension();
        }
        if (me.getSource() == Vista.getBtnCancelacionServicio()) {
            mostrarVentanaCancelacionServicio();
        }
        if (me.getSource() == Vista.getBtnCambioDireccion()) {
            mostrarVentanaCambioDireccion();
        }
        if (me.getSource() == Vista.getBtnReactivacion()) {
            mostrarVentanaReactivacion();
        }
        if (me.getSource() == Vista.getBtnCasosSoporte()) {
            mostrarVentanaCasosSoporte();
        }
        if (me.getSource() == Vista.getBtnMotivosSoporte()) {
            mostrarVentanaMotivosSoporte();
        }
        if (me.getSource() == Vista.getBtnOperarioSoporte()) {
            mostrarVentanOperariosSoporte();
        }
        if (me.getSource() == Vista.getBtnOrdenesTrabajo()) {
            mostrarVenantaOrdenesTrabajo();
        }

        if (me.getSource() == Vista.getBtnContratos()) {
            mostrarVentanaContratos();
        }

        if (me.getSource() == Vista.getBtnSalir()) {
            System.exit(0);
        }

        if (me.getSource() == Vista.getLblVentas()) {
            Vista.getLblFactura().setVisible(false);
        }
        if (me.getSource() == Vista.getLblCompras()) {
            Vista.getLblComprasPanel().setVisible(false);
        }

        if (me.getSource() == Vista.getLblDirectorio()) {
            Vista.getLblContribuyentes().setVisible(false);
        }
        if (me.getSource() == Vista.getLblInventario()) {
            Vista.getLblItems().setVisible(false);
            //Vista.getLblSeries().setVisible(true);
            Vista.getLblReportesStock().setVisible(false);
        }

        if (me.getSource() == Vista.getLblProvServiciosInternet()) {
            Vista.getLblNombresTecnicos().setVisible(false);
            Vista.getLblNombresTecnicos().setVisible(false);
            Vista.getLblTarifaInstalacion().setVisible(false);
            Vista.getLbltipoCliente().setVisible(false);
            Vista.getLblVelocidades().setVisible(false);
            Vista.getLblPlanesInternet().setVisible(false);
            Vista.getLblSolicitudes().setVisible(false);
            Vista.getLblContratos().setVisible(false);
            Vista.getLblOrdenesTrabajo().setVisible(false);
            Vista.getLblServicio().setVisible(false);
            Vista.getLblCambioPlan().setVisible(false);
            Vista.getLblSuspension().setVisible(false);
            Vista.getLblCancelacionServicio().setVisible(false);
            Vista.getLblCambioDireccion().setVisible(false);
            Vista.getLblReactivacion().setVisible(false);
        }

//        if (me.getSource() == Vista.getBtnSolicitudes()) {
//            
//        }
        if (me.getSource() == Vista.getLblRegistroLlamadas()) {
            Vista.getLblCasosSoporte().setVisible(false);
            Vista.getLblMotivoSoporte().setVisible(false);
            Vista.getLblOperariosSoporte().setVisible(false);
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
        if (me.getSource() == Vista.getLblCompras()) {
            Vista.getLblComprasPanel().setVisible(true);
        }

        if (me.getSource() == Vista.getLblDirectorio()) {
            Vista.getLblContribuyentes().setVisible(true);
        }
        if (me.getSource() == Vista.getLblInventario()) {
            Vista.getLblItems().setVisible(true);
            //Vista.getLblSeries().setVisible(true);
            Vista.getLblReportesStock().setVisible(true);
        }

        if (me.getSource() == Vista.getLblProvServiciosInternet()) {
            Vista.getLblNombresTecnicos().setVisible(true);
            Vista.getLblNombresTecnicos().setVisible(true);
            Vista.getLblTarifaInstalacion().setVisible(true);
            Vista.getLbltipoCliente().setVisible(true);
            Vista.getLblVelocidades().setVisible(true);
            Vista.getLblPlanesInternet().setVisible(true);
            Vista.getLblSolicitudes().setVisible(true);
            Vista.getLblContratos().setVisible(true);
            Vista.getLblOrdenesTrabajo().setVisible(true);
        }

        if (me.getSource() == Vista.getLblSolicitudes()) {
            Vista.getLblServicio().setVisible(false);
            Vista.getLblCambioPlan().setVisible(false);
            Vista.getLblSuspension().setVisible(false);
            Vista.getLblCancelacionServicio().setVisible(false);
            Vista.getLblCambioDireccion().setVisible(false);
            Vista.getLblReactivacion().setVisible(false);
        }

        if (me.getSource() == Vista.getLblRegistroLlamadas()) {
            Vista.getLblCasosSoporte().setVisible(true);
            Vista.getLblMotivoSoporte().setVisible(true);
            Vista.getLblOperariosSoporte().setVisible(true);
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

    public void mostrarVentanaCompras() {
        VentanaCompras ventanaCompras = new VentanaCompras();
        Vista.getEscritorio().add(ventanaCompras);
        ControladorCRUDVentanaCompras control = new ControladorCRUDVentanaCompras(ventanaCompras);
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

        ControladorCRUDVentanaContribuyentes control = new ControladorCRUDVentanaContribuyentes(ventanaContribuentes, formulario, persona, menu,login);
        control.iniciar();
        control.iniciaControl();

    }

    public void mostrarVentanaitems() {
        VentanaItems ventanaItems = new VentanaItems();
        Vista.getEscritorio().add(ventanaItems);
        ControladorCRUDVentanaItems control = new ControladorCRUDVentanaItems(ventanaItems);
        control.iniciar();

    }

    public void mostrarVentanaSeries() {
        VentanaSeries ventanaSeries = new VentanaSeries();
        Vista.getEscritorio().add(ventanaSeries);
        ControladorCRUDVentanaSeries control = new ControladorCRUDVentanaSeries(ventanaSeries);
        control.Iniciar();
    }

    public void mostrarVentanaReportes() {
        VentanaReportes ventanaReportes = new VentanaReportes();
        Vista.getEscritorio().add(ventanaReportes);
        ControladorCRUDVentanaReportesStock control = new ControladorCRUDVentanaReportesStock(ventanaReportes);
        control.Iniciar();
    }

    public void mostrarVentanaNombresTecnicos() {
        VentanaNombresTecnicos ventanaNombresTecnicos = new VentanaNombresTecnicos();
        Vista.getEscritorio().add(ventanaNombresTecnicos);
        ControladorCRUDVentanaNombresTecnicos control = new ControladorCRUDVentanaNombresTecnicos(ventanaNombresTecnicos);
        control.Iniciar();
    }

    public void mostrarVentanaTarifasInstalacion() {
        VentanaTarifasInstalacion ventanaTarifasInstalacion = new VentanaTarifasInstalacion();
        Vista.getEscritorio().add(ventanaTarifasInstalacion);
        ControladorCRUDVentanaTarifas control = new ControladorCRUDVentanaTarifas(ventanaTarifasInstalacion);
        control.Iniciar();
    }

    public void mostrarVentanatiposCliente() {
        VentanaTipoCliente ventanaTipoCliente = new VentanaTipoCliente();
        Vista.getEscritorio().add(ventanaTipoCliente);
        ControladorCRUDTiposCliente control = new ControladorCRUDTiposCliente(ventanaTipoCliente);
        control.Iniciar();
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

    public void mostrarVentanaServicio() {
        VentanaServicio ventanaServicio = new VentanaServicio();
        Vista.getEscritorio().add(ventanaServicio);
        ControladorCRUDVentanaServicio control = new ControladorCRUDVentanaServicio(ventanaServicio);
        control.Iniciar();
    }

    public void mostrarCambioPlan() {
        VentanaCambioPlan ventanaCambioPlan = new VentanaCambioPlan();
        FormularioCambioPlan formulario = new FormularioCambioPlan();
        Vista.getEscritorio().add(ventanaCambioPlan);
        ControladorCRUDCambioPlan control = new ControladorCRUDCambioPlan(ventanaCambioPlan, formulario);
        control.Iniciar();
        control.IniciaControl();
    }

    public void mostrarVentanaSuspension() {
        VentanaSuspension ventanaSuspension = new VentanaSuspension();
        Vista.getEscritorio().add(ventanaSuspension);
        ControladorCRUDVentanaSuspension control = new ControladorCRUDVentanaSuspension(ventanaSuspension);
        control.Iniciar();
    }

    public void mostrarVentanaCancelacionServicio() {
        VentanaCancelacionDeServicio ventanaCancelacionDeServicio = new VentanaCancelacionDeServicio();
        Vista.getEscritorio().add(ventanaCancelacionDeServicio);
        ControladorCRUDVentanaCancelacionServicio control = new ControladorCRUDVentanaCancelacionServicio(ventanaCancelacionDeServicio);
        control.Iniciar();
    }

    public void mostrarVentanaCambioDireccion() {
        VentanaCambioDireccion ventanaCambioDireccion = new VentanaCambioDireccion();
        Vista.getEscritorio().add(ventanaCambioDireccion);
        ControladorCRUDCmbioDireccion control = new ControladorCRUDCmbioDireccion(ventanaCambioDireccion);
        control.Iniciar();
    }

    public void mostrarVentanaReactivacion() {
        VentanaReactivacion ventanaReactivacion = new VentanaReactivacion();
        Vista.getEscritorio().add(ventanaReactivacion);
        ControladorCRUDReactivacion control = new ControladorCRUDReactivacion(ventanaReactivacion);
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

    public void mostrarVentanOperariosSoporte() {
        VentanaOperarioSoporte ventanaOperarioSoporte = new VentanaOperarioSoporte();
        Vista.getEscritorio().add(ventanaOperarioSoporte);
        ControladorCRUDOperarioSoporte control = new ControladorCRUDOperarioSoporte(ventanaOperarioSoporte);
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
}
