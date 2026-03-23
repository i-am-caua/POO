package metodos;
import java.util.Scanner;

class Util1{
	static int fat (int num) {
		int fat = 1;
		for (int i = num; i > 0; i--) {
			fat *= i;
		}
		return fat;
	}
}

public class ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o num:");
		int num = input.nextInt();
		
		System.out.printf("Fat de %d: %d",num , Util1.fat(num));
		
		input.close();
	}}