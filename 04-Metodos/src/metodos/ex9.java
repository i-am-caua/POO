package metodos;
import java.util.Scanner;

class Util8{
	static void SomaMatriz (int num[][]) {
		int soma = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				soma += num[i][j];
			}
		}
		System.out.println("Soma total:" + soma);
	}	
}

public class ex9{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores [][] = new int [3] [3];
		System.out.println("Digite os valores:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				valores[i][j] = input.nextInt();
			}
		}
		
		Util8.SomaMatriz(valores);
		
		
		input.close();
	}
}