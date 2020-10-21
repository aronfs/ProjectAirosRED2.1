/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author aaron
 */
public class VentanaFacturas extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioPreFacturas
     */
    public VentanaFacturas() {
        initComponents();
    }

    public JPanel getPanelVentaFacturasPanelPrincipanl() {
        return PanelVentaFacturasPanelPrincipanl;
    }

    public void setPanelVentaFacturasPanelPrincipanl(JPanel PanelVentaFacturasPanelPrincipanl) {
        this.PanelVentaFacturasPanelPrincipanl = PanelVentaFacturasPanelPrincipanl;
    }

    public JPanel getVentanaFacturasPanelBntInicio() {
        return VentanaFacturasPanelBntInicio;
    }

    public void setVentanaFacturasPanelBntInicio(JPanel VentanaFacturasPanelBntInicio) {
        this.VentanaFacturasPanelBntInicio = VentanaFacturasPanelBntInicio;
    }

    public JPanel getVentanaFacturasPanelFacturas() {
        return VentanaFacturasPanelFacturas;
    }

    public void setVentanaFacturasPanelFacturas(JPanel VentanaFacturasPanelFacturas) {
        this.VentanaFacturasPanelFacturas = VentanaFacturasPanelFacturas;
    }

    public JPanel getVentanaFacturasPanelFiltros() {
        return VentanaFacturasPanelFiltros;
    }

    public void setVentanaFacturasPanelFiltros(JPanel VentanaFacturasPanelFiltros) {
        this.VentanaFacturasPanelFiltros = VentanaFacturasPanelFiltros;
    }

    public JButton getVentanaFacturas_BntActualizar() {
        return VentanaFacturas_BntActualizar;
    }

    public void setVentanaFacturas_BntActualizar(JButton VentanaFacturas_BntActualizar) {
        this.VentanaFacturas_BntActualizar = VentanaFacturas_BntActualizar;
    }

    public JButton getVentanaFacturas_BntAplicarFiltro() {
        return VentanaFacturas_BntAplicarFiltro;
    }

    public void setVentanaFacturas_BntAplicarFiltro(JButton VentanaFacturas_BntAplicarFiltro) {
        this.VentanaFacturas_BntAplicarFiltro = VentanaFacturas_BntAplicarFiltro;
    }

    public JButton getVentanaFacturas_BntEditar() {
        return VentanaFacturas_BntEditar;
    }

    public void setVentanaFacturas_BntEditar(JButton VentanaFacturas_BntEditar) {
        this.VentanaFacturas_BntEditar = VentanaFacturas_BntEditar;
    }

    public JButton getVentanaFacturas_BntVerFactura() {
        return VentanaFacturas_BntVerFactura;
    }

    public void setVentanaFacturas_BntVerFactura(JButton VentanaFacturas_BntVerFactura) {
        this.VentanaFacturas_BntVerFactura = VentanaFacturas_BntVerFactura;
    }

    public JComboBox<String> getVentanaFacturas_ComboAutorizacion() {
        return VentanaFacturas_ComboAutorizacion;
    }

    public void setVentanaFacturas_ComboAutorizacion(JComboBox<String> VentanaFacturas_ComboAutorizacion) {
        this.VentanaFacturas_ComboAutorizacion = VentanaFacturas_ComboAutorizacion;
    }

    public JComboBox<String> getVentanaFacturas_ComboBodega() {
        return VentanaFacturas_ComboBodega;
    }

    public void setVentanaFacturas_ComboBodega(JComboBox<String> VentanaFacturas_ComboBodega) {
        this.VentanaFacturas_ComboBodega = VentanaFacturas_ComboBodega;
    }

    public JComboBox<String> getVentanaFacturas_ComboCreadoPor() {
        return VentanaFacturas_ComboCreadoPor;
    }

    public void setVentanaFacturas_ComboCreadoPor(JComboBox<String> VentanaFacturas_ComboCreadoPor) {
        this.VentanaFacturas_ComboCreadoPor = VentanaFacturas_ComboCreadoPor;
    }

    public JComboBox<String> getVentanaFacturas_ComboEstadoDoc() {
        return VentanaFacturas_ComboEstadoDoc;
    }

    public void setVentanaFacturas_ComboEstadoDoc(JComboBox<String> VentanaFacturas_ComboEstadoDoc) {
        this.VentanaFacturas_ComboEstadoDoc = VentanaFacturas_ComboEstadoDoc;
    }

    public JComboBox<String> getVentanaFacturas_ComboFormaPago() {
        return VentanaFacturas_ComboFormaPago;
    }

    public void setVentanaFacturas_ComboFormaPago(JComboBox<String> VentanaFacturas_ComboFormaPago) {
        this.VentanaFacturas_ComboFormaPago = VentanaFacturas_ComboFormaPago;
    }

    public JDateChooser getVentanaFacturas_JDateFechaFin() {
        return VentanaFacturas_JDateFechaFin;
    }

    public void setVentanaFacturas_JDateFechaFin(JDateChooser VentanaFacturas_JDateFechaFin) {
        this.VentanaFacturas_JDateFechaFin = VentanaFacturas_JDateFechaFin;
    }

    public JDateChooser getVentanaFacturas_JDateFechaInicio() {
        return VentanaFacturas_JDateFechaInicio;
    }

    public void setVentanaFacturas_JDateFechaInicio(JDateChooser VentanaFacturas_JDateFechaInicio) {
        this.VentanaFacturas_JDateFechaInicio = VentanaFacturas_JDateFechaInicio;
    }

    public JTable getVentanaFacturas_TablaGeneral() {
        return VentanaFacturas_TablaGeneral;
    }

    public void setVentanaFacturas_TablaGeneral(JTable VentanaFacturas_TablaGeneral) {
        this.VentanaFacturas_TablaGeneral = VentanaFacturas_TablaGeneral;
    }

    public JButton getVentanaFacturas_bntAnular() {
        return VentanaFacturas_bntAnular;
    }

    public void setVentanaFacturas_bntAnular(JButton VentanaFacturas_bntAnular) {
        this.VentanaFacturas_bntAnular = VentanaFacturas_bntAnular;
    }

    public JButton getBtnNuevoVentanaFactura() {
        return btnNuevoVentanaFactura;
    }

    public void setBtnNuevoVentanaFactura(JButton btnNuevoVentanaFactura) {
        this.btnNuevoVentanaFactura = btnNuevoVentanaFactura;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelVentaFacturasPanelPrincipanl = new javax.swing.JPanel();
        VentanaFacturasPanelFiltros = new javax.swing.JPanel();
        VentanaFacturas_BntAplicarFiltro = new javax.swing.JButton();
        VentanaFacturas_BntActualizar = new javax.swing.JButton();
        VentanaFacturasPanelBntInicio = new javax.swing.JPanel();
        btnNuevoVentanaFactura = new javax.swing.JButton();
        VentanaFacturas_BntEditar = new javax.swing.JButton();
        VentanaFacturas_bntAnular = new javax.swing.JButton();
        VentanaFacturas_BntVerFactura = new javax.swing.JButton();
        VentanaFacturasPanelFacturas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        VentanaFacturas_JDateFechaInicio = new com.toedter.calendar.JDateChooser();
        VentanaFacturas_ComboAutorizacion = new javax.swing.JComboBox<>();
        VentanaFacturas_JDateFechaFin = new com.toedter.calendar.JDateChooser();
        VentanaFacturas_ComboBodega = new javax.swing.JComboBox<>();
        VentanaFacturas_ComboEstadoDoc = new javax.swing.JComboBox<>();
        VentanaFacturas_ComboFormaPago = new javax.swing.JComboBox<>();
        VentanaFacturas_ComboCreadoPor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        VentanaFacturas_TablaGeneral = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1015, 555));

        PanelVentaFacturasPanelPrincipanl.setBackground(new java.awt.Color(255, 255, 255));
        PanelVentaFacturasPanelPrincipanl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VentanaFacturasPanelFiltros.setBackground(new java.awt.Color(153, 0, 0));

        VentanaFacturas_BntAplicarFiltro.setBackground(new java.awt.Color(51, 51, 51));
        VentanaFacturas_BntAplicarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        VentanaFacturas_BntAplicarFiltro.setText("Aplicar Filtros");

        VentanaFacturas_BntActualizar.setBackground(new java.awt.Color(51, 51, 51));
        VentanaFacturas_BntActualizar.setForeground(new java.awt.Color(255, 255, 255));
        VentanaFacturas_BntActualizar.setText("Actualizar");

        javax.swing.GroupLayout VentanaFacturasPanelFiltrosLayout = new javax.swing.GroupLayout(VentanaFacturasPanelFiltros);
        VentanaFacturasPanelFiltros.setLayout(VentanaFacturasPanelFiltrosLayout);
        VentanaFacturasPanelFiltrosLayout.setHorizontalGroup(
            VentanaFacturasPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaFacturasPanelFiltrosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(VentanaFacturas_BntAplicarFiltro)
                .addGap(18, 18, 18)
                .addComponent(VentanaFacturas_BntActualizar)
                .addContainerGap(749, Short.MAX_VALUE))
        );
        VentanaFacturasPanelFiltrosLayout.setVerticalGroup(
            VentanaFacturasPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaFacturasPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(VentanaFacturas_BntAplicarFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(VentanaFacturas_BntActualizar))
        );

        PanelVentaFacturasPanelPrincipanl.add(VentanaFacturasPanelFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 980, 40));

        VentanaFacturasPanelBntInicio.setBackground(new java.awt.Color(153, 0, 0));

        btnNuevoVentanaFactura.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevoVentanaFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoVentanaFactura.setText("Nuevo");

        VentanaFacturas_BntEditar.setBackground(new java.awt.Color(51, 51, 51));
        VentanaFacturas_BntEditar.setForeground(new java.awt.Color(255, 255, 255));
        VentanaFacturas_BntEditar.setText("Editar");

        VentanaFacturas_bntAnular.setBackground(new java.awt.Color(51, 51, 51));
        VentanaFacturas_bntAnular.setForeground(new java.awt.Color(255, 255, 255));
        VentanaFacturas_bntAnular.setText("Anular");

        VentanaFacturas_BntVerFactura.setBackground(new java.awt.Color(51, 51, 51));
        VentanaFacturas_BntVerFactura.setForeground(new java.awt.Color(255, 255, 255));
        VentanaFacturas_BntVerFactura.setText("Ver Factura");

        javax.swing.GroupLayout VentanaFacturasPanelBntInicioLayout = new javax.swing.GroupLayout(VentanaFacturasPanelBntInicio);
        VentanaFacturasPanelBntInicio.setLayout(VentanaFacturasPanelBntInicioLayout);
        VentanaFacturasPanelBntInicioLayout.setHorizontalGroup(
            VentanaFacturasPanelBntInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaFacturasPanelBntInicioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnNuevoVentanaFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VentanaFacturas_BntEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VentanaFacturas_bntAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VentanaFacturas_BntVerFactura)
                .addContainerGap(654, Short.MAX_VALUE))
        );
        VentanaFacturasPanelBntInicioLayout.setVerticalGroup(
            VentanaFacturasPanelBntInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaFacturasPanelBntInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaFacturasPanelBntInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoVentanaFactura)
                    .addComponent(VentanaFacturas_BntEditar)
                    .addComponent(VentanaFacturas_bntAnular)
                    .addComponent(VentanaFacturas_BntVerFactura))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelVentaFacturasPanelPrincipanl.add(VentanaFacturasPanelBntInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 980, 50));

        VentanaFacturasPanelFacturas.setBackground(new java.awt.Color(255, 255, 255));
        VentanaFacturasPanelFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Facturas"));
        VentanaFacturasPanelFacturas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fecha Inicio:");
        VentanaFacturasPanelFacturas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setText("Estado Doc.");
        VentanaFacturasPanelFacturas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setText("Fecha fin:");
        VentanaFacturasPanelFacturas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel4.setText("Bodega:");
        VentanaFacturasPanelFacturas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel5.setText("Estado Doc.");
        VentanaFacturasPanelFacturas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jLabel6.setText("Sistema:");
        VentanaFacturasPanelFacturas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jLabel7.setText("Forma pago:");
        VentanaFacturasPanelFacturas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        jLabel8.setText("Creado por:");
        VentanaFacturasPanelFacturas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, -1, -1));

        jLabel9.setText("Autorizacion:");
        VentanaFacturasPanelFacturas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        VentanaFacturas_JDateFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        VentanaFacturasPanelFacturas.add(VentanaFacturas_JDateFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 170, 20));

        VentanaFacturas_ComboAutorizacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "AUTORIZADO", "AÚN NO AUTORIZADOS", "ANULADO", "NO FILTRAR" }));
        VentanaFacturasPanelFacturas.add(VentanaFacturas_ComboAutorizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 170, -1));

        VentanaFacturas_JDateFechaFin.setBackground(new java.awt.Color(255, 255, 255));
        VentanaFacturasPanelFacturas.add(VentanaFacturas_JDateFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 170, -1));

        VentanaFacturas_ComboBodega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "MATRIZ CUENCA" }));
        VentanaFacturasPanelFacturas.add(VentanaFacturas_ComboBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 170, -1));

        VentanaFacturas_ComboEstadoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "ANULADO", "ARCHIVADO", "PENDIENTE" }));
        VentanaFacturasPanelFacturas.add(VentanaFacturas_ComboEstadoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 130, -1));

        VentanaFacturas_ComboFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "CONTADO", "CRÉDITO", "SIN FORMA DE PAGO" }));
        VentanaFacturasPanelFacturas.add(VentanaFacturas_ComboFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 110, -1));

        VentanaFacturas_ComboCreadoPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        VentanaFacturasPanelFacturas.add(VentanaFacturas_ComboCreadoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 110, -1));

        PanelVentaFacturasPanelPrincipanl.add(VentanaFacturasPanelFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 980, 170));

        jScrollPane1.setBorder(null);

        VentanaFacturas_TablaGeneral.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        VentanaFacturas_TablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "RUC", "Cliente", "Tipo", "IVA", "Total", "Estado Doc. Sistema", "Forma de Pago", "Estado Doc. Autorizacion", "Ambiente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VentanaFacturas_TablaGeneral);

        PanelVentaFacturasPanelPrincipanl.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 980, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelVentaFacturasPanelPrincipanl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelVentaFacturasPanelPrincipanl, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaFacturas().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelVentaFacturasPanelPrincipanl;
    private javax.swing.JPanel VentanaFacturasPanelBntInicio;
    private javax.swing.JPanel VentanaFacturasPanelFacturas;
    private javax.swing.JPanel VentanaFacturasPanelFiltros;
    private javax.swing.JButton VentanaFacturas_BntActualizar;
    private javax.swing.JButton VentanaFacturas_BntAplicarFiltro;
    private javax.swing.JButton VentanaFacturas_BntEditar;
    private javax.swing.JButton VentanaFacturas_BntVerFactura;
    private javax.swing.JComboBox<String> VentanaFacturas_ComboAutorizacion;
    private javax.swing.JComboBox<String> VentanaFacturas_ComboBodega;
    private javax.swing.JComboBox<String> VentanaFacturas_ComboCreadoPor;
    private javax.swing.JComboBox<String> VentanaFacturas_ComboEstadoDoc;
    private javax.swing.JComboBox<String> VentanaFacturas_ComboFormaPago;
    private com.toedter.calendar.JDateChooser VentanaFacturas_JDateFechaFin;
    private com.toedter.calendar.JDateChooser VentanaFacturas_JDateFechaInicio;
    private javax.swing.JTable VentanaFacturas_TablaGeneral;
    private javax.swing.JButton VentanaFacturas_bntAnular;
    private javax.swing.JButton btnNuevoVentanaFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
