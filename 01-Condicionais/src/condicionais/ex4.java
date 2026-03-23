package condicionais;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		double valor = input.nextDouble();
		
		if (valor < 100) {
			System.out.printf("Desconto: 5%%\nPreço final: R$ %.2f", valor * 0.95);
		} else if (valor <= 500){
			System.out.printf("Desconto: 10%%\nPreço final: R$ %.2f", valor * 0.90);
		} else {
			System.out.printf("Desconto: 15%%\nPreço final: R$ %.2f", valor * 0.85);
		}
		

		input.close();
	}

}
