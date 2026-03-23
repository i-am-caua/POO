package lacos;
import java.util.Scanner;


public class ex5 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int valor = input.nextInt();
		int total = 0;
		
		
		
		for (int i = 1; i <= valor; i++) {
			if (valor % i == 0) {
				total++;
			}
		}
		if (total == 2) {
			System.out.println("Eh primo");
		} else {
			System.out.println("Nao eh primo");
		}
		
		

		input.close();

	}

}
