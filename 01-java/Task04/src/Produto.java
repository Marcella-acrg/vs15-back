public class Produto {
    private String nome;
    private TipoProduto tipo;
    private double preco;
    private int quantidadeEstoque;
    private double quantidadeDesconto;

    public Produto(String nome, TipoProduto tipo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeDesconto = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getQuantidadeDesconto() {
        return quantidadeDesconto;
    }

    public void setQuantidadeDesconto(double quantidadeDesconto) {
        this.quantidadeDesconto = quantidadeDesconto;
    }
}
