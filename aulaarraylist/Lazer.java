/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaarraylist;

import java.util.ArrayList;

public class Lazer extends Pessoa{

    /**
     * @return the esp
     */
    public String getEsp() {
        return esp;
    }

    /**
     * @param esp the esp to set
     */
    public void setEsp(String esp) {
        this.esp = esp;
    }

    /**
     * @return the diaSemana
     */
    public String getDiaSemana() {
        return diaSemana;
    }

    /**
     * @param diaSemana the diaSemana to set
     */
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
   private String esp;
   private String diaSemana;
   private String horario; 
   
   @Override
   public void gerarInf(){ 
      super.gerarInf();
       System.out.println("Esporte Praticado:"+ getEsp());
       System.out.println("Dia Que Pratica:" + getDiaSemana());
       System.out.println("Horario do dia"+getHorario());
   }
    
}
