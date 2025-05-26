package com.mycompany.arraylistdois;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Arraylistdois {

    public static void main(String[] args) {
        ArrayList<esporte> informacoes = new ArrayList<>();
        String continuar;

        do {
            esporte esp = new esporte(); // CRIA UM NOVO OBJETO A CADA LOOP

            esp.setNome(JOptionPane.showInputDialog("Digite Seu Nome"));
            esp.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite Sua Idade")));
            esp.setEsporte(JOptionPane.showInputDialog("Digite Seu Esporte"));

            // Telefones
            String maisTel;
            do {
                int tel = Integer.parseInt(JOptionPane.showInputDialog("Digite Seu Telefone"));
                esp.getTelefone().add(tel);
                maisTel = JOptionPane.showInputDialog("Adicionar outro telefone? (S/N)");
            } while (maisTel.equalsIgnoreCase("s"));

            esp.dados(); // Exibe os dados
            informacoes.add(esp); // Adiciona o objeto na lista final

            continuar = JOptionPane.showInputDialog("Cadastrar outra pessoa? (S/N)");
        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar todos os dados
        System.out.println("TODOS OS DADOS CADASTRADOS:");
        for (esporte e : informacoes) {
            e.dados();
            System.out.println("----------");
        }
    }
}

