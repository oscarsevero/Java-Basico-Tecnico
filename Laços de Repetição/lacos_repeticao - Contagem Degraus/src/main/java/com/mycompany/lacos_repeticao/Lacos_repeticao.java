/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacos_repeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Ricardo
 */
public class Lacos_repeticao {

    public static void main(String[] args) {
       
        int entrada;
        entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de degraus: "));  
        
        for(int x=0; x<=entrada; x++) { 
            JOptionPane.showMessageDialog(null, "Subindo o degrau:" + x);
        }
        
        
        //JOptionPane.showMessageDialog(null, "Numero |digitado para entrada" + entrada);
        
    }
}
