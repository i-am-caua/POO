package Funcionarios;

public class Main {
    public static void main(String[] args) {

        Funcionario func = new Funcionario("João Silva", "111.222.333-44", 2000.0);
        Gerente ger = new Gerente("Maria Souza", "555.666.777-88", 5000.0, 1500.0);
        Desenvolvedor dev = new Desenvolvedor("Carlos Lima", "999.888.777-66", 4000.0, "Pleno");
        Estagiario est = new Estagiario("Ana Costa", "444.333.222-11", 100);

        System.out.println("FUNCIONÁRIOS\n");

        func.exibirDados();
        System.out.println();

        ger.exibirDados();
        System.out.println();

        dev.exibirDados();
        System.out.println();

        est.exibirDados();
       
    }
}