package encapsulamento;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo != null && !cargo.trim().isEmpty()) {
            this.cargo = cargo;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setNome("Carlos");
        func.setCargo("Desenvolvedor");
        func.setSalario(3000);
        System.out.println("Salário: R$ " + func.getSalario());
        func.aumentarSalario(10);
        System.out.println("Salário após aumento: R$ " + func.getSalario());
    }
}
