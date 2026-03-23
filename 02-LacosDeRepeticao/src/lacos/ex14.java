package lacos;
import java.util.Scanner;


public class ex14 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor escalar: ");
		int n = input.nextInt();		
		int vetor[][] = new int[3][3];
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf ("Vetor[%d][%d]: ", i, j);
				vetor[i][j] = input.nextInt();
				vetor [i][j] *= n;
			}
			
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.printf("%d\t", vetor[i][j]);		
				
			}
			System.out.println();
			
		}
		
		input.close();

	}

}
