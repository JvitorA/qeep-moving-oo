package br.com.qm.oo.empresa;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Programador programador = new Programador("José", "000000", 2000, 40, "Java", "BE");
		Programador programadorFront = new Programador("Antonio", "00010101", 2000, 40, "Javascript", "FE");
		LiderTecnico liderTecnico = new LiderTecnico("Maria", "101010101", 2000, 40, 10);
		
		liderTecnico.aumentaSalario();
		programador.aumentaSalario();
		programadorFront.aumentaSalario();
		
		liderTecnico.insereProgramador(programador);
		liderTecnico.insereProgramador(programadorFront);
		
		liderTecnico.imprimeNomesProgramadores();
		
//		System.out.println(programador.getSalario());
//		System.out.println(programadorFront.getSalario());
//		System.out.println(liderTecnico.getSalario());
	}
}
