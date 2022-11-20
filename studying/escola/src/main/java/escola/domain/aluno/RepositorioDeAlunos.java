package escola.domain.aluno;

import java.util.List;

public interface RepositorioDeAlunos {
	
	void matricular(Estudante estudante);
	
	Estudante buscarPorCpf(CPF cpf);
	
	List<Estudante> listarTodosEstudantesMatriculados();

}
