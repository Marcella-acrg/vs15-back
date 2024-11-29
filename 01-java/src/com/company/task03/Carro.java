package com.company.task03;

import java.util.Scanner;

public class Carro {

    public String marca;
    public String modelo;
    public String cor;
    private int ano;
    protected double velocidade;


    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void exibirDetalhesCarro() {
        System.out.println("Carro: " + this.marca + " " + this.modelo + " | Cor: " + this.cor + " | Ano de fabricação: " + this.ano);
    }

    public void acelerar(double velocidadeAtual) {
        this.velocidade += velocidadeAtual;
        System.out.println("Carro em movimento com velocidade de: " + this.velocidade + " Km/h");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.println("Infome o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.println("Informe a cor do carro: ");
        String cor = scanner.nextLine();

        System.out.println("Informe o ano do carro: ");
        int ano = scanner.nextInt();

        System.out.println("Informe a velocidade do carro: ");
        double velocidadeAtual = scanner.nextDouble();

        Carro carro = new Carro(marca, modelo, cor, ano);

        carro.exibirDetalhesCarro();
        carro.acelerar(velocidadeAtual);

        scanner.close();
    }
}



