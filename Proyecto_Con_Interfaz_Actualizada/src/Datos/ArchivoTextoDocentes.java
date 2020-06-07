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
       // this("C:\\Users\\zarel\\OneDrive\\Documentos\\NetBeansProjects\\PROYECTO GIT\\Proyecto_Con_Interfaz_Actualizada\\Documentos TXT\\Docentes.txt");
       this("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\ProyectoGit\\Proyecto_Con_Interfaz_Actualizada\\Documentos TXT\\Docentes.txt");
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
      
      
          
        public static String modificar(ArrayList<Docente> lista){
        String respuesta = "";
        FileWriter file = null;
        PrintWriter escritor = null;
        try{
            file = new FileWriter("C:\\Users\\zarel\\OneDrive\\Documentos\\NetBeansProjects\\PROYECTO GIT\\Proyecto_Con_Interfaz_Actualizada\\Documentos TXT\\Docentes.txt");
            escritor = new PrintWriter(file);
            for(Docente a: lista){
            escritor.println(a.getCargo()+"&"+a.getLinea()+"&"+a.getNombre()+"&"+a.getApellido()+"&"+a.getCedula()+"&" + a.getContraseña() + "" + a.getUsuario());
            }
            respuesta = "!!!REGISTRO MODIFICADO INCORRECTO!!!";
        }catch(IOException e){
            respuesta = "!!!NO SE PUEDE MODIFICAR EN EL ARCHIVO!!!";
        }finally{
            if(escritor!=null)
                escritor.close();
            try{
                if(file!=null)
                    file.close();
            }catch(IOException e){
                respuesta = "!!!NO SE LOGRO CERRAR EL ARCHIVO!!!";
            }
        }
        
        return respuesta;
    }
    
       
     public String eliminarArchivo(String cedula){
       String name = this.archivo.getName();
       if (this.archivo.delete()) return name;
        else return null;
    }

    
}
