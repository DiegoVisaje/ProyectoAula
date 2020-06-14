/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoTextoDocentes;
import Datos.ArchivoTextoProyectos;
import Modelo.Docente;
import Modelo.Estudiante;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zarel
 */
public class VerDatosPractica extends javax.swing.JFrame {
    private int radicado;
    private ArrayList<Estudiante> listaEstudiante;
    private ArchivoTextoProyectos  archivoProyectos;
    private ArchivoTextoDocentes archivoDocente;
    private ArrayList<Docente> listadocentes ;
    
    /**
     * Creates new form VerDatosPractica
     */
    public VerDatosPractica() {
        initComponents();
        this.radicado=radicado;
    }
    
     public VerDatosPractica(int radicado) {
        initComponents();
        this.radicado=radicado;
        try {
            
            listaEstudiante = new ArrayList();
            archivoProyectos = new ArchivoTextoProyectos();
            listaEstudiante = archivoProyectos.leerArchivo();
            listadocentes = new ArrayList();
            archivoDocente = new ArchivoTextoDocentes();
            listadocentes = archivoDocente.leerArchivo();
            
            llenarDatos();
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCorreccionProyecto = new javax.swing.JTextArea();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDescripcionProyecto2 = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtDescripcionProyecto3 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtDescripcionProyecto4 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        labelNombreProyecto = new javax.swing.JLabel();
        labelTiempoEjecucion = new javax.swing.JLabel();
        labelLinea = new javax.swing.JLabel();
        labelSublinea = new javax.swing.JLabel();
        labelModalidad = new javax.swing.JLabel();
        comboEvaluador2 = new javax.swing.JComboBox<>();
        labelDocente = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        comboEvaluador1 = new javax.swing.JComboBox<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtConceptoProyecto = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtDescripcionProyecto6 = new javax.swing.JTextArea();
        jPanel18 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtDescripcionProyecto7 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtDescripcionProyecto8 = new javax.swing.JTextArea();
        jPanel20 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtDescripcionProyecto9 = new javax.swing.JTextArea();
        jPanel23 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtDescripcionProyecto10 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtDescripcionProyecto11 = new javax.swing.JTextArea();
        BotonGuardar = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelDireccionEmp = new javax.swing.JLabel();
        labelFunciones = new javax.swing.JLabel();
        labelNombreEmp = new javax.swing.JLabel();
        labelAreaTrabajo = new javax.swing.JLabel();
        labelTelefonoEmp = new javax.swing.JLabel();
        labelRepresentanteEmp = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(650, 650));

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

        jLabel41.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel41.setText("Celular:");
        jPanel11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 90, 40));

        jLabel47.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel47.setText("Docente");
        jPanel11.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 90, 40));

        jTextField20.setText("PDF");
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20jTextField15jTextField5ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 110, 30));

        jLabel48.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel48.setText("Evaluador 2: ");
        jPanel11.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 90, 40));

        txtCorreccionProyecto.setColumns(20);
        txtCorreccionProyecto.setRows(5);
        jScrollPane4.setViewportView(txtCorreccionProyecto);

        jPanel11.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1270, 400, 310));

        jLabel49.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel49.setText("Tiempo de ejecucion: ");
        jPanel11.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 160, 40));

        jLabel50.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel50.setText("Modalidad de grado");
        jPanel11.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 160, 40));

        jLabel51.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel51.setText("Linea de Investigación:");
        jPanel11.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 170, 40));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setText("Sub-linea de Investigación:");
        jPanel11.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 180, 40));

        jPanel10.setBackground(new java.awt.Color(0, 153, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Datos de la tesis ");
        jPanel10.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 204, 40));

        jPanel13.setBackground(new java.awt.Color(0, 153, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Correción del proyecto");
        jPanel13.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 204, 40));

        jPanel10.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 350, 40));

        txtDescripcionProyecto2.setColumns(20);
        txtDescripcionProyecto2.setRows(5);
        jScrollPane6.setViewportView(txtDescripcionProyecto2);

        jPanel10.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 350, 310));

        jPanel14.setBackground(new java.awt.Color(0, 153, 0));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Correción del proyecto");
        jPanel14.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 204, 40));

        jPanel15.setBackground(new java.awt.Color(0, 153, 0));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Correción del proyecto");
        jPanel15.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 204, 40));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 350, 40));

        txtDescripcionProyecto3.setColumns(20);
        txtDescripcionProyecto3.setRows(5);
        jScrollPane7.setViewportView(txtDescripcionProyecto3);

        jPanel14.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 350, 310));

        jPanel10.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 350, 40));

        txtDescripcionProyecto4.setColumns(20);
        txtDescripcionProyecto4.setRows(5);
        jScrollPane8.setViewportView(txtDescripcionProyecto4);

        jPanel10.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 350, 310));

        jPanel11.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 830, 930, 40));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Ver datos proyecto");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 160, 40));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55jLabel39MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, -1, -1));

        jPanel11.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 40));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_arrow_30px_1.png"))); // NOI18N
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56jLabel40MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 1590, -1, -1));

        jLabel38.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel38.setText("Nombre del Proyecto:");
        jPanel11.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 160, 40));

        labelNombre.setText(".");
        jPanel11.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 200, 40));

        labelApellido.setText(".");
        jPanel11.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 200, 40));

        labelCedula.setText(".");
        jPanel11.add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 200, 40));

        labelCelular.setText(".");
        jPanel11.add(labelCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 200, 40));

        labelNombreProyecto.setText(".");
        jPanel11.add(labelNombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 200, 40));

        labelTiempoEjecucion.setText(".");
        jPanel11.add(labelTiempoEjecucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 200, 40));

        labelLinea.setText(".");
        jPanel11.add(labelLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 200, 40));

        labelSublinea.setText(".");
        jPanel11.add(labelSublinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 200, 40));

        labelModalidad.setText(".");
        jPanel11.add(labelModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 200, 40));

        comboEvaluador2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        jPanel11.add(comboEvaluador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 150, 40));

        labelDocente.setText(".");
        jPanel11.add(labelDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 200, 40));

        jLabel57.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel57.setText("Documento");
        jPanel11.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 90, 40));

        jLabel58.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel58.setText("Estado:");
        jPanel11.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 70, 40));

        jLabel59.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel59.setText("Evaluador 1: ");
        jPanel11.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 90, 40));

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDIENTE" }));
        jPanel11.add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 150, 40));

        comboEvaluador1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        jPanel11.add(comboEvaluador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 150, 40));

        txtConceptoProyecto.setColumns(20);
        txtConceptoProyecto.setRows(5);
        jScrollPane9.setViewportView(txtConceptoProyecto);

        jPanel11.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 1270, 400, 310));

        jPanel16.setBackground(new java.awt.Color(0, 153, 0));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Concepto del proyecto");
        jPanel16.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 190, 40));

        jPanel17.setBackground(new java.awt.Color(0, 153, 0));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Correción del proyecto");
        jPanel17.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 204, 40));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 350, 40));

        txtDescripcionProyecto6.setColumns(20);
        txtDescripcionProyecto6.setRows(5);
        jScrollPane10.setViewportView(txtDescripcionProyecto6);

        jPanel16.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 350, 310));

        jPanel18.setBackground(new java.awt.Color(0, 153, 0));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Correción del proyecto");
        jPanel18.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 204, 40));

        jPanel19.setBackground(new java.awt.Color(0, 153, 0));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Correción del proyecto");
        jPanel19.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 204, 40));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 350, 40));

        txtDescripcionProyecto7.setColumns(20);
        txtDescripcionProyecto7.setRows(5);
        jScrollPane11.setViewportView(txtDescripcionProyecto7);

        jPanel18.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 350, 310));

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 350, 40));

        txtDescripcionProyecto8.setColumns(20);
        txtDescripcionProyecto8.setRows(5);
        jScrollPane12.setViewportView(txtDescripcionProyecto8);

        jPanel16.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 350, 310));

        jPanel11.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 1220, 400, 40));

        jPanel20.setBackground(new java.awt.Color(0, 153, 0));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Descripcion del proyecto");
        jPanel20.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 0, 204, 40));

        jPanel11.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 930, 40));

        jPanel21.setBackground(new java.awt.Color(0, 153, 0));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Correción del proyecto");
        jPanel21.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 204, 40));

        jPanel22.setBackground(new java.awt.Color(0, 153, 0));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Correción del proyecto");
        jPanel22.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 204, 40));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 350, 40));

        txtDescripcionProyecto9.setColumns(20);
        txtDescripcionProyecto9.setRows(5);
        jScrollPane13.setViewportView(txtDescripcionProyecto9);

        jPanel21.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 350, 310));

        jPanel23.setBackground(new java.awt.Color(0, 153, 0));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Correción del proyecto");
        jPanel23.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 204, 40));

        jPanel24.setBackground(new java.awt.Color(0, 153, 0));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Correción del proyecto");
        jPanel24.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 204, 40));

        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 350, 40));

        txtDescripcionProyecto10.setColumns(20);
        txtDescripcionProyecto10.setRows(5);
        jScrollPane14.setViewportView(txtDescripcionProyecto10);

        jPanel23.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 350, 310));

        jPanel21.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 350, 40));

        txtDescripcionProyecto11.setColumns(20);
        txtDescripcionProyecto11.setRows(5);
        jScrollPane15.setViewportView(txtDescripcionProyecto11);

        jPanel21.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 350, 310));

        jPanel11.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1220, 400, 40));

        BotonGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_20px.png"))); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseClicked(evt);
            }
        });
        jPanel11.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 1590, 100, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel13.setText("Nombre del lugar: ");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 890, 130, 40));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel14.setText("Direccion:");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 890, 100, 40));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel15.setText("Telefono:");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 980, 110, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Representante Legal:");
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 990, 150, 50));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel17.setText("Area de Trabajo:");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1070, 120, 50));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setText("Funciones a Realizar:");
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1090, 160, 40));

        labelDireccionEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelDireccionEmp.setText("Practica\n");
        jPanel11.add(labelDireccionEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 890, 260, 40));

        labelFunciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelFunciones.setText("Practica\n");
        jPanel11.add(labelFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 1090, 260, 40));

        labelNombreEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNombreEmp.setText("Practica\n");
        jPanel11.add(labelNombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 890, 260, 40));

        labelAreaTrabajo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAreaTrabajo.setText("Practica\n");
        jPanel11.add(labelAreaTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1080, 260, 40));

        labelTelefonoEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTelefonoEmp.setText("Practica\n");
        jPanel11.add(labelTelefonoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 990, 260, 40));

        labelRepresentanteEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelRepresentanteEmp.setText("Practica\n");
        jPanel11.add(labelRepresentanteEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 1000, 260, 40));

        labelDescripcion.setText("Descripcion");
        jPanel11.add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 930, 180));

        jScrollPane1.setViewportView(jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1883, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField20jTextField15jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20jTextField15jTextField5ActionPerformed
        //
    }//GEN-LAST:event_jTextField20jTextField15jTextField5ActionPerformed

    private void jLabel55jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55jLabel39MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel55jLabel39MouseClicked

    private void jLabel56jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56jLabel40MouseClicked

    }//GEN-LAST:event_jLabel56jLabel40MouseClicked

    private void BotonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseClicked

    }//GEN-LAST:event_BotonGuardarMouseClicked

    public void llenarDatos(){
        
         for(Estudiante a: listaEstudiante){
              
            if(this.radicado == a.getPropuesta().getRadicado()){
               
                labelNombre.setText(a.getNombre());
                labelApellido.setText(a.getApellido());
                labelCedula.setText(a.getCedula());
                labelCelular.setText(a.getCelular());
                labelDocente.setText(a.getPropuesta().getDocenteAux());
                labelNombreProyecto.setText(a.getPropuesta().getNombreP());
                labelTiempoEjecucion.setText(a.getPropuesta().getTiempoEjeP());
                labelLinea.setText(a.getPropuesta().getLineaInvesti());
                labelSublinea.setText(a.getPropuesta().getSubLineaInvesti());
                labelModalidad.setText(a.getPropuesta().getTipoProyecto());
                labelDescripcion.setText(a.getPropuesta().getDescripcion());
                labelNombreEmp.setText(a.getPropuesta().getPracticas().getNombreEmp());
                labelDireccionEmp.setText(a.getPropuesta().getPracticas().getDireccionEmp());
                labelAreaTrabajo.setText(a.getPropuesta().getPracticas().getAreaTrbajo());
                labelRepresentanteEmp.setText(a.getPropuesta().getPracticas().getRepreLegal());
                labelTelefonoEmp.setText(a.getPropuesta().getPracticas().getTelefonoEmp());
                labelFunciones.setText(a.getPropuesta().getPracticas().getFunciones());
            }
        }
        
        for (Docente e: listadocentes){
            if(labelLinea.getText().toString().equals(e.getLinea())){
                comboEvaluador1.addItem(e.getNombre()+" "+e.getApellido());
            }
        }
        
        for (Docente e: listadocentes){
            if(labelLinea.getText().toString().equals(e.getLinea())){
                comboEvaluador2.addItem(e.getNombre()+" "+e.getApellido());
            }
        }
        
        comboEstado.addItem("Aceptado");
        comboEstado.addItem("Rechazado");
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerDatosPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDatosPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDatosPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDatosPractica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDatosPractica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonGuardar;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboEvaluador1;
    private javax.swing.JComboBox<String> comboEvaluador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
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
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelAreaTrabajo;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelDireccionEmp;
    private javax.swing.JLabel labelDocente;
    private javax.swing.JLabel labelFunciones;
    private javax.swing.JLabel labelLinea;
    private javax.swing.JLabel labelModalidad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreEmp;
    private javax.swing.JLabel labelNombreProyecto;
    private javax.swing.JLabel labelRepresentanteEmp;
    private javax.swing.JLabel labelSublinea;
    private javax.swing.JLabel labelTelefonoEmp;
    private javax.swing.JLabel labelTiempoEjecucion;
    private javax.swing.JTextArea txtConceptoProyecto;
    private javax.swing.JTextArea txtCorreccionProyecto;
    private javax.swing.JTextArea txtDescripcionProyecto10;
    private javax.swing.JTextArea txtDescripcionProyecto11;
    private javax.swing.JTextArea txtDescripcionProyecto2;
    private javax.swing.JTextArea txtDescripcionProyecto3;
    private javax.swing.JTextArea txtDescripcionProyecto4;
    private javax.swing.JTextArea txtDescripcionProyecto6;
    private javax.swing.JTextArea txtDescripcionProyecto7;
    private javax.swing.JTextArea txtDescripcionProyecto8;
    private javax.swing.JTextArea txtDescripcionProyecto9;
    // End of variables declaration//GEN-END:variables
}
