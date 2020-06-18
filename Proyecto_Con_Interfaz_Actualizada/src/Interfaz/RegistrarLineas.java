/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.LineaDeInvestigacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;  
import Datos.*;
import Modelo.SubLineaInvestigacion;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author zarel
 */
public class RegistrarLineas extends javax.swing.JInternalFrame {

  private ArrayList<LineaDeInvestigacion> listaLineas = new ArrayList<LineaDeInvestigacion>();
  private ArchivoTextoLineas archivoTexto = new ArchivoTextoLineas();
  private Archivo_TextoSub_Linea archivoSubLineas = new Archivo_TextoSub_Linea();
  private  LineaDeInvestigacion e;
  
  
  
  //  private ArrayList<SubLineaInvestigacion> listaLineasSubLineas = new ArrayList<SubLineaInvestigacion>();   ****NO SE USA****
  //  private Archivo_TextoSub_Linea archivoSub_linea = new Archivo_TextoSub_Linea();    ****NO SE USA****
  
   // private SubLineaInvestigacion subLineaInvestigacion;  ****NO SE USA****


  
    
    public RegistrarLineas() {
        initComponents();
        
      try {
          listaLineas = archivoTexto.leerArchivo();
          mostrarTabla();
          
      } catch (Exception ex) {
          Logger.getLogger(RegistrarLineas.class.getName()).log(Level.SEVERE, null, ex);
      }
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TxtBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMostrarLineas = new javax.swing.JTable();
        TxtRegistrarLinea = new javax.swing.JTextField();
        TxtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BotonEliminar = new javax.swing.JLabel();
        BotonModificar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_arrow_30px_1.png"))); // NOI18N
        botonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, 10));

        TxtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TxtBuscar.setBorder(null);
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 480, 20));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Registrar linea:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 30));

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

        jTablaMostrarLineas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMostrarLineasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaMostrarLineas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 610, 200));

        TxtRegistrarLinea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtRegistrarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRegistrarLineaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtRegistrarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 310, 30));

        TxtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 60, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_replace_20px.png"))); // NOI18N
        jLabel4.setText("buscar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lista de la lineas de investigación");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 265, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 610, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Codigo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 70, 30));

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
        jLabel1.setText("Registrar lineas");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 440, 60));

        Escritorio.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 580));

        jMenu2.setText("REGISTRAR");

        jMenu1.setText("SUB-LIENAS");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
       RegistrarSub_Lineas();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void BotonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseClicked
     
       try{
        //esto si
       
        LlenarTablaLinea();
        
        if(e != null){
              archivoTexto.Guardar(e);
        }
        
         mostrarTabla();
           
       }catch( Exception exception ){
           
           JOptionPane.showMessageDialog(this, exception.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE); 
           
       }
       
    }//GEN-LAST:event_BotonGuardarMouseClicked
 
    private void TxtRegistrarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRegistrarLineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRegistrarLineaActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void botonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarMouseClicked
      new Admin2().show();
    }//GEN-LAST:event_botonRegresarMouseClicked

    private void jTablaMostrarLineasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMostrarLineasMouseClicked
       cargarDatos();
    }//GEN-LAST:event_jTablaMostrarLineasMouseClicked

    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked

       eliminar();

    }//GEN-LAST:event_BotonEliminarMouseClicked

    private void BotonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarMouseClicked
        modificar();
    }//GEN-LAST:event_BotonModificarMouseClicked

    public void eliminar(){
        String mensaje;
        
        mensaje = eliminarLinea();
        mostrarTabla();
        limpiarDatosLineas();
        JOptionPane.showMessageDialog(this, mensaje , "MENSAJE ELIMINAR", JOptionPane.INFORMATION_MESSAGE);
    }
     public String eliminarLinea(){
     String mensaje;
     
       try{
                      
            String codigo = TxtBuscar.getText().trim();
            archivoSubLineas.EliminarConLinea(codigo);
            mensaje = archivoTexto.Eliminar(codigo);
            listaLineas = archivoTexto.leerArchivo();

        }catch( Exception a){
          mensaje = "ERROR AL ELIMINAR" + a.getMessage() ; 
        }
         return mensaje;
             
             
    }
   
    public LineaDeInvestigacion RegistrarLinea(){
          
        String linea, codigo;
        
        linea = TxtRegistrarLinea.getText();
        codigo = TxtCodigo.getText();
        e = new  LineaDeInvestigacion();
        
        if(validarSubLinea(codigo)){
            
          e=null;
          
        }else{
               
           e.setNombre(linea);
           e.setCodigo(codigo);
           
        }
        
        return e;
        
    }
    
    public void LlenarTablaLinea(){
   
        try{
          
            
            LineaDeInvestigacion e = this.RegistrarLinea();
            
            
            if(validarLinea(e.getCodigo())&& (!e.getCodigo().equals("")&& !e.getNombre().equals(""))) {
               listaLineas.add(e);
                JOptionPane.showMessageDialog(this, "Linea registrado con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarDatosLineas(); 
                
            }
            else{
               JOptionPane.showMessageDialog(this, "Codigo repetido", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE); 
        }
        
    }
    
    public void limpiarDatosLineas(){
        
        this.TxtCodigo.setText("");
        this.TxtRegistrarLinea.setText("");
         
    }
     
    public void mostrarTabla(){
        
        String titulos[]={"Codigo", "Linea investigacion"};
        
        DefaultTableModel ModeloTabla = new DefaultTableModel();
        ModeloTabla.setColumnIdentifiers(titulos);
        
         for(LineaDeInvestigacion a: listaLineas){
          Object datos[]={a.getCodigo(), a.getNombre()};
           ModeloTabla.addRow(datos);
         }
         jTablaMostrarLineas.setModel(ModeloTabla);
    }

    private boolean validarLinea(String codigo){
        for(LineaDeInvestigacion linea: listaLineas){
            if(linea.getCodigo().equals(codigo)){
                return false;
            }
        }
        return true;
    }
    
    private boolean validarSubLinea(String codigo){
        for(LineaDeInvestigacion linea: listaLineas){
            if(linea.getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }
    
    private void cargarDatos() {
        try{
            
            TxtRegistrarLinea.setText(jTablaMostrarLineas.getValueAt(jTablaMostrarLineas.getSelectedRow(), 1).toString());
            TxtCodigo.setText(jTablaMostrarLineas.getValueAt(jTablaMostrarLineas.getSelectedRow(), 0).toString());
            TxtCodigo.requestFocus();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "error al seleccionar");
        }
    }

    public void RegistrarSub_Lineas(){
    
       RegistrarSubLineas mu = new RegistrarSubLineas();
       Escritorio.add(mu);
       mu.show();
    
     }
    
    public void modificar(){
      
       String lineas, codigo, nose;
       
       try{
        
        nose = jTablaMostrarLineas.getValueAt(jTablaMostrarLineas.getSelectedRow(), 1).toString();
          
        lineas = TxtRegistrarLinea.getText().trim();
        codigo = TxtCodigo.getText().trim();
        
        e = new LineaDeInvestigacion(); 
         
        e.setCodigo(codigo);
        e.setNombre(lineas);
        
        archivoTexto.Modificar(e , nose);
        listaLineas = archivoTexto.leerArchivo();
        
        mostrarTabla();
        limpiarDatosLineas();
        

       }catch(Exception a){
          JOptionPane.showMessageDialog(this, a, "Excepcion", JOptionPane.ERROR_MESSAGE); 
       }  
   }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonEliminar;
    private javax.swing.JLabel BotonGuardar;
    private javax.swing.JLabel BotonModificar;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtRegistrarLinea;
    private javax.swing.JLabel botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablaMostrarLineas;
    // End of variables declaration//GEN-END:variables
}
