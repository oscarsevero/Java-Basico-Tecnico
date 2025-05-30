package com.mycompany.sistemadatahoracomcolecoe;  // Corrigir o nome do pacote

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Oscar Ricardo
 */
public class SistemaDataHoraComColecoe{  // Corrigir o nome da classe

    // Classe para representar uma entrada de data e hora
    static class RegistroDataHora {
        private Date dataHora;
        private String descricao;

        public RegistroDataHora(Date dataHora, String descricao) {
            this.dataHora = dataHora;
            this.descricao = descricao;
        }

        public Date getDataHora() {
            return dataHora;
        }

        public String getDescricao() {
            return descricao;
        }

        @Override
        public String toString() {
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            return "Data e Hora: " + formatador.format(dataHora) + " | Descrição: " + descricao;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<RegistroDataHora> registros = new ArrayList<>();  // Lista para armazenar os registros

        // Loop para o menu de operações
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Registrar data e hora atual");
            System.out.println("2. Listar todos os registros");
            System.out.println("3. Filtrar registros por descrição");
            System.out.println("4. Ordenar registros por data");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    // Registrar a data e hora atual
                    System.out.print("Digite uma descrição para o registro: ");
                    String descricao = scanner.nextLine();
                    RegistroDataHora novoRegistro = new RegistroDataHora(new Date(), descricao);
                    registros.add(novoRegistro);
                    System.out.println("Registro adicionado com sucesso!");
                    break;

                case 2:
                    // Listar todos os registros
                    System.out.println("\nLista de registros:");
                    registros.forEach(System.out::println);
                    break;

                case 3:
                    // Filtrar registros por descrição
                    System.out.print("Digite a palavra-chave para filtrar pela descrição: ");
                    String palavraChave = scanner.nextLine();
                    List<RegistroDataHora> filtrados = registros.stream()
                        .filter(r -> r.getDescricao().toLowerCase().contains(palavraChave.toLowerCase()))
                        .collect(Collectors.toList());
                    System.out.println("\nRegistros filtrados:");
                    filtrados.forEach(System.out::println);
                    break;

                case 4:
                    // Ordenar os registros por data
                    List<RegistroDataHora> ordenados = registros.stream()
                        .sorted(Comparator.comparing(RegistroDataHora::getDataHora))
                        .collect(Collectors.toList());
                    System.out.println("\nRegistros ordenados por data:");
                    ordenados.forEach(System.out::println);
                    break;

                case 5:
                    // Sair do programa
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
