/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoTextoPropuestaProyecto;
import Datos.ArchivoTextoProyectos;
import Modelo.Estudiante;
import Modelo.LineaDeInvestigacion;
import Modelo.PropuestaProyecto;
import Modelo.SolicitudEvaluacion;
import Modelo.SubLineaInvestigacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerProyectoEvaluador extends javax.swing.JInternalFrame {

   private ArrayList<PropuestaProyecto> listaProyectos;
   private ArrayList<Estudiante> listaEstudiante;
   private ArrayList<PropuestaProyecto> listaFiltrada;
   private ArrayList<SolicitudEvaluacion> listaSolicitudes;
   private ArrayList<SolicitudEvaluacion> listaSolicitudesFiltrada;
   private ArchivoTextoPropuestaProyecto solicitudes= new ArchivoTextoPropuestaProyecto();
   private ArchivoTextoProyectos proyectosDB= new ArchivoTextoProyectos();
   
   String nombreDocente, evaluador;
   
    public VerProyectoEvaluador() {
        initComponents();
    }
    
    public VerProyectoEvaluador(String nombreDocente ){
         initComponents();
         this.nombreDocente = nombreDocente;
         System.out.println("nombre del docente: " + nombreDocente);
         
          inicarProyectos();
          filtrarProyecto();
          ObtenerEvaluacion();
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
     
     
    public void filtrarProyecto(){
       
        listaFiltrada = new ArrayList<PropuestaProyecto>();
        
        for (PropuestaProyecto a : listaProyectos) {
            
            if(a.getEvaluador1().equals(nombreDocente)){
                listaFiltrada.add(a);
                evaluador = "1";
            }if(a.getEvaluador2().equals(nombreDocente)){
                listaFiltrada.add(a);
                evaluador = "2";
            }
        }
    }
    
    private void ObtenerEvaluacion(){
        
       
        listaSolicitudes= new ArrayList<SolicitudEvaluacion>();
        listaSolicitudesFiltrada= new ArrayList<SolicitudEvaluacion>();
        
        try {
            
            listaSolicitudes=solicitudes.leerArchivo();
            JOptionPane.showMessageDialog(null,"se consultaron correctamente");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "error al caragar las solictudes");
        
        }
        
        for (PropuestaProyecto propuestaProyecto : listaFiltrada) {
            
            for (SolicitudEvaluacion itemSolicitud : listaSolicitudes) {
                if (itemSolicitud.getFk_PropuestaRadicado().equals(""+propuestaProyecto.getRadicado())) {
                    listaSolicitudesFiltrada.add(itemSolicitud);
                }
            }
          
        }
        
        try {
            
        System.out.println(listaSolicitudesFiltrada.get(0).getResumenResultados());
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "no tiene solicitud de evaluacion asignadas");
        }
          pintarTabla();
    }
    
    
      public void pintarTabla(){
        
        String titulos[]={"RADICADO","RESUMEN", "TRABAJOS FUTURO" , "CONCLUSIONES", "ESTADO UNO", "ESTADO DOS"};
      
        DefaultTableModel ModeloTabla = new DefaultTableModel();
        ModeloTabla.setColumnIdentifiers(titulos);
        
        for(SolicitudEvaluacion a: listaSolicitudesFiltrada ){
          Object datos[]={a.getFk_PropuestaRadicado() ,a.getConclusiones(), a.getTrabajosFuturos(), a.getConclusiones(),a.getEstado1(),a.getEstado2()};
          
           ModeloTabla.addRow(datos);
           }
        
         tablaProyectos.setModel(ModeloTabla);
      
        
       
    }

    public void modificar(String estado){
        
        String radicado;
       
       try{
           
           radicado=txtRadicado.getText();
           
           SolicitudEvaluacion solicitudBuscada=new SolicitudEvaluacion();
           
           for (SolicitudEvaluacion solicitudEvaluacion : listaSolicitudesFiltrada) {
               if (radicado.equals(solicitudEvaluacion.getFk_PropuestaRadicado())) {
                   solicitudBuscada=solicitudEvaluacion;

               }
           }
           
           if(evaluador=="1"){
               solicitudBuscada.setEstado1(estado);
           }else if(evaluador=="2"){
               solicitudBuscada.setEstado2(estado);
           }
           
           
                    JOptionPane.showMessageDialog(this,"se modifico correctamente la solicitud con radicado: "+ radicado);
           
           solicitudes.modificar(radicado, solicitudBuscada);
           ObtenerEvaluacion();
           
       }catch(Exception a){
          JOptionPane.showMessageDialog(this, a, "Excepcion", JOptionPane.ERROR_MESSAGE); 
       }  
        
    }
      
      
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TxtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProyectos = new javax.swing.JTable();
        BotonBuscar = new javax.swing.JLabel();
        BotonRechazado = new javax.swing.JLabel();
        BotonAceptados = new javax.swing.JLabel();
        txtRadicado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, 10));

        TxtBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TxtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        TxtBuscar.setBorder(null);
        TxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 480, 20));

        jScrollPane1.setViewportView(tablaProyectos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 770, 390));

        BotonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_replace_20px.png"))); // NOI18N
        BotonBuscar.setText("buscar");
        jPanel1.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, -1));

        BotonRechazado.setBackground(new java.awt.Color(255, 255, 255));
        BotonRechazado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonRechazado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_cancel_20px.png"))); // NOI18N
        BotonRechazado.setText("Rechazar");
        BotonRechazado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        BotonRechazado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRechazadoMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRechazado, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 100, 30));

        BotonAceptados.setBackground(new java.awt.Color(255, 255, 255));
        BotonAceptados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonAceptados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_checked_20px.png"))); // NOI18N
        BotonAceptados.setText("Aceptados");
        BotonAceptados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));
        BotonAceptados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAceptadosMouseClicked(evt);
            }
        });
        jPanel1.add(BotonAceptados, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 100, 30));
        jPanel1.add(txtRadicado, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 100, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 960, 480));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista Proyecto");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 400, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAceptadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAceptadosMouseClicked
        modificar("Aprobado");
    }//GEN-LAST:event_BotonAceptadosMouseClicked

    private void BotonRechazadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRechazadoMouseClicked
        modificar("Reprobado");
    }//GEN-LAST:event_BotonRechazadoMouseClicked

    private void TxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAceptados;
    private javax.swing.JLabel BotonBuscar;
    private javax.swing.JLabel BotonRechazado;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaProyectos;
    private javax.swing.JTextField txtRadicado;
    // End of variables declaration//GEN-END:variables
}
