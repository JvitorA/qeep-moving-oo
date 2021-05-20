package br.com.qm.oo.estacionamento;

import java.util.HashMap;
import java.util.Map;

public class Estacionamento {

	// 4. Modele a classe Estacionamento com
	// os atributos
	// valorEmCaixa
	// capacidadeMaxima
	// Crie um map para armazenar os carros dentro do estacionamento onde a chave é
	// a
	// placa e o valor é um objeto do tipo Carro.
	// os métodos
	// registraEntrada(carro) - adiciona um carro no estacionamento
	// registraSaida(placa, valorEstadia) - remove um carro do estacionamento e
	// registrando o valor da estadia.
	// imprimeSaldo() - mostra na tela do valor em caixa
	// carroPresente(placa) - mostra na tela se um carro está dentro do
	// estacionamento
	private double valorEmCaixa;
	private int capacidadeMaxima;
	private Map<String, Carro> carrosEstacionados;

	public Estacionamento(double valorEmCaixa, int capacidadeMaxima) {
		this.valorEmCaixa = valorEmCaixa;
		this.capacidadeMaxima = capacidadeMaxima;
		this.carrosEstacionados = new HashMap<String, Carro>();
	}

	public void registraEntrada(Carro carro) {

		if (this.carrosEstacionados.size() >= this.capacidadeMaxima) {
			// jogar uma exceção: Estacionamento cheio
			return;
		}

		if (this.carroPresente(carro.getPlaca())) {
			// jogar uma exceção: Carro já presente;
			return;
		}

		this.carrosEstacionados.put(carro.getPlaca().toUpperCase(), carro);

	}

	public void registraSaida(String placa, double valorEstadia) {

		if (!this.carroPresente(placa)) {
			// jogar uma exceção: carro não se encontra no estacionamento.
			return;
		}
		
		this.carrosEstacionados.remove(placa.toUpperCase());
		this.valorEmCaixa += valorEstadia;

	}

	public void imprimeSaldo() {
		System.out.printf("\n Valor em caixa: %.2f\n", this.valorEmCaixa);
	}

	public boolean carroPresente(String placa) {

		return this.carrosEstacionados.get(placa.toUpperCase()) != null;

	}

}
