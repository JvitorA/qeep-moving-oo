package br.com.qm.oo.universidade;

import java.util.Scanner;

public class ProgramaPrincipal {

	
	public static boolean cadastraProfessor(Scanner teclado, Professor[] professores) {
		
		teclado.nextLine();
		System.out.println("Vamos cadastrar o professor: ");
		System.out.println("Digite o nome do professor: ");
		String nome = teclado.nextLine();
		System.out.println("Digite o CPF do professor: ");
		String cpf = teclado.next();
		System.out.println("Digite o número de registro do professor: ");
		int nroRegistro = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o orgão de lotação: ");
		String orgaoLotacao = teclado.nextLine();
		System.out.println("Digite o salário: ");
		double salario = teclado.nextDouble();
		System.out.println("Digite o nível de graduação: ");
		String nivelGraduacao = teclado.next();
		System.out.println("Digite a disciplina ministrada: ");
		teclado.nextLine();
		String disciplina = teclado.nextLine();
		
		Professor professorCadastrado = new Professor(nome, cpf, nroRegistro, orgaoLotacao, salario, nivelGraduacao, disciplina, 
							0, 0);
		for (int i = 0; i < professores.length; i++) {
		
			if (professores[i] == null) {
				professores[i] = professorCadastrado;
				return true;
			}
		}
		
		return false;
	}
	
	public static void listaProfessores(Professor[] professores) {
		for (Professor professor : professores) {
			if (professor != null) {
				System.out.println(professor);
			}
		}
	}
	
	public static Professor buscaProfessor(Scanner teclado, Professor[] professores) {
		
		System.out.println("Digite o CPF pelo qual você quer pesquisar: ");
		String cpfConsultado = teclado.next();
		for (int i = 0; i < professores.length; i++) {
			
			if (professores[i] != null 
					&& professores[i].getCpf().equals(cpfConsultado)) {
				return professores[i];
			}
			
		}
		
		return null;
	}
	
	public static boolean removeProfessor(Scanner teclado, Professor[] professores) {
		
		System.out.println("Digite o CPF pelo qual você quer remover: ");
		String cpfConsultadoRemocao = teclado.next();
		
		for (int i = 0; i < professores.length; i++) {
			
			if (professores[i] != null 
					&& professores[i].getCpf().equals(cpfConsultadoRemocao)) {
				professores[i] = null;
				return true;
			}
			
		}
		
		return false;
	}
	
	public static void menuProfessores(Scanner teclado, Professor[] professores) {
		
		int opcaoMenuProfessores = 0;
		do {
			System.out.println("--- Menu de professores ---");
			System.out.println("1 - Cadastrar um professor");
			System.out.println("2 - Listar todos os professores");
			System.out.println("3 - Consultar professor por CPF");
			System.out.println("4 - Remover um professor");
			System.out.println("5 - Aumentar o salário");
			System.out.println("0 - Voltar ao menu anterior");
			opcaoMenuProfessores = teclado.nextInt();
			
			switch (opcaoMenuProfessores) {
				case 1: 
					System.out.println("-- Cadastra professor --");
					if (cadastraProfessor(teclado, professores)) {
						System.out.println("Cadastro realizado com sucesso!");
					} else {
						System.out.println("Falha ao cadastra professor!");
					}
					break;
				case 2:
					System.out.println("-- Professores Cadastrados --");
					listaProfessores(professores);
					System.out.println("----");
					break;
				case 3:
					System.out.println("-- Consulta professor --");
					Professor professorConsultado = buscaProfessor(teclado, professores);
					if ( professorConsultado != null) {
						System.out.println(professorConsultado);
					} else {
						System.out.println("Professor não encontrado!");
					}
					break;
				case 4: 
					System.out.println("-- Remove professor --");
					if (removeProfessor(teclado, professores)) {
						System.out.println("Professor removido com sucesso!");
					} else {
						System.out.println("Professor não encontrado!");
					}
					break;
					
				case 5:
					System.out.println("-- Aumento de salário --");
					Professor professorAumento = buscaProfessor(teclado, professores);
					if (professorAumento != null) {
						professorAumento.aumentaSalario();
						System.out.println("Salário do "  + professorAumento.getNome() + " aumentado com sucesso!");
					} else {
						System.out.println("Professor não encontrado!");
					}
				case 0:
					System.out.println("Voltando ao menu anterior!");
					break;
				default:
					System.out.println("Menu professores -> Opção inválida");
			}
			
		} while (opcaoMenuProfessores != 0);
		
		
	}
	
	private static void imprimirFolha(Professor[] professores, Coordenador[] coordenadores,
			FuncionarioAdministrativo[] funcionariosAdm) {
		
		System.out.println("--- FOLHA DE PAGAMENTO ---");
		System.out.println("--- Professores ---");
		
		double total = 0;
		for (Professor professor : professores) {
			if (professor != null) {
				total += professor.getSalario();
				System.out.printf("\n %s ------------------ R$%.2f", professor.getNome(), professor.getSalario());
			}
		}
		
		System.out.println("\n--- Coordenadores ---");
		for (Coordenador coordenador : coordenadores) {
			if (coordenador != null) {
				total += coordenador.getSalario();
				System.out.printf("\n %s ------------------ R$%.2f", coordenador.getNome(), coordenador.getSalario());
			}
		}
		
		System.out.println("\n--- Funcionários Administrativos ---");
		for (FuncionarioAdministrativo funcionarioAdm : funcionariosAdm) {
			if (funcionarioAdm != null) {
				total += funcionarioAdm.getSalario();
				System.out.printf("\n %s ------------------ R$%.2f", funcionarioAdm.getNome(), funcionarioAdm.getSalario());
			}
		}
		
		
		System.out.printf("\nTotal de pagamentos deste mês ----------- R$%.2f\n", total);
	}
	
	public static void main(String[] args) {
		// Sistema pra gerir a universidade
		// Inicializar a universidade (especificar quantos profissionais ela tem 
		// (professores, coordenadores e func Administrativos)
		
		// Manter (cadastrar, consultar e remover) Professores
		// Manter (cadastrar, consultar e remover) Coordenadores
		// Manter (cadastrar, consultar e remover) FuncionariosAdministrativos
		
		// Aumentar o salário de um funcionário pelo seu cpf
		// Imprimir a folha de pagamento da universidade
		Scanner teclado = new Scanner(System.in);
		System.out.println("--- UNIVERSIDADE QEEP MOVING ---");
		System.out.println("Quantos professores podem existir na sua universidade?");
		int qtdProfessores = teclado.nextInt();
		System.out.println("Quantos cordenadores podem existir na sua universidade?");
		int qtdCoordenadores = teclado.nextInt();
		System.out.println("Quantos funcionários administrativos podem existir na sua universidade?");
		int qtdFuncionariosAdm = teclado.nextInt();
		
		// Inicializando os arrays que servirão como controle.
		Professor[] professores = new Professor[qtdProfessores];
		Coordenador[] coordenadores = new Coordenador[qtdCoordenadores];
		FuncionarioAdministrativo[] funcionariosAdm = new FuncionarioAdministrativo[qtdFuncionariosAdm];
		
		
		
		int opcaoMenuPrincipal = 0;
		do {
			System.out.println("--- Funcionalidades por tipo de funcionario ---");
			System.out.println("1 - Professores");
			System.out.println("2 - Coordenadores");
			System.out.println("3 - Funcionários Administrativos");
			System.out.println("4 - Imprimir folha de pagamento");
			System.out.println("0 - Para encerrar");
			
			opcaoMenuPrincipal = teclado.nextInt();
			
			switch (opcaoMenuPrincipal) {
				case 1:
					menuProfessores(teclado, professores);
					break;
				case 2:
					//menuCoordenadores();
					break;
				case 3: 
					//menuFuncionariosAdm();
					break;
				case 4:
					imprimirFolha(professores, coordenadores, funcionariosAdm);
					break;
			default:
				System.out.println("Opção inválida!");
			}
			
		} while (opcaoMenuPrincipal != 0);
		
		
		
		
		
		teclado.close();
	}

	
}
