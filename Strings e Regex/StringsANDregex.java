/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringsandregex;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Oscar Ricardo
 */
public class StringsANDregex {

   public static void main(String[] args) {

        String texto = "  Meu nome é João da Silva, cpf: 123.456.789-09. \n"
                     + "#foco #força #fé \n"
                     + "Referência: AB-1234 \n"
                     + "Saldo: 1532.4 reais \n"
                     + "Senha: Jo@o1234 ";

        // 1. Remover espaços em branco (trim)
        texto = texto.trim();
        System.out.println("Texto sem espaços extras:\n" + texto);

        // 2. Maiúsculas e minúsculas
        System.out.println("\nMaiúsculas:\n" + texto.toUpperCase());
        System.out.println("\nMinúsculas:\n" + texto.toLowerCase());

        // 3. Substituir parte da string
        String textoSubstituido = texto.replace("João", "Carlos");
        System.out.println("\nSubstituindo 'João' por 'Carlos':\n" + textoSubstituido);

        // 4. Extrair CPF com regex
        Pattern padraoCPF = Pattern.compile("\\b\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}\\b");
        Matcher matcherCPF = padraoCPF.matcher(texto);
        if (matcherCPF.find()) {
            System.out.println("\nCPF encontrado: " + matcherCPF.group());
        }

        // 5. Verificar se contém a palavra "Referência"
        if (texto.contains("Referência")) {
            System.out.println("\nA string contém 'Referência'.");
        }

        // 6. Formatando número (saldo)
        Pattern saldoPattern = Pattern.compile("Saldo: (\\d+\\.\\d+)");
        Matcher matcherSaldo = saldoPattern.matcher(texto);
        if (matcherSaldo.find()) {
            double saldo = Double.parseDouble(matcherSaldo.group(1));
            DecimalFormat df = new DecimalFormat("#,###.00");
            System.out.println("\nSaldo formatado: R$ " + df.format(saldo));
        }

        // 7. Validando código de referência: AB-1234 (letras + hífen + 4 dígitos)
        Pattern refPattern = Pattern.compile("Referência: ([A-Z]{2}-\\d{4})");
        Matcher matcherRef = refPattern.matcher(texto);
        if (matcherRef.find()) {
            System.out.println("\nCódigo de referência válido: " + matcherRef.group(1));
        }

        // 8. Validando CPF (simples)
        if (matcherCPF.group().matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            System.out.println("\nCPF está no formato correto.");
        }

        // 9. Extraindo hashtags
        Pattern hashtagPattern = Pattern.compile("#\\w+");
        Matcher matcherHashtag = hashtagPattern.matcher(texto);
        System.out.println("\nHashtags encontradas:");
        while (matcherHashtag.find()) {
            System.out.println(matcherHashtag.group());
        }

        // 10. Validando senha (mín. 6 caracteres, 1 letra maiúscula, 1 número, 1 símbolo)
        Pattern senhaPattern = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!]).{6,}");
        Matcher matcherSenha = senhaPattern.matcher(texto);
        if (matcherSenha.find()) {
            System.out.println("\nSenha válida encontrada: " + matcherSenha.group());
        } else {
            System.out.println("\nSenha inválida.");
        }
    }
}