package exercicio4;

public class ValidadorEmail {

    public void validar(String email) throws EmailInvalidoException {
        if (email == null || email.trim().isEmpty()) {
            throw new EmailInvalidoException("O e-mail nao pode estar vazio.");
        }

        if (!email.contains("@")) {
            throw new EmailInvalidoException(
                "O e-mail \"" + email + "\" e invalido: deve conter o caractere '@'."
            );
        }

        if (!email.endsWith(".com")) {
            throw new EmailInvalidoException(
                "O e-mail \"" + email + "\" e invalido: deve terminar com \".com\"."
            );
        }
    }
}
