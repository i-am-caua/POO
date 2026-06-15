package exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroUsuario usuario = new CadastroUsuario();

        try {
            System.out.print("Digite o nome do usuario: ");
            String nome = scanner.nextLine();
            usuario.setNome(nome);

            System.out.print("Digite a idade do usuario: ");
            int idade = Integer.parseInt(scanner.nextLine());
            usuario.setIdade(idade);

            System.out.println("\n" + usuario);

        } catch (IdadeInvalidaException e) {
            System.out.println("\nErro no cadastro: " + e.getMessage());
            System.out.println("Somente maiores de 18 anos podem se cadastrar.");

        } catch (NumberFormatException e) {
            System.out.println("\nErro: A idade deve ser um numero inteiro valido!");

        } finally {
            System.out.println("\nProcesso de cadastro finalizado.");
            scanner.close();
        }
    }
}
