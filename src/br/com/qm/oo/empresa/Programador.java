package br.com.qm.oo.empresa;

public class Programador extends Funcionario {

	
	private String linguagem;
	private String especialidade;
	
	public Programador(String nome, String cpf, double salario, double horasSemanais, String linguagem,
			String especialidade) {
		super(nome, cpf, salario, horasSemanais);
		this.linguagem = linguagem;
		this.especialidade = especialidade;
	}
	
	@Override
	public void aumentaSalario() {
		if (this.linguagem == "Java") {
			super.setSalario(super.getSalario() * 1.5);
		} else {
			super.setSalario(super.getSalario() * 1.2);
		}
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
