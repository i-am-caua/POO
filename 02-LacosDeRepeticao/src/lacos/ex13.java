package lacos;
import java.util.Scanner;


public class ex13 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		
		int vetor[][] = new int[3][3];
		boolean Simetrica = true;
		
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf ("Vetor[%d][%d]: ", i, j);
				vetor[i][j] = input.nextInt();
			}
			
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (vetor[i][j] != vetor[j][i]) {
					Simetrica = false;
					break;
				}
			}
		}
		if (Simetrica) {
			System.out.println("Eh simetrica");
		} else {
			System.out.println("Nao eh simetrica");
		}
		
		input.close();

	}

}
