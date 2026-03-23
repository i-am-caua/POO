package metodos;
import java.util.Scanner;

class Util5{
	static int Maior (int num[]) {
		int maior = num[0];
		for (int n : num) {
			if (n > maior) {
				maior = n;
			}
		}
		return maior;
	}	
}

public class ex6{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores [] = new int [5];
		System.out.println("Digite os valores:");
		for (int i = 0; i < 5; i++) {
			valores[i] = input.nextInt();
		}

		System.out.printf("Maior: %d",Util5.Maior(valores));
		
		input.close();
	}
}