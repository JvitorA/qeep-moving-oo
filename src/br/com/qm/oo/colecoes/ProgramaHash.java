package br.com.qm.oo.colecoes;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class ProgramaHash {

	//2. Escreva um programa para criar um HashMap onde a chave é o CPF e o valor o Nome.

	//Leia do usuário 10 conjuntos de valores e armazene em seu Hashmap

	//Mostre na tela os 10 valores de nomes armazenados

	//Peça ao usuário um CPF e remova do seu hashMap a entrada referente à esse valor

	//Mostre na tela os valores restantes em seu hashMap

	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Map<String, String> dados = new HashMap<String, String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um CPF");
			String cpf = teclado.next();
			System.out.println("Digite um nome:");
			String nome = teclado.next();
			dados.put(cpf, nome);
		}
		
		for (String nome : dados.values()) {
			System.out.println(nome);
		}
		
		System.out.println("Digite um CPF para ser removido: ");
		String cpfRemovido = teclado.next();
		
		dados.remove(cpfRemovido);
		
		for (String nome : dados.values()) {
			System.out.println(nome);
		}
		
		teclado.close();
	}
		
}
