package com.company.task04;

public class Carrinho {
    int totalProdutos = 100;
    private Produtos[] produtos = new Produtos[totalProdutos];
    private int[] quantidades = new int[totalProdutos];
    private int tamanho = 0;

    public void adicionarProduto(Produtos produto, int quantidade) {
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i].equals(produto)) {
                quantidades[i] += quantidade;
                return;
            }
        }
        produtos[tamanho] = produto;
        quantidades[tamanho] = quantidade;
        tamanho++;
    }

    public void removerProduto(Produtos produto) {
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i].equals(produto)) {
                for (int j = i; j < tamanho - 1; j++) {
                    produtos[j] = produtos[j + 1];
                    quantidades[j] = quantidades[j + 1];
                }
                tamanho--;
                return;
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < tamanho; i++) {
            total += produtos[i].getPreco() * quantidades[i];
        }
        return total;
    }

    public void exibirProdutos() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(produtos[i].getNome() + " - Qtd: " + quantidades[i] + " - Preço: " + produtos[i].getPreco());
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}

