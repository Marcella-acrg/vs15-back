package com.company.task01;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsiusTemperature = scanner.nextDouble();

        double fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;

        System.out.println("A temperatura de " + celsiusTemperature + "ºC é igual a " + fahrenheitTemperature + "ºF");

        scanner.close();

    }
}
