package lacos;
import java.util.Scanner;


public class ex7 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		
		int vetor[] = new int[100];
		int soma = 0;
		int i = 0;
		vetor[i] = 0;
		
		
		
		while (vetor[i] != -1) {
			soma += vetor[i];
			vetor[++i] = input.nextInt();
			
		}
		System.out.println("Soma: " + soma);
			

		input.close();

	}

}
