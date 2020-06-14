/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JPanel;

/**
 *
 * @author zarel
 */
public class ComiteInvestigacion extends javax.swing.JFrame {

    /**
     * Creates new form ComiteInvestigacion
     */
    public ComiteInvestigacion() {
        initComponents();
       this.setLocationRelativeTo(null);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanelListaProyecto8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanelProyectoAcetado = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanelDocenteAsignado = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        LabelProyectoEvaluados = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        LabelBotonInicio = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 102, 0));
        jPanel10.setForeground(new java.awt.Color(0, 102, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelListaProyecto8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelListaProyecto8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelListaProyecto8jPanelListaProyectoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelListaProyecto8jPanelListaProyectoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelListaProyecto8jPanelListaProyectoMouseExited(evt);
            }
        });
        jPanelListaProyecto8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel26.setText("Lista Proyectos");
        jPanelListaProyecto8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 40));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_order_history_30px.png"))); // NOI18N
        jPanelListaProyecto8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel10.add(jPanelListaProyecto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 40));

        jPanelProyectoAcetado.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProyectoAcetado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelProyectoAcetadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelProyectoAcetadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelProyectoAcetadoMouseExited(evt);
            }
        });
        jPanelProyectoAcetado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel28.setText("Proyecto Aceptado");
        jPanelProyectoAcetado.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 40));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_compose_30px.png"))); // NOI18N
        jPanelProyectoAcetado.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel10.add(jPanelProyectoAcetado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, -1));

        jPanelDocenteAsignado.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDocenteAsignado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDocenteAsignadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelDocenteAsignadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelDocenteAsignadoMouseExited(evt);
            }
        });
        jPanelDocenteAsignado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel30.setText("Lista Docente");
        jPanelDocenteAsignado.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 140, 40));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_conference_foreground_selected_30px.png"))); // NOI18N
        jPanelDocenteAsignado.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel10.add(jPanelDocenteAsignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 220, -1));

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("_____________________________________");
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 230, 20));

        LabelProyectoEvaluados.setBackground(new java.awt.Color(255, 255, 255));
        LabelProyectoEvaluados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelProyectoEvaluadosMouseClicked(evt);
            }
        });
        LabelProyectoEvaluados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel54.setText("Proyectos Evaluados");
        LabelProyectoEvaluados.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 170, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_eye_30px.png"))); // NOI18N
        LabelProyectoEvaluados.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel10.add(LabelProyectoEvaluados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 220, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("_____________________________________");
        jPanel10.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 230, 20));

        jPanel11.setBackground(new java.awt.Color(0, 102, 0));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel11.add(LabelBotonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 80));

        jLabel58.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Investigacion");
        jPanel11.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 160, 40));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 160));

        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("_____________________________________");
        jPanel10.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 20));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_open_door_20px.png"))); // NOI18N
        jLabel13.setText("Salir");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 61, -1));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel2.add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 680, 600));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelBotonIniciojLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonIniciojLabel35MouseClicked
       
        new ComiteInvestigacion().show();
        dispose();
        
    }//GEN-LAST:event_LabelBotonIniciojLabel35MouseClicked

    private void LabelBotonIniciojLabel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonIniciojLabel35MouseEntered
         
    }//GEN-LAST:event_LabelBotonIniciojLabel35MouseEntered

    private void LabelBotonIniciojLabel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonIniciojLabel35MouseExited
      
    }//GEN-LAST:event_LabelBotonIniciojLabel35MouseExited

    private void jPanelListaProyecto8jPanelListaProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelListaProyecto8jPanelListaProyectoMouseClicked
     listaProyecto();
    }//GEN-LAST:event_jPanelListaProyecto8jPanelListaProyectoMouseClicked

    public void listaProyecto(){
        
        ListaProyectos lista = new ListaProyectos();
        Escritorio.add(lista);
        lista.show();
        
    }
    
    
    
    private void jPanelListaProyecto8jPanelListaProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelListaProyecto8jPanelListaProyectoMouseEntered
         resetColor(jPanelListaProyecto8);
     
    }//GEN-LAST:event_jPanelListaProyecto8jPanelListaProyectoMouseEntered

    private void jPanelListaProyecto8jPanelListaProyectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelListaProyecto8jPanelListaProyectoMouseExited
         setColor(jPanelListaProyecto8);
        
    }//GEN-LAST:event_jPanelListaProyecto8jPanelListaProyectoMouseExited

    private void jPanelProyectoAcetadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProyectoAcetadoMouseClicked
      proyectoAceptados();
    }//GEN-LAST:event_jPanelProyectoAcetadoMouseClicked

    public void proyectoAceptados(){
        
        ProyectoAceptados lista = new ProyectoAceptados();
        Escritorio.add(lista);
        lista.show();
        
    }
    
    private void jPanelProyectoAcetadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProyectoAcetadoMouseEntered
        resetColor(jPanelProyectoAcetado);
    }//GEN-LAST:event_jPanelProyectoAcetadoMouseEntered

    private void jPanelProyectoAcetadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelProyectoAcetadoMouseExited
        setColor(jPanelProyectoAcetado);
    }//GEN-LAST:event_jPanelProyectoAcetadoMouseExited

    private void jPanelDocenteAsignadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDocenteAsignadoMouseClicked
       listaDocente(); //LLAMO AQUI, JENNY
    }//GEN-LAST:event_jPanelDocenteAsignadoMouseClicked

    private void jPanelDocenteAsignadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDocenteAsignadoMouseEntered
        resetColor(jPanelDocenteAsignado);
    }//GEN-LAST:event_jPanelDocenteAsignadoMouseEntered

    private void jPanelDocenteAsignadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDocenteAsignadoMouseExited
        setColor(jPanelDocenteAsignado);
    }//GEN-LAST:event_jPanelDocenteAsignadoMouseExited

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
      
    }//GEN-LAST:event_jPanel11MouseExited

    private void LabelProyectoEvaluadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelProyectoEvaluadosMouseClicked
       proyectoEvaluados(); //LLAMO AQUI
    }//GEN-LAST:event_LabelProyectoEvaluadosMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new Login().show();
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel57MouseClicked

    //AGREGRE ESTOD DOS METODOS DONDE LLAMA INTERFAZ, JENNY
    
    public void listaDocente(){
        
        ListaDocente listaDocente = new ListaDocente();
        Escritorio.add(listaDocente);
        listaDocente.show();
        
    }
    
    public void proyectoEvaluados(){
        
      ListaProyectos listaProyectos = new ListaProyectos();
      Escritorio.add(listaProyectos);
      listaProyectos.show();
        
        
    }
    
    
     public void setColor(JPanel panel ){
       panel.setBackground(new java.awt.Color(255,255,255)); 
   }
   
    public void resetColor(JPanel panel ){
       panel.setBackground(new java.awt.Color(204,204,204)); 
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
            java.util.logging.Logger.getLogger(ComiteInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComiteInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComiteInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComiteInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComiteInvestigacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel LabelBotonInicio;
    private javax.swing.JPanel LabelProyectoEvaluados;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDocenteAsignado;
    private javax.swing.JPanel jPanelListaProyecto8;
    private javax.swing.JPanel jPanelProyectoAcetado;
    // End of variables declaration//GEN-END:variables
}
