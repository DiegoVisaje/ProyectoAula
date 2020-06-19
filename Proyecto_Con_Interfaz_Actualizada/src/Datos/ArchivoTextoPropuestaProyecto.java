/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.LineaDeInvestigacion;
import Modelo.SolicitudEvaluacion;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
           
           
     
     
    
}
