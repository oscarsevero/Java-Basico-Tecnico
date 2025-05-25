/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somadevalores;

/**
 *
 * @author Oscar Ricardo
 */
public class SomaDeValores {

   public static void main(String[] args) {
    int[] valores = {10, 20, 30, 40, 50};

    int resultado = 0; // move para fora do for
    for (int x = 0; x < valores.length; x++) { 
        resultado += valores[x];     
    }

    System.out.println("Soma de Valores Total: " + resultado);
}
}

