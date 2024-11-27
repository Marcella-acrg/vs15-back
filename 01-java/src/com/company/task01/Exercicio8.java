package com.company.task01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

    public static class Produto {
        public String nome;
        public String descricao;
        public double preco;
        public int estoque;

        public Produto(String nome, String descricao, double preco, int estoque) {
            this.nome = nome;
            this.descricao = descricao;
            this.preco = preco;
            this.estoque = estoque;
        }

        public void aplicarDesconto(double percentual) {
            if (percentual > 0 && percentual <= 100) {
                this.preco -= this.preco * (percentual / 100);
            } else {
                System.out.println("Percentual de desconto inválido!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", "Notebook Dell Inspiron 15", 3500.00, 10));
        produtos.add(new Produto("Smartphone", "Smartphone Samsung Galaxy S21", 2500.00, 5));
        produtos.add(new Produto("Fone de Ouvido", "Fone Bluetooth JBL", 300.00, 20));
        produtos.add(new Produto("Smartwatch", "Relógio inteligente Xiaomi", 500.00, 15));

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Produtos");
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Aplicar desconto a um produto");
            System.out.println("3. Exibir detalhes de um produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição do produto: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Estoque disponível: ");
                    int estoque = scanner.nextInt();
                    produtos.add(new Produto(nome, descricao, preco, estoque));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado!");
                        break;
                    }
                    System.out.println("Escolha o índice do produto para aplicar desconto:");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println(i + ": " + produtos.get(i).nome);
                    }
                    System.out.print("Índice: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < produtos.size()) {
                        System.out.print("Percentual de desconto (%): ");
                        double percentualDeDesconto = scanner.nextDouble();

                        Produto produtoSelecionado = produtos.get(indice);
                        double precoInicial = produtoSelecionado.preco;
                        double valorDesconto = produtoSelecionado.preco * (percentualDeDesconto / 100);

                        produtoSelecionado.aplicarDesconto(percentualDeDesconto);

                        System.out.println("Desconto aplicado com sucesso!");
                        System.out.printf("Preço inical: R$%.2f\n", precoInicial);
                        System.out.printf("Valor do desconto: R$%.2f\n", valorDesconto);
                        System.out.printf("Preço atualizado com desconto: R$%.2f\n", produtoSelecionado.preco);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 3:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado!");
                        break;
                    }
                    System.out.println("Escolha o índice do produto para exibir detalhes:");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println(i + ": " + produtos.get(i).nome);
                    }
                    System.out.print("Índice: ");
                    indice = scanner.nextInt();
                    if (indice >= 0 && indice < produtos.size()) {
                        Produto produto = produtos.get(indice);
                        System.out.println("Detalhes do Produto:");
                        System.out.println("Nome: " + produto.nome);
                        System.out.println("Descrição: " + produto.descricao);
                        System.out.printf("Preço: R$%.2f\n", produto.preco);
                        System.out.println("Estoque: " + produto.estoque);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
