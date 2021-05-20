package br.com.qm.oo.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NomesEscrita {

	// 3. Leia n nomes digitados pelo usuário e os grave todos (um em cada linha) em
	// minúsculo em um arquivo
	// chamado "nomes.txt".

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## Leitor de nomes ##");
		System.out.println("Digite quantos nomes você quer guardar: ");
		int qtdNomes = teclado.nextInt();
		
		teclado.nextLine();
		FileWriter writer = null;
		try {
			writer = new FileWriter("nomes.txt");

			for (int i = 0; i < qtdNomes; i++) {
				System.out.println("Digite um nome: ");
				String nomeLido = teclado.nextLine();
				writer.write(nomeLido.toLowerCase());
				writer.write("\n");
				
			}
			
			writer.close();
		} catch (IOException e) {
			// Trataremos no futuro
		}

		
		teclado.close();
		
	}

}
