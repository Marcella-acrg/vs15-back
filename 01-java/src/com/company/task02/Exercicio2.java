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

            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome do time da casa: ");
                    timesCasa[totalJogos] = scanner.nextLine();

                    System.out.println("Digite o nome do time visitante: ");
                    timesVisitantes[totalJogos] = scanner.nextLine();

                    System.out.println("Digite o total de pontos do time da casa: ");
                    pontuacoesCasa[totalJogos] = scanner.nextInt();

                    System.out.println("Digite o total de pontos do time visitante");
                    pontuacoesVisitantes[totalJogos] = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println("Digite a data do jogo: ");
                    datasJogos[totalJogos] = scanner.nextLine();

                    totalJogos += 1;
                    break;

                case 2:
                    for (int i = 0; i < totalJogos; i++) {
                        System.out.println("Time casa: " + timesCasa[i] + " X Time visitante:" + timesVisitantes[i]);
                        System.out.println("Na data: " + datasJogos[i]);
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do time: ");
                    String nomePesquisa = scanner.nextLine();

                    for (int i = 0; i < totalJogos; i++) {
                        if (timesCasa[i].equals(nomePesquisa) || timesVisitantes[i].equals(nomePesquisa)){
                            System.out.println("Time casa: " + timesCasa[i] + " X Time visitante:" + timesVisitantes[i]);
                            System.out.println("Na data: " + datasJogos[i]);
                        }
                        else{
                            System.out.println("Time nao encontrado.");
                        }
                    }
                    break;

                case 4:
                    exibirClassificacao(timesCasa, pontuacoesCasa, "Times da Casa", totalJogos);
                    exibirClassificacao(timesVisitantes, pontuacoesVisitantes, "Times Visitantes", totalJogos);
                    break;

                case 5:
                    System.out.println("Voce decidiu sair.");
                    return;
            }
        }
    }

    static void exibirClassificacao(String[] times, int[] pontuacoes, String titulo, int totalJogos) {
        System.out.println("\nClassificação: " + titulo);
        for (int i = 0; i < totalJogos; i++) {
            for (int j = i + 1; j < totalJogos; j++) {
                if (times[j] != null && times[i] != null && times[i].equals(times[j])) {
                    pontuacoes[i] += pontuacoes[j];
                    times[j] = null;
                }
            }
        }

        for (int i = 0; i < totalJogos; i++) {
            if (times[i] != null) {
                System.out.println(times[i] + ": " + pontuacoes[i] + " pontos");
            }
        }
    }
}
