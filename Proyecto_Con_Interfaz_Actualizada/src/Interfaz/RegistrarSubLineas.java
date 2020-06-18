/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.*;
import Modelo.*;
import com.sun.xml.internal.messaging.saaj.util.ParserPool;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author zarel
 */
public class RegistrarSubLineas extends javax.swing.JInternalFrame {

    private ArrayList<SubLineaInvestigacion> listaLineasSubLineas = new ArrayList<SubLineaInvestigacion>();
    private ArrayList<LineaDeInvestigacion> listaLineas = new ArrayList<LineaDeInvestigacion>();
    private Archivo_TextoSub_Linea archivoSub_linea = new Archivo_TextoSub_Linea();
    private ArchivoTextoLineas archivoTexto = new ArchivoTextoLineas();
    private SubLineaInvestigacion subLineaInvestigacion;
    
    
    public RegistrarSubLineas() {
        
        initComponents();
          try {
          listaLineas = archivoTexto.leerArchivo();
          ListaDeLineas();
          listaLineasSubLineas = archivoSub_linea.leerArchivo();
          MostrarTabla();
      } catch (Exception ex) {
          Logger.getLogger(RegistrarLineas.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BotonRegresar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPintarSubLinea = new javax.swing.JTable();
        TxtSubLineas = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxRegistrarLineas = new javax.swing.JComboBox<>();
        BotonEliminar = new javax.swing.JLabel();
        BotonModificar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_arrow_30px_1.png"))); // NOI18N
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, 10));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscar.setBorder(null);
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 480, 20));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Elegir linea:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 160, 30));

        BotonGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_20px.png"))); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 100, 30));

        TablaPintarSubLinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPintarSubLineaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPintarSubLinea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 610, 200));

        TxtSubLineas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtSubLineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 150, 30));

        BotonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_replace_20px.png"))); // NOI18N
        BotonBuscar.setText("buscar");
        jPanel1.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lista de la sub-lineas investigacion");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 280, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 610, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Registrar sub-lineas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, 30));

        jComboBoxRegistrarLineas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        jComboBoxRegistrarLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRegistrarLineasActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxRegistrarLineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 150, 30));

        BotonEliminar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_delete_bin_20px_1.png"))); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        BotonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 100, 30));

        BotonModificar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_as_20px.png"))); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        BotonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonModificarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 100, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 640, 480));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 30, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Sublineas");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 530, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseClicked
       
        try{
           
        LlenarTablaLinea();
        archivoSub_linea.Guardar(subLineaInvestigacion);
        MostrarTabla();
        LimpiarTabla();
        
       }catch( Exception exception ){
           
           JOptionPane.showMessageDialog(this, archivoSub_linea, "ERROR", JOptionPane.ERROR_MESSAGE); 
           
       }
        
        
    }//GEN-LAST:event_BotonGuardarMouseClicked

    private void jComboBoxRegistrarLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRegistrarLineasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRegistrarLineasActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked
    
    //MODIFIQUE ALGO AQUI, JENY.
    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked
    
       //AQUI LLAME EL METODO ELIMINAR, JENNY, EN EL BOTON.
       String mensaje;
       mensaje = eliminarSubLinea();
       //PARA QUE SE ACTUALICE LA TABLA.
       MostrarTabla();
       //SE LIMPIE LA TABALA CADA VEZ QUE ELIMINES.
       LimpiarTabla();     
       JOptionPane.showMessageDialog(this, mensaje , "MENSAJE ELIMINAR", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_BotonEliminarMouseClicked

    private void TablaPintarSubLineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPintarSubLineaMouseClicked
     cargarDatos(); //LO LLAMAMOS EN LA TABLA, JENNY
    }//GEN-LAST:event_TablaPintarSubLineaMouseClicked

    private void BotonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarMouseClicked
       modificar();
    }//GEN-LAST:event_BotonModificarMouseClicked

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        new Admin2().show();
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

   //PUSE METODO CARGAR_DATOS JENNY, ENFOCA LA TABLA.
    
   private void cargarDatos() {
        try{
            
            TxtSubLineas.setText(TablaPintarSubLinea.getValueAt(TablaPintarSubLinea.getSelectedRow(), 2).toString());
            jComboBoxRegistrarLineas.setSelectedItem(TablaPintarSubLinea.getValueAt(TablaPintarSubLinea.getSelectedRow(), 1).toString());      
            TxtSubLineas.requestFocus();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Hay campos vacios");
        }
    }

   //AGREGRE UN METODO ELIMINAR SUBLINEA, JENNY, ME ELIMINA UNA SUB LINEA ESPECIFICA.
     
   public String eliminarSubLinea(){
       
     String mensaje;
     
       try{
        
            String codigo = txtBuscar.getText().trim(); 
            mensaje = archivoSub_linea.Eliminar(codigo);
            listaLineasSubLineas = archivoSub_linea.leerArchivo();

            }catch( Exception a){
              mensaje = "ERROR AL ELIMINAR" + a.getMessage() ; 
            }
             return mensaje;
    }
   
   //CREAMOS METODO PARA MODIFICAR, JENNY.
   
   public void modificar(){
       
       String subLineas, lineas, nose;
       
       try{
        
        nose = TablaPintarSubLinea.getValueAt(TablaPintarSubLinea.getSelectedRow(), 2).toString();
          
        subLineas = TxtSubLineas.getText();
        lineas = jComboBoxRegistrarLineas.getSelectedItem().toString();
        
        subLineaInvestigacion = new SubLineaInvestigacion(); 
         
        subLineaInvestigacion.setCodigo(lineas);
        subLineaInvestigacion.setNombre(subLineas);
        
        archivoSub_linea.Modificar(subLineaInvestigacion , nose);
        listaLineasSubLineas = archivoSub_linea.leerArchivo();
        
        MostrarTabla();
        LimpiarTabla();
        

       }catch(Exception a){
          JOptionPane.showMessageDialog(this, a, "Excepcion", JOptionPane.ERROR_MESSAGE); 
       }  
   }
 
    //CREE METODO LIMPIAR TABLA DE SUB-LINEA, JENY
   private void LimpiarTabla(){
        
        this.TxtSubLineas.setText("");
        this.jComboBoxRegistrarLineas.setSelectedItem("");
        this.txtBuscar.setText("");
    }
    
    public void LimpiarDatosSubLineas(){
            
        this.TxtSubLineas.setText("");
        this.jComboBoxRegistrarLineas.setSelectedItem("");
        
    }
    
    public SubLineaInvestigacion RegistrarSubLineas(){
        
        String subLineas, lineas, lCodigo="";
        
        subLineas = TxtSubLineas.getText();
        lineas = jComboBoxRegistrarLineas.getSelectedItem().toString();
       
         
        for(LineaDeInvestigacion linea: listaLineas){
            if(lineas.equals(linea.getNombre())){
              lCodigo = linea.getCodigo();
            }
        }
        subLineaInvestigacion = new SubLineaInvestigacion(); 
         
        subLineaInvestigacion.setlCodigo(lCodigo);
        subLineaInvestigacion.setCodigo(lineas);
        subLineaInvestigacion.setNombre(subLineas);
      
        
        
        return subLineaInvestigacion;
      
    }          
    
    public void LlenarTablaLinea(){
   
        try{
            SubLineaInvestigacion e = this.RegistrarSubLineas();
            if(this.listaLineasSubLineas.add(e)){
                JOptionPane.showMessageDialog(this, "Sub-Linea registrado con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                this.LimpiarDatosSubLineas(); 
                
            }
            else{
               JOptionPane.showMessageDialog(this, "Error al registrar la sub-linea", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Excepcion", JOptionPane.ERROR_MESSAGE); 
        }
        
    }
    
    public void ListaDeLineas(){
        
        for(LineaDeInvestigacion a: listaLineas){
            jComboBoxRegistrarLineas.addItem(a.getNombre());
        }
    }
       
    public void MostrarTabla(){
        
        String titulos[]={"codigo","Linea", "sub-linea"};
        
        DefaultTableModel ModeloTabla = new DefaultTableModel();
        ModeloTabla.setColumnIdentifiers(titulos);
        
        for(SubLineaInvestigacion a: listaLineasSubLineas){
          Object datos[]={a.getlCodigo(), a.getCodigo(), a.getNombre()};
           ModeloTabla.addRow(datos);
           }
        
         TablaPintarSubLinea.setModel(ModeloTabla);
    }

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonBuscar;
    private javax.swing.JLabel BotonEliminar;
    private javax.swing.JLabel BotonGuardar;
    private javax.swing.JLabel BotonModificar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JTable TablaPintarSubLinea;
    private javax.swing.JTextField TxtSubLineas;
    private javax.swing.JComboBox<String> jComboBoxRegistrarLineas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
