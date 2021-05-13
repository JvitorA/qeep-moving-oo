package br.com.qm.oo.televisao;

public class ControleRemoto {
	
	// 4. Crie uma classe Televisao e uma classe ControleRemoto que pode 
	//controlar o volume e trocar os canais da televisão. 
	//O controle de volume permite:
	//aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
	//aumentar e diminuir o número do canal em uma unidade;
	//trocar para um canal indicado;
	//consultar o valor do volume de som e o canal selecionado;
	private Televisao televisao;
	private int volumeMax;
	private int volumeMin;
	private int canalMax;
	private int canalMin;
	
	public ControleRemoto(int volumeMax, int volumeMin, int canalMax, int canalMin) {
		this.televisao = new Televisao(0, 0);
		this.volumeMax = volumeMax;
		this.volumeMin = volumeMin;
		this.canalMax = canalMax;
		this.canalMin = canalMin;
	}
	
	public void aumentaVolume() {
		
		int volumeAtual = this.televisao.getVolumeAtual();
		if (volumeAtual < this.volumeMax) {
			this.televisao.setVolumeAtual(volumeAtual + 1);
		}
		
	}
	
	public void diminuiVolume() {
		
		int volumeAtual = this.televisao.getVolumeAtual();
		if (volumeAtual > this.volumeMin) {
			this.televisao.setVolumeAtual(volumeAtual - 1);
		}
		
	}
	
	public void proximoCanal() {
		int canalAtual = this.televisao.getCanalAtual();
		if (canalAtual < this.canalMax) {
			this.televisao.setCanalAtual(canalAtual + 1);
		}
	}
	
	public void voltaCanal() {
		int canalAtual = this.televisao.getCanalAtual();
		if (canalAtual > this.canalMin) {
			this.televisao.setCanalAtual(canalAtual - 1);
		}
	}
	
	public void trocaCanal(int novoCanal) {
		
		if (novoCanal >= this.canalMin 
				&& novoCanal <= this.canalMax) {
			this.televisao.setCanalAtual(novoCanal);
		}
		
	}
	
	public void consultaTv() {
		System.out.println("---------");
		System.out.printf("\nCanal Atual: %d", this.televisao.getCanalAtual());
		System.out.printf("\nVolume Atual: %d", this.televisao.getVolumeAtual());
		System.out.println("\n---------");		
	}

}
