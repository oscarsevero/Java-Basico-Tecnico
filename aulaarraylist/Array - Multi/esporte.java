/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylistdois;

/**
 *
 * @author Oscar Ricardo
 */
public class esporte extends Pessoa {

    /**
     * @return the esporte
     */
    public String getEsporte() {
        return esporte;
    }

    /**
     * @param esporte the esporte to set
     */
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }
    
    private String esporte; 
    
    @Override
    public void dados(){ 
    super.dados();
    System.out.println(esporte);
}
    @Override
public String toString() {
    return super.toString() + ", Esporte: " + esporte;
}

}
