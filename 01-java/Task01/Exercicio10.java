package com.company.task01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("5. Cálculo de área de um círculo");
            System.out.println("6. Cálculo de área de um retângulo");
            System.out.println("7. Cálculo de área de um triângulo");
            System.out.println("8. Cálculo de diâmetro de um círculo");
            System.out.println("9. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double primeiroNumero = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double segundoNumero = scanner.nextDouble();
                    System.out.println("Resultado: " + String.format("%.2f", primeiroNumero + segundoNumero));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    primeiroNumero = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    segundoNumero = scanner.nextDouble();
                    System.out.println("Resultado: " + String.format("%.2f", primeiroNumero - segundoNumero));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    primeiroNumero = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    segundoNumero = scanner.nextDouble();
                    System.out.println("Resultado: " + String.format("%.2f", primeiroNumero * segundoNumero));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    primeiroNumero = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    segundoNumero = scanner.nextDouble();
                    if (segundoNumero != 0) {
                        System.out.println("Resultado: " + String.format("%.2f", primeiroNumero / segundoNumero));
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;

                case 5:
                    System.out.print("Digite o raio do círculo: ");
                    double raioDoCirculo = scanner.nextDouble();
                    double areaDoCirculo = Math.PI * Math.pow(raioDoCirculo, 2);
                    System.out.println("Área do círculo: " + String.format("%.2f", areaDoCirculo));
                    break;

                case 6:
                    System.out.print("Digite a largura do retângulo: ");
                    double larguraDoRetangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double alturaDoRetangulo = scanner.nextDouble();
                    double areaRetangulo = larguraDoRetangulo * alturaDoRetangulo;
                    System.out.println("Área do retângulo: " + String.format("%.2f", areaRetangulo));
                    break;

                case 7:
                    System.out.print("Digite a base do triângulo: ");
                    double baseDoTriangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaDoTriangulo = scanner.nextDouble();
                    double areaDoTriangulo = (baseDoTriangulo * alturaDoTriangulo) / 2;
                    System.out.println("Área do triângulo: " + String.format("%.2f", areaDoTriangulo));
                    break;

                case 8:
                    System.out.print("Digite o raio do círculo: ");
                    raioDoCirculo = scanner.nextDouble();
                    double diametroDoCirculo = 2 * raioDoCirculo;
                    System.out.println("Diâmetro do círculo: " + String.format("%.2f", diametroDoCirculo));
                    break;

                case 9:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        } while (opcao != 9);

        scanner.close();
    }
}
