
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

public class Archivo_TextoSub_Linea {
    
    
    private File archivo;
    private FileWriter aEsc;  // abre archivo para escritura
    private Scanner aLect; // abre archivo en modo lectura
    
    public Archivo_TextoSub_Linea(String name){
        this.archivo = new File(name);
    }
    
    
     public Archivo_TextoSub_Linea() {
        this("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\Proyecto_Con_Interfaz_Actualizada\\Documentos TXT\\CatalogoSubLineaInvestigacion.txt");
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
      
    
}
