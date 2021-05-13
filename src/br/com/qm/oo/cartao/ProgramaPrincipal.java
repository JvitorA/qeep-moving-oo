package br.com.qm.oo.cartao;

public class ProgramaPrincipal {

	
	public static void main(String[] args) {
		
		CartaoCredito cartao = new CartaoCredito(5000, "José");
		
		cartao.aumentaLimite(-500F);
		
		cartao.imprimeFatura();
		
		cartao.aumentaLimite(1000F);
		
		cartao.imprimeFatura();
		
		cartao.realizaCompra(3000);
		
		cartao.imprimeFatura();
		
		cartao.realizaCompra(3001);
		
		cartao.imprimeFatura();
	}
	
}
