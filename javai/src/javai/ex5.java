package javai;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		double valor = input.nextDouble();
		
		if (valor % 400 == 0 || ((valor % 4 == 0) && (valor % 100 != 0))) {
			System.out.println("Ano bissesxto");
		} else {
			System.out.println("Ano normal");
		}
		

		input.close();
	}

}
