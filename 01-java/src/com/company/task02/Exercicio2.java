package com.company.task02;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int jogosTotal = 100;
        String[] timesCasa = new String[jogosTotal];
        String[] timesVisitantes = new String[jogosTotal];
        int[] pontuacoesCasa = new int[jogosTotal];
        int[] pontuacoesVisitantes = new int[jogosTotal];
        String[] datasJogos = new String[jogosTotal];

        int totalJogos = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Inserir novo jogo");
            System.out.println("2. Exibir todos os jogos");
            System.out.println("3. Buscar jogos por time");
            System.out.println("4. Exibir classificação dos times");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
    }
}
