package javai;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int valor = input.nextInt();
		if (valor > 18) {
			System.out.println("Maior de idade.");
		} else {
			System.out.println("Menor de idade.");
		}
		
		
		
	
		
		input.close();
	}

}
