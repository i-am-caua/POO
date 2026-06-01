package pagamento;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String descricao, String numeroCartao) {
        super(valor, descricao);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Cartao de Credito realizado!");
        System.out.println("Cartao: **** **** **** " + numeroCartao.substring(numeroCartao.length() - 4));
    }
}
