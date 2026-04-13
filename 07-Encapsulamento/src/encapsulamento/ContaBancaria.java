package encapsulamento;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero != null && !numero.trim().isEmpty()) {
            this.numero = numero;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumero("12345");
        conta.setTitular("Maria Santos");
        conta.depositar(1000);
        System.out.println("Saldo: " + conta.getSaldo());
        conta.sacar(200);
        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}
