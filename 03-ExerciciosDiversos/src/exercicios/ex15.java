package exercicios;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor base: ");
		double valor = input.nextDouble();
		System.out.println("Digite o valor altura: ");
		double valor1 = input.nextDouble();
		
		
		System.out.printf("Area: %.2f", Math.sqrt(Math.pow(valor, 2) + Math.pow(valor1,2)));
		
		input.close();
	}

}
