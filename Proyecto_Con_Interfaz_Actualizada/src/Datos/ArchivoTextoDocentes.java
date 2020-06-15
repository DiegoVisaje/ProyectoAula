/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.*;
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
public class ArchivoTextoDocentes {
    
    private File archivo;
    private FileWriter aEsc;  // abre archivo para escritura
    private Scanner aLect; // abre archivo en modo lectura
    
    public ArchivoTextoDocentes(String name) {
        this.archivo = new File(name);
    }
    
    
     public ArchivoTextoDocentes() {
   
        this("Docentes.txt");
    }
     
      public boolean Guardar (Docente docente) throws Exception{
       this.aEsc =null;
       try{
           this.aEsc = new FileWriter(this.archivo, true);
           PrintWriter pw = new PrintWriter(this.aEsc);
           pw.println( docente.formaArchivo());
           return true;
       }catch(IOException ioe){
          throw new Exception("Error al abrir archivo para escritura"); 
       } 
       finally{
           
           if(this.aEsc!=null)
               this.aEsc.close();
           
       }
    }

     
      public ArrayList<Docente> leerArchivo () throws Exception{
       
        try {
            ArrayList<Docente> listaDocentes = new ArrayList();
            this.aLect = new Scanner(this.archivo);
            while(this.aLect.hasNext()){
                String datos[] = this.aLect.nextLine().split(";");
                Docente docente = new Docente();
                docente.setCargo(datos[0]);
                docente.setNombre(datos[1]);
                docente.setApellido(datos[2]);
                docente.setCedula(datos[3]);
                docente.setUsuario(datos[4]);
                docente.setContraseña(datos[5]);
                docente.setLinea(datos[6]);
                listaDocentes.add(docente);
            }
            this.aLect.close();
            return listaDocentes;
            
        } catch (FileNotFoundException ex) {
           throw new Exception("Error al abrir archivo para lectura");   
        }
  }
     

    public String Modificar(Docente docente, String llave) throws Exception{
        
             
       this.aEsc =null;
       
       try{
           
         ArrayList<Docente> listaDocente = new ArrayList();
         listaDocente = leerArchivo();  
         this.aEsc = new FileWriter(this.archivo, false);
         PrintWriter pw = new PrintWriter(this.aEsc);
         
         for(Docente a: listaDocente){
             if(!a.getCedula().equals(llave)){
              pw.println(a.formaArchivo());
             }else{
             docente.setUsuario(a.getCedula());
              pw.println(docente.formaArchivo());
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

    public String Eliminar(String cedula) throws Exception {
        this.aEsc =null;
       
       try{
           
         ArrayList<Docente> listaDocentes = new ArrayList();
         listaDocentes = leerArchivo();
         this.aEsc = new FileWriter(this.archivo, false);
         PrintWriter pw = new PrintWriter(this.aEsc);
         
         for(Docente a: listaDocentes){
             if(!a.getCedula().equals(cedula)){
              pw.println(a.formaArchivo());
             }
         }
           return "EL ARCHIVO FUE ELIMINADO";
       }catch(IOException ioe){
          throw new Exception("ERROR AL ABRIR EL ARCHIVO"); 
          
       } 
      
       finally{
           
            if(this.aEsc!=null)
             this.aEsc.close();    
       }
    }

    
}
