/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoTextoDocentes;
import Datos.Archivo_TextoSub_Linea;
import Datos.ArchivoTexto;
import Modelo.Docente;
import Modelo.Estudiante;
import Modelo.LineaDeInvestigacion;
import Modelo.PropuestaProyecto;
import Modelo.SubLineaInvestigacion;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zarel
 */
public class RegistrarProyecto extends javax.swing.JInternalFrame {
    
    
    private ArrayList<Docente> listadocentes = new ArrayList<Docente>();
    private  ArchivoTextoDocentes archivoTextoDocente = new ArchivoTextoDocentes();
    private ArrayList<SubLineaInvestigacion> listaSubLineas = new ArrayList<SubLineaInvestigacion>();
    private ArrayList<LineaDeInvestigacion> listaLineas = new ArrayList<LineaDeInvestigacion>();
    private Archivo_TextoSub_Linea archivoSub_linea = new Archivo_TextoSub_Linea();
    private ArchivoTexto archivoTexto = new ArchivoTexto();
    private SubLineaInvestigacion subLineaInvestigacion;
     private String codigo="", linea="";
    /**
     * Creates new form RegistrarProyecto
     */
    
    Estudiante estudiante = new Estudiante();
   // PropuestaProyecto propuesta = new PropuestaProyecto();
    
    public RegistrarProyecto() {
        initComponents();
        
        try {

        listadocentes = archivoTextoDocente.leerArchivo();
        listaDocentes();
        listaLineas = archivoTexto.leerArchivo();
        listaLineas();
        listaSubLineas = archivoSub_linea.leerArchivo();

        
    } catch (Exception ex) {
        Logger.getLogger(RegistrarLineas.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        TxtCelular = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        ComboDocente = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        ComboTiempo = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        ComboSublinea = new javax.swing.JComboBox<>();
        ComboLineaInvestigacion = new javax.swing.JComboBox<>();
        BotonPractica = new javax.swing.JButton();
        BotonTesis = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setForeground(new java.awt.Color(0, 153, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel37.setText("Nombre:");
        jPanel11.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, 40));

        jLabel39.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel39.setText("Apellido:");
        jPanel11.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 40));

        jLabel40.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel40.setText("Cedula:");
        jPanel11.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 40));

        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 40));

        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 40));

        TxtCelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.add(TxtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, 40));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.setCaretColor(new java.awt.Color(51, 153, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel11.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 40));

        jLabel41.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel41.setText("Celular:");
        jPanel11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 90, 40));

        ComboDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        ComboDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDocenteActionPerformed(evt);
            }
        });
        jPanel11.add(ComboDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 190, 40));

        jLabel47.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel47.setText("Docente");
        jPanel11.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 90, 40));

        jTextField20.setText("PDF");
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15jTextField5ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 110, 30));

        jLabel48.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel48.setText("Documento");
        jPanel11.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 90, 40));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel11.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 930, 170));

        jLabel49.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel49.setText("Tiempo de ejecucion: ");
        jPanel11.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 160, 40));

        jLabel50.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel50.setText("Modalidad de Grado:");
        jPanel11.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 160, 40));

        jLabel51.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel51.setText("Linea de Investigación:");
        jPanel11.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 160, 40));

        ComboTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "1 mes", "2 meses", "3 meses", "4 meses" }));
        jPanel11.add(ComboTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 150, 40));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setText("Sub-linea de Investigación:");
        jPanel11.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 170, 40));

        ComboSublinea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel11.add(ComboSublinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 150, 40));

        ComboLineaInvestigacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel11.add(ComboLineaInvestigacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 150, 40));

        BotonPractica.setText("Practico");
        BotonPractica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonPractica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5jButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(BotonPractica, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 80, 40));

        BotonTesis.setText("Tesis");
        BotonTesis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonTesis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6jButton2MouseClicked(evt);
            }
        });
        BotonTesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6jButton2ActionPerformed(evt);
            }
        });
        jPanel11.add(BotonTesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 90, 40));

        jPanel10.setBackground(new java.awt.Color(0, 153, 0));

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Descricion del proyecto");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 930, 40));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Registro de proyecto");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 0, 189, 40));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, -1, -1));

        jPanel11.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 40));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_arrow_30px_1.png"))); // NOI18N
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 660, -1, 30));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_secured_letter_30px.png"))); // NOI18N

        jLabel58.setText("Enviar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 660, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        regresar();
    }//GEN-LAST:event_jLabel40MouseClicked
     
    public void regresar(){   
        new Inicio().show();
        dispose();
    }
    
     public String buscarCodigo(String Linea){
        for(LineaDeInvestigacion a: listaLineas){
            
            if(Linea.equals(a.getNombre())){
                return a.getCodigo();
            }
        }
        return null;
    }
    
    public void listaLineas(){
         for(LineaDeInvestigacion a: listaLineas){
            ComboLineaInvestigacion.addItem(a.getNombre());
        }
    }
            
    public void listaDocentes(){
         for(Docente a: listadocentes){
            ComboDocente.addItem(a.getNombre()+" "+a.getApellido());
        }
    }
    
     public void listaSubLineas(String codigo){
        
        for(SubLineaInvestigacion a: listaSubLineas ){
            if(a.getlCodigo().equals(codigo)){
             ComboSublinea.addItem(a.getNombre());  
            }  
        }
    }
    
    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jButton6jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6jButton2ActionPerformed

    private void jButton6jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6jButton2MouseClicked
        new Tesis().show();
        dispose();
    }//GEN-LAST:event_jButton6jButton2MouseClicked

    private void jButton5jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5jButton1ActionPerformed
        new Practico().show();
        dispose();
    }//GEN-LAST:event_jButton5jButton1ActionPerformed

    private void jTextField15jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15jTextField5ActionPerformed
    
    }//GEN-LAST:event_jTextField15jTextField5ActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
      
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String celuar = TxtCelular.getText().trim();
        String docente = ComboDocente.getSelectedItem().toString();
        String tiempoDeEjecucion = ComboTiempo.getSelectedItem().toString();
        String lineaInvestigacion = ComboLineaInvestigacion.getSelectedItem().toString();
        String subLinea = ComboSublinea.getSelectedItem().toString();
        
        
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setCedula(celuar);
        
        
        
        
        
        
        
    }//GEN-LAST:event_jPanel6MouseClicked

    private void ComboDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDocenteActionPerformed
       linea = ComboLineaInvestigacion.getSelectedItem().toString();
       codigo = buscarCodigo(linea);
       ComboSublinea.removeAllItems();
       listaSubLineas(codigo);
        
        
    }//GEN-LAST:event_ComboDocenteActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPractica;
    private javax.swing.JButton BotonTesis;
    private javax.swing.JComboBox<String> ComboDocente;
    private javax.swing.JComboBox<String> ComboLineaInvestigacion;
    private javax.swing.JComboBox<String> ComboSublinea;
    private javax.swing.JComboBox<String> ComboTiempo;
    private javax.swing.JTextField TxtCelular;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
