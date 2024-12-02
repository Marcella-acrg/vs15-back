package com.company.task01;

public class Exercicio4 {
    public static void main(String[] args) {

        int anoDeChegadaDosPortugueses = 1500;
        int anoAtual = 2024;
        int idadeMedia = 28;

        int anosPassados = anoAtual - anoDeChegadaDosPortugueses;

        int geracoes = anosPassados / idadeMedia;

        System.out.println("O número de gerações passadas desde 1500 é de: " + geracoes + " gerações");
    }
}
