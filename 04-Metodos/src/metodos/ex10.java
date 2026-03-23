package metodos;
import java.util.Scanner;

class Util9{
	static void SomaMatriz (int num[][]) {
		int par = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (num [i][j] % 2 == 0) {
					par++;
				}
			}
		}
		System.out.println("Quantidade de números pares:" + par);
	}	
}

public class ex10{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores [][] = new int [3] [3];
		System.out.println("Digite os valores:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				valores[i][j] = input.nextInt();
			}
		}
		
		Util9.SomaMatriz(valores);
		
		
		input.close();
	}
}