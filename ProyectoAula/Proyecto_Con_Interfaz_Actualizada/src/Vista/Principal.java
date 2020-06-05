/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Principal {
    
    
    public static void main(String[] args) {
        
        
        Administrador administrador = new Administrador();                                                           
        administrador.setUsuario("Diego");  //ADMINISTRADOR POR DEFECTO
        administrador.setContraseña("123");
        
        
        
        Scanner escaner = new Scanner(System.in);  
        Propuestas propuesta = new Propuestas();
     
        int op; 
        String usuario, contraseña;
        
        
     do{
         System.out.println("\n\n****Bienvenido****");
            System.out.println("1.Estudiante ");
            System.out.println("2.Docente / Administrador");
            
            System.out.println("\n3.Salir");
            System.out.print("Digite opcion: ");
            op = escaner.nextInt();
            System.out.println("Presione  Enter para continuar...");
            switch(op){
            
                case 1:
                    
                    // PARA QUE EL ESTUDIANTE ENVIE SU PROYECTO DE GRADO
                    
                    propuesta.enviarProyecto();
                    
                    break;
                case 2:
                    
                    //LOGIN PARA VERIFICAR SI ES ADMINISTRADOR O DOCENTE
                    escaner.nextLine();
                    System.out.println("\n**** LOGIN ADMI / DOCENTE ****");
                    System.out.println("Digite usuario: ");
                    usuario = escaner.nextLine();
                    System.out.println("Digite contraseña: ");
                    contraseña = escaner.nextLine();
                    
                    if((administrador.getUsuario().equals(usuario)) && (administrador.getContraseña().equals(contraseña))){
                        System.out.println("****BIENVENIDO ADMINISTRADOR****");
                    administrador.crearMiembro();
                    
                    } 
                    
                    else{
                        
                        boolean Aux;
                        String cargo;
                     
                        
                        
                        Aux = administrador.verificarCuenta(usuario, contraseña);
                        cargo = administrador.verificarCargo(usuario,contraseña);
                      
                        if(!Aux){
                            
                            System.out.println("Contraseña Incorrecta");
                            
                        }else{
                            
                          if ("Evaludor".equals(cargo)){
                              
                              // MENU PARA DOCENTE EVALUADOR
                              
                              
                          }  
                          
                          if ("Comite".equals(cargo)){
                              
                             propuesta.menuDocente();
                             
                          }  
                        } 
                    }
                 break;
            }   
            
     }while(op!=3);
      
    }  
    
}