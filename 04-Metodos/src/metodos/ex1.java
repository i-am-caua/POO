package metodos;
import java.util.Scanner;

class Util {
	static boolean Ehpar (int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
}

public class ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o num:");
		int num = input.nextInt();
		
		System.out.printf("Eh %s", Util.Ehpar(num) ? "par" : "impar");
		
		
		input.close();
	}

}
