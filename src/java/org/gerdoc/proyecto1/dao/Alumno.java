/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gerdoc.proyecto1.dao;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Alumno implements Serializable
{
    private String nombre;
    private String calif;
        private String colorCH;
    private String saborAF;




    public Alumno() 
    {
    }

    	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.calif = calif;
                this.colorCH = colorCH;
                this.saborAF = saborAF;
	}
    
    public String getColorCH() {
    return colorCH;
    }

    public void setColorCH(String colorCH) {
        this.colorCH = colorCH;
    }

    public String getSaborAF() {
        return saborAF;
    }

    public void setSaborAF(String saborAF) {
        this.saborAF = saborAF;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalif() {
        return calif;
    }

    public void setCalif(String calif) {
        this.calif = calif;
    }
    
}
