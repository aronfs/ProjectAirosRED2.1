/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class FormularioPlanesInternet extends javax.swing.JFrame {

    /**
     * Creates new form FormularioConstribuyente
     */
    public FormularioPlanesInternet() {
        initComponents();
    }

    public JButton getFormularioPlanesIntenet_BntGuardar() {
        return FormularioPlanesIntenet_BntGuardar;
    }

    public void setFormularioPlanesIntenet_BntGuardar(JButton FormularioPlanesIntenet_BntGuardar) {
        this.FormularioPlanesIntenet_BntGuardar = FormularioPlanesIntenet_BntGuardar;
    }

    public JButton getFormularioPlanesIntenet_BontCancelar() {
        return FormularioPlanesIntenet_BontCancelar;
    }

    public void setFormularioPlanesIntenet_BontCancelar(JButton FormularioPlanesIntenet_BontCancelar) {
        this.FormularioPlanesIntenet_BontCancelar = FormularioPlanesIntenet_BontCancelar;
    }

    public JTextField getFormularioPlanesIntenet_Txt_Nombre_Tecnico() {
        return FormularioPlanesIntenet_Txt_Nombre_Tecnico;
    }

    public void setFormularioPlanesIntenet_Txt_Nombre_Tecnico(JTextField FormularioPlanesIntenet_Txt_Nombre_Tecnico) {
        this.FormularioPlanesIntenet_Txt_Nombre_Tecnico = FormularioPlanesIntenet_Txt_Nombre_Tecnico;
    }

    public JTextField getFormularioPlanesIntenet_txt_IDPlna() {
        return FormularioPlanesIntenet_txt_IDPlna;
    }

    public void setFormularioPlanesIntenet_txt_IDPlna(JTextField FormularioPlanesIntenet_txt_IDPlna) {
        this.FormularioPlanesIntenet_txt_IDPlna = FormularioPlanesIntenet_txt_IDPlna;
    }

    public JTextField getFormularioPlanesIntenet_txt_NombrePlan() {
        return FormularioPlanesIntenet_txt_NombrePlan;
    }

    public void setFormularioPlanesIntenet_txt_NombrePlan(JTextField FormularioPlanesIntenet_txt_NombrePlan) {
        this.FormularioPlanesIntenet_txt_NombrePlan = FormularioPlanesIntenet_txt_NombrePlan;
    }

    public JTextField getFormularioPlanesIntenet_txt_Precio() {
        return FormularioPlanesIntenet_txt_Precio;
    }

    public void setFormularioPlanesIntenet_txt_Precio(JTextField FormularioPlanesIntenet_txt_Precio) {
        this.FormularioPlanesIntenet_txt_Precio = FormularioPlanesIntenet_txt_Precio;
    }

    public JTextField getFormularioPlanesIntenet_txt_Velocidad() {
        return FormularioPlanesIntenet_txt_Velocidad;
    }

    public void setFormularioPlanesIntenet_txt_Velocidad(JTextField FormularioPlanesIntenet_txt_Velocidad) {
        this.FormularioPlanesIntenet_txt_Velocidad = FormularioPlanesIntenet_txt_Velocidad;
    }

    public JTextField getFormularioPlanesIntenet_txt_comparticionCanal() {
        return FormularioPlanesIntenet_txt_comparticionCanal;
    }

    public void setFormularioPlanesIntenet_txt_comparticionCanal(JTextField FormularioPlanesIntenet_txt_comparticionCanal) {
        this.FormularioPlanesIntenet_txt_comparticionCanal = FormularioPlanesIntenet_txt_comparticionCanal;
    }

    public JTextField getFormularioPlanesIntenet_txt_tipoCliente() {
        return FormularioPlanesIntenet_txt_tipoCliente;
    }

    public void setFormularioPlanesIntenet_txt_tipoCliente(JTextField FormularioPlanesIntenet_txt_tipoCliente) {
        this.FormularioPlanesIntenet_txt_tipoCliente = FormularioPlanesIntenet_txt_tipoCliente;
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
        jLabel3 = new javax.swing.JLabel();
        FormularioPlanesIntenet_Txt_Nombre_Tecnico = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        FormularioPlanesIntenet_txt_tipoCliente = new javax.swing.JTextField();
        FormularioPlanesIntenet_txt_comparticionCanal = new javax.swing.JTextField();
        FormularioPlanesIntenet_txt_NombrePlan = new javax.swing.JTextField();
        FormularioPlanesIntenet_txt_IDPlna = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FormularioPlanesIntenet_txt_Velocidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FormularioPlanesIntenet_txt_Precio = new javax.swing.JTextField();
        FormularioPlanesIntenet_BntGuardar = new javax.swing.JButton();
        FormularioPlanesIntenet_BontCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nombre Tecnico:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 61, -1, -1));

        FormularioPlanesIntenet_Txt_Nombre_Tecnico.setBackground(new java.awt.Color(255, 255, 255));
        FormularioPlanesIntenet_Txt_Nombre_Tecnico.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(FormularioPlanesIntenet_Txt_Nombre_Tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 200, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planes Internet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        FormularioPlanesIntenet_txt_tipoCliente.setBackground(new java.awt.Color(255, 255, 255));
        FormularioPlanesIntenet_txt_tipoCliente.setForeground(new java.awt.Color(0, 0, 0));

        FormularioPlanesIntenet_txt_comparticionCanal.setBackground(new java.awt.Color(255, 255, 255));
        FormularioPlanesIntenet_txt_comparticionCanal.setForeground(new java.awt.Color(0, 0, 0));

        FormularioPlanesIntenet_txt_NombrePlan.setBackground(new java.awt.Color(255, 255, 255));
        FormularioPlanesIntenet_txt_NombrePlan.setForeground(new java.awt.Color(0, 0, 0));

        FormularioPlanesIntenet_txt_IDPlna.setBackground(new java.awt.Color(255, 255, 255));
        FormularioPlanesIntenet_txt_IDPlna.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setText("ID Plan:");

        jLabel2.setText("Nombre Plan:");

        jLabel5.setText("Comparticion Canal:");

        jLabel6.setText("Tipo Cliente:");

        FormularioPlanesIntenet_txt_Velocidad.setBackground(new java.awt.Color(255, 255, 255));
        FormularioPlanesIntenet_txt_Velocidad.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setText("Velocidad:");

        jLabel8.setText("Precio:");

        FormularioPlanesIntenet_txt_Precio.setBackground(new java.awt.Color(255, 255, 255));
        FormularioPlanesIntenet_txt_Precio.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(FormularioPlanesIntenet_txt_tipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(FormularioPlanesIntenet_txt_IDPlna, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(FormularioPlanesIntenet_txt_NombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(FormularioPlanesIntenet_txt_comparticionCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FormularioPlanesIntenet_txt_Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FormularioPlanesIntenet_txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormularioPlanesIntenet_txt_IDPlna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormularioPlanesIntenet_txt_NombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(FormularioPlanesIntenet_txt_Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormularioPlanesIntenet_txt_comparticionCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(FormularioPlanesIntenet_txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormularioPlanesIntenet_txt_tipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 210));

        FormularioPlanesIntenet_BntGuardar.setText("Guardar");
        jPanel1.add(FormularioPlanesIntenet_BntGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        FormularioPlanesIntenet_BontCancelar.setText("Cancelar");
        jPanel1.add(FormularioPlanesIntenet_BontCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Formulario Contribuyente");
        jPanel1.getAccessibleContext().setAccessibleParent(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioPlanesInternet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPlanesInternet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPlanesInternet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPlanesInternet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPlanesInternet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FormularioPlanesIntenet_BntGuardar;
    private javax.swing.JButton FormularioPlanesIntenet_BontCancelar;
    private javax.swing.JTextField FormularioPlanesIntenet_Txt_Nombre_Tecnico;
    private javax.swing.JTextField FormularioPlanesIntenet_txt_IDPlna;
    private javax.swing.JTextField FormularioPlanesIntenet_txt_NombrePlan;
    private javax.swing.JTextField FormularioPlanesIntenet_txt_Precio;
    private javax.swing.JTextField FormularioPlanesIntenet_txt_Velocidad;
    private javax.swing.JTextField FormularioPlanesIntenet_txt_comparticionCanal;
    private javax.swing.JTextField FormularioPlanesIntenet_txt_tipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
