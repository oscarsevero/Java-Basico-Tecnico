/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylistdois;

import java.util.ArrayList;

/**
 *
 * @author Oscar Ricardo
 */
public class Pessoa {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the telefone
     */
    public ArrayList<Integer> getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(ArrayList<Integer> telefone) {
        this.telefone = telefone;
    }
    String nome;
    private int idade;
    private ArrayList<Integer> telefone = new ArrayList<>();
    
public void dados(){ 
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(telefone);
}

    @Override
    public String toString() {
    return "Nome: " + nome + ", Idade: " + idade + ", Telefones: " + telefone;
}
}