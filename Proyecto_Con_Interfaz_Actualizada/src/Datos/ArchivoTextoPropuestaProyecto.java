/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Estudiante;
import Modelo.LineaDeInvestigacion;
import Modelo.SolicitudEvaluacion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS-PC
 */
public class ArchivoTextoPropuestaProyecto {
    
    private File archivo;
    private FileWriter aEsc;  // abre archivo para escritura
    private Scanner aLect; // abre archivo en modo lectura
    
    
     public ArchivoTextoPropuestaProyecto(String name) {
        this.archivo = new File(name);
    }
    
    
     public ArchivoTextoPropuestaProyecto() {
      
       this("SolicitudEvaluacion.txt");

    }
     
     
      public boolean Guardar (SolicitudEvaluacion solicitudEvaluacion) throws Exception{
       this.aEsc =null;
       try{
           this.aEsc = new FileWriter(this.archivo, true);
           PrintWriter pw = new PrintWriter(this.aEsc);
           pw.println( solicitudEvaluacion.formaArchivo());
           return true;
       }catch(IOException ioe){
          throw new Exception("Error al abrir archivo para escritura"); 
       } 
       finally{
           if(this.aEsc!=null)
               this.aEsc.close();
       }
    }
      
      
        public ArrayList<SolicitudEvaluacion> leerArchivo () throws Exception{
       
        try {
            ArrayList<SolicitudEvaluacion> lista = new ArrayList();
            this.aLect = new Scanner(this.archivo);
            while(this.aLect.hasNext()){
                String datos[] = this.aLect.nextLine().split(";");
                SolicitudEvaluacion evaluacion = new SolicitudEvaluacion();
                evaluacion.setResumenResultados(datos[0]);
                evaluacion.setConclusiones(datos[1]);
                evaluacion.setTrabajosFuturos(datos[2]);
                evaluacion.setFk_PropuestaRadicado(datos[3]);
                evaluacion.setEstado1(datos[4]);
                evaluacion.setEstado2(datos[5]);
                
                lista.add(evaluacion);
            }
            this.aLect.close();
            return lista;
            
        } catch (FileNotFoundException ex) {
           throw new Exception("Error al abrir archivo para lectura");   
        }
    }
        
        
       public String modificar(String radicado, SolicitudEvaluacion solicitud)throws Exception{
      
        this.aEsc =null;
       
       try{
           
         ArrayList<SolicitudEvaluacion> lista = new ArrayList();
         lista = leerArchivo();
         this.aEsc = new FileWriter(this.archivo, false);
         PrintWriter pw = new PrintWriter(this.aEsc);
         
         for(SolicitudEvaluacion a: lista){
           
            if(a.getFk_PropuestaRadicado().equals(radicado)){
                a.setEstado1(solicitud.getEstado1());
                a.setEstado2(solicitud.getEstado2());
                pw.println(a.formaArchivo());
             
            }else{
             
              pw.println(a.formaArchivo());
            }
         }
           return "EL ARCHIVO FUE MODIFICADO";
       }catch(IOException ioe){
          throw new Exception("ERROR AL ABRIR EL ARCHIVO"); 
       } 
       finally{
           if(this.aEsc!=null)
               this.aEsc.close();
       }
          
      }
           
     
     
    
}
