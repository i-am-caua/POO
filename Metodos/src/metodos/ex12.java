package metodos;
import java.util.Scanner;

class Util11{
	static boolean Ehsimetrica (int num[][]) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (num[i][j] != num[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
}

public class ex12{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores [][] = new int [3] [3];
		System.out.println("Digite os valores:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				valores[i][j] = input.nextInt();
			}
		}
		
		System.out.printf("A matriz %sé simétrica",Util11.Ehsimetrica(valores) ? "" : "não ");
		
		
		input.close();
	}
}
