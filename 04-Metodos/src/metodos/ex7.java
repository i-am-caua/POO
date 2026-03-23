package metodos;
import java.util.Scanner;

class Util6{
	static void inverte (int num[]) {
		System.out.printf("[");

		for (int i = num.length - 1; i >= 0; i--) {
			System.out.printf("%d%c", num[i], i == 0 ? ']' : ',');
			
		}
		
		
	}	
}

public class ex7{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores [] = new int [5];
		System.out.println("Digite os valores:");
		for (int i = 0; i < 5; i++) {
			valores[i] = input.nextInt();
		}
		
		Util6.inverte(valores);
		
		input.close();
	}
}