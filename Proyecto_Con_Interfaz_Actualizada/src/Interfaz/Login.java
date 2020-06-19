/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoTextoDocentes;
import Modelo.Docente;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author zarel
 */
public class Login extends javax.swing.JFrame {

    private ArchivoTextoDocentes archivo;
    private ArrayList<Docente> listadocentes;
    
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        TxtUsuario = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 102, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtUsuario.setText("usuario");
        TxtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtUsuarioFocusLost(evt);
            }
        });
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        jPanel11.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 160, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_20px.png"))); // NOI18N
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 30));

        TxtContraseña.setText("contraseña");
        TxtContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtContraseñaFocusLost(evt);
            }
        });
        jPanel8.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 160, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_password_20px.png"))); // NOI18N
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton4.setText("Iniciar");
        jButton4.setBorder(null);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 60, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_x_30px_1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 30));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton5.setText("Salir");
        jButton5.setBorder(null);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 60, 30));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 280, 440));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("________");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_male_user_127px.png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Login");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 60));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        loginAdmin();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void loginAdmin(){
        String usuario= "Admin", contraseña= "123";
   
        if(TxtUsuario.getText().equals(usuario) && TxtContraseña.getText().equals(contraseña)){
            JOptionPane.showMessageDialog(this, "Bienvenido Administrador");
            new Admin2().show();
            dispose();
        }else{
            loginDocente();
        }  
    }
    public void loginDocente(){
        boolean contraseñaIncorrecta = false;
     try{   
        archivo = new ArchivoTextoDocentes();
        listadocentes = new ArrayList();
        listadocentes = archivo.leerArchivo();
        
        for(Docente a: listadocentes){
            if(TxtUsuario.getText().equals(a.getUsuario())&& TxtContraseña.getText().equals(a.getContraseña())){
               if(a.getCargo().equals("Miembro")){
                   contraseñaIncorrecta = true;
                   
                  new ComiteInvestigacion().show(); 
                  dispose();
               }else{       
                   if(a.getCargo().equals("Evaluador")){
                       contraseñaIncorrecta = true;
                       new DocenteEvaluador(a.getNombre()+" "+a.getApellido()).show();
                       dispose();
                   }
               } 
            }
        }
        if(contraseñaIncorrecta==false){
            JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña Incorrecta");
        }
               
      }catch(Exception ex){
          Logger.getLogger(RegistrarLineas.class.getName()).log(Level.SEVERE, null, ex); 
         
       }   
    }
     
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       Salir();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
  
  
    }//GEN-LAST:event_jButton4MouseClicked

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       new Inicio().show();
       dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsuarioFocusGained
  
        
        if(TxtUsuario.getText().equals("usuario")){
             TxtUsuario.setText("");
        }
       
    }//GEN-LAST:event_TxtUsuarioFocusGained

    private void TxtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtContraseñaFocusGained
     
        if(TxtContraseña.getText().equals("contraseña")){
            TxtContraseña.setText("");
        }
     
    }//GEN-LAST:event_TxtContraseñaFocusGained

    private void TxtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsuarioFocusLost
       
            if(TxtUsuario.getText().equals("")){
             TxtUsuario.setText("usuario");
        }
    }//GEN-LAST:event_TxtUsuarioFocusLost

    private void TxtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtContraseñaFocusLost
       
         if(TxtContraseña.getText().equals("")){
            TxtContraseña.setText("contraseña");
        }
    }//GEN-LAST:event_TxtContraseñaFocusLost

    public void Salir(){
      System.exit(0);
    }
    
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
