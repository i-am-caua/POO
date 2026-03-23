package lacoRepeticao;
import java.util.Scanner;


public class ex4 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int soma = 0;
		
	
		
		for (int i = 1; i <= 5; i++) {
			int valor = input.nextInt();
			soma += valor;
			
		}
		System.out.println("\nMédia: " + soma / 5);
		

		input.close();

	}

}
