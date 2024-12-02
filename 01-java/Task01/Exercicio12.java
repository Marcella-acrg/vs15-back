package com.company.task01;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do livro: R$ ");
        double precoDoLivro = scanner.nextDouble();

        System.out.print("Quantidade de livros: ");
        int quantidadeDeLivros = scanner.nextInt();

        double valorTotal = precoDoLivro * quantidadeDeLivros;

        if (valorTotal > 100.00) {
            valorTotal = valorTotal * 0.95;
        }

        System.out.printf("Valor final da compra: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
