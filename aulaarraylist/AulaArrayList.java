package com.mycompany.aulaarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AulaArrayList {
    public static void main(String[] args) {
        ArrayList<Lazer> listaLazer = new ArrayList<>();

        boolean rel = true;
        while (rel) {
            String menu = "Escolha uma opção:\n"
                        + "0 - Sair ( Fechar ) \n"
                        + "1 - Cadastrar Usuário\n"
                        + "2 - Listar Usuários\n"
                        + "3 - Pesquisar Usuário";
            String valorDigitado = JOptionPane.showInputDialog(menu);

        if (valorDigitado == null) {
        // usuário cancelou, sair do loop
        rel = false;
        continue;
}
            
            switch (valorDigitado) {

                case "1":
                    Lazer lazer = new Lazer(); // nova instância a cada cadastro
                    lazer.setId(Integer.parseInt(JOptionPane.showInputDialog("ID:")));  
                    lazer.setNome(JOptionPane.showInputDialog("Nome:"));  
                    lazer.setCpf(Integer.parseInt(JOptionPane.showInputDialog("CPF:")));  
                    lazer.setRg(Integer.parseInt(JOptionPane.showInputDialog("RG:")));  
                    lazer.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Altura:"))); 
                    lazer.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Peso:"))); 
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

                    String opcional = "Cadastrar Lazer?:\n"  
                        + "1 - SIM\n"
                        + "2 - NAO"; 
                    int opcionalResposta = Integer.parseInt(JOptionPane.showInputDialog(opcional));

                    if(opcionalResposta == 1) { 
                        lazer.setEsp(JOptionPane.showInputDialog("Esporte:"));  
                        lazer.setDiaSemana(JOptionPane.showInputDialog("Dia da Semana:")); 
                        lazer.setHorario(JOptionPane.showInputDialog("Horario:")); 
                    }
                    listaLazer.add(lazer);
                    JOptionPane.showMessageDialog(null, "Retornando ao Menu INICIAL");
                    break;

                case "2":
                    StringBuilder dados = new StringBuilder();
                    for (Lazer l : listaLazer) {
                        dados.append("ID: ").append(l.getId()).append("\n")
                            .append("Nome: ").append(l.getNome()).append("\n")
                            .append("CPF: ").append(l.getCpf()).append("\n")
                            .append("RG: ").append(l.getRg()).append("\n")
                            .append("Altura: ").append(String.format("%.2f", l.getAltura())).append("\n")
                            .append("Peso: ").append(String.format("%.2f", l.getPeso())).append("\n");

                        if (l.getEsp() != null) {
                            dados.append("Lazer: O colaborador ").append(l.getNome())
                                .append(" pratica ").append(l.getEsp())
                                .append(" nos dias de ").append(l.getDiaSemana())
                                .append(" no horário de ").append(l.getHorario()).append("\n");
                        }
                        dados.append("------------\n");
                    }
                    JOptionPane.showMessageDialog(null, dados.toString());
                    break;
                    
                    //Entendimento do For
                    //Lazer: é o tipo dos objetos dentro da listaLazer.
                    //l: é a variável temporária que representa cada item da lista, a cada volta do loop.
                    //listaLazer: é a lista que contém vários objetos do tipo Lazer.       

                case "3":
                    int pesquisaId = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ID:"));  
                    boolean encontrado = false;
                    for (Lazer l : listaLazer) {
                        if (pesquisaId == l.getId()) {
                            StringBuilder resultado = new StringBuilder();
                            resultado.append("ID: ").append(l.getId()).append("\n")
                                .append("Nome: ").append(l.getNome()).append("\n")
                                .append("CPF: ").append(l.getCpf()).append("\n")
                                .append("RG: ").append(l.getRg()).append("\n")
                                .append("Altura: ").append(String.format("%.2f", l.getAltura())).append("\n")
                                .append("Peso: ").append(String.format("%.2f", l.getPeso())).append("\n");

                            if (l.getEsp() != null) {
                                resultado.append("Lazer: O colaborador ").append(l.getNome())
                                    .append(" pratica ").append(l.getEsp())
                                    .append(" nos dias de ").append(l.getDiaSemana())
                                    .append(" no horário de ").append(l.getHorario()).append("\n");
                            }

                            JOptionPane.showMessageDialog(null, resultado.toString());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "ID não encontrado.");
                    }
                    break;

                case "0":
                    rel = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}

/*
 * ===== RESUMO DO QUE FOI USADO E ESTUDADO NESTE CÓDIGO =====
 *
 * PACOTES E IMPORTAÇÕES:
 * - package: Define o pacote da aplicação (com.mycompany.aulaarraylist).
 * - import java.util.ArrayList: Utilizado para armazenar vários objetos do tipo Lazer dinamicamente.
 * - import javax.swing.JOptionPane: Utilizado para criar janelas gráficas de entrada e saída de dados (GUI).
 *
 * CLASSES E OBJETOS:
 * - Classe principal: AulaArrayList (com método main para executar o programa).
 * - Classe auxiliar: Lazer (representa um usuário com dados pessoais e opcionais de lazer).
 *
 * ESTRUTURAS DE DADOS:
 * - ArrayList<Lazer>: Armazena objetos do tipo Lazer, permitindo adicionar, listar e buscar elementos.
 *
 * ENTRADA E SAÍDA DE DADOS:
 * - JOptionPane.showInputDialog(): Solicita dados ao usuário.
 * - JOptionPane.showMessageDialog(): Mostra informações para o usuário.
 *
 * CONTROLE DE FLUXO:
 * - Estrutura de repetição while: Mantém o programa em execução até que o usuário escolha sair.
 * - Estrutura switch-case: Controla as opções do menu (Cadastrar, Listar, Pesquisar, Sair).
 * - Estrutura if-else: Verifica condições como cadastro opcional de lazer e existência do ID pesquisado.
 * - Estrutura for-each: Percorre a lista de usuários para listagem e busca.
 *
 * FORMATAÇÃO DE DADOS:
 * - StringBuilder: Usado para construir strings grandes de forma eficiente.
 * - String.format(): Usado para exibir altura e peso com duas casas decimais.
 *
 * TRATAMENTO DE DADOS:
 * - Conversão de String para int/float usando Integer.parseInt() e Float.parseFloat().
 *
 * ORIENTAÇÃO A OBJETOS:
 * - Criação de uma classe (Lazer) com atributos, encapsulamento (private) e métodos getters/setters.
 * - Instanciação de objetos (new Lazer()).
 * - Armazenamento e acesso a dados via métodos acessores (get/set).
 *
 * PRINCIPAIS CONCEITOS:
 * - Cadastro e armazenamento de dados em memória.
 * - Leitura, listagem e busca por atributo (ID).
 * - Uso de atributos opcionais com verificação (ex: esporte, dia, horário).
 * - Separação da lógica de negócios (classe Lazer) e interface de usuário (JOptionPane).
 *

*/
