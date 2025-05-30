/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadatahora;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Oscar Ricardo
 */
public class SistemaDataHora {

     // Método para mostrar a data e hora atuais
    public static void mostrarDataHoraAtual() {
        // Obtendo a data e hora atuais
        Date dataHoraAtual = new Date();

        // Formatando a data e hora
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Exibindo a data e hora no formato desejado
        System.out.println("Data e hora atuais: " + formatador.format(dataHoraAtual));
    }

    // Método para salvar a data e hora fornecida pelo usuário
    public static void salvarDataHora(String dataHora) {
        // Aqui você poderia salvar em um arquivo ou banco de dados, por exemplo.
        // Vamos apenas exibir para fins de exemplo.
        System.out.println("Data e hora salva: " + dataHora);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe a data e hora atuais
        mostrarDataHoraAtual();

        // Pergunta ao usuário se ele quer salvar uma data e hora
        System.out.print("Deseja salvar a data e hora atuais? (sim/não): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            // Salva a data e hora
            Date dataHoraAtual = new Date();
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            salvarDataHora(formatador.format(dataHoraAtual));
        } else {
            System.out.println("Data e hora não foram salvas.");
        }

        scanner.close();
    }
}