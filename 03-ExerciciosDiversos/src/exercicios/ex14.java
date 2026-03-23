package exercicios;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor base: ");
		int valor = input.nextInt();
		
		
		System.out.printf("%d : %d", valor / 60, valor % 60);
		
		input.close();
	}

}
