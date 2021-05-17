package br.com.qm.oo.fornecedor;

public abstract class Pessoa {

	//2. Crie uma Classe Pessoa, contendo os atributos encapsulados, com seus 
	//respectivos seletores (getters) e modificadores (setters). Atributos: String nome; String endereço; String telefone;

	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
