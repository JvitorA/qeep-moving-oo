package br.com.qm.oo.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DadosPessoaisLeitura {

	public static void main(String[] args) {

		FileReader estrutura = null;
		try {
			estrutura = new FileReader("/Users/joao.alves/exemplo/dadosPessoais.txt");
			BufferedReader leitor = new BufferedReader(estrutura);

			String linha;

			while ((linha = leitor.readLine()) != null) {
				
				System.out.println(linha);
				
			}

			estrutura.close();
			leitor.close();
		} catch (IOException e) {
			// Tratar depois
		}

		
	}

}
