package br.com.qm.oo.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaArrayList {

	
	//1. Escreva um programa em Java que cria um ArrayList e peça pro usuario digitar 
	//cores até quando ele digitar preto, 
	//armazene essas cores e por fim as imprima na tela.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		List<String> cores = new ArrayList<String>();		
		
		String corAtual = null; 
		
		do {
			System.out.println("Digite uma cor:");
			corAtual = teclado.next();
			cores.add(corAtual);
		} while (!corAtual.equals("preto"));
		
		
		for (String cor : cores) {
			
			System.out.println(cor);
			
		}
		
	}
	
}
