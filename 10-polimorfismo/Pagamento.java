public class Pagamento {
    private double valor;
    private String descricao;

    public Pagamento(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirDados() {
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento...");
    }
}
