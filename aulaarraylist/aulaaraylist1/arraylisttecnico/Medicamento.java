/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylisttecnico;

/**
 *
 * @author Oscar Ricardo
 */
public class Medicamento {

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Dosagem
     */
    public double getDosagem() {
        return Dosagem;
    }

    /**
     * @param Dosagem the Dosagem to set
     */
    public void setDosagem(double Dosagem) {
        this.Dosagem = Dosagem;
    }

    /**
     * @return the Valor
     */
    public int getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the Efeitos
     */
    public String getEfeitos() {
        return Efeitos;
    }

    /**
     * @param Efeitos the Efeitos to set
     */
    public void setEfeitos(String Efeitos) {
        this.Efeitos = Efeitos;
    }

    /**
     * @return the Indicação
     */
    public String getIndicação() {
        return Indicacao;
    }

    /**
     * @param Indicação the Indicação to set
     */
    public void setIndicação(String Indicação) {
        this.Indicacao = Indicacao;
    }
    
    private String Nome; 
    private double Dosagem; 
    private int Valor; 
    private String Efeitos; 
    private String Indicacao; 
    
    
    public void inf(){ 
    
        System.out.println(Nome);
        System.out.println(Dosagem);
        System.out.println(Valor);
        System.out.println(Efeitos);
        System.out.println(Indicacao);
    
    }
}
