package br.com.qm.oo.empresa;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private double horasSemanais;

	public Funcionario(String nome, String cpf, double salario, double horasSemanais) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.horasSemanais = horasSemanais;
	}
	
	public void aumentaSalario() {
		this.salario = this.salario * 1.3;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getHorasSemanais() {
		return horasSemanais;
	}

	public void setHorasSemanais(double horasSemanais) {
		this.horasSemanais = horasSemanais;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
}
