package br.com.qm.oo.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NomesLeitura {

	// 4. Leia o arquivo gerado no exercício anterior e exiba cada linha na tela
	// trocando todas as letras a por x.

	public static void main(String[] args) {

		FileReader estrutura;
		try {
			
			estrutura = new FileReader("nomes.txt");

			BufferedReader leitor = new BufferedReader(estrutura);

			String linha;
			while ((linha = leitor.readLine()) != null) {

				System.out.println(linha.replace('a', 'x'));

			}
			
			estrutura.close();
			leitor.close();
		} catch (IOException e) {
			// Trataremos em breve.
		}

	}

}
