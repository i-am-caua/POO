package encapsulamento;

public class Aluno {
    private String nome;
    private String matricula;
    private double media;

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao());
    }

    public String situacao() {
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.trim().isEmpty()) {
            this.matricula = matricula;
        }
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if (media >= 0 && media <= 10) {
            this.media = media;
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João Silva");
        aluno.setMatricula("2025001");
        aluno.setMedia(7.5);
        aluno.exibirInformacoes();
    }
}
