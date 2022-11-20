package escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import escola.domain.aluno.Estudante;

public class momeryRepo {
	
	private List<Estudante> matriculados = new ArrayList<>();
	
	public void matricular(Estudante estudante) {
		this.matriculados.add(estudante);
	}
}
