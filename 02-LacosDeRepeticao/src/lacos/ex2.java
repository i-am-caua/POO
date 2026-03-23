package lacos;
import java.util.Scanner;


public class ex2 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int valor = input.nextInt();
		int soma = 0;
		
		for (int i = 1; i <= valor; i++) {
			System.out.printf("%d %c ", i, i == valor ? '=' : '+' );
			soma += i;
		}
		System.out.println(soma);
		
		
	
		input.close();

	}

}
