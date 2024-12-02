public class DescontosSalarioVendedor {

    public DescontosSalarioVendedor() {
    }

    public double calcularDescontoSalario(Vendedor vendedor){
        double salario = vendedor.getSalarioBase();
        double alioquotaINSS = calularAliquotaINSS(salario);
        double alioquotaIRRF = calularAliquotaIRRF(salario);
        return salario * ((alioquotaINSS + alioquotaIRRF) / 100);
    }

    private double calularAliquotaINSS(double salario) {
        for (TipoDesconto tipo : TipoDesconto.values()) {
            if (tipo.name().startsWith("INSS")) {
                if (salario < tipo.getLimiteEnquadramento()) {
                    return tipo.getAliquota();
                }
            }
        }
        return 0;
    }

    private double calularAliquotaIRRF(double salario) {
        if (salario > TipoDesconto.IRRF_A.getLimiteEnquadramento()){
            for (TipoDesconto tipo : TipoDesconto.values()) {
                if (tipo.name().startsWith("IRRF")) {
                    if (salario < tipo.getLimiteEnquadramento()) {
                        return tipo.getAliquota();
                    }
                }
            }
        }
        return 0;
    }
}
