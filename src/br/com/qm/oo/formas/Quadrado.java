package br.com.qm.oo.formas;

public class Quadrado extends FormaGeometrica {

	private double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	public void dizQueSouQuadrado() {
		System.out.println("Sou um quadrado!");
	}

	@Override
	public void calculaArea() {
		System.out.println("-- Calculando a área do Quadrado --");
		super.setArea(this.lado * this.lado);
	}

}
