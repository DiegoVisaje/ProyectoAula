
package Datos;

import Modelo.LineaDeInvestigacion;
import Modelo.SubLineaInvestigacion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.ListAdapter;

public class Archivo_TextoSub_Linea {
    
    
    private File archivo;
    private FileWriter aEsc; // abre archivo para escritura
    private Scanner aLect; // abre archivo en modo lectura
    
    public Archivo_TextoSub_Linea(String name){
        this.archivo = new File(name);
    }
    
    
     public Archivo_TextoSub_Linea() {
     
      this("CatalogoSubLineaInvestigacion.txt");
    }
     
      public boolean Guardar (SubLineaInvestigacion sub_lineaIn) throws Exception{
       this.aEsc =null;
       try{
           
           this.aEsc = new FileWriter(this.archivo, true);
           PrintWriter pw = new PrintWriter(this.aEsc);
           pw.println(sub_lineaIn.formaArchivo());
           return true;
           
       }catch(IOException ioe){
           
          throw new Exception("Error al abrir archivo para escritura"); 
          
       } 
       finally{
           if(this.aEsc!=null)
               this.aEsc.close();
       }
    }
    
      public ArrayList<SubLineaInvestigacion> leerArchivo () throws Exception{
       
        try {
            ArrayList<SubLineaInvestigacion> listaSubLinea = new ArrayList();
            this.aLect = new Scanner(this.archivo);
            while(this.aLect.hasNext()){
                String datos[] = this.aLect.nextLine().split(";");
                SubLineaInvestigacion Linea = new SubLineaInvestigacion();
                Linea.setlCodigo(datos[0]);
                Linea.setCodigo(datos[1]);
                Linea.setNombre(datos[2]);
                listaSubLinea.add(Linea);
            }
            this.aLect.close();
            return listaSubLinea;
            
        } catch (FileNotFoundException ex) {
           throw new Exception("Error al abrir archivo para lectura");   
        }
  }
      
      //CREE ARCHIVO ELIMINAR, JENY.
       public String Eliminar (String nombre) throws Exception{
           
       this.aEsc =null;
       
       try{
           
         ArrayList<SubLineaInvestigacion> listaSubLineaIn = new ArrayList();
         listaSubLineaIn = leerArchivo();  
         this.aEsc = new FileWriter(this.archivo, false);
         PrintWriter pw = new PrintWriter(this.aEsc);
         
         for(SubLineaInvestigacion a: listaSubLineaIn){
             if(!a.getNombre().equals(nombre)){
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
    public void EliminarConLinea (String codigo) throws Exception{
           
       this.aEsc =null;
       
       try{
           
         ArrayList<SubLineaInvestigacion> listaSubLineaIn = new ArrayList();
         listaSubLineaIn = leerArchivo();  
         this.aEsc = new FileWriter(this.archivo, false);
         PrintWriter pw = new PrintWriter(this.aEsc);
         
         for(SubLineaInvestigacion a: listaSubLineaIn){
             if(!a.getCodigo().equals(codigo)){
              pw.println(a.formaArchivo());
             }
         }
         
       }catch(IOException ioe){
          throw new Exception("ERROR AL ABRIR EL ARCHIVO"); 
       } 
       finally{
           if(this.aEsc!=null)
               this.aEsc.close();
       }
    }   
      
    public String Modificar (SubLineaInvestigacion subLinea, String nose) throws Exception{
           
       this.aEsc =null;
       
       try{
           
         ArrayList<SubLineaInvestigacion> listaSubLineaIn = new ArrayList();
         listaSubLineaIn = leerArchivo();  
         this.aEsc = new FileWriter(this.archivo, false);
         PrintWriter pw = new PrintWriter(this.aEsc);
         
         for(SubLineaInvestigacion a: listaSubLineaIn){
             if(!a.getNombre().equals(nose)){
              pw.println(a.formaArchivo());
             }else{
              subLinea.setlCodigo(a.getlCodigo()); 
              pw.println(subLinea.formaArchivo());
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
