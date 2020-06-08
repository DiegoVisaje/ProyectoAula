/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Estudiante;
import Modelo.PropuestaProyecto;
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
    private ArrayList<Estudiante> listaEstudiante;
    
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
    
    // ++++++++++++FALTA CREAR METODO LEER+++++++++++++++ 
    
    /*
    public ArrayList<Estudiante> leer(String radicado) throws Exception{
        try{
            listaEstudiante = new ArrayList();
            this.aLect = new Scanner(this.archivo);
             while(this.aLect.hasNext()){
                  String datos[] = this.aLect.nextLine().split(";");
                 Estudiante estudiante = new Estudiante();
                 PropuestaProyecto proyecto = new PropuestaProyecto();
                 
                 estudiante.setNombre();
                 estudiante.setApellido();
                 estudiante.setCedula();
                 estudiante.setCelular();
                 
                
                 
             }    
                 
            listaEstudiante.add(estudiante);
        
             return listaEstudiante;
         } catch (FileNotFoundException ex) {
           throw new Exception("Error al abrir archivo para lectura");   
        }
       
    }
    
    */
    
 }
 
