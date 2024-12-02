package com.company.task01;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores: ");
        int numeroTotalDeEleitores = scanner.nextInt();

        System.out.println("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        System.out.println("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.println("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        int totalDeVotos = votosValidos + votosBrancos + votosNulos;

        double percentualDeVotosValidos = (double) votosValidos / numeroTotalDeEleitores * 100;
        double percentualDeVotosBrancos = (double) votosBrancos / numeroTotalDeEleitores * 100;
        double percentualDeVotosNulos = (double) votosNulos / numeroTotalDeEleitores * 100;

        System.out.println("\n Resumo da votação: ");
        System.out.println("Total de eleitores: " +  numeroTotalDeEleitores);
        System.out.println("Total de votos: " + totalDeVotos);
        System.out.println("Total de votos válidos: " + String.format("%.2f", percentualDeVotosValidos) + "%");
        System.out.println("Total de votos brancos: " + String.format("%.2f", percentualDeVotosBrancos) + "%");
        System.out.println("Total de votos nulos: " + String.format("%.2f", percentualDeVotosNulos) + "%");

        scanner.close();
    }
}
