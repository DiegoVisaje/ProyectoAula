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
    
    private String resumenResultados,conclusiones, trabajosFuturos, lineaInvestigacion;

    public SolicitudEvaluacion() {
    }

    public SolicitudEvaluacion(String resumenResultados, String conclusiones, String trabajosFuturos, String lineaInvestigacion) {
        this.resumenResultados = resumenResultados;
        this.conclusiones = conclusiones;
        this.trabajosFuturos = trabajosFuturos;
        this.lineaInvestigacion = lineaInvestigacion;
    }

    /**
     * @return the resumenResultados
     */
    public String getResumenResultados() {
        return resumenResultados;
    }

    /**
     * @param resumenResultados the resumenResultados to set
     */
    public void setResumenResultados(String resumenResultados) {
        this.resumenResultados = resumenResultados;
    }

    /**
     * @return the conclusiones
     */
    public String getConclusiones() {
        return conclusiones;
    }

    /**
     * @param conclusiones the conclusiones to set
     */
    public void setConclusiones(String conclusiones) {
        this.conclusiones = conclusiones;
    }

    /**
     * @return the trabajosFuturos
     */
    public String getTrabajosFuturos() {
        return trabajosFuturos;
    }

    /**
     * @param trabajosFuturos the trabajosFuturos to set
     */
    public void setTrabajosFuturos(String trabajosFuturos) {
        this.trabajosFuturos = trabajosFuturos;
    }

    /**
     * @return the lineaInvestigacion
     */
    public String getLineaInvestigacion() {
        return lineaInvestigacion;
    }

    /**
     * @param lineaInvestigacion the lineaInvestigacion to set
     */
    public void setLineaInvestigacion(String lineaInvestigacion) {
        this.lineaInvestigacion = lineaInvestigacion;
    }

   
    
    
    
}
