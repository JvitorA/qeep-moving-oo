package br.com.qm.oo.universidade;

public class Coordenador extends Funcionario {

	//Os coordenadores possuem os atributos: professoresSupervisionados[10].
	private Professor[] professoresSupervisionados;

	public Coordenador(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario) {
		super(nome, cpf, nroRegistro, orgaoLotacao, salario);
		this.professoresSupervisionados = new Professor[10];
	}

	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}
	
	//Adiciona professor (para os coordenadores): observe que um coordenador 
	//só pode coordenar 10 professores.
	// {professor, professor, professor, professor}
	public void adicionaProfessor(Professor professor) {
		
		for (int i = 0; i < this.professoresSupervisionados.length; i++) {
			
			if (this.professoresSupervisionados[i] == null) {
				this.professoresSupervisionados[i] = professor;
				break;
			}
			
		}
		
		
	}
	
	public void aumentaSalario() {
		
		super.setSalario(super.getSalario() * 1.05);
		
	}
	
}
