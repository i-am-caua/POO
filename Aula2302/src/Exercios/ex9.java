package Exercios;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor de C: ");
		double valor = input.nextDouble();
		
		System.out.printf("%.1f °F", 1.8 * valor + 32);
		input.close();
	}

}
