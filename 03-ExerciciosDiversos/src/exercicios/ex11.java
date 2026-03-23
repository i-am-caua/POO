package exercicios;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor de R: ");
		double valor = input.nextDouble();
		double pi = 3.14159;
		
		System.out.printf("Volume: %.2f", (4.0/3.0) *(pi * Math.pow(valor, 3)));
		
		input.close();
	}

}
