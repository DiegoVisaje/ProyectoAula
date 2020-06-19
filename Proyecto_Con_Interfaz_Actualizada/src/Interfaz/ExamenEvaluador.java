/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.*;
import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author zarel
 */
public class ExamenEvaluador extends javax.swing.JInternalFrame {

    /**
     * Creates new form ExamenEvaluador
     */
    
    private ArchivoTextoProyectos proyectosDB= new ArchivoTextoProyectos();
    private ArchivoTextoPropuestaProyecto evaluacionDb= new ArchivoTextoPropuestaProyecto();
     private ArrayList<PropuestaProyecto> listaProyectos;
     private ArrayList<Estudiante> listaEstudiante;
     private PropuestaProyecto propuestaBuscada;
     
            
    public ExamenEvaluador() {
        initComponents();
        inicarProyectos();
    }
    
   public void inicarProyectos(){
       
        try {
           
            listaProyectos= new ArrayList<PropuestaProyecto>();
            listaEstudiante=new ArrayList<Estudiante>();
            listaEstudiante=proyectosDB.leerArchivo();
            
            for (Estudiante estudiante : listaEstudiante) {
                listaProyectos.add(estudiante.getPropuesta());
            }
            
       } catch (Exception e) {
           
       }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarProyecto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txtconclusiones = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtResumenresultados = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtTrabajosfuturos = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(txtBuscarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 480, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 480, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 30, 20));

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_replace_20px.png"))); // NOI18N
        botonBuscar.setText("buscar");
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });
        jPanel3.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 80, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 0));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Resumen resultados");
        jPanel4.add(jLabel8);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 980, -1));

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("conclusiones");
        jPanel5.add(jLabel6);

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 980, 40));

        jPanel7.setBackground(new java.awt.Color(0, 102, 0));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Trabajos futuros");
        jPanel7.add(jLabel10);

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 980, 40));

        Txtconclusiones.setColumns(20);
        Txtconclusiones.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Txtconclusiones.setRows(5);
        jScrollPane1.setViewportView(Txtconclusiones);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 980, 110));

        TxtResumenresultados.setColumns(20);
        TxtResumenresultados.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        TxtResumenresultados.setRows(5);
        jScrollPane2.setViewportView(TxtResumenresultados);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 980, 110));

        TxtTrabajosfuturos.setColumns(20);
        TxtTrabajosfuturos.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        TxtTrabajosfuturos.setRows(5);
        jScrollPane3.setViewportView(TxtTrabajosfuturos);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 980, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_secured_letter_30px.png"))); // NOI18N
        jLabel4.setText("Enviar");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 560, 80, 30));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_arrow_30px_1.png"))); // NOI18N
        botonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarMouseClicked(evt);
            }
        });
        jPanel3.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 560, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1000, 600));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enviar Examen");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 420, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_secured_letter_50px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 50, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProyectoActionPerformed

    }//GEN-LAST:event_txtBuscarProyectoActionPerformed

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked

        buscarProyecto();

    }//GEN-LAST:event_botonBuscarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void botonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarMouseClicked
        new Admin2().show();
    }//GEN-LAST:event_botonRegresarMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       guardar();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void guardar(){
        SolicitudEvaluacion solicitud= new SolicitudEvaluacion();
        solicitud.setResumenResultados(TxtResumenresultados.getText().trim());
        solicitud.setConclusiones(Txtconclusiones.getText().trim());
        solicitud.setTrabajosFuturos(TxtTrabajosfuturos.getText().trim());
        solicitud.setFk_PropuestaRadicado(""+propuestaBuscada.getRadicado());
        
        try {
            
            evaluacionDb.Guardar(solicitud);
            JOptionPane.showMessageDialog(null, " Se guardo correctamente" );
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al guardar" );
        }
    }
    
    private void buscarProyecto(){
        
      
        
      try{
         
        int radicado=Integer.parseInt(txtBuscarProyecto.getText());
        boolean encontrado=false;
        PropuestaProyecto propuesta = new PropuestaProyecto();
        int radicado2;
       
        for (PropuestaProyecto itemP : listaProyectos) {
            if(itemP.getRadicado()==radicado){
                propuesta=itemP;
                propuestaBuscada=itemP;
                encontrado=true;
             
            }
        }
        
        if(encontrado){
            
            JOptionPane.showMessageDialog(null, "SE ENCONTRO LA PROPUESTA DEL PROYECTO: "+ propuesta.getRadicado() +": "+ propuesta.getNombreP());
            propuestaBuscada=propuesta;
        }
    }catch(Exception a){
            JOptionPane.showMessageDialog(this, "DIGITE UN NUMERO RADICADO VALIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
        
    }
   }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TxtResumenresultados;
    private javax.swing.JTextArea TxtTrabajosfuturos;
    private javax.swing.JTextArea Txtconclusiones;
    private javax.swing.JLabel botonBuscar;
    private javax.swing.JLabel botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBuscarProyecto;
    // End of variables declaration//GEN-END:variables

 
}
