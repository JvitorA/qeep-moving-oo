package br.com.qm.oo.fornecedor;

import java.util.Scanner;

public class ProgramaPrincipal {
	
	
	public static void insereEmpregado(Empregado empregadoCadastrado, Empregado[] empregados) {
		
		for (int i = 0; i < empregados.length; i++) {
			
			if (empregados[i] == null) {
				empregados[i] = empregadoCadastrado;
				break;
			}
			
		}
		
	}
	
	public static Empregado cadastrarEmpregado(Scanner teclado, boolean administrador) {
		teclado.nextLine();
		System.out.println("Digite o nome do empregado: ");
		String nome = teclado.nextLine();
		System.out.println("Digite o endereco: ");
		String endereco = teclado.nextLine();
		System.out.println("Digite o telefone");
		String telefone = teclado.nextLine();
		System.out.println("Digite o código do setor: ");
		int codigoSetor = teclado.nextInt();
		System.out.println("Digite o salário base: ");
		double salarioBase = teclado.nextDouble();
		System.out.println("Digite o imposto: ");
		double imposto = teclado.nextDouble();
		
		if (administrador) {
			System.out.println("Digite a ajuda de custo");
			double ajudaDeCusto = teclado.nextDouble();
			return new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, imposto, ajudaDeCusto);
		}
		
		return new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
	}
	
	
	public static void listarEmpregados(Empregado[] empregados) {
		
		for (Empregado empregado : empregados) {
			
			if (empregado != null) {
				System.out.printf("\n%s ---- %d ---- %.2f ---- %.2f\n", empregado.getNome(), empregado.getCodigoSetor(), 
						empregado.getSalarioBase(), empregado.calcularSalario());
			}
			
		}
		
	}
	
	public static void menuEmpregados(Scanner teclado, Empregado[] empregados) {
		
		int opcaoEmpregados = 0;
		do {
			System.out.println("1 - Para cadastrar empregados");
			System.out.println("2 - Para cadastrar administradores");
			System.out.println("3 - Listar todos os empregados");
			System.out.println("0 - Para sair");
			
			opcaoEmpregados = teclado.nextInt();
			switch (opcaoEmpregados) {
				case 1:
					Empregado empregadoCadastrado = cadastrarEmpregado(teclado, false);
					insereEmpregado(empregadoCadastrado, empregados);
					break;
				case 2:
					insereEmpregado(cadastrarEmpregado(teclado, true), empregados);
					break;
				case 3:
					listarEmpregados(empregados);
					break;
				case 0:
					System.out.println("Voltando ao menu principal!");
					break;
				default:
					System.out.println("Opção inválida!");
			}
			
		} while (opcaoEmpregados != 0);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--- GESTÃO EMPRESARIAL ---");
		Fornecedor[] fornecedores = new Fornecedor[10];
		Empregado[] empregados = new Empregado[10];
		
		int opcao = 0;
		do {
			System.out.println("- Menu da empresa -");
			System.out.println("1 - Para empregados");
			System.out.println("2 - Para fornecedores");
			System.out.println("0 - Para sair");
			
			opcao = teclado.nextInt();
			switch (opcao) {
				case 1:
					menuEmpregados(teclado, empregados);
					break;
				case 2:
					//menuFornecedores(teclado, fornecedores);
					break;
				case 0:
					System.out.println("Obrigado por usar o nosso sistema!");
					break;
				default:
					System.out.println("Opção inválida!");
			
			}
			
			
			
		} while (opcao != 0);
		
		teclado.close();
	}
}
