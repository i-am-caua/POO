package metodos;
import java.util.Scanner;

class Util4{
	static double media (double num[]) {
		double soma = 0;
		for (double n : num) {
			soma += n;
		}
		return soma / 5;
	}	
}

public class ex5{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valores [] = new double [5];
		System.out.println("Digite os valores:");
		for (int i = 0; i < 5; i++) {
			valores[i] = input.nextDouble();
		}

		System.out.printf("Soma: %.2f",Util4.media(valores));
		
		input.close();
	}
}