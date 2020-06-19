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
    
    
    private String resumenResultados,conclusiones, trabajosFuturos;
    private String Fk_PropuestaRadicado; 
    

    public SolicitudEvaluacion() {
    }

    public SolicitudEvaluacion(String resumenResultados, String conclusiones, String trabajosFuturos, String lineaInvestigacion) {
        this.resumenResultados = resumenResultados;
        this.conclusiones = conclusiones;
        this.trabajosFuturos = trabajosFuturos;
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
    
    
    public String formaArchivo(){
        return resumenResultados + ";" + conclusiones+";"+trabajosFuturos+";"+Fk_PropuestaRadicado;
    }
    
   
    
    
    
}
