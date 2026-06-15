package exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidadorEmail validador = new ValidadorEmail();

        try {
            System.out.print("Digite seu endereco de e-mail: ");
            String email = scanner.nextLine();

            validador.validar(email);

            System.out.println("\nE-mail \"" + email + "\" validado com sucesso!");

        } catch (EmailInvalidoException e) {
            System.out.println("\nE-mail invalido: " + e.getMessage());
            System.out.println("Por favor, informe um e-mail valido contendo '@' e terminando com \".com\".");

        } finally {
            System.out.println("\nProcesso de validacao finalizado.");
            scanner.close();
        }
    }
}
