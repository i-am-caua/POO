package lacos;
import java.util.Scanner;


public class ex1 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int valor = input.nextInt();
		
		for (int i = 0; i < valor; i++) {
			System.out.printf("%d ", i + 1);
		}
		
	
		input.close();

	}

}
