package metodos;
import java.util.Scanner;

class Util10{
	static void MultiEscalar (int num[][], int n) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d\t", num[i][j] * n);
			}
			System.out.println();
		}
	}	
}

public class ex11{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores [][] = new int [3] [3];
		System.out.println("Digite os valores:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				valores[i][j] = input.nextInt();
			}
		}
		System.out.println("Digite o num para multiplicar a matriza:");
		int n = input.nextInt();
		
		Util10.MultiEscalar(valores, n);
		
		
		input.close();
	}
}