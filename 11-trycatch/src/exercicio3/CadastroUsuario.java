package exercicio3;

public class CadastroUsuario {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException(
                "Idade invalida: " + idade + " anos. O usuario deve ter pelo menos 18 anos para se cadastrar."
            );
        }
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cadastro realizado com sucesso!\n" +
               "  Nome: " + nome + "\n" +
               "  Idade: " + idade + " anos";
    }
}
