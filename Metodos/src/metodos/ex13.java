package metodos;
import java.util.Scanner;

class Util12{
	static int produto (int num, int num1) {
		int produto = 0;
		for (int i = 0; i < num1; i++) {
			produto += num;
		}
		return produto;
	}
}

public class ex13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o num 1:");
		int num = input.nextInt();
		System.out.println("Digite o num 2:");
		int num1 = input.nextInt();
		
		System.out.printf("Produto: %d", Util12.produto(num, num1));
		
		input.close();
	}
}