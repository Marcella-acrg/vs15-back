package com.company.task01;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nomeDoFuncionario = scanner.nextLine();

        System.out.println("Digite o salário mensal do funcionário: ");
        double salarioMensalDoFuncionario = scanner.nextDouble();

        System.out.println("Digite o número de meses trabalhados no ano (1 a 12): ");
        int mesesTrabalhados = scanner.nextInt();

        double salarioAnualDoFuncionario = salarioMensalDoFuncionario * mesesTrabalhados;

        System.out.printf("O salário anual de %s é: R$ %.2f\n", nomeDoFuncionario, salarioAnualDoFuncionario);

        scanner.close();
    }
}
