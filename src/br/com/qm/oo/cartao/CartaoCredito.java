package br.com.qm.oo.cartao;

public class CartaoCredito {

	// Crie uma classe que represente um cartão de crédito, 
	// que deve ter como atributos o seu limite, o saldo da fatura e 
	// nome do cliente. Crie também os métodos aumentaLimite(), diminuiLimite(), 
	// realizaCompra() que não deve permitir uma compra caso o limite tenha sido 
	// atingido e o imprimeFatura() que imprime na tela o valor da fatura.
	// Crie um programa principal capaz de executar as operações do cartão de crédito.
	float limite;
	float saldo;
	String nomeCliente;
	
	public CartaoCredito(float limite, String nomeCliente) {
		this.limite = limite;
		this.saldo = 0;
		this.nomeCliente = nomeCliente;
	}
	
	
	// Acrescentar valor ao limite atual
	public void aumentaLimite(float valorAcrescido) {
		if (valorAcrescido > 0) {
			this.limite += valorAcrescido;
		}
	}
	
	public void diminuiLimite(float valorDecrescido) {
		if (valorDecrescido > 0 && valorDecrescido <= this.limite) {
			this.limite -= valorDecrescido;
		}
	}
	
	public void realizaCompra(float valorCompra) {
		
		float novoSaldo = this.saldo + valorCompra;
		if (novoSaldo <= this.limite) {
			this.saldo = novoSaldo;
		}
		
	}
	
	public void imprimeFatura() {
		System.out.println("--------");
		System.out.printf("\n%s\n", this.nomeCliente);
		System.out.printf("\nO seu limite é: %.2f\n", this.limite);
		System.out.printf("\nVocê já gastou %.2f\n", this.saldo);
		System.out.printf("\nVocê ainda pode gastar: %.2f\n", this.limite - this.saldo);
		System.out.println("--------");
	}
	
}
