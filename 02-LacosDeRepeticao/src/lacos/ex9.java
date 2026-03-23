package lacos;
import java.util.Scanner;


public class ex9 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		
		int vetor[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			vetor[i] = input.nextInt();
		}
		
		System.out.print("[");
		for (int i = 4; i >= 0; i--) {
			System.out.printf("%d%c ", vetor[i], i == 0 ? ']' : ',');
		}
		
		input.close();

	}

}
