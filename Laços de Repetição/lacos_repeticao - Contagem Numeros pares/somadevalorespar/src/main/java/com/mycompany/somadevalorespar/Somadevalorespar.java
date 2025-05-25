/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somadevalorespar;

/**
 *
 * @author Oscar Ricardo
 */
public class Somadevalorespar {

    public static void main(String[] args) {        
        //Dividido por 2 Igual  a 0 , se tiver resto é impar
     int control = 0;  
     for(int x =0; x<=100; x++){    
         
            if (x % 2 == 0){ 
                control +=x;              
            }            
     }  System.out.println("Soma dos Valores de Todos Numeros Pares de 0 ate 100:  " + control);
        
    }
}
