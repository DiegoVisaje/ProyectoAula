
package Datos;

import Modelo.Docente;
import Modelo.LineaDeInvestigacion;
import Modelo.SubLineaInvestigacion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArchivoTextoLineas {
    private File archivo;
    private FileWriter aEsc;  // abre archivo para escritura
    private Scanner aLect; // abre archivo en modo lectura
    
    public ArchivoTextoLineas(String name) {
        this.archivo = new File(name);
    }
    
    
     public ArchivoTextoLineas() {
      
       this("CatalogoLineaInvestigacion.txt");

    }
     
      public boolean Guardar (LineaDeInvestigacion lineaInvestigacion) throws Exception{
       this.aEsc =null;
       try{
           this.aEsc = new FileWriter(this.archivo, true);
           PrintWriter pw = new PrintWriter(this.aEsc);
           pw.println( lineaInvestigacion.formaArchivo());
           return true;
       }catch(IOException ioe){
          throw new Exception("Error al abrir archivo para escritura"); 
       } 
       finally{
           if(this.aEsc!=null)
               this.aEsc.close();
       }
    }
     
    public ArrayList<LineaDeInvestigacion> leerArchivo () throws Exception{
       
        try {
            ArrayList<LineaDeInvestigacion> lista = new ArrayList();
            this.aLect = new Scanner(this.archivo);
            while(this.aLect.hasNext()){
                String datos[] = this.aLect.nextLine().split(";");
                LineaDeInvestigacion Linea = new LineaDeInvestigacion();
                Linea.setCodigo(datos[0]);
                Linea.setNombre(datos[1]);
                lista.add(Linea);
            }
            this.aLect.close();
            return lista;
            
        } catch (FileNotFoundException ex) {
           throw new Exception("Error al abrir archivo para lectura");   
        }
    }
     
    
      public String Eliminar (String codigo) throws Exception{
           
       this.aEsc =null;
       
       try{
           
         ArrayList<LineaDeInvestigacion> listaLineaIn = new ArrayList();
         listaLineaIn = leerArchivo();  
         this.aEsc = new FileWriter(this.archivo, false);
         PrintWriter pw = new PrintWriter(this.aEsc);
         
         for(LineaDeInvestigacion a: listaLineaIn){
             if(!a.getCodigo().equals(codigo)){
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
    
      
       public String Modificar (LineaDeInvestigacion LineaIn , String nose) throws Exception{
           
       this.aEsc =null;
       
       try{
           
         ArrayList<LineaDeInvestigacion> listaLineas = new ArrayList();
         listaLineas = leerArchivo();  
         this.aEsc = new FileWriter(this.archivo, false);
         PrintWriter pw = new PrintWriter(this.aEsc);
         
         for(LineaDeInvestigacion a: listaLineas){
             if(!a.getNombre().equals(nose)){
              pw.println(a.formaArchivo());
             }else{
              LineaIn.setCodigo(a.getCodigo()); 
              pw.println(LineaIn.formaArchivo());
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
