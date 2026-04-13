package encapsulamento;

public class Sensor {
    private String tipo;
    private double valorAtual;
    private double limiteMaximo;

    public String verificarAlerta() {
        if (valorAtual > limiteMaximo) {
            return "ALERTA: O valor atual (" + valorAtual + ") ultrapassou o limite máximo (" + limiteMaximo + ")!";
        }
        return "Normal";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo;
        }
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double novoValor) {
        if (novoValor >= 0) {
            this.valorAtual = novoValor;
        }
    }

    public double getLimiteMaximo() {
        return limiteMaximo;
    }

    public void setLimiteMaximo(double limiteMaximo) {
        if (limiteMaximo >= 0) {
            this.limiteMaximo = limiteMaximo;
        }
    }

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.setTipo("Temperatura");
        sensor.setLimiteMaximo(30);
        sensor.setValorAtual(25);
        System.out.println("Sensor: " + sensor.getTipo());
        System.out.println(sensor.verificarAlerta());
        sensor.setValorAtual(35);
        System.out.println(sensor.verificarAlerta());
    }
}
