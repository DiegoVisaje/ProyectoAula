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
public class SolicitudEvaluacion {
    
    
    private String resumenResultados,conclusiones, trabajosFuturos,estado1, estado2;
    private String Fk_PropuestaRadicado; 
    

    public SolicitudEvaluacion() {
    }

    public SolicitudEvaluacion(String resumenResultados, String conclusiones, String trabajosFuturos, String lineaInvestigacion, String estado1, String estado2) {
        this.resumenResultados = resumenResultados;
        this.conclusiones = conclusiones;
        this.trabajosFuturos = trabajosFuturos;
        this.estado1 = "PENDIENTE";
        this.estado2 = "PENDIENTE";
     
    }

    public String getResumenResultados() {
        return resumenResultados;
    }

    public void setResumenResultados(String resumenResultados) {
        this.resumenResultados = resumenResultados;
    }

    public String getConclusiones() {
        return conclusiones;
    }


    public void setConclusiones(String conclusiones) {
        this.conclusiones = conclusiones;
    }

    
    public String getTrabajosFuturos() {
        return trabajosFuturos;
    }

    
    public void setTrabajosFuturos(String trabajosFuturos) {
        this.trabajosFuturos = trabajosFuturos;
    }


    
    public String getFk_PropuestaRadicado() {
        return Fk_PropuestaRadicado;
    }

    public void setFk_PropuestaRadicado(String Fk_PropuestaRadicado) {
        this.Fk_PropuestaRadicado = Fk_PropuestaRadicado;
    }
    
    
    
    /**
     * @return the estado1
     */
    public String getEstado1() {
        return estado1;
    }

    /**
     * @param estado1 the estado1 to set
     */
    public void setEstado1(String estado1) {
        this.estado1 = estado1;
    }

    /**
     * @return the estado2
     */
    public String getEstado2() {
        return estado2;
    }

    /**
     * @param estado2 the estado2 to set
     */
    public void setEstado2(String estado2) {
        this.estado2 = estado2;
    }

    public String formaArchivo(){
        return getResumenResultados() + ";" + getConclusiones()+";"+getTrabajosFuturos()+";"+getFk_PropuestaRadicado() + ";" + getEstado1() + ";" + getEstado2();
    }

    
    
}
