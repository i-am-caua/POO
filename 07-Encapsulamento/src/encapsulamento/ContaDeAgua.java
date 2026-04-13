package encapsulamento;

public class ContaDeAgua {
    private double leituraAnterior;
    private double leituraAtual;

    public double calcularConsumo() {
        if (leituraAtual > leituraAnterior) {
            return leituraAtual - leituraAnterior;
        }
        return 0;
    }

    public double getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(double leituraAnterior) {
        if (leituraAnterior >= 0) {
            this.leituraAnterior = leituraAnterior;
        }
    }

    public double getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(double leituraAtual) {
        if (leituraAtual >= this.leituraAnterior) {
            this.leituraAtual = leituraAtual;
        }
    }

    public static void main(String[] args) {
        ContaDeAgua conta = new ContaDeAgua();
        conta.setLeituraAnterior(100);
        conta.setLeituraAtual(150);
        System.out.println("Consumo: " + conta.calcularConsumo() + " m³");
    }
}
