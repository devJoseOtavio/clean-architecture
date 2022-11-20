package escola.domain.aluno;

public class MatricularAluno {

	private Estudante estudante;
	
//	public static void main(String[] args) {
//		MatricularAluno matricula = new MatricularAluno();
//		Estudante estudante2 = matricula.comNomeCpfEmail("", "", "");
//		matricula.comNomeCpfEmail("", "", "");
//		.comTelefone("", "");
//		criar();
//	}
	
	public MatricularAluno comNomeCpfEmail(String nome, String cpf, String email) {
		this.estudante = new Estudante(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public MatricularAluno comTelefone(String ddd, String numero) {
		this.estudante.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public Estudante criar() {
		return this.estudante;
	}
}
