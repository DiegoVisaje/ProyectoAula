package Interfaz;

import javax.swing.JPanel;


public class Admin2 extends javax.swing.JFrame {

   
    public Admin2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

      public void regresar(){
        new Inicio().show();
        dispose();
    }
    
     public void setColor(JPanel panel ){
       panel.setBackground(new java.awt.Color(240,240,240)); 
   }
   
     public void resetColor(JPanel panel){
         panel.setBackground(new java.awt.Color(205,205,205));
     }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5Admin = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanelRegistrarDocente = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanelRegistrarLinea = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanelRegistrarSubLinea2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanelBarras = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5Admin.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5AdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5AdminMouseExited(evt);
            }
        });
        jPanel5Admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("________________");
        jPanel5Admin.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 20));

        jLabel33.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Administrador");
        jPanel5Admin.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_male_user_40px.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel35MouseExited(evt);
            }
        });
        jPanel5Admin.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 40, 50));

        jPanel1.add(jPanel5Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 110));

        jPanelRegistrarDocente.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRegistrarDocenteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRegistrarDocenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRegistrarDocenteMouseExited(evt);
            }
        });
        jPanelRegistrarDocente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Registrar docente");
        jPanelRegistrarDocente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_registration_20px_1.png"))); // NOI18N
        jPanelRegistrarDocente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel1.add(jPanelRegistrarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, 40));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 20));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 210, 20));

        jPanelRegistrarLinea.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarLinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRegistrarLineaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRegistrarLineaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRegistrarLineaMouseExited(evt);
            }
        });
        jPanelRegistrarLinea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Registrar linea");
        jPanelRegistrarLinea.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_maintenance_date_20px.png"))); // NOI18N
        jPanelRegistrarLinea.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel1.add(jPanelRegistrarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, -1));

        jPanelRegistrarSubLinea2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarSubLinea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRegistrarSubLinea2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRegistrarSubLinea2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRegistrarSubLinea2MouseExited(evt);
            }
        });
        jPanelRegistrarSubLinea2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Registrar sub-linea");
        jPanelRegistrarSubLinea2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_maintenance_date_20px.png"))); // NOI18N
        jPanelRegistrarSubLinea2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel1.add(jPanelRegistrarSubLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 210, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_open_door_20px.png"))); // NOI18N
        jLabel13.setText("Salir");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 61, -1));

        jPanelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 610));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, 30));

        jPanelPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 690, 40));

        jPanelBarras.setBackground(new java.awt.Color(0, 153, 51));
        jPanelBarras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jPanelBarras.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 0, -1, -1));

        jPanelPrincipal.add(jPanelBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 680, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUpc/Admin.jpg"))); // NOI18N

        escritorio.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelPrincipal.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 680, 610));

        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelRegistrarDocenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistrarDocenteMouseEntered
        resetColor(jPanelRegistrarDocente);
    }//GEN-LAST:event_jPanelRegistrarDocenteMouseEntered

    private void jPanelRegistrarDocenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistrarDocenteMouseExited
        setColor(jPanelRegistrarDocente);
    }//GEN-LAST:event_jPanelRegistrarDocenteMouseExited

    private void jPanel5AdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5AdminMouseEntered
      
    }//GEN-LAST:event_jPanel5AdminMouseEntered

    private void jPanel5AdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5AdminMouseExited
      
    }//GEN-LAST:event_jPanel5AdminMouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
         new Admin2().show();
         dispose();
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseEntered
         resetColorAdmin(jPanel5Admin);
    }//GEN-LAST:event_jLabel35MouseEntered

    private void jLabel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseExited
        setColorAdmin(jPanel5Admin);
    }//GEN-LAST:event_jLabel35MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
      new Login().show();
      dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    public void registrarSubLinea(){
        RegistrarSubLineas cu = new RegistrarSubLineas();
        escritorio.add(cu);
        cu.show();   
    }
    
    
    private void jPanelRegistrarDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistrarDocenteMouseClicked
        
        RegistrarDocente cu = new RegistrarDocente();
          escritorio.add(cu);
          cu.show();
          
    }//GEN-LAST:event_jPanelRegistrarDocenteMouseClicked

    private void jPanelRegistrarLineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistrarLineaMouseClicked
        RegistrarLienas();
    }//GEN-LAST:event_jPanelRegistrarLineaMouseClicked

    public void crearDocente(){
        
        RegistrarDocente crearDocente = new RegistrarDocente();
        escritorio.add(crearDocente);
        crearDocente.show();
        
    }
    
    
    private void jPanelRegistrarLineaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistrarLineaMouseEntered
          resetColor(jPanelRegistrarLinea);
    }//GEN-LAST:event_jPanelRegistrarLineaMouseEntered

    private void jPanelRegistrarLineaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistrarLineaMouseExited
         setColor(jPanelRegistrarLinea);
    }//GEN-LAST:event_jPanelRegistrarLineaMouseExited

    private void jPanelRegistrarSubLinea2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistrarSubLinea2MouseClicked
       registrarSubLinea();
    }//GEN-LAST:event_jPanelRegistrarSubLinea2MouseClicked

    private void jPanelRegistrarSubLinea2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistrarSubLinea2MouseEntered
        resetColor(jPanelRegistrarSubLinea2);
    }//GEN-LAST:event_jPanelRegistrarSubLinea2MouseEntered

    private void jPanelRegistrarSubLinea2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistrarSubLinea2MouseExited
          setColor(jPanelRegistrarSubLinea2);
    }//GEN-LAST:event_jPanelRegistrarSubLinea2MouseExited

     public void RegistrarLienas(){
    
      RegistrarLineas mu = new RegistrarLineas();
      escritorio.add(mu);
      mu.show();
    
     }
     
     
     
     public void setColorAdmin(JPanel panel ){
       panel.setBackground(new java.awt.Color(0,102,0)); 
   }
   
    public void resetColorAdmin(JPanel panel ){
       panel.setBackground(new java.awt.Color(0,153,51)); 
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
            java.util.logging.Logger.getLogger(Admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5Admin;
    private javax.swing.JPanel jPanelBarras;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelRegistrarDocente;
    private javax.swing.JPanel jPanelRegistrarLinea;
    private javax.swing.JPanel jPanelRegistrarSubLinea2;
    // End of variables declaration//GEN-END:variables
}
