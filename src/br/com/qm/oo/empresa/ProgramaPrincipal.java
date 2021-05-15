package br.com.qm.oo.empresa;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Funcionario[] funcionarios = new Funcionario[3];
		funcionarios[0] = new Programador("José", "000000", 2000, 40, "Java", "BE");
		funcionarios[1] = new Programador("Antonio", "00010101", 2000, 40, "Javascript", "FE");
		funcionarios[2] = new LiderTecnico("Maria", "101010101", 2000, 40, 10);
		
		//Funcionario funcionario = new Programador("José", "000000", 2000, 40, "Java", "BE");
		
		//funcionario.aumentaSalario();
		
		for (Funcionario funcionario : funcionarios) {
			funcionario.aumentaSalario();
			System.out.println(funcionario.getSalario());
		}
		
		
		
//		Programador programador = new Programador("José", "000000", 2000, 40, "Java", "BE");
//		Programador programadorFront = new Programador("Antonio", "00010101", 2000, 40, "Javascript", "FE");
//		LiderTecnico liderTecnico = new LiderTecnico("Maria", "101010101", 2000, 40, 10);
//		
//		
//		liderTecnico.aumentaSalario();
//		programador.aumentaSalario();
//		programadorFront.aumentaSalario();
//		
//		liderTecnico.insereProgramador(programador);
//		liderTecnico.insereProgramador(programadorFront);
//		
//		liderTecnico.imprimeNomesProgramadores();
		
//		System.out.println(programador.getSalario());
//		System.out.println(programadorFront.getSalario());
//		System.out.println(liderTecnico.getSalario());
	}
}
