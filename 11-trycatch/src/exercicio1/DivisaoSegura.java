package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        while (!sucesso) {
            try {
                System.out.print("Digite o primeiro numero (dividendo): ");
                int dividendo = scanner.nextInt();

                System.out.print("Digite o segundo numero (divisor): ");
                int divisor = scanner.nextInt();

                int resultado = dividendo / divisor;

                System.out.println("Resultado da divisao: " + dividendo + " / " + divisor + " = " + resultado);
                sucesso = true;

            } catch (ArithmeticException e) {
                System.out.println("\nErro: Divisao por zero nao e permitida!");
                System.out.println("Detalhes: " + e.getMessage());
                System.out.println("Por favor, tente novamente com um divisor diferente de zero.\n");
                scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("\nErro: Voce deve digitar apenas numeros inteiros!");
                System.out.println("Por favor, tente novamente.\n");
                scanner.nextLine();

            } finally {
                if (sucesso) {
                    System.out.println("\nOperacao finalizada com sucesso!");
                } else {
                    System.out.println("Tentando novamente...\n");
                }
            }
        }

        scanner.close();
    }
}
