package pagamento;

public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;

    public PagamentoBoleto(double valor, String descricao, String codigoBarras) {
        super(valor, descricao);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Boleto gerado com sucesso!");
        System.out.println("Codigo de Barras: " + codigoBarras);
    }
}
