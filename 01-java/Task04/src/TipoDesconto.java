public enum TipoDesconto {
    INSS_A(1412.01, 7.5),
    INSS_B(2666.68, 9),
    INSS_C(4000.03, 12),
    INSS_D(7786.02, 14),
    IRRF_A(2259.20, 0),
    IRRF_B(2826.65, 7.5),
    IRRF_C(3751.05, 15),
    IRRF_D(4664.68, 22.5),
    IRRF_E(44664.68, 27.5);

    private final double limiteEnquadramento;
    private final double aliquota;

    TipoDesconto(double limiteEnquadramento, double aliquota){
        this.limiteEnquadramento = limiteEnquadramento;
        this.aliquota = aliquota;
    }

    public double getLimiteEnquadramento() {
        return limiteEnquadramento;
    }

    public double getAliquota() {
        return aliquota;
    }
}
