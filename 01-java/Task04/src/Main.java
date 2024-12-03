import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Produto> produtos = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Vendedor> vendedores = new ArrayList<>();
    static ArrayList<CarrinhoCompra> carrinhos = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;
        do {
            System.out.println("\n*************** Sistema de Compras Online ***************");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Cadastrar Vendedor");
            System.out.println("3. Adicionar Produto ao Carrinho");
            System.out.println("4. Visualizar Carrinho");
            System.out.println("5. Finalizar Compra");
            System.out.println("6. Exibir Lucratividade");
            System.out.println("7. Listar Vendedores e Comissões");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade em Estoque: ");
                    int quantidadeEstoque = scanner.nextInt();
                    System.out.println("Tipo (1 - ALIMENTOS, 2 - BEBIDAS, 3 - LIMPEZA): ");
                    int tipo = scanner.nextInt();
                    TipoProduto tipoProduto = TipoProduto.values()[tipo - 1];
                    if (produtos.add(new Produto(nomeProduto, tipoProduto, preco, quantidadeEstoque))){
                        System.out.println("Produto cadastrado com sucesso!");
                    }else{
                        System.out.println("Erro ao cadastrar!");
                    }
                    break;

                case 2:
                    System.out.print("Nome do Cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Dinheiro disponível: ");
                    double dinheiro = scanner.nextDouble();
                    if (clientes.add(new Cliente(nomeCliente, email, dinheiro))){
                        System.out.println("Cliente cadastrado com sucesso!");
                    }else{
                        System.out.println("Erro ao cadastrar!");
                    }
                    break;

                case 3:
                    System.out.print("Nome do Vendedor: ");
                    String nomeVendedor = scanner.nextLine();
                    System.out.print("Registro: ");
                    String registro = scanner.nextLine();
                    System.out.print("Data Nascimento: ");
                    String dataNascimento = scanner.nextLine();
                    if (vendedores.add(new Vendedor(nomeVendedor, registro, dataNascimento))){
                        System.out.println("Vendedor cadastrado com sucesso!");
                    }else{
                        System.out.println("Erro ao cadastrar!");
                    }
                    break;

                case 4:
                    
                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
