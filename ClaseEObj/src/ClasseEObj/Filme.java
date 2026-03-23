package ClasseEObj;

public class Filme {
	String titulo;
	int duracao;
	String genero;
	String classificacao;
	void exibirInformacoes () {
		System.out.printf("---Dados---\nNome: %s\nDuração: %d\nGenero: %s\nClassificação: %s\n", titulo, duracao, genero, classificacao);
	}
	void avaliar(double avaliacao) {
		System.out.println("O filme " + titulo + " foi avaliado em " + avaliacao);
	}
	void reproduzir() {
		System.out.println("Reproduzindo o filme " + titulo);
	}

	public static void main(String[] args) {
		
        Filme filme1 = new Filme();
   
        filme1.titulo = "Do Zezin";
        filme1.duracao = 1200;
        filme1.genero = "Bla bla";
        filme1.classificacao = "Melhor do mundo";
        
        
        filme1.exibirInformacoes();
        filme1.avaliar(10.0);
        filme1.reproduzir();

	}

}
