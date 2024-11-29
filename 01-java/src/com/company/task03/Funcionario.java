package com.company.task03;

public class Funcionario {

    private String nome;
    public String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirDetalhesFuncionario() {
        System.out.println("Nome: " + this.nome + " | Cargo: " + this.cargo);
        System.out.println("Salário: R$ " + String.format("%.2f", this.salario));
    }

    public void calcularSalarioAnual() {
        double salarioAnual = this.salario * 12;
        System.out.println("Salário anual: R$ " + String.format("%.2f", salarioAnual));
    }

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Marcella Araújo", "Analista de QA", 4500.00);

        funcionario.exibirDetalhesFuncionario();

        funcionario.calcularSalarioAnual();
    }
}
