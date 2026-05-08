package Funcionarios;

public class Desenvolvedor extends Funcionario {
    private String nivel;

    public Desenvolvedor(String nome, String cpf, double salarioBase, String nivel) {
        super(nome, cpf, salarioBase);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + 500.0;
    }

    @Override
    public void exibirDados() {
        System.out.println("Desenvolvedor: ");
        super.exibirDados();
        System.out.println("Nível: " + nivel);
    }

}