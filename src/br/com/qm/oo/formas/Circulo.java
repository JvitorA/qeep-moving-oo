package br.com.qm.oo.formas;

public class Circulo extends FormaGeometrica {

	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public void calculaArea() {
		System.out.println("-- Calculando a área do Circulo --");
		super.setArea(Math.PI * Math.pow(raio, 2));
	}
	
}
