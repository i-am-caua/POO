package metodos;
import java.util.Scanner;

class Util2{
	static boolean Ehprimo (int num) {
		if (num == 2) return true;
		int primo = 0;
		
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				primo++;
			}
		}
		if (primo > 1) {
			return false;
		}
		return true;
	}
}

public class ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o num:");
		int num = input.nextInt();
		
		System.out.printf("O número %d %sé primo",num , Util2.Ehprimo(num) ? "" : "não ");
		
		input.close();
	}
}