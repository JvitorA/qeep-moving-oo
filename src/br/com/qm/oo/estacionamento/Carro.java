package br.com.qm.oo.estacionamento;

public class Carro {
	
	//3. Modele a classe Carro com
	//os atributos
	//placa
	//cor
	//marca
	//modelo
	private String placa;
	private String cor;
	private String marca;
	private String modelo;
	
	public Carro(String placa, String cor, String marca, String modelo) {
		this.placa = placa;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

}
