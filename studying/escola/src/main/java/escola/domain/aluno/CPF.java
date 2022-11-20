package escola.domain.aluno;

public class CPF {

	private String numero;
	
	public CPF(String numero) {
		if (numero == null) {
			throw new IllegalArgumentException("CPF inexistente");
		}
		
		this.numero = numero;
	}
	
	public String getNumer() {
		return numero;
	}
	
}
