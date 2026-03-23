package lacoRepeticao;
import java.util.Scanner;


public class ex8 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		
		int vetor[] = new int[5];
		int maior = -9999, menor = 99999;
		
		for (int i = 0; i < 5; i++) {
			vetor[i] = input.nextInt();
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.printf ("Maior: %d\n\nMenor: %d", maior, menor);
		
		
		
		input.close();

	}

}