package com.company.task03;

public class Aluno {

    private String nome;
    protected int idade;
    public double nota1;
    public double nota2;
    public double nota3;

    public Aluno(String nome, int idade, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome + " | Idade: " + this.idade + " anos");
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Nota 3: " + this.nota3);
        System.out.println("Média: " + String.format("%.2f", calcularMedia()));
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3 ) / 3;

    }

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Marcella Araújo", 39, 8.5, 9.0, 7.2);

        aluno.exibirInformacoes();

    }
}
