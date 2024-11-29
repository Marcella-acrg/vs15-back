package com.company.task03;

public class Filme {

    public String titulo;
    public String genero;
    private int duracao;

    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao + " minutos");
    }

    public static void main(String[] args) {
        Filme filme1 = new Filme("Cidade de Deus", "Drama/Crime", 130);
        Filme filme2 = new Filme("Tropa de Elite", "Ação/Drama", 115);


        filme1.exibirDetalhes();
        System.out.println();
        filme2.exibirDetalhes();
    }
}

