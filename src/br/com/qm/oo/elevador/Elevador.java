package br.com.qm.oo.elevador;

public class Elevador {
	
	//3. Crie uma classe denominada Elevador para armazenar as informações
	//  de um elevador dentro de um prédio. A classe deve armazenar o 
	//  andar atual (térreo = 0), total de andares no prédio 
	//  (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele.
	//  A classe deve também disponibilizar os seguintes métodos:
	//	Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
	//	Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
	//	Sobe : para subir um andar (não deve subir se já estiver no último andar);
	//	Desce : para descer um andar (não deve descer se já estiver no térreo);
	//	Crie um programa principal capaz de interagir com seu Elevador.
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int qtdPessoas;
	
	
	public Elevador(int totalAndares, int capacidade) {
		this.andarAtual = 0;
		this.qtdPessoas = 0;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}
	
	public void entra() {
		if (qtdPessoas < capacidade) {
			qtdPessoas++;
		}
	}
	
	public void sai() {
		if (qtdPessoas > 0) {
			qtdPessoas--;
		}
	}
	
	public void sobe() {
		if (andarAtual < totalAndares) {
			andarAtual++;
		}
	}
	
	public void desce() {
		if (andarAtual > 0) {
			andarAtual--;
		}
	}
	
	public void status() {
		System.out.println("----------");
		System.out.printf("\nO elevador está no andar: %d\n", this.andarAtual);
		System.out.printf("\n Há %d pessoas no elevador.\n", this.qtdPessoas);
		System.out.println("----------");
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}
	
	

}
