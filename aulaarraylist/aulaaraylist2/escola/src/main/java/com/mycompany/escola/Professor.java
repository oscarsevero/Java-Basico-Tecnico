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
public class Professor {

    /**
     * @return the nomeProfessor
     */
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    /**
     * @param nomeProfessor the nomeProfessor to set
     */
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    /**
     * @return the idadeProfessor
     */
    public int getIdadeProfessor() {
        return idadeProfessor;
    }

    /**
     * @param idadeProfessor the idadeProfessor to set
     */
    public void setIdadeProfessor(int idadeProfessor) {
        this.idadeProfessor = idadeProfessor;
    }

    /**
     * @return the disciplana
     */
    public String getDisciplana() {
        return disciplana;
    }

    /**
     * @param disciplana the disciplana to set
     */
    public void setDisciplana(String disciplana) {
        this.disciplana = disciplana;
    }

    /**
     * @return the arraylistaprofessores
     */
    public ArrayList <Professor> getArraylistaprofessores() {
        return arraylistaprofessores;
    }

    /**
     * @param arraylistaprofessores the arraylistaprofessores to set
     */
    public void setArraylistaprofessores(ArrayList <Professor> arraylistaprofessores) {
        this.arraylistaprofessores = arraylistaprofessores;
    }
    
    private String nomeProfessor; 
    private int idadeProfessor; 
    private String disciplana; 
    private ArrayList <Professor> arraylistaprofessores = new ArrayList<Professor>();
    
    public void infoProfessor() { 
        
        System.out.println("Nome Professor: " + nomeProfessor);
        System.out.println("Idade Professor: " + idadeProfessor);
        System.out.println("Aula de Disciplina: " +  disciplana);
       
    }
}
