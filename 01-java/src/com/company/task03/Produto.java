package com.company.task03;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhesProduto() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$ " + String.format("%.2f", this.preco));
        System.out.println("Quantidade em estoque: " + this.quantidade);
    }

    public void adicionarEstoque(int entradaDeProduto) {
        if (entradaDeProduto > 0) {
            this.quantidade += entradaDeProduto;
            System.out.println(entradaDeProduto + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook Dell", 4500.00, 10);

        produto.exibirDetalhesProduto();
        System.out.println();

        produto.adicionarEstoque(7);
        System.out.println();

        produto.exibirDetalhesProduto();
    }
}

