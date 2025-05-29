/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola;

/**
 *
 * @author Oscar Ricardo
 */
public class Turma {

    /**
     * @return the nameTurma
     */
    public String getNameTurma() {
        return nameTurma;
    }

    /**
     * @param nameTurma the nameTurma to set
     */
    public void setNameTurma(String nameTurma) {
        this.nameTurma = nameTurma;
    }

    /**
     * @return the dateInicioTurma
     */
    public String getDateInicioTurma() {
        return dateInicioTurma;
    }

    /**
     * @param dateInicioTurma the dateInicioTurma to set
     */
    public void setDateInicioTurma(String dateInicioTurma) {
        this.dateInicioTurma = dateInicioTurma;
    }

    /**
     * @return the anoTurma
     */
    public int getAnoTurma() {
        return anoTurma;
    }

    /**
     * @param anoTurma the anoTurma to set
     */
    public void setAnoTurma(int anoTurma) {
        this.anoTurma = anoTurma;
    }
    private String nameTurma; 
    private String dateInicioTurma; 
    private int anoTurma; 
    
    public void infoTurma(){ 
        System.out.println("Nome da turma: " + nameTurma);
        System.out.println("Data de Inicio: " + dateInicioTurma);
        System.out.println("Ano da Turma " + anoTurma);     
        System.out.println("");
        
    }
}
