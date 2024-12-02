import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fabio", "fabio@gmail.com", 1000);
        Vendedor vendedor = new Vendedor("Marcella", "1", "17/07/1985");
        Produto produto1 = new Produto("Feijao", TipoProduto.ALIMENTOS, 5.90, 80);
        Produto produto2 = new Produto("Feijao", TipoProduto.ALIMENTOS, 5.90, 80);
        Produto produto3 = new Produto("Feijao", TipoProduto.ALIMENTOS, 5.90, 80);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        CarrinhoCompra  carrinhoCompra = new CarrinhoCompra(cliente, produtos, vendedor);
        System.out.printf("%.2f",carrinhoCompra.calularValorTotal());

    }
}