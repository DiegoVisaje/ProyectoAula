/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class PropuestaProyecto {
    
    private String nombreP,tiempoEjeP,lineaInvesti,subLineaInvesti,descripcion, docenteAux,tipoProyecto,estado, correciones, concepto;
    private int radicado;
    private Tesis tesis;
    private Practicas practicas;

    public PropuestaProyecto() {
        this.estado = "Pendiente";
        this.concepto = "";
        this.correciones = "";
    }

    public PropuestaProyecto(String nombreP, String tiempoEjeP, String lineaInvesti, String subLineaInvesti, String descripcion, String docenteAux, String tipoProyecto, int radicado, Tesis tesis, Practicas practicas) {
        this.nombreP = nombreP;
        this.tiempoEjeP = tiempoEjeP;
        this.lineaInvesti = lineaInvesti;
        this.subLineaInvesti = subLineaInvesti;
        this.descripcion = descripcion;
        this.docenteAux = docenteAux;
        this.tipoProyecto = tipoProyecto;
        this.estado = "pendiente" ;
        this.radicado = radicado;
        this.tesis = tesis;
        this.practicas = practicas;
        this.concepto = "";
        this.correciones = "";
        
    }

  

  

    /**
     * @return the nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * @param nombreP the nombreP to set
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    /**
     * @return the tiempoEjeP
     */
    public String getTiempoEjeP() {
        return tiempoEjeP;
    }

    /**
     * @param tiempoEjeP the tiempoEjeP to set
     */
    public void setTiempoEjeP(String tiempoEjeP) {
        this.tiempoEjeP = tiempoEjeP;
    }

    /**
     * @return the lineaInvesti
     */
    public String getLineaInvesti() {
        return lineaInvesti;
    }

    /**
     * @param lineaInvesti the lineaInvesti to set
     */
    public void setLineaInvesti(String lineaInvesti) {
        this.lineaInvesti = lineaInvesti;
    }

    /**
     * @return the subLineaInvesti
     */
    public String getSubLineaInvesti() {
        return subLineaInvesti;
    }

    /**
     * @param subLineaInvesti the subLineaInvesti to set
     */
    public void setSubLineaInvesti(String subLineaInvesti) {
        this.subLineaInvesti = subLineaInvesti;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the radi
     */
    public int getRadicado() {
        return radicado;
    }

    /**
     * @param radi the radi to set
     */
    public void setRadicado() {
        
        this.radicado = (int) (Math.random()*100000+1);
        
    }

    /**
     * @return the docAux
     */
    public String getDocenteAux() {
        return docenteAux;
    }

    /**
     * @param docenteAux the docAux to set
     */
    public void setDocenteAux(String docenteAux) {
        this.docenteAux = docenteAux;
    }

    /**
     * @return the tipoProyecto
     */
    public String getTipoProyecto() {
        return tipoProyecto;
    }

    
    /**
     * @param tipoProyecto the tipoProyecto to set
     */
    public void setTipoProyecto() {
       
        int a;
        
        Scanner escaner = new Scanner(System.in);
        System.out.println("Tipo de proyecto: ");
        System.out.println("1. Tesis");
        System.out.println("2. Practicas");
        System.out.print("Seleccione: ");
        a = escaner.nextInt();
        
        if (a==1){
            tesis = new Tesis();
            tesis.registrarTesis();
            this.tipoProyecto = "tesis";
            
        }
        else{
            practicas = new Practicas();
            practicas.registrarPracticas();
            this.tipoProyecto= "practicas";
        }
    }

    /**
     * @return the tesis
     */
    public Tesis getTesis() {
        return tesis;
    }

    /**
     * @param tesis the tesis to set
     */
    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

    /**
     * @return the practicas
     */
    public Practicas getPracticas() {
        return practicas;
    }

    /**
     * @param practicas the practicas to set
     */
    public void setPracticas(Practicas practicas) {
        this.practicas = practicas;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the correciones
     */
    public String getCorreciones() {
        return correciones;
    }

    /**
     * @param correciones the correciones to set
     */
    public void setCorreciones( String correcciones) {
        this.correciones = correcciones;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    
    
    
    
}
