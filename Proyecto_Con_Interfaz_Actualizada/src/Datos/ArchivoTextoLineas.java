
package Datos;

import Modelo.Docente;
import Modelo.LineaDeInvestigacion;
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
       //this("C:\\Users\\zarel\\OneDrive\\Documentos\\NetBeansProjects\\PROYECTO GIT\\Proyecto_Con_Interfaz_Actualizada\\Documentos TXT\\CatalogoLineaInvestigacion.txt");
       this("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\ProyectoGit\\Proyecto_Con_Interfaz_Actualizada\\Documentos TXT\\CatalogoLineaInvestigacion.txt");

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
      
     
      
 
}
