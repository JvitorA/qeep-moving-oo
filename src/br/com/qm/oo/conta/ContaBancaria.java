package br.com.qm.oo.conta;

public class ContaBancaria {

	// 2. Crie uma classe referente à uma conta bancária, que possui como atributos 
	// o seu número, saldo e o nome do correntista. 
	// Crie também o método saque() que serve para retirar um certo valor do saldo,
	// o método depósito() que serve para adiconar um valor ao saldo e o método extrato() 
	// que serve para mostrar na tela o nome do correntista, o número da conta e o saldo. 
	// Crie um programa principal e demonstre a utilização dos métodos implementados.
	private int nroConta;
	private float saldo;
	private String nomeCorrentista;
	
	public ContaBancaria(int nroConta, String nomeCorrentista) {
		this.nroConta = nroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = 0;
	}
	
	public boolean saque(float valor) {
		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean deposito(float valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		
		return false;
	}
	
	public void extrato() {
		System.out.println("\n----------EXTRATO--------\n");
		System.out.printf("\nNro da conta: %d", this.nroConta);
		System.out.printf("\nCorrentista: %s", this.nomeCorrentista);
		System.out.printf("\nSaldo: %.2f", this.saldo);
	}
	
	
	
}
