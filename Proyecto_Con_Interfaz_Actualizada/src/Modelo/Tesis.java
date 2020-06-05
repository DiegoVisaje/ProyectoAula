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
public class Tesis {
    
    private String planteamientoproblema,objGeneral,objEspecifico,justificacion;

    public Tesis() {
    }

    public Tesis(String planteamientoproblema, String objGeneral, String objEspecifico, String justificacion) {
        this.planteamientoproblema = planteamientoproblema;
        this.objGeneral = objGeneral;
        this.objEspecifico = objEspecifico;
        this.justificacion = justificacion;
    }

    /**
     * @return the planteamientoproblema
     */
    public String getPlanteamientoproblema() {
        return planteamientoproblema;
    }

    /**
     * @param planteamientoproblema the planteamientoproblema to set
     */
    public void setPlanteamientoproblema(String planteamientoproblema) {
        this.planteamientoproblema = planteamientoproblema;
    }

    /**
     * @return the objGeneral
     */
    public String getObjGeneral() {
        return objGeneral;
    }

    /**
     * @param objGeneral the objGeneral to set
     */
    public void setObjGeneral(String objGeneral) {
        this.objGeneral = objGeneral;
    }

    /**
     * @return the objEspecifico
     */
    public String getObjEspecifico() {
        return objEspecifico;
    }

    /**
     * @param objEspecifico the objEspecifico to set
     */
    public void setObjEspecifico(String objEspecifico) {
        this.objEspecifico = objEspecifico;
    }

    /**
     * @return the justificacion
     */
    public String getJustificacion() {
        return justificacion;
    }

    /**
     * @param justificacion the justificacion to set
     */
    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
    
    
    public void registrarTesis(){
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Planteamiento del problema: ");
        this.planteamientoproblema = escaner.nextLine();
        System.out.println("\nObjetivo General: ");
        this.objGeneral = escaner.nextLine();
        System.out.println("\nObjetivos especificos: ");
        this.objEspecifico = escaner.nextLine();
        System.out.println("\nJustificacion: ");
        this.justificacion = escaner.nextLine();
        
        
    }
    
    
    
    
}
