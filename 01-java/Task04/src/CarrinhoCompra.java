import java.util.ArrayList;

public class CarrinhoCompra {
    public static final int CEM_PORCENTO = 100;
    private Cliente cliente;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private int quantidadeItens = produtos.size();
    private Vendedor vendedor;

    public CarrinhoCompra(Cliente cliente, ArrayList<Produto> produtos, Vendedor vendedor) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.vendedor = vendedor;
    }

    public void exibirRecibo(FormaPagamento formaPagamento){
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Total Itens: " + this.quantidadeItens);
        System.out.println("Valor Total: " + calularValorTotal());

        for (int i = 0; i < this.produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println("Item: " + i + " nome: " + produto.getNome() + " valor: " + produto.getPreco());
        }
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        if (!produtos.remove(produto)){
            System.out.println("Produto não encontrado.");
        }
    }

    public double calularValorTotal(){
        double soma = 0;
        for (Produto produto: this.produtos) {
            soma += produto.getPreco() - (produto.getPreco() * (produto.getQuantidadeDesconto() / CEM_PORCENTO));
        }
        return soma;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

}
