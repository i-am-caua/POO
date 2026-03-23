package lacos;
import java.util.Scanner;


public class ex15 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int par = 0;
			
		int vetor[][] = new int[3][3];
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf ("Vetor[%d][%d]: ", i, j);
				vetor[i][j] = input.nextInt();
				if (vetor[i][j] % 2 == 0) {
					par++;
				}
				
			}
			
		}
		System.out.println("\nHa " + par + " pares");
		
		input.close();

	}

}
