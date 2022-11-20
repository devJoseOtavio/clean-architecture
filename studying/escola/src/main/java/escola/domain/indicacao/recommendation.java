package escola.domain.indicacao;

import java.time.LocalDateTime;

import escola.domain.aluno.Estudante;

public class recommendation {

	private Estudante indicado;
	private Estudante indicador;
	private LocalDateTime dataIndicacao;

	public recommendation(Estudante indicado, Estudante indicador) {
		this.indicado = indicado;
		this.indicador = indicador;
		this.dataIndicacao = LocalDateTime.now();
	}
	
	public Estudante getIndicado() {
		return indicado;
	}

	public Estudante getIndicador() {
		return indicador;
	}
	
	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}
	
}
