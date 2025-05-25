/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validadordesenha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.regex.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Ricardo
 */
public class ValidadorDesenha {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Validador e Gerador de Senha");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Digite a senha:");
        JTextField senhaField = new JTextField(20);
        JButton validarBtn = new JButton("Validar Senha");
        JButton gerarBtn = new JButton("Gerar Senha Válida");
        JLabel resultado = new JLabel("");

        validarBtn.addActionListener(e -> {
            String texto = senhaField.getText();
            Pattern senhaPattern = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!]).{8,}");
            Matcher matcherSenha = senhaPattern.matcher(texto);
            if (matcherSenha.find()) {
                resultado.setText("✅ Senha válida!");
            } else {
                resultado.setText("❌ Senha inválida!");
            }
        });

        gerarBtn.addActionListener(e -> {
            String senhaGerada = gerarSenhaValida();
            senhaField.setText(senhaGerada);
            resultado.setText("🔐 Senha gerada!");
        });

        frame.add(label);
        frame.add(senhaField);
        frame.add(validarBtn);
        frame.add(gerarBtn);
        frame.add(resultado);
        frame.setVisible(true);
    }

    // Gera uma senha com ao menos 8 caracteres, incluindo maiúsculas, minúsculas, número e caractere especial
    private static String gerarSenhaValida() {
        String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiais = "@#$%!";
        String todos = letrasMaiusculas + letrasMinusculas + numeros + especiais;

        Random rand = new Random();
        StringBuilder senha = new StringBuilder();

        // Garante pelo menos um de cada tipo
        senha.append(letrasMaiusculas.charAt(rand.nextInt(letrasMaiusculas.length())));
        senha.append(letrasMinusculas.charAt(rand.nextInt(letrasMinusculas.length())));
        senha.append(numeros.charAt(rand.nextInt(numeros.length())));
        senha.append(especiais.charAt(rand.nextInt(especiais.length())));

        // Preenche o restante até 8+ caracteres
        while (senha.length() < 8) {
            senha.append(todos.charAt(rand.nextInt(todos.length())));
        }

        return senha.toString();
    }
}

/*Carla está desenvolvendo um sistema de cadastro de usuários e precisa validar as senhas. A senha deve ter pelo menos:

8 caracteres
Uma letra maiúscula
Uma letra minúscula
Um número
Um caractere especial
Crie um programa que receba uma senha e exiba uma mensagem indicando se a senha é válida ou não.
*/