package com.company.task01;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeDoProduto = scanner.nextLine();

        System.out.print("Digite o preço do produto: R$ ");
        double precoDoProduto = scanner.nextDouble();

        System.out.println("Promoção: " + nomeDoProduto);

        for (int i = 1; i <= 10; i++) {
            double desconto = i * 5;
            if (desconto > 50) {
                desconto = 50;
            }

            double precoComDesconto = precoDoProduto * (1 - desconto / 100);
            double total = precoComDesconto * i;

            System.out.printf("%d x R$ %.2f = R$ %.2f\n", i, precoComDesconto, total);
        }

        scanner.close();
    }
}
