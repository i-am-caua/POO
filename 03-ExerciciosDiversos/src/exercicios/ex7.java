package exercicios;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		
		double valor = input.nextDouble();
		double sen = valor - (Math.pow(valor, 3)/ 6) + (Math.pow(valor, 5)/ 120) - (Math.pow(valor, 7)/ 5040);
		
		System.out.printf("Valor aproximado do seno: %f\n", sen);
		System.out.printf("Valor do seno: %f\n", Math.sin(valor));
		System.out.printf("Diferenca: %f", Math.sin(valor) - sen);
		input.close();
	}

}
