package lacoRepeticao;
import java.util.Scanner;


public class ex6 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		
		int vetor[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
			
		}
		
		System.out.print("Vetor: [");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d%c ", vetor[i], i == 9 ? ']' : ',');
		}
		
		
		input.close();

	}

}