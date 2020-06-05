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
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author zarel
 */
public class RegistrarLineas extends javax.swing.JInternalFrame {

  private ArrayList<LineaDeInvestigacion> listaLineas = new ArrayList<LineaDeInvestigacion>();
  
  
  private  LineaDeInvestigacion e;
  private  ArchivoTexto archivoTexto = new ArchivoTexto();
  
    
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
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
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

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_arrow_30px_1.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, 10));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 480, 20));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Registrar linea:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        BotonGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_20px.png"))); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 100, 30));

        jScrollPane1.setViewportView(jTablaMostrarLineas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 610, 200));

        TxtRegistrarLinea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtRegistrarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRegistrarLineaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtRegistrarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, 30));

        TxtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 60, 30));

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
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 70, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 640, 480));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
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
           
        LlenarTablaLinea();
        if(e != null){
              archivoTexto.Guardar(e);
        }
        
         mostrarTabla();
           
       }catch( Exception exception ){
           
           JOptionPane.showMessageDialog(this, e, "ERROR", JOptionPane.ERROR_MESSAGE); 
           
       }
       
    }//GEN-LAST:event_BotonGuardarMouseClicked

    private void TxtRegistrarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRegistrarLineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRegistrarLineaActionPerformed

    
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
            if(this.listaLineas.add(e) && e != null){
               JOptionPane.showMessageDialog(this, "Linea registrado con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarDatosLineas(); 
                
            }
            else{
               JOptionPane.showMessageDialog(this, "Error al registrar Linea", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Excepcion", JOptionPane.ERROR_MESSAGE); 
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

    
    private boolean validarSubLinea(String codigo){
        for(LineaDeInvestigacion linea: listaLineas){
            if(linea.getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }
    
    
    public void RegistrarSub_Lineas(){
         
       RegistrarSubLineas mu = new RegistrarSubLineas();
       Escritorio.add(mu);
       mu.show();
    
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonGuardar;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtRegistrarLinea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
