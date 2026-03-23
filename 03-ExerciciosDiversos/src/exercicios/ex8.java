package exercicios;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor de R: ");
		double valor = input.nextDouble();
		double pi = 3.14159;
		
		System.out.printf("Area: %.2f", pi * Math.pow(valor, 2));
		
		input.close();
		
	}

}
