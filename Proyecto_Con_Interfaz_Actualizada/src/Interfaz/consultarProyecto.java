
package Interfaz;

import Datos.ArchivoTextoProyectos;
import Modelo.Estudiante;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class consultarProyecto extends javax.swing.JInternalFrame {     
   
    private ArrayList<Estudiante> listaEstudiante;
    private ArchivoTextoProyectos  archivo;
    private  int radicado;
    
    public consultarProyecto() {
        initComponents();
        
     try{
     
       listaEstudiante = new ArrayList();
       archivo = new ArchivoTextoProyectos();
       listaEstudiante = archivo.leerArchivo();
       
      }catch(Exception ae){
          Logger.getLogger(RegistrarLineas.class.getName()).log(Level.SEVERE, null, ae);
      }    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarProyecto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JLabel();
        botonVolver = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        labelNombreP = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        labelTipoProyecto = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        labelEvaluador2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        labelEvaluador1 = new javax.swing.JLabel();
        labelConcepto = new javax.swing.JLabel();
        labelCorrecciones = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarProyecto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscarProyecto.setBorder(null);
        txtBuscarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProyectoActionPerformed(evt);
            }
        });
        jPanel3.add(txtBuscarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 480, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 480, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 30, 20));

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_replace_20px.png"))); // NOI18N
        botonBuscar.setText("buscar");
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });
        jPanel3.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 80, -1));

        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_arrow_30px_1.png"))); // NOI18N
        botonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVolverMouseClicked(evt);
            }
        });
        jPanel3.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 560, 30, 30));

        labelNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 240, 40));

        jLabel37.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel37.setText("Nombre:");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 40));

        labelApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 240, 40));

        jLabel38.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel38.setText("Apellido");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 100, 40));

        labelCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 240, 40));

        jLabel39.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel39.setText("Cedula");
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, 40));

        jLabel40.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel40.setText("Nombre del Proyecto:");
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 150, 40));

        labelNombreP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(labelNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 200, 40));

        jLabel41.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel41.setText("Estado:");
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 150, 40));

        labelEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(labelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 200, 40));

        jLabel42.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel42.setText("Tipo de Proyecto:");
        jPanel3.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 150, 40));

        labelTipoProyecto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(labelTipoProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 200, 40));

        jLabel43.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel43.setText("Evaluador 2:");
        jPanel3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 150, 40));

        labelEvaluador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(labelEvaluador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 200, 40));

        jLabel44.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel44.setText("Evaluador 1:");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 90, 40));

        labelEvaluador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(labelEvaluador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 240, 40));

        labelConcepto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(labelConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 370, 210));

        labelCorrecciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(labelCorrecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 340, 210));

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Concepto");
        jPanel1.add(jLabel8);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 370, 40));

        jPanel4.setBackground(new java.awt.Color(0, 102, 0));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correcciones");
        jPanel4.add(jLabel6);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 340, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1000, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar proyecto");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 520, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_view_40px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 50, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProyectoActionPerformed
      
    }//GEN-LAST:event_txtBuscarProyectoActionPerformed

    private void botonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMouseClicked
        regresar();
    }//GEN-LAST:event_botonVolverMouseClicked

    public void regresar(){
        
        new Inicio().show();
        dispose();
        
    }
    
      public void mostrarTablaProyecto(int radicado){
        
         for(Estudiante a: listaEstudiante){
            if(radicado==a.getPropuesta().getRadicado()){
                
               labelNombre.setText(a.getNombre());
               labelApellido.setText(a.getApellido());
               labelCedula.setText(a.getCedula());
               labelEstado.setText(a.getPropuesta().getEstado());
               labelNombreP.setText(a.getPropuesta().getNombreP());
               labelEvaluador1.setText(a.getPropuesta().getEvaluador1());
               labelEvaluador2.setText(a.getPropuesta().getEvaluador2());
               labelTipoProyecto.setText(a.getPropuesta().getTipoProyecto());
               labelCorrecciones.setText(a.getPropuesta().getCorreciones());
               labelConcepto.setText(a.getPropuesta().getConcepto());
            }
        }
       
        
         
    }
    
      public void nada(){
    
}
    
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        radicado = Integer.parseInt(txtBuscarProyecto.getText());
        mostrarTablaProyecto(radicado);
      
    }//GEN-LAST:event_botonBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonBuscar;
    private javax.swing.JLabel botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelConcepto;
    private javax.swing.JLabel labelCorrecciones;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelEvaluador1;
    private javax.swing.JLabel labelEvaluador2;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreP;
    private javax.swing.JLabel labelTipoProyecto;
    private javax.swing.JTextField txtBuscarProyecto;
    // End of variables declaration//GEN-END:variables
}
