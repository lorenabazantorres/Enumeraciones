/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.enumeraciones;

/**
 *
 * @author LORENA
 */
public enum Continentes {
    Asia(46, "1.2 billones"),
    America(44, ""),
    Africa(53, ""),
    Europa(46, ""),
    Oceania(14, "");
    //Ultimo elemento con punto y coma

    private final int numpaises;
    private final String numhabitantes;

    //constructor
    Continentes(int numpaises, String numhabitantes) {
        this.numpaises = numpaises;
        this.numhabitantes = numhabitantes;
    }

    //get 
    public int getNumpaises() {
        return numpaises;
    }

    public String getNumhabitantes() {
        return numhabitantes;
    }

}
