package javai;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int valor = input.nextInt();
		
		
		
		System.out.printf("%s", valor % 2 == 0 ? "eh par" : "nao eh par");
		
		input.close();
	}

}
