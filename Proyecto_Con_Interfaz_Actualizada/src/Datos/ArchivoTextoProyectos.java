/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Docente;
import Modelo.Estudiante;
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
                Estudiante estudiante = new Estudiante();
                estudiante.setNombre(datos[0]);
                estudiante.setApellido(datos[1]);
                estudiante.setCelular(datos[2]);
                estudiante.setCedula(datos[3]);
              
                
                listaEstudiante.add(estudiante);
            }
            this.aLect.close();
            return listaEstudiante;
            
        } catch (FileNotFoundException ex) {
           throw new Exception("Error al abrir archivo para lectura");   
        }
  }
      
    
    
 }
 
