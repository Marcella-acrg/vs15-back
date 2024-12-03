import java.util.ArrayList;

public class CarrinhoCompra {
    public static final int CEM_PORCENTO = 100;
    private Cliente cliente;
    private ArrayList<ProdutoCarrinho> produtosCarrinho = new ArrayList<>();
    private Vendedor vendedor;

    public CarrinhoCompra(Cliente cliente, ArrayList<ProdutoCarrinho> produtosCarrinho, Vendedor vendedor) {
        this.cliente = cliente;
        this.produtosCarrinho = produtosCarrinho;
        this.vendedor = vendedor;
    }

    public void exibirRecibo(FormaPagamento formaPagamento){
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Total Itens: " + produtosCarrinho.size());
        System.out.printf("Valor Total: %.2f", calularValorTotal());
        System.out.println("\n");

        for (int i = 0; i < this.produtosCarrinho.size(); i++) {
            ProdutoCarrinho produtoCarrinho = produtosCarrinho.get(i);
            Produto produto = produtoCarrinho.getProduto();
            System.out.println("Item: " + i + " nome: " + produto.getNome() + " valor: " + produto.getPreco() + " quantidade: " + produtoCarrinho.getQuantidade());
        }
    }

    public double calularValorTotal(){
        double soma = 0;
        for (ProdutoCarrinho produtoCarrinho: this.produtosCarrinho) {
            Produto produto = produtoCarrinho.getProduto();
            soma += produtoCarrinho.getQuantidade() * (produto.getPreco() - (produto.getPreco() * (produto.getQuantidadeDesconto() / CEM_PORCENTO)));
        }
        return soma;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ProdutoCarrinho> getProdutosCarrinho() {
        return produtosCarrinho;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

}
