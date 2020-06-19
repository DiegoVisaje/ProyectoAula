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
public class Practicas {
    
    private String nombreEmp, direccionEmp, telefonoEmp,repreLegal,areaTrbajo,funciones;

    public Practicas() {
    }

    public Practicas(String nombreP, String direccionP, String telefonoP, String repreLegal, String areaTrbajo, String funciones) {
        this.nombreEmp = nombreP;
        this.direccionEmp = direccionP;
        this.telefonoEmp = telefonoP;
        this.repreLegal = repreLegal;
        this.areaTrbajo = areaTrbajo;
        this.funciones = funciones;
    }

    /**
     * @return the nombreP
     */
    public String getNombreEmp() {
        return nombreEmp;
    }

    /**
     * @param nombreEmp the nombreP to set
     */
    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    /**
     * @return the direccionP
     */
    public String getDireccionEmp() {
        return direccionEmp;
    }

    /**
     * @param direccionEmp the direccionP to set
     */
    public void setDireccionEmp(String direccionEmp) {
        this.direccionEmp = direccionEmp;
    }

    /**
     * @return the telefonoP
     */
    public String getTelefonoEmp() {
        return telefonoEmp;
    }

    /**
     * @param telefonoEmp the telefonoP to set
     */
    public void setTelefonoEmp(String telefonoEmp) {
        this.telefonoEmp = telefonoEmp;
    }

    /**
     * @return the repreLegal
     */
    public String getRepreLegal() {
        return repreLegal;
    }

    /**
     * @param repreLegal the repreLegal to set
     */
    public void setRepreLegal(String repreLegal) {
        this.repreLegal = repreLegal;
    }

    /**
     * @return the areaTrbajo
     */
    public String getAreaTrbajo() {
        return areaTrbajo;
    }

    /**
     * @param areaTrbajo the areaTrbajo to set
     */
    public void setAreaTrbajo(String areaTrbajo) {
        this.areaTrbajo = areaTrbajo;
    }

    /**
     * @return the funciones
     */
    public String getFunciones() {
        return funciones;
    }

    /**
     * @param funciones the funciones to set
     */
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }
    
    public void registrarPracticas(){
        
      Scanner escaner = new Scanner(System.in);   
      
        System.out.println("Nombre de la empresa: ");
        this.nombreEmp =  escaner.nextLine();
        System.out.println("\nDireccion de la empresa: ");
        this.direccionEmp =  escaner.nextLine();
        System.out.println("\nTelefono de la empresa: ");
        this.telefonoEmp =  escaner.nextLine();
        System.out.println("\nRepresentante legal: ");
        this.repreLegal =  escaner.nextLine();
        System.out.println("\nArea de trabajo ");
        this.areaTrbajo =  escaner.nextLine();
        System.out.println("\nFunciones a realizar: ");
        this.funciones =  escaner.nextLine();
        
        
        
    }
    
    
}
