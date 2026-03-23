package lacos;
import java.util.Scanner;


public class ex11 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		
		int vetor[][] = new int[3][3];
		int soma = 0;
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf ("Vetor[%d][%d]: ", i, j);
				vetor[i][j] = input.nextInt();
				soma += vetor[i][j];
			}
			
		}
		System.out.println("Soma: " + soma);
		
		input.close();

	}

}
