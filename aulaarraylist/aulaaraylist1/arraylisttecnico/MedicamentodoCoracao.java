/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylisttecnico;

import java.util.ArrayList;

/**
 *
 * @author Oscar Ricardo
 */
public class MedicamentodoCoracao extends Medicamento{

    /**
     * @return the ListaREMEDIOS
     */
    public ArrayList<Medicamento> getListaREMEDIOS() {
        return ListaREMEDIOS;
    }

    /**
     * @param ListaREMEDIOS the ListaREMEDIOS to set
     */
    public void setListaREMEDIOS(ArrayList<Medicamento> ListaREMEDIOS) {
        this.ListaREMEDIOS = ListaREMEDIOS;
    }

    /**
     * @return the Tecnico
     */
    public String getTecnico() {
        return Tecnico;
    }

    /**
     * @param Tecnico the Tecnico to set
     */
    public void setTecnico(String Tecnico) {
        this.Tecnico = Tecnico;
    }

    /**
     * @return the Prescricao
     */
    public String getPrescricao() {
        return Prescricao;
    }

    /**
     * @param Prescricao the Prescricao to set
     */
    public void setPrescricao(String Prescricao) {
        this.Prescricao = Prescricao;
    }

    /**
     * @return the Lote
     */
    public int getLote() {
        return Lote;
    }

    /**
     * @param Lote the Lote to set
     */
    public void setLote(int Lote) {
        this.Lote = Lote;
    }

    /**
     * @return the DataValidade
     */
    public String getDataValidade() {
        return DataValidade;
    }

    /**
     * @param DataValidade the DataValidade to set
     */
    public void setDataValidade(String DataValidade) {
        this.DataValidade = DataValidade;
    }
    
    private String Tecnico;
    private String Prescricao;
    private int Lote; 
    private String DataValidade; 
    private ArrayList<Medicamento> ListaREMEDIOS = new ArrayList<Medicamento>();
    
    
    @Override
     public void inf(){
     
         super.inf();
         System.out.println(Tecnico);
         System.out.println(Prescricao);
         System.out.println(Lote);
         System.out.println(DataValidade);
         System.out.println(ListaREMEDIOS);
     }
    
    
    
}
