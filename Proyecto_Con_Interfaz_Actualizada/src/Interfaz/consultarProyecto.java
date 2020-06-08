
package Interfaz;

import Datos.ArchivoTextoProyectos;
import Modelo.Estudiante;
import javax.swing.table.DefaultTableModel;

public class consultarProyecto extends javax.swing.JInternalFrame {     
        private Estudiante estudiante;
    public consultarProyecto() {
        initComponents();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProyecto = new javax.swing.JTable();
        botonVolver = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarProyecto.setBackground(new java.awt.Color(240, 240, 240));
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

        jScrollPane1.setViewportView(TablaProyecto);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 980, 490));

        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_arrow_30px_1.png"))); // NOI18N
        botonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVolverMouseClicked(evt);
            }
        });
        jPanel3.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 560, 30, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1000, 600));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar proyecto");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 520, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_view_40px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 50, 50));

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
    
      public void mostrarTablaProyecto(){
         
        String titulos[]={"Cedula", "Nombre", "Apellido","Proyecto","Estado" , "Linea"};
        DefaultTableModel ModeloTabla = new DefaultTableModel();
        ModeloTabla.setColumnIdentifiers(titulos);
        
         
    }
    
    
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
       String radicado = txtBuscarProyecto.getText().trim();
       estudiante = new Estudiante();
       
       
      // estudiante = ArchivoTextoProyectos.leer(radicado);
       
    }//GEN-LAST:event_botonBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProyecto;
    private javax.swing.JLabel botonBuscar;
    private javax.swing.JLabel botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBuscarProyecto;
    // End of variables declaration//GEN-END:variables
}
