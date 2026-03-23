package metodos;
import java.util.Scanner;

class Util7{
	static void diagonalPricipal (int num[][]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					System.out.print(num[i][j] + "\t");
				} else {
					System.out.print( "X\t");
				}
			}
			System.out.println();
		}
	
	}	
}

public class ex8{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores [][] = new int [3] [3];
		System.out.println("Digite os valores:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				valores[i][j] = input.nextInt();
			}
		}
		
		Util7.diagonalPricipal(valores);
		
		
		input.close();
	}
}