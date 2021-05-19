package br.com.qm.oo.universidade;

public class UniversidadeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5170646375483206454L;
	
	private String mensagem;

	public UniversidadeException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
