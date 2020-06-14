/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo. *;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ArchivoTextoProyectos {
    
     
    private File archivo;
    private FileWriter aEsc;  // abre archivo para escritura
    private Scanner aLect; // abre archivo en modo lectura


    Estudiante estudiante;
    PropuestaProyecto propuesta;
    Tesis tesis;
    Practicas practica;

    
    public ArchivoTextoProyectos(String name) {
        this.archivo = new File(name);
    }
    

    
     public ArchivoTextoProyectos() {
         
        //AQUI CAMBIE TU DIRECCION Y LA  MIA PARA CREAR UN ARCHIVO DE TEXTO PARA LOS PROYECTOS
      
        this("Proyectos.txt");
     
    }
     
    public String Guardar (Estudiante estudiante) throws Exception{
       this.aEsc =null;
       String mensaje;

       try{
           this.aEsc = new FileWriter(this.archivo, true);
           PrintWriter pw = new PrintWriter(this.aEsc);
           pw.println( estudiante.formaArchivo());
           mensaje = "GUARDO CORRECTAMENTE EL PROYECTO,SU RADICADO ES: "+estudiante.getPropuesta().getRadicado();
           
           return mensaje;
           
       }catch(IOException ioe){
          mensaje = "ERROR AL GUARDAR PROYECTO" + ioe.getMessage();
          return mensaje;
       } 
       finally{
           if(this.aEsc!=null)
               this.aEsc.close();
       }
    }
    

    
      public ArrayList<Estudiante> leerArchivo () throws Exception{
       
        try {
            ArrayList<Estudiante> listaEstudiante = new ArrayList();
            
           
            this.aLect = new Scanner(this.archivo);
            while(this.aLect.hasNext()){
                String datos[] = this.aLect.nextLine().split(";");
                estudiante = new Estudiante();
                propuesta = new PropuestaProyecto();
                
                propuesta.setRadicado(Integer.parseInt(datos[0]));
                estudiante.setNombre(datos[1]);
                estudiante.setApellido(datos[2]);
                estudiante.setCedula(datos[3]);
                estudiante.setCelular(datos[4]);
                propuesta.setNombreP(datos[5]);
                propuesta.setTiempoEjeP(datos[6]);
                propuesta.setLineaInvesti(datos[7]);
                propuesta.setSubLineaInvesti(datos[8]);
                propuesta.setDescripcion(datos[9]);
                propuesta.setDocenteAux(datos[10]);
                propuesta.setTipoProyecto(datos[11]);
                propuesta.setEstado(datos[12]);
                propuesta.setCorreciones(datos[13]);
                propuesta.setConcepto(datos[14]);
                propuesta.setEvaluador1(datos[15]);
                propuesta.setEvaluador2(datos[16]);
                
                if(propuesta.getTipoProyecto().equals("Tesis")){
                   tesis = new Tesis();
                   tesis.setPlanteamientoproblema(datos[17]);
                   tesis.setObjGeneral(datos[18]);
                   tesis.setObjEspecifico(datos[19]);
                   tesis.setJustificacion(datos[20]);
                   propuesta.setTesis(tesis);
                }else{
                    practica = new Practicas();
                    practica.setNombreEmp(datos[17]);
                    practica.setDireccionEmp(datos[18]);
                    practica.setTelefonoEmp(datos[19]);
                    practica.setRepreLegal(datos[20]);
                    practica.setAreaTrbajo(datos[21]);
                    practica.setFunciones(datos[22]);
                    propuesta.setPracticas(practica);   
                }
         
                estudiante.setPropuesta(propuesta);
                
                listaEstudiante.add(estudiante);
            }
            this.aLect.close();
            return listaEstudiante;
            
        } catch (FileNotFoundException ex) {
           throw new Exception("Error al abrir archivo para lectura");   
        }
  }
    
}
 
