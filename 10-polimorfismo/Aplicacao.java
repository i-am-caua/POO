public class Aplicacao {
    public static void main(String[] args) {
        PagamentoPix pix = new PagamentoPix(150.00, "Compra online", "joao@email.com");
        PagamentoCartao cartao = new PagamentoCartao(350.00, "Loja de eletronicos", "1234567890123456");
        PagamentoBoleto boleto = new PagamentoBoleto(89.90, "Assinatura mensal", "23793381286008371234567890123456789000001");

        Pagamento[] pagamentos = {pix, cartao, boleto};

        for (int i = 0; i < pagamentos.length; i++) {
            System.out.println("===== Pagamento " + (i + 1) + " =====");
            pagamentos[i].exibirDados();
            pagamentos[i].processarPagamento();
            System.out.println();
        }
    }
}
