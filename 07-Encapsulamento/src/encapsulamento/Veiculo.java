package encapsulamento;

public class Veiculo {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public void acelerar(double valor) {
        if (valor > 0) {
            this.velocidadeAtual += valor;
        }
    }

    public void frear(double valor) {
        if (valor > 0) {
            this.velocidadeAtual -= valor;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            }
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        }
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        if (velocidadeAtual >= 0) {
            this.velocidadeAtual = velocidadeAtual;
        }
    }

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Toyota");
        veiculo.setModelo("Corolla");
        System.out.println("Velocidade inicial: " + veiculo.getVelocidadeAtual());
        veiculo.acelerar(50);
        System.out.println("Após acelerar: " + veiculo.getVelocidadeAtual());
        veiculo.frear(20);
        System.out.println("Após frear: " + veiculo.getVelocidadeAtual());
    }
}
