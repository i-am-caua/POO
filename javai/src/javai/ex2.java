package javai;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int valor = input.nextInt();
		if (valor < 0) {
			System.out.printf("%d é um número NEGATIVO.", valor);
		} else {
			System.out.printf("%d é um número POSITIVO.", valor);
		}
		
		
		input.close();
	}

}
