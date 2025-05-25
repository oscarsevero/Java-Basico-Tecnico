/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;
import javax.swing.JOptionPane;


public class Login {
    public static void main(String[] args) {
        int senhaCorreta = 1234, tentativas = 3;
        while (tentativas > 0) {
            String entrada = JOptionPane.showInputDialog(
                "Digite a senha (" + tentativas + " tentativa(s)):"
            );
            int valor = Integer.parseInt(entrada);  
            if (valor == senhaCorreta) {
                JOptionPane.showMessageDialog(null, "Acesso liberado!");
                break;  // sai do while sem usar return
            }
            tentativas--;
        }
        if (tentativas == 0) {
            JOptionPane.showMessageDialog(null, "Acesso bloqueado!");
        }
    }
}
