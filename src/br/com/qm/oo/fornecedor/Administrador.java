package br.com.qm.oo.fornecedor;

public class Administrador extends Empregado {

	// Implemente a classe Administrador como subclasse da classe Empregado. 
	// Um determinado administrador tem como atributos, para além dos atributos da classe 
	// Pessoa e da classe Empregado, o atributo ajudaDeCusto (ajudas referentes a viagens, estadias, ...). 
	// Note que deverá redefinir na classe Administrador o método herdado calcularSalario 
	// (o salário de um administrador é equivalente ao salário de um empregado usual acrescido das ajudas de custo).
	// Escreva um programa de teste adequado para esta classe.
	private double ajudaDeCusto;

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + this.ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
