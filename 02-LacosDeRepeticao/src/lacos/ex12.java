package lacos;
import java.util.Scanner;


public class ex12 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		
		int vetor[][] = new int[3][3];
		
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf ("Vetor[%d][%d]: ", i, j);
				vetor[i][j] = input.nextInt();
			}
			
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j || i + j == 2) {
					System.out.printf("%d\t", vetor[i][j]);		
					
				} else {
					System.out.print("X\t");
				}
				
			}
			System.out.println();
			
		}
		
		input.close();

	}

}
