package br.com.qm.oo.formas;

public abstract class FormaGeometrica {
	
	//2. Faça um programa que calcule a área de uma figura geométrica. 
	// Aceite quatro tipos de figura geométrica: quadrado, retângulo, 
	// triângulo e círculo. 
	// Use herança, classe abstrata e polimorfismo.
	private double area;

	public FormaGeometrica() {
	}
	
	public abstract void calculaArea();

	public double getArea() {
		return area;
	}

	protected void setArea(double area) {
		this.area = area;
	}
}
