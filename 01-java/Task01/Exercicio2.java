package com.company.task01;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        switch (numero % 2) {
            case 0 -> System.out.println("O número " + numero + " é par.");
            case 1, -1 -> System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();

    }
}
