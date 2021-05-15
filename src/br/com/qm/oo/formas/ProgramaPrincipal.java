package br.com.qm.oo.formas;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void insereNoArray(FormaGeometrica forma, FormaGeometrica[] formas) {

		for (int i = 0; i < formas.length; i++) {
			if (formas[i] == null) {
				formas[i] = forma;
				break;
			}
		}

	}

	public static void calculaAreas(FormaGeometrica[] formas) {
		for (FormaGeometrica forma : formas) {
			if (forma != null) {
				forma.calculaArea();
				System.out.println(forma.getArea());
				if (forma instanceof Quadrado) {
					Quadrado quadrado = (Quadrado) forma;
					quadrado.dizQueSouQuadrado();
				}
			}
		}
	}
	
	private static void criaQuadrado(Scanner teclado, FormaGeometrica[] formas) {
		System.out.println("Digite o tamanho do lado:");
		double lado = teclado.nextDouble();
		FormaGeometrica quadrado = new Quadrado(lado);
		insereNoArray(quadrado, formas);
	}
	
	private static void criaCirculo(Scanner teclado, FormaGeometrica[] formas) {
		System.out.println("Digite o tamanho do raio:");
		double raio = teclado.nextDouble();
		FormaGeometrica circulo = new Circulo(raio);
		insereNoArray(circulo, formas);
	}

	private static void criaTriangulo(Scanner teclado, FormaGeometrica[] formas) {
		System.out.println("Digite a base:");
		double baseT = teclado.nextDouble();
		System.out.println("Digite a altura:");
		double alturaT = teclado.nextDouble();
		FormaGeometrica triangulo = new Triangulo(baseT, alturaT);
		insereNoArray(triangulo, formas);
	}

	private static void criaRetangulo(Scanner teclado, FormaGeometrica[] formas) {
		System.out.println("Digite a base:");
		double base = teclado.nextDouble();
		System.out.println("Digite a altura:");
		double altura = teclado.nextDouble();
		FormaGeometrica retangulo = new Retangulo(base, altura);
		insereNoArray(retangulo, formas);
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("-- Inicialização -- ");
		System.out.println("Quantas formas você quer guardar?");
		int qtdFormas = teclado.nextInt();
		FormaGeometrica[] formas = new FormaGeometrica[qtdFormas];

		System.out.println("--- Menu formas ---");

		int opcao = 0;
		do {
			System.out.println("1 - Pra criar um quadrado");
			System.out.println("2 - Pra criar um retângulo");
			System.out.println("3 - Pra criar um triângulo");
			System.out.println("4 - Pra criar um círculo");
			System.out.println("5 - Pra calcular e mostrar todas as áreas");
			System.out.println("0 - Pra sair");
			opcao = teclado.nextInt();

			switch (opcao) {
				case 1:
					criaQuadrado(teclado, formas);
					break;
				case 2:
					criaRetangulo(teclado, formas);
					break;
				case 3:
					criaTriangulo(teclado, formas);
					break;
				case 4:
					criaCirculo(teclado, formas);
					break;
				case 5:
					calculaAreas(formas);
					break;
				case 0:
					System.out.println("Obrigado por usar o nosso programa!");
				default:
					System.out.println("Opção inválida!");

			}

		} while (opcao != 0);

		
		teclado.close();
	}


}
