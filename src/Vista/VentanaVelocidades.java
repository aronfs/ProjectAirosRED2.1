/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author aaron
 */
public class VentanaVelocidades extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaVelocidades
     */
    public VentanaVelocidades() {
        initComponents();
    }

    public JButton getVentanaVelocidad_BntActualizar() {
        return VentanaVelocidad_BntActualizar;
    }

    public void setVentanaVelocidad_BntActualizar(JButton VentanaVelocidad_BntActualizar) {
        this.VentanaVelocidad_BntActualizar = VentanaVelocidad_BntActualizar;
    }

    public JButton getVentanaVelocidad_BntAplicarFiltro() {
        return VentanaVelocidad_BntAplicarFiltro;
    }

    public void setVentanaVelocidad_BntAplicarFiltro(JButton VentanaVelocidad_BntAplicarFiltro) {
        this.VentanaVelocidad_BntAplicarFiltro = VentanaVelocidad_BntAplicarFiltro;
    }

    public JButton getVentanaVelocidad_BntRestablecer() {
        return VentanaVelocidad_BntRestablecer;
    }

    public void setVentanaVelocidad_BntRestablecer(JButton VentanaVelocidad_BntRestablecer) {
        this.VentanaVelocidad_BntRestablecer = VentanaVelocidad_BntRestablecer;
    }

    public JComboBox<String> getVentanaVelocidad_ComboUnidad() {
        return VentanaVelocidad_ComboUnidad;
    }

    public void setVentanaVelocidad_ComboUnidad(JComboBox<String> VentanaVelocidad_ComboUnidad) {
        this.VentanaVelocidad_ComboUnidad = VentanaVelocidad_ComboUnidad;
    }

    public JPanel getVentanaVelocidad_PanelFiltro() {
        return VentanaVelocidad_PanelFiltro;
    }

    public void setVentanaVelocidad_PanelFiltro(JPanel VentanaVelocidad_PanelFiltro) {
        this.VentanaVelocidad_PanelFiltro = VentanaVelocidad_PanelFiltro;
    }

    public JPanel getVentanaVelocidad_PanelVelocidad() {
        return VentanaVelocidad_PanelVelocidad;
    }

    public void setVentanaVelocidad_PanelVelocidad(JPanel VentanaVelocidad_PanelVelocidad) {
        this.VentanaVelocidad_PanelVelocidad = VentanaVelocidad_PanelVelocidad;
    }

    public JTable getVentanaVelocidad_TablaGeneral() {
        return VentanaVelocidad_TablaGeneral;
    }

    public void setVentanaVelocidad_TablaGeneral(JTable VentanaVelocidad_TablaGeneral) {
        this.VentanaVelocidad_TablaGeneral = VentanaVelocidad_TablaGeneral;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        VentanaVelocidad_PanelVelocidad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VentanaVelocidad_ComboUnidad = new javax.swing.JComboBox<>();
        VentanaVelocidad_PanelFiltro = new javax.swing.JPanel();
        VentanaVelocidad_BntAplicarFiltro = new javax.swing.JButton();
        VentanaVelocidad_BntActualizar = new javax.swing.JButton();
        VentanaVelocidad_BntRestablecer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VentanaVelocidad_TablaGeneral = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jButton1.setText("Nuevo");

        jButton2.setText("Editar");

        jButton3.setText("Anular");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addGap(39, 39, 39)
                .addComponent(jButton3)
                .addContainerGap(677, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 40));

        VentanaVelocidad_PanelVelocidad.setBackground(new java.awt.Color(255, 255, 255));
        VentanaVelocidad_PanelVelocidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Velocidades de Plan"));

        jLabel1.setText("Unidad:");

        VentanaVelocidad_ComboUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Kbps", "Mbps", "Gbps" }));

        javax.swing.GroupLayout VentanaVelocidad_PanelVelocidadLayout = new javax.swing.GroupLayout(VentanaVelocidad_PanelVelocidad);
        VentanaVelocidad_PanelVelocidad.setLayout(VentanaVelocidad_PanelVelocidadLayout);
        VentanaVelocidad_PanelVelocidadLayout.setHorizontalGroup(
            VentanaVelocidad_PanelVelocidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaVelocidad_PanelVelocidadLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VentanaVelocidad_ComboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(573, Short.MAX_VALUE))
        );
        VentanaVelocidad_PanelVelocidadLayout.setVerticalGroup(
            VentanaVelocidad_PanelVelocidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaVelocidad_PanelVelocidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaVelocidad_PanelVelocidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(VentanaVelocidad_ComboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(VentanaVelocidad_PanelVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 980, 60));

        VentanaVelocidad_PanelFiltro.setBackground(new java.awt.Color(204, 0, 0));

        VentanaVelocidad_BntAplicarFiltro.setBackground(new java.awt.Color(102, 102, 102));
        VentanaVelocidad_BntAplicarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        VentanaVelocidad_BntAplicarFiltro.setText("Aplicar Filtros");

        VentanaVelocidad_BntActualizar.setBackground(new java.awt.Color(102, 102, 102));
        VentanaVelocidad_BntActualizar.setForeground(new java.awt.Color(255, 255, 255));
        VentanaVelocidad_BntActualizar.setText("Actualizar");

        VentanaVelocidad_BntRestablecer.setBackground(new java.awt.Color(102, 102, 102));
        VentanaVelocidad_BntRestablecer.setForeground(new java.awt.Color(255, 255, 255));
        VentanaVelocidad_BntRestablecer.setText("Restablecer Filtros");

        javax.swing.GroupLayout VentanaVelocidad_PanelFiltroLayout = new javax.swing.GroupLayout(VentanaVelocidad_PanelFiltro);
        VentanaVelocidad_PanelFiltro.setLayout(VentanaVelocidad_PanelFiltroLayout);
        VentanaVelocidad_PanelFiltroLayout.setHorizontalGroup(
            VentanaVelocidad_PanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaVelocidad_PanelFiltroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(VentanaVelocidad_BntAplicarFiltro)
                .addGap(18, 18, 18)
                .addComponent(VentanaVelocidad_BntActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VentanaVelocidad_BntRestablecer)
                .addContainerGap(596, Short.MAX_VALUE))
        );
        VentanaVelocidad_PanelFiltroLayout.setVerticalGroup(
            VentanaVelocidad_PanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaVelocidad_PanelFiltroLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(VentanaVelocidad_PanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VentanaVelocidad_BntAplicarFiltro)
                    .addComponent(VentanaVelocidad_BntActualizar)
                    .addComponent(VentanaVelocidad_BntRestablecer))
                .addContainerGap())
        );

        jPanel1.add(VentanaVelocidad_PanelFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 980, 50));

        VentanaVelocidad_TablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Velocidad", "Creado por", "Fecha de Creacion"
            }
        ));
        jScrollPane1.setViewportView(VentanaVelocidad_TablaGeneral);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 980, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
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
//            java.util.logging.Logger.getLogger(VentanaVelocidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaVelocidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaVelocidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaVelocidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaVelocidades().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VentanaVelocidad_BntActualizar;
    private javax.swing.JButton VentanaVelocidad_BntAplicarFiltro;
    private javax.swing.JButton VentanaVelocidad_BntRestablecer;
    private javax.swing.JComboBox<String> VentanaVelocidad_ComboUnidad;
    private javax.swing.JPanel VentanaVelocidad_PanelFiltro;
    private javax.swing.JPanel VentanaVelocidad_PanelVelocidad;
    private javax.swing.JTable VentanaVelocidad_TablaGeneral;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
