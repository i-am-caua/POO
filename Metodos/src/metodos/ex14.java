package metodos;
import java.util.Scanner;

class Util13{
	static double FparaC (int num) {
		return (num * 1.8) + 32;
	}
}

public class ex14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o num 1:");
		int num = input.nextInt();
		
		
		System.out.printf("Temperatura em Fahrenheit: %.1f", Util13.FparaC(num));
		
		input.close();
	}
}