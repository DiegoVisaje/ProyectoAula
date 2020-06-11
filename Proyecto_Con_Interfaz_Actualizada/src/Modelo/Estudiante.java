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
    
    
    public String formaArchivo(){
        String mensaje =   propuesta.getRadicado()+";"+super.getNombre()+";"+super.getApellido()+";"+super.getCedula()+";"+celular+";"+propuesta.getNombreP()+";"+
               propuesta.getTiempoEjeP()+";"+propuesta.getLineaInvesti()+";"+propuesta.getSubLineaInvesti()+";"+
               propuesta.getDescripcion()+";"+propuesta.getDocenteAux()+";"+propuesta.getTipoProyecto()+";"+propuesta.getEstado()+";"+
               propuesta.getCorreciones()+";"+propuesta.getConcepto()+";"+propuesta.getEvaluador1()+";"+propuesta.getEvaluador2();
        
        if(propuesta.getTipoProyecto().equals("Tesis")){
           return mensaje + ";"+ propuesta.getTesis().getPlanteamientoproblema()+";"+
               propuesta.getTesis().getObjGeneral()+";"+propuesta.getTesis().getObjEspecifico()+";"+propuesta.getTesis().getJustificacion(); 
        }else{
           return mensaje +";"+propuesta.getPracticas().getNombreEmp()+";"+
               propuesta.getPracticas().getDireccionEmp()+";"+propuesta.getPracticas().getTelefonoEmp()+";"+propuesta.getPracticas().getRepreLegal()+";"+
               propuesta.getPracticas().getAreaTrbajo()+";"+propuesta.getPracticas().getFunciones(); 
        }
        
        
    }
    
    
}
