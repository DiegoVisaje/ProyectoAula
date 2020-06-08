/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Estudiante;
import java.io.File;
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
         
        //this("C:\\Users\\zarel\\OneDrive\\Documentos\\NetBeansProjects\\PROYECTO GIT\\Proyecto_Con_Interfaz_Actualizada\\Documentos TXT\\Proyectos.txt");
       this("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\ProyectoGit\\Proyecto_Con_Interfaz_Actualizada\\Documentos TXT\\Proyectos.txt");
    }
     
    public boolean Guardar (Estudiante estudiante) throws Exception{
       this.aEsc =null;
       try{
           this.aEsc = new FileWriter(this.archivo, true);
           PrintWriter pw = new PrintWriter(this.aEsc);
           pw.println( estudiante.formaArchivo());
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
 
