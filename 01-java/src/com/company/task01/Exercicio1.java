package com.company.task01;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora de início do jogo: ");
        int horaInicioJogo = scanner.nextInt();

        System.out.println("Digite os minutos de início do jogo: ");
        int minutoInicioJogo = scanner.nextInt();


        System.out.println("Digite a hora de término do jogo: ");
        int horaTerminoJogo = scanner.nextInt();

        System.out.println("Digite os minutos de término do jogo: ");
        int minutoTerminoJogo = scanner.nextInt();

        int inicioEmMinutosTotais = horaInicioJogo * 60 + minutoInicioJogo;
        int terminoEmMinutosTotais = horaTerminoJogo * 60 + minutoTerminoJogo;

        int duracaoTotalEmMinutos;
        if(terminoEmMinutosTotais >= inicioEmMinutosTotais) {
            duracaoTotalEmMinutos = terminoEmMinutosTotais - inicioEmMinutosTotais;
        } else {
            duracaoTotalEmMinutos = (24 * 60 - inicioEmMinutosTotais) + terminoEmMinutosTotais;
        }

        int duracaoHoras = duracaoTotalEmMinutos / 60;
        int duracaoMinutos = duracaoTotalEmMinutos % 60;

        System.out.printf("A duração do jogo foi de %d hora(s) e %d minuto(s).%n" , duracaoHoras, duracaoMinutos);

        scanner.close();
    }
}
