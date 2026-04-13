package encapsulamento;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void vender(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        }
    }

    public void reporEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(2500.00);
        produto.setQuantidade(10);
        System.out.println("Produto: " + produto.getNome() + " - R$ " + produto.getPreco());
        produto.vender(3);
        System.out.println("Quantidade em estoque: " + produto.getQuantidade());
    }
}
