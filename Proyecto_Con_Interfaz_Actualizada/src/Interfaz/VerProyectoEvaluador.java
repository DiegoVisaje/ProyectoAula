/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoTextoPropuestaProyecto;
import Datos.ArchivoTextoProyectos;
import Modelo.Estudiante;
import Modelo.PropuestaProyecto;
import Modelo.SolicitudEvaluacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VerProyectoEvaluador extends javax.swing.JInternalFrame {

   private ArrayList<PropuestaProyecto> listaProyectos;
   private ArrayList<Estudiante> listaEstudiante;
   private ArrayList<PropuestaProyecto> listaFiltrada;
   private ArrayList<SolicitudEvaluacion> listaSolicitudes;
    private ArrayList<SolicitudEvaluacion> listaSolicitudesFiltrada;
   private ArchivoTextoPropuestaProyecto solicitudes= new ArchivoTextoPropuestaProyecto();
   private ArchivoTextoProyectos proyectosDB= new ArchivoTextoProyectos();
   
   String nombreDocente;
    
    
 
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
            
            if(a.getEvaluador1().equals(nombreDocente) || a.getEvaluador2().equals(nombreDocente)){
                listaFiltrada.add(a);
               
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
    
    
    private void pintarTabla(){
        
        
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
        BotonGuardar = new javax.swing.JLabel();
        BotonRechazado = new javax.swing.JLabel();
        BotonVerDatos = new javax.swing.JLabel();
        BotonAceptados = new javax.swing.JLabel();
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
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 480, 20));

        jScrollPane1.setViewportView(tablaProyectos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 500, 390));

        BotonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_replace_20px.png"))); // NOI18N
        BotonBuscar.setText("buscar");
        jPanel1.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, -1));

        BotonGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_20px.png"))); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        jPanel1.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 100, 30));

        BotonRechazado.setBackground(new java.awt.Color(255, 255, 255));
        BotonRechazado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonRechazado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_cancel_20px.png"))); // NOI18N
        BotonRechazado.setText("Rechazar");
        BotonRechazado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.add(BotonRechazado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 100, 30));

        BotonVerDatos.setBackground(new java.awt.Color(255, 255, 255));
        BotonVerDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonVerDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_eye_20px_1.png"))); // NOI18N
        BotonVerDatos.setText("Ver datos");
        BotonVerDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel1.add(BotonVerDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 100, 30));

        BotonAceptados.setBackground(new java.awt.Color(255, 255, 255));
        BotonAceptados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonAceptados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_checked_20px.png"))); // NOI18N
        BotonAceptados.setText("Aceptados");
        BotonAceptados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));
        jPanel1.add(BotonAceptados, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 100, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 640, 480));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista Proyecto");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 400, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAceptados;
    private javax.swing.JLabel BotonBuscar;
    private javax.swing.JLabel BotonGuardar;
    private javax.swing.JLabel BotonRechazado;
    private javax.swing.JLabel BotonVerDatos;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaProyectos;
    // End of variables declaration//GEN-END:variables
}
