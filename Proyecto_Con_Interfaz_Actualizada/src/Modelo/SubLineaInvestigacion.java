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
public class SubLineaInvestigacion{
    
    private String codigo, nombre, lCodigo;
    
    public SubLineaInvestigacion() {
    }

    
    public SubLineaInvestigacion(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      public String formaArchivo(){
        return lCodigo+ ";" + codigo + ";" + nombre ;
    }

    /**
     * @return the lCodigo
     */
    public String getlCodigo() {
        return lCodigo;
    }

    /**
     * @param lCodigo the lCodigo to set
     */
    public void setlCodigo(String lCodigo) {
        this.lCodigo = lCodigo;
    }
    
      
}
