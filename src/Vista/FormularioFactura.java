/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aaron
 */
public class FormularioFactura extends javax.swing.JFrame {

    /**
     * Creates new form FormularioFactura
     */
    public FormularioFactura() {
        initComponents();
    }

    public JTable getFormulariofacturaTabla_Factura() {
        return formulariofacturaTabla_Factura;
    }

    public void setFormulariofacturaTabla_Factura(JTable formulariofacturaTabla_Factura) {
        this.formulariofacturaTabla_Factura = formulariofacturaTabla_Factura;
    }

    public JComboBox<String> getFormulariofacturacombobox_Anulada() {
        return formulariofacturacombobox_Anulada;
    }

    public void setFormulariofacturacombobox_Anulada(JComboBox<String> formulariofacturacombobox_Anulada) {
        this.formulariofacturacombobox_Anulada = formulariofacturacombobox_Anulada;
    }

    public JComboBox<String> getFormulariofacturacombobox_bodega() {
        return formulariofacturacombobox_bodega;
    }

    public void setFormulariofacturacombobox_bodega(JComboBox<String> formulariofacturacombobox_bodega) {
        this.formulariofacturacombobox_bodega = formulariofacturacombobox_bodega;
    }

    public JTable getFormulariofacturatabla_contratoservicioI() {
        return formulariofacturatabla_contratoservicioI;
    }

    public void setFormulariofacturatabla_contratoservicioI(JTable formulariofacturatabla_contratoservicioI) {
        this.formulariofacturatabla_contratoservicioI = formulariofacturatabla_contratoservicioI;
    }

    public JTextField getFormulariofacturatxt_cliente() {
        return formulariofacturatxt_cliente;
    }

    public void setFormulariofacturatxt_cliente(JTextField formulariofacturatxt_cliente) {
        this.formulariofacturatxt_cliente = formulariofacturatxt_cliente;
    }

    public JLabel getFormulariofacturatxt_fecha() {
        return formulariofacturatxt_fecha;
    }

    public void setFormulariofacturatxt_fecha(JLabel formulariofacturatxt_fecha) {
        this.formulariofacturatxt_fecha = formulariofacturatxt_fecha;
    }

    public JLabel getFormulariofacturatxt_numerodedocumento() {
        return formulariofacturatxt_numerodedocumento;
    }

    public void setFormulariofacturatxt_numerodedocumento(JLabel formulariofacturatxt_numerodedocumento) {
        this.formulariofacturatxt_numerodedocumento = formulariofacturatxt_numerodedocumento;
    }

    public JTextArea getFormulariofacturatxt_observaciones() {
        return formulariofacturatxt_observaciones;
    }

    public void setFormulariofacturatxt_observaciones(JTextArea formulariofacturatxt_observaciones) {
        this.formulariofacturatxt_observaciones = formulariofacturatxt_observaciones;
    }

    public JPanel getFormulariofacturaPane_tablacontratosl() {
        return formulariofacturaPane_tablacontratosl;
    }

    public void setFormulariofacturaPane_tablacontratosl(JPanel formulariofacturaPane_tablacontratosl) {
        this.formulariofacturaPane_tablacontratosl = formulariofacturaPane_tablacontratosl;
    }

    public JPanel getFormulariofacturaPanel() {
        return formulariofacturaPanel;
    }

    public void setFormulariofacturaPanel(JPanel formulariofacturaPanel) {
        this.formulariofacturaPanel = formulariofacturaPanel;
    }

    public JLabel getFormulariofactura_txt() {
        return formulariofactura_txt;
    }

    public void setFormulariofactura_txt(JLabel formulariofactura_txt) {
        this.formulariofactura_txt = formulariofactura_txt;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        formulariofacturaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        formulariofacturacombobox_bodega = new javax.swing.JComboBox<>();
        formulariofacturacombobox_Anulada = new javax.swing.JComboBox<>();
        formulariofacturatxt_numerodedocumento = new javax.swing.JLabel();
        formulariofacturatxt_fecha = new javax.swing.JLabel();
        formulariofacturatxt_cliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        formulariofacturatxt_observaciones = new javax.swing.JTextArea();
        formulariofacturaPane_tablacontratosl = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        formulariofacturatabla_contratoservicioI = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        formulariofacturaTabla_Factura = new javax.swing.JTable();
        formulariofactura_txt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formulariofacturaPanel.setBackground(new java.awt.Color(255, 255, 255));
        formulariofacturaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));
        formulariofacturaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Numero de Documento:");
        formulariofacturaPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setText("Cliente:");
        formulariofacturaPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 30));

        jLabel3.setText("Observaciones:");
        formulariofacturaPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel4.setText("Fecha:");
        formulariofacturaPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel5.setText("Bodega:");
        formulariofacturaPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, 20));

        jLabel6.setText("Anulada:");
        formulariofacturaPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        formulariofacturacombobox_bodega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "MATRIZ CUENCA" }));
        formulariofacturaPanel.add(formulariofacturacombobox_bodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 160, -1));

        formulariofacturacombobox_Anulada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "SI", "NO" }));
        formulariofacturaPanel.add(formulariofacturacombobox_Anulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 160, -1));

        formulariofacturatxt_numerodedocumento.setText("---------------------------------------");
        formulariofacturaPanel.add(formulariofacturatxt_numerodedocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 160, -1));

        formulariofacturatxt_fecha.setText("------------------");
        formulariofacturaPanel.add(formulariofacturatxt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));
        formulariofacturaPanel.add(formulariofacturatxt_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 170, -1));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        formulariofacturatxt_observaciones.setColumns(20);
        formulariofacturatxt_observaciones.setRows(5);
        jScrollPane3.setViewportView(formulariofacturatxt_observaciones);

        formulariofacturaPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        formulariofacturaPane_tablacontratosl.setBackground(new java.awt.Color(255, 255, 255));
        formulariofacturaPane_tablacontratosl.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrato Servicio de Internet"));

        formulariofacturatabla_contratoservicioI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Contrato de servicio de Internet", "Fecha Contratacion"
            }
        ));
        jScrollPane4.setViewportView(formulariofacturatabla_contratoservicioI);

        javax.swing.GroupLayout formulariofacturaPane_tablacontratoslLayout = new javax.swing.GroupLayout(formulariofacturaPane_tablacontratosl);
        formulariofacturaPane_tablacontratosl.setLayout(formulariofacturaPane_tablacontratoslLayout);
        formulariofacturaPane_tablacontratoslLayout.setHorizontalGroup(
            formulariofacturaPane_tablacontratoslLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formulariofacturaPane_tablacontratoslLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        formulariofacturaPane_tablacontratoslLayout.setVerticalGroup(
            formulariofacturaPane_tablacontratoslLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formulariofacturaPane_tablacontratoslLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formulariofacturaPanel.add(formulariofacturaPane_tablacontratosl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 890, 130));

        jPanel1.add(formulariofacturaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 980, 340));

        formulariofacturaTabla_Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Item", "Aplica IVA", "Cantidad", "Precio", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(formulariofacturaTabla_Factura);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 980, 140));

        formulariofactura_txt.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        formulariofactura_txt.setText("Factura -------------------");
        jPanel1.add(formulariofactura_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jButton1.setText("Guardar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
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
//            java.util.logging.Logger.getLogger(FormularioFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormularioFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormularioFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormularioFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormularioFactura().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel formulariofacturaPane_tablacontratosl;
    private javax.swing.JPanel formulariofacturaPanel;
    private javax.swing.JTable formulariofacturaTabla_Factura;
    private javax.swing.JLabel formulariofactura_txt;
    private javax.swing.JComboBox<String> formulariofacturacombobox_Anulada;
    private javax.swing.JComboBox<String> formulariofacturacombobox_bodega;
    private javax.swing.JTable formulariofacturatabla_contratoservicioI;
    private javax.swing.JTextField formulariofacturatxt_cliente;
    private javax.swing.JLabel formulariofacturatxt_fecha;
    private javax.swing.JLabel formulariofacturatxt_numerodedocumento;
    private javax.swing.JTextArea formulariofacturatxt_observaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
