package classes_objetos;

public class ContaBancaria {
	int numero;
	String titular;
	double saldo;
	String tipo;
	void consultarSaldo () {
		System.out.println("Seu saldo é: " + saldo);
	}
	void depositar(double valor) {
		System.out.println("O valor " + valor + " foi depositado");
		saldo += valor;
	}
	void sacar(double valor) {
		if (saldo > 0) {
			System.out.println("O valor " + valor + " foi sacado");
			saldo -= valor;
		} else if (valor > saldo) {
			System.out.println("Saldo menor que o saque.");
		} else {
			System.out.println("Conta Zerada ");
		}
	}

	public static void main(String[] args) {
		
        ContaBancaria contaTeste = new ContaBancaria();
   
        contaTeste.numero =1000;
        contaTeste.titular = "Zezin";
        contaTeste.saldo = 1000000000000000000000.0;
        contaTeste.tipo = "Master master master gold ultra blaster";
        
        
        contaTeste.consultarSaldo();
        contaTeste.depositar(10000.0);
        contaTeste.sacar(10000.0);
        contaTeste.consultarSaldo();
	}

}
