package ClasseEObj;

public class Aluno {
	String nome;
	int matricula;
	String curso;
	int anoEntrada;
	void mostrarDados () {
		System.out.printf("---Dados---\nNome: %s\nMatricula: %d\nCurso: %s\nAno de Entrada: %d", nome, matricula, curso, anoEntrada);
	}
	void trancarMatricula() {
		System.out.println("A matricula: " + matricula + "foi trancada");
	}
	void reativarMatricula() {
		System.out.println("A matricula: " + matricula + "foi reativada");
	}

	public static void main(String[] args) {
		
        Aluno aluno1 = new Aluno();
   
        aluno1.nome = "Zezin";
        aluno1.matricula = 1200;
        aluno1.curso = "BCC";
        aluno1.anoEntrada = 2005;

        
        aluno1.mostrarDados();

	}

}
