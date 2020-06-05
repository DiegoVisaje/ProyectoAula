/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Propuestas {
    
    private static  ArrayList<Estudiante> ListaPendientes = new ArrayList<Estudiante>();
    private static  ArrayList<Estudiante> ListaAceptadas = new ArrayList<Estudiante>();
    private static  ArrayList<Estudiante> ListaRechazadas = new ArrayList<Estudiante>();
    private static  ArrayList<Estudiante> ListaEvaluadas = new ArrayList<Estudiante>();

 
    public Propuestas() {
    }
    
    /**
     * @return the Lista
     */
    public static ArrayList<Estudiante> getListaPendientes() {
        return ListaPendientes;
    }

    /**
     * @param aLista the Lista to set
     */
    public static void setListaPendientes(ArrayList<Estudiante> aLista) {
        ListaPendientes = aLista;
    }

    /**
     * @return the ListaAceptadas
     */
    public static ArrayList<Estudiante> getListaAceptadas() {
        return ListaAceptadas;
    }

    /**
     * @param aListaAceptadas the ListaAceptadas to set
     */
    public static void setListaAceptadas(ArrayList<Estudiante> aListaAceptadas) {
        ListaAceptadas = aListaAceptadas;
    }

    /**
     * @return the ListaRechazadas
     */
    public static ArrayList<Estudiante> getListaRechazadas() {
        return ListaRechazadas;
    }

    /**
     * @param aListaRechazadas the ListaRechazadas to set
     */
    public static void setListaRechazadas(ArrayList<Estudiante> aListaRechazadas) {
        ListaRechazadas = aListaRechazadas;
    }

    

    
    public void enviarProyecto(){
        
       Estudiante estudiante = new Estudiante();
       PropuestaProyecto propuesta = new PropuestaProyecto();
       Scanner escaner = new Scanner(System.in);
      
        String celular, nombre, apellido,  cedula,nombreP, tiempoEjeP, lineaInvesti, subLineaInvesti, descripcion, docenteAux;
        System.out.println("\n\n****BIENVENIDO ESTUDIANTE***");
        System.out.println("**Digite sus datos para el envio del proyecto**");
         
        System.out.print("\nNombre estudiante: ");
        nombre = escaner.nextLine();
        System.out.print("\nApellido estudiante: ");
        apellido = escaner.nextLine();
        System.out.print("\nCelular estudiante: ");
        celular = escaner.nextLine();
        System.out.print("\nNumero de identificacion: ");
        cedula = escaner.nextLine();
        System.out.print("\nNombre del proyecto: ");
        nombreP = escaner.nextLine();
        System.out.print("\nTiempo de ejecucion del proyecto: ");
        tiempoEjeP = escaner.nextLine();
        System.out.print("\nLinea de investigacion del proyecto: ");
        lineaInvesti = escaner.nextLine();
        System.out.print("\nSublinea de investigacion: ");
        subLineaInvesti = escaner.nextLine();
        System.out.print("\nDescripcion del proyecto: ");
        descripcion = escaner.nextLine();
        System.out.print("\nDocente Asesor: ");
        docenteAux = escaner.nextLine();
        
        
       
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setCedula(cedula);
        estudiante.setCelular(celular);
        
        propuesta.setDescripcion(descripcion);
        propuesta.setDocenteAux(docenteAux);
        propuesta.setLineaInvesti(lineaInvesti);
        propuesta.setNombreP(nombreP);
        propuesta.setSubLineaInvesti(subLineaInvesti);
        propuesta.setTiempoEjeP(tiempoEjeP);
        propuesta.setTipoProyecto();
        propuesta.setRadicado();
       estudiante.setPropuesta(propuesta);
        
        
        
        System.out.println("RADICADO PARA CONSULTAS: "+propuesta.getRadicado());
        
        getListaPendientes().add(estudiante);
      
        int i = 1;
        System.out.println("************Lista de proyectos hasta el momento***********");
        
        for( Estudiante a: getListaPendientes()){
            System.out.println(i+"\t"+a.getNombre()+"\t"+a.getApellido()+"\t"+a.getCedula()+"\t"+a.getCelular());
            System.out.println( "\n\t "+a.getPropuesta().getNombreP()+"\n\t "+a.getPropuesta().getTiempoEjeP()+"\n\t "+a.getPropuesta().getLineaInvesti());
            System.out.print("\t "+a.getPropuesta().getSubLineaInvesti()+"\n\t "+a.getPropuesta().getEstado());
            System.out.print("\n\t "+a.getPropuesta().getDocenteAux()+"\n\t "+a.getPropuesta().getDescripcion()+"\n\t "+a.getPropuesta().getTipoProyecto());
            if("tesis".equals(a.getPropuesta().getTipoProyecto())){
                System.out.println("\n\t"+a.getPropuesta().getTesis().getPlanteamientoproblema()+"\n\t"+a.getPropuesta().getTesis().getObjGeneral());
                System.out.println("\n\t"+a.getPropuesta().getTesis().getObjEspecifico()+"\n\t"+a.getPropuesta().getTesis().getJustificacion());
                 System.out.println("\n------------------------------");
                 
            }else{
                
                System.out.println("\n\t"+a.getPropuesta().getPracticas().getNombreEmp()+"\n\t"+a.getPropuesta().getPracticas().getDireccionEmp());
                System.out.println("\n\t"+a.getPropuesta().getPracticas().getTelefonoEmp()+"\n\t"+a.getPropuesta().getPracticas().getRepreLegal());
                System.out.println("\n\t"+a.getPropuesta().getPracticas().getAreaTrbajo()+"\n\t"+a.getPropuesta().getPracticas().getFunciones());
                System.out.println("\n------------------------------");
            }
            i++;
        }
        
        
    }
    
    public void menuDocente(){
        Scanner escaner = new Scanner(System.in);
        int op=0;
         
        do{
            
             System.out.println("\n****BIENVENIDO DOCENTE****");
            
            System.out.println("Bienvenido");
            System.out.println("1.Lista Proyectos enviados ");
            System.out.println("2.Lista Proyectos  Aceptados");
            System.out.println("3.Lista Proyectos evaluados");
            System.out.println("\n4.Salir");
            System.out.print("Digite opcion: ");
            op = escaner.nextInt();
            System.out.println("Presione  Enter para continuar...");
            
            switch(op){
            
                case 1:
                    
                    int i = 1;
                    
                    if(ListaPendientes.get(0)==null){
                        
                        System.out.println("LISTA VACIA"); 
                        
                    }else{
                        
                        System.out.println("\n\nNombre Estudiante"+"\t\tNombre Propuesta"+"\t\tLinea de Investigacion"+"\t\tTipo de proyecto");
                        
                       for( Estudiante a: ListaPendientes){
                       
                         System.out.println(i+". "+a.getNombre()+" "+a.getApellido()+"\t "+a.getPropuesta().getNombreP());
                         System.out.print( "\t "+a.getPropuesta().getLineaInvesti()+"\t "+a.getPropuesta().getTipoProyecto());
                       
                            i++;
                        }
                    }
                    break;  
                    
                case 2: 
                    
                    
                    
                    break;
                    
                case 3:
                   
                    
                    break;
             } 
            
        }while(op!=4); 
        
        
    }

    
     
    
}
