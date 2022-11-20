package escola.application.recommendation;

import escola.domain.aluno.Estudante;

public interface SendEmailRecommendation {

	void sendTo(Estudante estudante);
	
}
