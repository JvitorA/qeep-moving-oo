package br.com.qm.oo.televisao;

public class Televisao {

	// 4. Crie uma classe Televisao e uma classe ControleRemoto que pode 
	//controlar o volume e trocar os canais da televisão. 
	//O controle de volume permite:
	//aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
	//aumentar e diminuir o número do canal em uma unidade;
	//trocar para um canal indicado;
	//consultar o valor do volume de som e o canal selecionado;

	//Crie depois um programa principal que interaja com as suas classes, 
	//não se esqueça dos modificadores de acesso e dos getters e setters em suas
	//classes.
	private int canalAtual;
	private int volumeAtual;
	
	public Televisao(int canalAtual, int volumeAtual) {
		this.canalAtual = canalAtual;
		this.volumeAtual = volumeAtual;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public int getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual = volumeAtual;
	}
	
}
