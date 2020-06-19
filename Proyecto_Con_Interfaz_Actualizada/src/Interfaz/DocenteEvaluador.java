
package Interfaz;

import javax.swing.JPanel;


public class DocenteEvaluador extends javax.swing.JFrame {

  
    public DocenteEvaluador(){
        initComponents();
         this.setLocationRelativeTo(null);
    }
    
    public DocenteEvaluador(String nombre) {
        initComponents();
        jLabel58.setText(nombre);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        PanelListaProyecto = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        PanelHistorial = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        LabelBotonInicio = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 102, 0));
        jPanel11.setForeground(new java.awt.Color(0, 102, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelListaProyecto.setBackground(new java.awt.Color(255, 255, 255));
        PanelListaProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelListaProyectojPanelListaProyectoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelListaProyectojPanelListaProyectoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelListaProyectojPanelListaProyectoMouseExited(evt);
            }
        });
        PanelListaProyecto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel28.setText("Lista Proyectos");
        PanelListaProyecto.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 40));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_brief_30px.png"))); // NOI18N
        PanelListaProyecto.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel11.add(PanelListaProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 220, 40));

        PanelHistorial.setBackground(new java.awt.Color(255, 255, 255));
        PanelHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelHistorialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelHistorialMouseExited(evt);
            }
        });
        PanelHistorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel30.setText("Historial");
        PanelHistorial.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_wipes_30px.png"))); // NOI18N
        PanelHistorial.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel11.add(PanelHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 220, -1));

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("_____________________________________");
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 240, 20));

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("____________________________________");
        jPanel11.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 240, 20));

        jPanel12.setBackground(new java.awt.Color(0, 102, 0));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelBotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_male_user_100px.png"))); // NOI18N
        LabelBotonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelBotonIniciojLabel35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelBotonIniciojLabel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelBotonIniciojLabel35MouseExited(evt);
            }
        });
        jPanel12.add(LabelBotonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 80));

        jLabel58.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Evaluador");
        jPanel12.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 40));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 160));

        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("____________________________________");
        jPanel11.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 20));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_open_door_20px.png"))); // NOI18N
        jLabel13.setText("Salir");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 61, -1));

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 940, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelListaProyectojPanelListaProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelListaProyectojPanelListaProyectoMouseClicked
        VerProyectoEvaluador a = new VerProyectoEvaluador(jLabel58.getText());
        Escritorio.add(a);
        a.show();
        
        
    }//GEN-LAST:event_PanelListaProyectojPanelListaProyectoMouseClicked

    private void PanelListaProyectojPanelListaProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelListaProyectojPanelListaProyectoMouseEntered
        resetColor(PanelListaProyecto);

    }//GEN-LAST:event_PanelListaProyectojPanelListaProyectoMouseEntered

    private void PanelListaProyectojPanelListaProyectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelListaProyectojPanelListaProyectoMouseExited
        setColor(PanelListaProyecto);

    }//GEN-LAST:event_PanelListaProyectojPanelListaProyectoMouseExited

    private void PanelHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHistorialMouseClicked
        HistorialEvaluador a = new HistorialEvaluador();
        Escritorio.add(a);
        a.show();
    }//GEN-LAST:event_PanelHistorialMouseClicked

    private void PanelHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHistorialMouseEntered
        resetColor(PanelHistorial);
    }//GEN-LAST:event_PanelHistorialMouseEntered

    private void PanelHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHistorialMouseExited
        setColor(PanelHistorial);
    }//GEN-LAST:event_PanelHistorialMouseExited

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
       
    }//GEN-LAST:event_jLabel57MouseClicked

    private void LabelBotonIniciojLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonIniciojLabel35MouseClicked
        new DocenteEvaluador().show();
        
    }//GEN-LAST:event_LabelBotonIniciojLabel35MouseClicked

    private void LabelBotonIniciojLabel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonIniciojLabel35MouseEntered

    }//GEN-LAST:event_LabelBotonIniciojLabel35MouseEntered

    private void LabelBotonIniciojLabel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonIniciojLabel35MouseExited

    }//GEN-LAST:event_LabelBotonIniciojLabel35MouseExited

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered

    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited

    }//GEN-LAST:event_jPanel12MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new Login().show();
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

        
     public void setColor(JPanel panel ){
       panel.setBackground(new java.awt.Color(255,255,255)); 
   }
   
    public void resetColor(JPanel panel ){
       panel.setBackground(new java.awt.Color(204,204,204)); 
   }
    
    
    
   
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
            java.util.logging.Logger.getLogger(DocenteEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocenteEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocenteEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocenteEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocenteEvaluador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel LabelBotonInicio;
    private javax.swing.JPanel PanelHistorial;
    private javax.swing.JPanel PanelListaProyecto;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    // End of variables declaration//GEN-END:variables
}
