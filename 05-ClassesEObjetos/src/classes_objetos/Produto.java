package classes_objetos;

public class Produto {
	String nome;
	double preco;
	int codigo;
	int estoque;
	void exibir () {
		System.out.printf("---Detalhes---\nNome: %s\nPreço: %.2f\nCodigo: %d\nEstoque: %d", nome, preco, codigo, estoque);
	}
	void aplicarDesconto(double porcetagem) {
		preco = preco - (preco * porcetagem / 100);
	}
	void reporEstoque (int quantidade) {
		estoque += quantidade;
	}

	public static void main(String[] args) {
		
        Produto p1 = new Produto();
   
        p1.nome = "Pc Da Xina";
        p1.preco = 1200.00;
        p1.codigo = 5544;
        p1.estoque = 5;

        System.out.println("Estado Inicial:\n");
        p1.exibir();

        
        p1.aplicarDesconto(10.0);
        p1.reporEstoque(7);      

        System.out.println("\n\nApós alterações:\n");
        p1.exibir();
	}

}
