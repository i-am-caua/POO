package Funcionarios;

public class Estagiario extends Funcionario {
    private int horasTrabalhadas;

    public Estagiario(String nome, String cpf, int horasTrabalhadas) {
        super(nome, cpf, 0);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabalhadas * 20;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Estagiario: ");
        super.exibirDados();
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
    }
}
