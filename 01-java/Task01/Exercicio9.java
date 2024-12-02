package com.company.task01;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] dicionario = {
                {"Cachorro", "Dog"},
                {"Cidade", "City"},
                {"Feliz", "Happy"},
                {"Triste", "Sad"},
                {"Dog", "Cachorro"},
                {"City", "Cidade"},
                {"Happy", "Feliz"},
                {"Sad", "Triste"}
        };

        System.out.println("Escolha o idioma de entrada (Português ou Inglês): ");
        String idioma = scanner.nextLine().trim().toLowerCase();

        System.out.println("Digite a palavra a ser traduzida: ");
        String palavra = scanner.nextLine().trim();

        boolean traduzido = false;

        if (idioma.equals("português")) {
            for (int i = 0; i < dicionario.length; i++) {
                if (dicionario[i][0].equalsIgnoreCase(palavra)) {
                    System.out.println("Tradução: " + dicionario[i][1]);
                    traduzido = true;
                    break;
                }
            }
        } else if (idioma.equals("inglês")) {
            for (int i = 0; i < dicionario.length; i++) {
                if (dicionario[i][1].equalsIgnoreCase(palavra)) {
                    System.out.println("Tradução: " + dicionario[i][0]);
                    traduzido = true;
                    break;
                }
            }
        }

        if (!traduzido) {
            System.out.println("Esse idioma não é válido.");
        }

        scanner.close();

    }
}
