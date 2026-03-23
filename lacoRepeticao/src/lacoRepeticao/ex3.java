package lacoRepeticao;
import java.util.Scanner;


public class ex3 {

	public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int valor = input.nextInt();
	
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(valor +" x " + i + " = " + valor * i);
		}
		

		input.close();

	}

}
