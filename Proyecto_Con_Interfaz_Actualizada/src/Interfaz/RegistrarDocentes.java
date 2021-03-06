
package Interfaz;

import Datos.ArchivoTextoLineas;
import Datos.ArchivoTextoDocentes;
import Datos.Archivo_TextoSub_Linea;
import Modelo.*;
import Modelo.LineaDeInvestigacion;
import Modelo.SubLineaInvestigacion;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zarel
 */

public class RegistrarDocentes extends javax.swing.JInternalFrame {

 
    private Docente docente;
    private ArrayList<Docente> listadocentes = new ArrayList<Docente>();
    
    private ArrayList<LineaDeInvestigacion> listaLineas = new ArrayList<LineaDeInvestigacion>();
    
    private Archivo_TextoSub_Linea archivoSub_linea = new Archivo_TextoSub_Linea();
    private ArchivoTextoLineas archivoTexto = new ArchivoTextoLineas();
    private  ArchivoTextoDocentes archivoTextoDocente = new ArchivoTextoDocentes();
 
    private String linea="";
    
   
   
    public RegistrarDocentes() {
        initComponents();
        a();
       
        
    }
    
    public void a() {
        
     try {
         cargos();
         listaLineas = archivoTexto.leerArchivo();
         listaLineas();
         listadocentes = archivoTextoDocente.leerArchivo();
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
        botonBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        TxtApellidoDocente = new javax.swing.JTextField();
        TxtContraseñaDocente = new javax.swing.JTextField();
        TxtCedulaDocente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        BotonGuardarDocente = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDocentes = new javax.swing.JTable();
        ComboCargo = new javax.swing.JComboBox<>();
        ComboLineaInvestigacion = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        TxtNombreDocente = new javax.swing.JTextField();
        BotonEliminar = new javax.swing.JLabel();
        BotonModificar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

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
        jPanel1.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, 10));

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_replace_20px.png"))); // NOI18N
        botonBuscar.setText("buscar");
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 480, 20));

        TxtApellidoDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtApellidoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, 30));

        TxtContraseñaDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtContraseñaDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 140, 30));

        TxtCedulaDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtCedulaDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 140, 30));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("Linea de investigacion:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 180, 30));

        BotonGuardarDocente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonGuardarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_20px.png"))); // NOI18N
        BotonGuardarDocente.setText("Guardar");
        BotonGuardarDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        BotonGuardarDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarDocenteMouseClicked(evt);
            }
        });
        jPanel1.add(BotonGuardarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 100, 30));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("Cargo:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 60, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Contraseña:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 100, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Apellido:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Cedula:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 30));

        TablaDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDocentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDocentes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 630, 190));

        ComboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        ComboCargo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCargoActionPerformed(evt);
            }
        });
        jPanel1.add(ComboCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 140, 30));

        ComboLineaInvestigacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        ComboLineaInvestigacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComboLineaInvestigacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboLineaInvestigacionMouseClicked(evt);
            }
        });
        ComboLineaInvestigacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLineaInvestigacionActionPerformed(evt);
            }
        });
        jPanel1.add(ComboLineaInvestigacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 140, 30));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Nombre:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));

        TxtNombreDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, 30));

        BotonEliminar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_delete_bin_20px_1.png"))); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        BotonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 100, 30));

        BotonModificar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_as_20px.png"))); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        BotonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonModificarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 100, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lista de los docentes registrados");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 280, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 630, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 510));

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
        jLabel1.setText("Registrar docente");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 500, 60));

        Escritorio.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCargoActionPerformed

    private void BotonGuardarDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarDocenteMouseClicked
        guardarDocente();
    }//GEN-LAST:event_BotonGuardarDocenteMouseClicked

    public void guardarDocente(){
        
        try{
           
        LlenarTablaDocente();
        
        if(docente != null){
            
           archivoTextoDocente.Guardar(docente);
           
        }
        mostrarTabla();
           
       }catch( Exception exception ){
           
         JOptionPane.showMessageDialog(this, archivoSub_linea, "ERROR", JOptionPane.ERROR_MESSAGE); 
    
       }  
    }
    

    private void ComboLineaInvestigacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboLineaInvestigacionMouseClicked
      
    }//GEN-LAST:event_ComboLineaInvestigacionMouseClicked

    private void ComboLineaInvestigacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLineaInvestigacionActionPerformed

       linea = ComboLineaInvestigacion.getSelectedItem().toString();

    }//GEN-LAST:event_ComboLineaInvestigacionActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void botonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarMouseClicked
       new Admin2().show();
    }//GEN-LAST:event_botonRegresarMouseClicked

    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked

        //AQUI LLAME EL METODO ELIMINAR, DIEGO, EN EL BOTON.
        String mensaje;
        mensaje = eliminarDocente();

        //PARA QUE SE ACTUALICE LA TABLA.
        mostrarTabla();
        //SE LIMPIE LA TABALA CADA VEZ QUE ELIMINES.
        LimpiarDatosDocente();

        JOptionPane.showMessageDialog(this, mensaje , "MENSAJE ELIMINAR", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_BotonEliminarMouseClicked

    private void BotonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarMouseClicked
        modificarDocente();
    }//GEN-LAST:event_BotonModificarMouseClicked

    private void TablaDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDocentesMouseClicked
       cargarDatos();
    }//GEN-LAST:event_TablaDocentesMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
       
    }//GEN-LAST:event_txtBuscarActionPerformed

//PUSE METODO CARGAR_DATOS DIEGO, ENFOCA LA TABLA.
    
   private void cargarDatos() {
        try{
            
           TxtNombreDocente.setText(TablaDocentes.getValueAt(TablaDocentes.getSelectedRow(),2).toString());
           TxtApellidoDocente.setText(TablaDocentes.getValueAt(TablaDocentes.getSelectedRow(), 3).toString());
           TxtCedulaDocente.setText(TablaDocentes.getValueAt(TablaDocentes.getSelectedRow(), 4).toString());
           TxtContraseñaDocente.setText(TablaDocentes.getValueAt(TablaDocentes.getSelectedRow(), 5).toString());
           ComboCargo.setSelectedItem(TablaDocentes.getValueAt(TablaDocentes.getSelectedRow(),0).toString() );
           ComboLineaInvestigacion.setSelectedItem(TablaDocentes.getValueAt(TablaDocentes.getSelectedRow(),6).toString());
           
           TxtNombreDocente.requestFocus();
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "HAY CAMPOS VACIOS");
        }
    }

   //AGREGRE UN METODO ELIMINAR SUBLINEA, DIEGO, ME ELIMINA UNA SUB LINEA ESPECIFICA.
     
   public String eliminarDocente(){
     String mensaje;
     
       try{
        
            String cedula = txtBuscar.getText().trim(); 
            mensaje = archivoTextoDocente.Eliminar(cedula);
            listadocentes = archivoTextoDocente.leerArchivo();

        }catch( Exception a){
             mensaje = "ERROR AL ELIMINAR" + a.getMessage() ; 
        }
       return mensaje;
    }
   
   //CREAMOS METODO PARA MODIFICAR, DIEGO.
   
   public void modificarDocente(){
       
      String cargo,  nombre, apellido,  cedula,  contraseña,linea, llave;
       
       try{
        
       llave = TablaDocentes.getValueAt(TablaDocentes.getSelectedRow(), 4).toString();
          
       cargo = ComboCargo.getSelectedItem().toString();
       nombre = TxtNombreDocente.getText();
       apellido = TxtApellidoDocente.getText();
       cedula = TxtCedulaDocente.getText();
       contraseña = TxtContraseñaDocente.getText();
       linea = ComboLineaInvestigacion.getSelectedItem().toString();
        
        docente = new Docente(); 
         
       
        docente.setNombre(nombre);
        docente.setApellido(apellido);
        docente.setCedula(cedula);
        docente.setCargo(cargo);
        docente.setContraseña(contraseña);
        docente.setLinea(linea);
         
         
        archivoTextoDocente.Modificar(docente, llave);
         listadocentes = archivoTextoDocente.leerArchivo();
        
        mostrarTabla();
        LimpiarDatosDocente();
        

       }catch(Exception a){
          JOptionPane.showMessageDialog(this, a, "Excepcion", JOptionPane.ERROR_MESSAGE); 
       }  
   }
   
    

    public Docente registrarDocente(){
        
       String cargo,  nombre, apellido,  cedula,  contraseña,subLinea;
       cargo = ComboCargo.getSelectedItem().toString();
       nombre = TxtNombreDocente.getText();
       apellido = TxtApellidoDocente.getText();
       cedula = TxtCedulaDocente.getText();
       contraseña = TxtContraseñaDocente.getText();
     
      
      docente = new Docente();
       
      docente.setCargo(cargo);
      docente.setNombre(nombre);
      docente.setApellido(apellido);
      docente.setCedula(cedula);
      docente.setContraseña(contraseña);

      docente.setUsuario(cedula);
      docente.setLinea(linea); 
                            
       return docente;
        
    }
    
    public void listaLineas(){
        
        for(LineaDeInvestigacion a: listaLineas){
            ComboLineaInvestigacion.addItem(a.getNombre());
        }
    }

    public void cargos(){
        ComboCargo.addItem("Miembro");
        ComboCargo.addItem("Evaluador");
    }
    
     public void LlenarTablaDocente(){
         
        try{
            Docente e = this.registrarDocente();
            if(this.listadocentes.add(e)){
                JOptionPane.showMessageDialog(this, "Docente registrado con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                this.LimpiarDatosDocente(); 
                
            }
            else{
               JOptionPane.showMessageDialog(this, "Error al registrar al Docente", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Excepcion", JOptionPane.ERROR_MESSAGE); 
        }
        
    }
    
     public void LimpiarDatosDocente(){
         
        this.TxtNombreDocente.setText("");
        this.TxtCedulaDocente.setText("");
        this.TxtContraseñaDocente.setText("");
        this.TxtApellidoDocente.setText("");
        this.ComboLineaInvestigacion.setSelectedItem("SELECCIONE");
        this.ComboCargo.setSelectedItem("SELECCIONE");
        this.txtBuscar.setText("");
        
     }
     
    public void mostrarTabla(){
        String titulos[]={"Cargo", "Cedula","Nombre", "Apellido","Usuario","Contraseña" , "Linea"};
        
        DefaultTableModel ModeloTabla = new DefaultTableModel();
        ModeloTabla.setColumnIdentifiers(titulos);
        
        for(Docente a: listadocentes){
          Object datos[]={a.getCargo(), a.getCedula(),a.getNombre(), a.getApellido(),a.getUsuario(), a.getContraseña(), a.getLinea()};
           ModeloTabla.addRow(datos);
       }
        
         TablaDocentes.setModel(ModeloTabla);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonEliminar;
    private javax.swing.JLabel BotonGuardarDocente;
    private javax.swing.JLabel BotonModificar;
    private javax.swing.JComboBox<String> ComboCargo;
    private javax.swing.JComboBox<String> ComboLineaInvestigacion;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JTable TablaDocentes;
    private javax.swing.JTextField TxtApellidoDocente;
    private javax.swing.JTextField TxtCedulaDocente;
    private javax.swing.JTextField TxtContraseñaDocente;
    private javax.swing.JTextField TxtNombreDocente;
    private javax.swing.JLabel botonBuscar;
    private javax.swing.JLabel botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
