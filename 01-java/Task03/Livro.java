package com.company.task03;

import java.util.Scanner;

public class Livro {

    public String titulo;
    public String autor;
    public int anoPublicacao;
    private boolean disponivel;


    public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public void exibirDetalhesLivro() {
        System.out.println("Título: " + this.titulo + " | Autor: " + this.autor + " | Ano de Publicação: " + this.anoPublicacao );
        System.out.println("Disponível: " + (this.disponivel ? "Sim" : "Não"));
    }

    public void emprestarLivro() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("O livro \"" + this.titulo + "\" foi emprestado com sucesso.");
        } else {
            System.out.println("O livro \"" + this.titulo + "\" não está disponível para empréstimo.");
        }
    }

    public static void main(String[] args) {

        Livro livro1 = new Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956, true);
        Livro livro2 = new Livro("A Moreninha", "Joaquim Manuel de Macedo", 1844, false);
        Livro livro3 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881, true);

        livro1.exibirDetalhesLivro();
        System.out.println("********************************************************************************************************");
        System.out.println();
        livro2.exibirDetalhesLivro();
        System.out.println("********************************************************************************************************");
        System.out.println();
        livro3.exibirDetalhesLivro();
        System.out.println();
        livro3.emprestarLivro();

    }
}
