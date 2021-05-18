package br.com.qm.oo.elevador;

public class CargaElevadorException extends RuntimeException {

	private static final long serialVersionUID = -8349609603377935806L;

	private String mensagem;

	public CargaElevadorException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

}
