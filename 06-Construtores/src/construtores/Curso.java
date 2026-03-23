package construtores;


public class Curso {
	String nome;
	int cargaHoraria;
	String areaConhecimento;
	String nomeProfessor;
	
	public Curso (String nome, int cargaHoraria, String areaConhecimento, String nomeProfessor ) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.areaConhecimento = areaConhecimento;
		this.nomeProfessor = nomeProfessor;
	}
	public Curso (String nome, int cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}
	void exibirDetalhes() {
		System.out.println("======");
		System.out.printf ("Nome do curso: %s\nCarga Horária: %d\nÁrea de conhecimento: %s\nNome do Professor: %s\n",nome, cargaHoraria, areaConhecimento, nomeProfessor);
	}
public static void main(String[] args) {
		Curso cursoBcc = new Curso ("BCC", 1000, "TI", "Marcos");
		cursoBcc.exibirDetalhes();
		
	}

}
