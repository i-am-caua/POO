package classes_objetos;

public class Livro {
	String titulo;
	String autor;
	int anoPublicacao;
	String editora;
	
	void exibirDetalhes () {
		System.out.printf("Titulo: %s\nAutor: %s\nAno publicado: %d\nEditora: %s\n\n", titulo, autor, anoPublicacao, editora);
	}
	void emprestar () {
		System.out.println("O livro " + titulo + " foi emprestado.");	
	}
	void devolver () {
		System.out.println("O livro " + titulo + " foi devolvido.");	
	}

	public static void main(String[] args) {
		
		Livro livroTeste = new Livro();
		livroTeste.titulo = "Hobbit";
		livroTeste.autor = "Zé ninguem";
		livroTeste.anoPublicacao = 1000;
		livroTeste.editora = "Edition Zé ninguem";
		livroTeste.exibirDetalhes();
		livroTeste.emprestar();
		livroTeste.devolver();
	}

}
