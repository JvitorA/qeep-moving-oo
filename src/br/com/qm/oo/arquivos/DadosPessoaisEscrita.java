package br.com.qm.oo.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DadosPessoaisEscrita {

	
	// 1. Leia do usuário seu nome, peso e altura e escreva isto em um arquivo texto de nome 
	// "dadosPessoais.txt" com cada uma dessas informações em uma linha.

	//2. Leia o arquivo criado no exercício anterior a mostre seu conteúdo na tela transformando 
	// todo texto escrito em maiúsculo.

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		System.out.println("Digite seu peso: ");
		float peso = teclado.nextFloat();
		System.out.println("Digite sua altura: ");
		float altura = teclado.nextFloat();
		
		try {
			FileWriter writer = new FileWriter("/Users/joao.alves/exemplo/dadosPessoais.txt");
			writer.write(nome);
			
			writer.write(String.format("\n%.2f", peso));
			writer.write(String.format("\n%.2f", altura));
			
			writer.close();
		} catch (IOException e) {
			// Vamos tratar depois
		}
	
		teclado.close();
	}
	
}
