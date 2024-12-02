package com.company.task01;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos da turma: ");
        int quantidadeDeAlunosDaTurma = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= quantidadeDeAlunosDaTurma; i++) {
            System.out.println("Digite o nome do aluno " + i + "; ");
            String nomeDoAluno = scanner.nextLine();

            System.out.println("Digite a nota da primeira prova: " );
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a nota da segunda prova: " );
            double nota2 = scanner.nextDouble();

            System.out.println("Digite a nota da terceira prova: " );
            double nota3 = scanner.nextDouble();
            scanner.nextLine();

            double mediaDoAluno = (nota1 + nota2 + nota3) / 3;

            System.out.println("Aluno(a): " + nomeDoAluno + " - Média: " + String.format("%.2f", mediaDoAluno));
        }

        scanner.close();

    }
}
