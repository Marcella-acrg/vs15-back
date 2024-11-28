package com.company.task02;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        String[] nomeDosPets = new String[3];
        String[] tipoDosPets = new String[3];

        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n******** Sistema de Gerenciamento da Clínica de Pets ********");
            System.out.println("1. Inserir novo pet");
            System.out.println("2. Exibir todos os pets");
            System.out.println("3. Buscar pet pelo nome");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1:
                    boolean petAdicionado = false;
                    for (int i = 0; i < nomeDosPets.length; i++) {
                        if (nomeDosPets[i] == null) {
                            System.out.println("Digite o nome do pet: ");
                            nomeDosPets[i] = ler.nextLine();
                            System.out.println("Digite o tipo do pet: ");
                            tipoDosPets[i] = ler.nextLine();
                            System.out.println("Pet adicionado com sucesso!");
                            petAdicionado = true;
                            break;
                        }
                    }
                    if (!petAdicionado) {
                        System.out.println("Não é possível adicionar novos pets.");
                    }
                    break;

                case 2:
                    boolean petsRegistrados = false;
                    System.out.println("\n****** Pets Registrados ******");
                    for (int i = 0; i < nomeDosPets.length; i++) {
                        if (nomeDosPets[i] != null) {
                            System.out.println("Nome: " + nomeDosPets[i] + " | Tipo: " + tipoDosPets[i]);
                            petsRegistrados = true;

                        }
                    }
                    if (!petsRegistrados) {
                        System.out.println("Nenhum pet registrado.");
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do pet para realizar a busca: ");
                    String buscarNome = ler.nextLine();
                    boolean petEncontrado = false;

                    for(int i = 0; i < nomeDosPets.length; i++){
                        if (nomeDosPets[i] != null && nomeDosPets[i].equalsIgnoreCase(buscarNome)) {
                            System.out.println("Pet encontrado! Nome: " + nomeDosPets[i] + " | Tipo: " + tipoDosPets[i]);
                            petEncontrado = true;
                            break;
                        }
                    }

                    if (!petEncontrado) {
                        System.out.println("O pet não consta em nossos cadastros!");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        ler.close();
    }
}
