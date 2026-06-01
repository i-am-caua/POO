package pagamento;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String descricao, String chavePix) {
        super(valor, descricao);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Pix realizado!");
        System.out.println("Chave Pix: " + chavePix);
    }
}
