package br.com.qm.oo.fornecedor;

public class Empregado extends Pessoa {

	
	// Considere, como outra subclasse da classe Pessoa, a classe Empregado. 
	// Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a 
	// classe Pessoa, os atributos codigoSetor(inteiro), salarioBase(vencimento base) e 
	// imposto(porcentagem retida dos impostos).
	// Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario.
	// Escreva um programa de teste adequado para a classe Empregado.
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	
	public double calcularSalario() {
		return this.salarioBase - (this.salarioBase * (this.imposto / 100));
	}
	
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
}
