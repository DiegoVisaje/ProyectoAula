/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Scanner;


public class Administrador {
    private static  ArrayList<Docente> ListaMiembrosComite = new ArrayList<Docente>();
    private static  ArrayList<LineaDeInvestigacion> listaLineas = new ArrayList<LineaDeInvestigacion>();
    private static  ArrayList<SubLineaInvestigacion> listaSubLineas = new ArrayList<SubLineaInvestigacion>();
    
    Scanner escaner = new Scanner(System.in);
    private String usuario, contraseña;

    public Administrador() {
    }
    
    public Administrador(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
      /**
     * @return the ListaMiembrosComite
     */
    public static ArrayList<Docente> getListaMiembrosComite() {
        return ListaMiembrosComite;
    }

    /**
     * @param aListaMiembrosComite the ListaMiembrosComite to set
     */
    public static void setListaMiembrosComite(ArrayList<Docente> aListaMiembrosComite) {
        ListaMiembrosComite = aListaMiembrosComite;
    }
    
    
    public void crearMiembro(){
        
        System.out.println("\n\n**** CREAR DOCENTE *****");
        
        Docente a = new Docente();
        
        String  nombre,apellido,cedula,usuario,contraseña,cargo;
        int aux1;
        
        System.out.println("Nombre: ");
        nombre= escaner.nextLine();
        System.out.println("Apellido:");
        apellido= escaner.nextLine();
        System.out.println("Cedula: ");
        cedula= escaner.nextLine();
        System.out.println("Usuario:");
        usuario= escaner.nextLine();
        System.out.println("Contraseña:");
        contraseña= escaner.nextLine();
        System.out.println("Cargo desempeñado:");
        System.out.println("1.Miembro");
        System.out.println("2.Docente Evaluador");
        aux1 = escaner.nextInt();
        
       do{
           if(aux1==1){
               cargo="Comite";
               break;
           }else{
               cargo="Evaluador";
           }
       }while((aux1!=1)||(aux1!=2));
        
        a.setNombre(nombre);
        a.setApellido(apellido);
        a.setCedula(cedula);
        a.setUsuario(usuario);
        a.setContraseña(contraseña);
        a.setCargo(cargo);
        
        getListaMiembrosComite().add(a);
        
        System.out.println("Miembro agregado exitosamente...");
        
    }
    
    public void listaMiembros(){
        
        for(Docente a: getListaMiembrosComite()){
            System.out.println("\n\nNombre: "+a.getNombre());
            System.out.println("Apellido: "+a.getApellido());
            System.out.println("Cedula: "+a.getCedula());
            System.out.println("Usuario: "+a.getUsuario());
            System.out.println("Contraseña: "+a.getContraseña());
            System.out.println("Cargo: "+a.getCargo());
        }
        
    }
    
    public boolean verificarCuenta(String usuario, String contraseña){
        
        for(Docente a: getListaMiembrosComite()){
            if((usuario.equals(a.getUsuario())) && (contraseña.equals(a.getContraseña()))){
                return true;
            }
        }
        return false;
        
    } 
    
    public String verificarCargo(String usuario, String contraseña){
        
        for(Docente a: getListaMiembrosComite()){
            if((usuario.equals(a.getUsuario())) && (contraseña.equals(a.getContraseña()))){
                
                if("Comite".equals(a.getCargo())){
                    return "Comite";
                }
                else{
                    
                    if("Evaluador".equals(a.getCargo())){
                    return "Evaluador";
                }
                
            }
        }
    }
        
    return null;
    }
    
    
    public void registrarLinea(){
        
        System.out.println("\n\n**** REGISTRAR LINEA DE INVESTIGACION *****");
        
        String  codigo,nombre;
        
        System.out.println("Digite el codigo ");
        codigo = escaner.nextLine();
        System.out.println("Digite el nombre ");
        nombre = escaner.nextLine();
        
        
        LineaDeInvestigacion a = new LineaDeInvestigacion(codigo, nombre);
        
        listaLineas.add(a);
        
        System.out.println("Linea de investigacion registrada con exito!!!!!!!!");
    }
    
    public void registrarSubLinea(){
        int aux1, i=1;
        String codigo, nombre;
        LineaDeInvestigacion e = new LineaDeInvestigacion();
        
        
        System.out.println("\n\n**** REGISTRAR SUBLINEA DE INVESTIGACION *****");
        System.out.println("Seleccione la Linea de investigacion a la que pertenece la Sublinea que desea agregar");
        System.out.println("CODIGO"+"\tNOMBRE");
        
        for( LineaDeInvestigacion a: listaLineas){
            System.out.println(i+". "+a.getCodigo()+"\t"+a.getNombre());
            i++;
        }
        
        System.out.print("Selecione: ");
        aux1 = escaner.nextInt();
        
        e = listaLineas.get(aux1-1);
        codigo= e.getCodigo();
        
        System.out.println("Digite el numbre de la Sublinea que desea agregar");
        nombre = escaner.nextLine();
        
        SubLineaInvestigacion o = new SubLineaInvestigacion(codigo, nombre);
         
        listaSubLineas.add(o);
        
        System.out.println("Sublinea de investigacion agregada con exito!!!!!!!!!!");
        
        
    }
    
    public void mostrarLineas(){
        int i=1;
        
        System.out.println("CODIGO"+"\tNOMBRE");
        
        for( LineaDeInvestigacion a: listaLineas){
            System.out.println(i+". "+a.getCodigo()+"\t"+a.getNombre());
            i++;
        }
        
    }
    
    public void mostrarSublineas(){
        
        int i=1;
        
        System.out.println("CODIGO"+"\tNOMBRE");
        
        for( SubLineaInvestigacion a: listaSubLineas){
            System.out.println(i+". "+a.getCodigo()+"\t"+a.getNombre());
            i++;
        }
        
    }
    
    public void menuAdministrador(){
        
         int op=0;
         
        do{
            
             System.out.println("\n****BIENVENIDO ADMINISTRADOR****");
            
            System.out.println("Bienvenido");
            System.out.println("1. Registrar Docente ");
            System.out.println("2. Registrar Linea de Investigacion");
            System.out.println("3. Registrar SubLinea de Investigacion");
            System.out.println("4. Mostrar Lineas de Investigacion");
            System.out.println("5. Mostrar SubLineas de Investigacion");
            
            System.out.println("\n4.Salir");
            System.out.print("Digite opcion: ");
            op = escaner.nextInt();
            System.out.println("Presione  Enter para continuar...");
            
            switch(op){
            
                case 1:
                    
                    crearMiembro();
                    
                 break;  
                    
                case 2: 
                    
                    registrarLinea();
                    
                  break;
                    
                case 3:
                    
                   registrarSubLinea();
                    
                 break;
                case 4:
                    
                   mostrarLineas();
                    
                 break;
                case 5:
                    
                   mostrarSublineas();
                    
                 break;
            } 
            
        }while(op!=4);
    }
    
}
