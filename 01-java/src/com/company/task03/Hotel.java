package com.company.task03;

public class Hotel {

    private String nomeCliente;
    protected int numeroDeQuartos;
    public int diasEstadia;
    public double valorDiaria;

    public Hotel(String nomeCliente, int numeroDeQuartos, int diasEstadia, double valorDiaria) {
        this.nomeCliente = nomeCliente;
        this.numeroDeQuartos = numeroDeQuartos;
        this.diasEstadia = diasEstadia;
        this.valorDiaria = valorDiaria;
    }

    public void exibirDetalhesDaReserva() {
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Número de quartos reservados: " + numeroDeQuartos);
        System.out.println("Quantidade de dias no hotel: " + diasEstadia + " dias");
        System.out.println("Valor da Diária: R$ " + valorDiaria);
    }

    public void calcularValorTotal() {
        double valorTotal = valorDiaria *  numeroDeQuartos * diasEstadia;
        System.out.println("Valor total da reserva: R$" + valorTotal);
    }


    public static void main(String[] args) {
        Hotel hotel = new Hotel("Marcella Araújo", 2, 5, 180);

        hotel.exibirDetalhesDaReserva();

        hotel.calcularValorTotal();
    }
}
