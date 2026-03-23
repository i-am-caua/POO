package metodos;
import java.util.Scanner;

class Util3{
	static int soma (int num[]) {
		int soma = 0;
		for (int n : num) {
			soma += n;
		}
		return soma;
	}	
}

public class ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores [] = new int [4];
		System.out.println("Digite os valores:");
		for (int i = 0; i < 4; i++) {
			valores[i] = input.nextInt();
		}

		System.out.printf("Soma: %d",Util3.soma(valores));
		
		input.close();
	}
}