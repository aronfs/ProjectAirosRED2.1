/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author aaron
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1Login = new javax.swing.JPanel();
        Panel2Login = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtCedulaLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtContrasenaLogin = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        btnModoNocturno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1Login.setBackground(new java.awt.Color(102, 0, 51));

        Panel2Login.setBackground(new java.awt.Color(204, 0, 51));
        Panel2Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Nombre Usuario:");
        Panel2Login.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblContrasena.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena.setText("Contraseña:");
        Panel2Login.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(255, 0, 51));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        Panel2Login.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        txtCedulaLogin.setBackground(new java.awt.Color(204, 0, 51));
        txtCedulaLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtCedulaLogin.setBorder(null);
        Panel2Login.add(txtCedulaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 240, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        Panel2Login.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 230, 20));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        Panel2Login.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, 20));

        txtContrasenaLogin.setBackground(new java.awt.Color(204, 0, 51));
        txtContrasenaLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenaLogin.setBorder(null);
        txtContrasenaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaLoginActionPerformed(evt);
            }
        });
        Panel2Login.add(txtContrasenaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 230, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-usuario-masculino-en-círculo-45.png"))); // NOI18N
        Panel2Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        btnRegistrarse.setBackground(new java.awt.Color(255, 0, 51));
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        Panel2Login.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        btnModoNocturno.setText("Modo Nocturno");

        javax.swing.GroupLayout Panel1LoginLayout = new javax.swing.GroupLayout(Panel1Login);
        Panel1Login.setLayout(Panel1LoginLayout);
        Panel1LoginLayout.setHorizontalGroup(
            Panel1LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1LoginLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(Panel2Login, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModoNocturno)
                .addGap(36, 36, 36))
        );
        Panel1LoginLayout.setVerticalGroup(
            Panel1LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1LoginLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnModoNocturno)
                .addGap(45, 45, 45)
                .addComponent(Panel2Login, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getPanel1Login() {
        return Panel1Login;
    }

    public void setPanel1Login(JPanel Panel1Login) {
        this.Panel1Login = Panel1Login;
    }

    public JPanel getPanel2Login() {
        return Panel2Login;
    }

    public void setPanel2Login(JPanel Panel2Login) {
        this.Panel2Login = Panel2Login;
    }

    public JButton getBtnIngresar() {
        return btnIngresar;
    }

    public void setBtnIngresar(JButton btnIngresar) {
        this.btnIngresar = btnIngresar;
    }

    public JButton getBtnModoNocturno() {
        return btnModoNocturno;
    }

    public void setBtnModoNocturno(JButton btnModoNocturno) {
        this.btnModoNocturno = btnModoNocturno;
    }

    public JButton getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public void setBtnRegistrarse(JButton btnRegistrarse) {
        this.btnRegistrarse = btnRegistrarse;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JLabel getLblContrasena() {
        return lblContrasena;
    }

    public void setLblContrasena(JLabel lblContrasena) {
        this.lblContrasena = lblContrasena;
    }

    public JLabel getLblUsuario() {
        return lblUsuario;
    }

    public void setLblUsuario(JLabel lblUsuario) {
        this.lblUsuario = lblUsuario;
    }

    public JTextField getTxtCedulaLogin() {
        return txtCedulaLogin;
    }

    public void setTxtCedulaLogin(JTextField txtCedulaLogin) {
        this.txtCedulaLogin = txtCedulaLogin;
    }

    public JPasswordField getTxtContrasenaLogin() {
        return txtContrasenaLogin;
    }

    public void setTxtContrasenaLogin(JPasswordField txtContrasenaLogin) {
        this.txtContrasenaLogin = txtContrasenaLogin;
    }
    
    
    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtContrasenaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaLoginActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1Login;
    private javax.swing.JPanel Panel2Login;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnModoNocturno;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCedulaLogin;
    private javax.swing.JPasswordField txtContrasenaLogin;
    // End of variables declaration//GEN-END:variables
}
