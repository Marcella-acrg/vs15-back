package com.company.task03;

public class Restaurante {

    public String nome;
    public String endereco;
    protected String culinariaEspecifica;
    public double avaliacao;

    public Restaurante(String nome, String endereco, String culinariaEspecifica, double avaliacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.culinariaEspecifica = culinariaEspecifica;
        this.avaliacao = avaliacao;
    }

    public void exibirDetalhes() {
        System.out.println("Restaurante: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Tipo de Culinária: " + culinariaEspecifica);
        System.out.println("Avaliação: " + avaliacao + " estrelas");
    }

    public void atualizarAvaliacao(double novaAvaliacao) {
        if(novaAvaliacao >= 0 && novaAvaliacao <= 5) {
            this.avaliacao = novaAvaliacao;
            System.out.println("Nova avaliação do restaurante " + nome + ": " + avaliacao + " estrelas");
        } else {
            System.out.println("Avaliação inválida! Inserir nota de avaliação entre 0 e 5");
        }
    }

    public static void main(String[] args) {

        Restaurante restaurante1 = new Restaurante("Churrascaria Fogo de Chão", "Avenida Paulista, 1000", "Churrasco", 4.8);
        Restaurante restaurante2 = new Restaurante("A Casa do Pastel", "Rua do Mercado, 45","Comida Brasileira", 4.6);

        restaurante1.exibirDetalhes();
        System.out.println();
        System.out.println("*************************************************");
        restaurante2.exibirDetalhes();
        System.out.println();
        System.out.println("*************************************************");
        restaurante2.atualizarAvaliacao(3.8);
        System.out.println();
        restaurante2.exibirDetalhes();
        System.out.println();



    }


}
