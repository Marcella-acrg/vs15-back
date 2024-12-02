import java.util.ArrayList;

public class Vendedor {
    public static final int CEM_PORCENTO = 100;
    public static final double CINCO = 5.0;
    public static final double SALARIO_BASE = 1500;
    public static final double VALE_TRANSPORTE_BASE = 1500;
    private String nome;
    private final String registro;
    private String dataNascimento;
    private double salarioBase;
    private double valeTransporte;
    private double comissao;

    public Vendedor(String nome, String registro, String dataNascimento) {
        this.nome = nome;
        this.registro = registro;
        this.dataNascimento = dataNascimento;
        this.valeTransporte = SALARIO_BASE;
        this.salarioBase = VALE_TRANSPORTE_BASE;
    }

    public double calcularComissao(ArrayList<CarrinhoCompra> carrinhoCompras, Vendedor vendedor){
        double totalVendas = 0;
        for (CarrinhoCompra carrinho: carrinhoCompras) {
            if (carrinho.getVendedor().equals(vendedor)){
                totalVendas += carrinho.calularValorTotal();
            }
        }
        vendedor.setComissao(totalVendas * (CINCO / CEM_PORCENTO));
        return vendedor.getComissao();
    }

    public void exibirVendedoresComComissao(ArrayList<Vendedor> vendedores){
        for (Vendedor vendedor: vendedores) {
            if (vendedor.getComissao() > 0){
                System.out.println("Nome: " + vendedor.getNome() + " registro: " + vendedor.getRegistro());
            }
        }
    }

    public double calcularSalario(Vendedor vendedor, ArrayList<CarrinhoCompra> carrinhoCompras){
        DescontosSalarioVendedor descontos = new DescontosSalarioVendedor();
        double descontoSalario = descontos.calcularDescontoSalario(vendedor);
        double comissao = calcularComissao(carrinhoCompras, vendedor);
        return valeTransporte + (salarioBase * comissao) - descontoSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
