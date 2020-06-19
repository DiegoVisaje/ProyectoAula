/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ADMIN
 */
public class Docente extends Persona{
    
    //hola esta es mi rama 
    
    
    private String cargo,usuario,contraseña, linea;

    public Docente() {
        super();
    }

    public Docente(String cargo,String usuario, String contraseña, String linea) {
        this.cargo = cargo;
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.linea = null;
    }

    public Docente(String cargo, String nombre, String apellido, String cedula,String usuario, String contraseña, String linea) {
        super(nombre, apellido, cedula);
        this.cargo = cargo;
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.linea = null;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
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
     * @return the linea
     */
    public String getLinea() {
        return linea;
    }

    
    
    /**
     * @param linea the linea to set
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }
    
    public String formaArchivo(){
        return  cargo+";"+super.getNombre()+";"+super.getApellido()+";"+super.getCedula()+";"+usuario+ ";"+contraseña +";"+linea ;
    }

   
    
       
       
    
}
