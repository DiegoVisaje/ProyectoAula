/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoTextoProyectos;
import Modelo.Estudiante;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zarel
 */
public class ProyectoAceptados extends javax.swing.JInternalFrame {
    private ArrayList<Estudiante> listaEstudiante;
    private ArchivoTextoProyectos  archivo;
    
    /**
     * Creates new form ProyectoAceptados
     */
    public ProyectoAceptados() {
        initComponents();
        try {
            listaEstudiante = new ArrayList();
            archivo = new ArchivoTextoProyectos();
            listaEstudiante = archivo.leerArchivo();
            llenarTabla();
            
         } catch (Exception ex) {
         Logger.getLogger(RegistrarLineas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarTabla(){
        String titulos[]={"Radicado","Cedula", "Nombre Proyecto","Linea", "Tipo Proyecto"};
        DefaultTableModel ModeloTabla = new DefaultTableModel();
        ModeloTabla.setColumnIdentifiers(titulos); 
        
        for(Estudiante a: listaEstudiante){
            if(a.getPropuesta().getEstado().equals("Aceptado")){
                Object datos[]={a.getPropuesta().getRadicado(),a.getCedula(),a.getPropuesta().getNombreP(),a.getPropuesta().getLineaInvesti(),a.getPropuesta().getTipoProyecto()};
                ModeloTabla.addRow(datos);
            }
        }
        TablaListaProyecto.setModel(ModeloTabla);
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaListaProyecto = new javax.swing.JTable();
        BotonBuscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, 10));

        Buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setBorder(null);
        jPanel2.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 480, 20));

        jScrollPane1.setViewportView(TablaListaProyecto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 640, 430));

        BotonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_replace_20px.png"))); // NOI18N
        BotonBuscar.setText("buscar");
        jPanel2.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, -1));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 500));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proyectos aceptados");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 590, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 600));

        Escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonBuscar;
    private javax.swing.JTextField Buscar;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JTable TablaListaProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
