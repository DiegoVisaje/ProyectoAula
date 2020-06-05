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
public class Estudiante extends Persona{
    
    private String celular;
    private PropuestaProyecto propuesta;

    public Estudiante() {
        super();
        
    }

    public Estudiante(String celular, String nombre, String apellido, String cedula,PropuestaProyecto propuesta) {
        super(nombre, apellido, cedula);
        this.celular = celular;
        this.propuesta = propuesta;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the propuesta
     */
    public PropuestaProyecto getPropuesta() {
        return propuesta;
    }

    /**
     * @param propuesta the propuesta to set
     */
    public void setPropuesta(PropuestaProyecto propuesta) {
        this.propuesta = propuesta;
    }
    
    public void calcular(){
         int num;
         String jjj;
    }
    
    
    
}
