/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola;

import java.util.ArrayList;

/**
 *
 * @author Oscar Ricardo
 */
public class Alun {

    /**
     * @return the nomeAlun
     */
    public String getNomeAlun() {
        return nomeAlun;
    }

    /**
     * @param nomeAlun the nomeAlun to set
     */
    public void setNomeAlun(String nomeAlun) {
        this.nomeAlun = nomeAlun;
    }

    /**
     * @return the idadeALun
     */
    public int getIdadeALun() {
        return idadeALun;
    }

    /**
     * @param idadeALun the idadeALun to set
     */
    public void setIdadeALun(int idadeALun) {
        this.idadeALun = idadeALun;
    }

    /**
     * @return the cpfalun
     */
    public String getCpfalun() {
        return cpfalun;
    }

    /**
     * @param cpfalun the cpfalun to set
     */
    public void setCpfalun(String cpfalun) {
        this.cpfalun = cpfalun;
    }

    /**
     * @return the alunoarray
     */
    public ArrayList <Alun> getAlunoarray() {
        return alunoarray;
    }

    /**
     * @param alunoarray the alunoarray to set
     */
    public void setAlunoarray(ArrayList <Alun> alunoarray) {
        this.alunoarray = alunoarray;
    }
    
    private String nomeAlun;
    private int idadeALun; 
    private String cpfalun;   
    private ArrayList <Alun> alunoarray = new ArrayList <Alun>();
    
}
