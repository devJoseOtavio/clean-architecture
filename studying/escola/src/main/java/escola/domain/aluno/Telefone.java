package escola.domain.aluno;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if (ddd == null) {
			throw new IllegalArgumentException("DDD inexistente");
		}
		
		if (!ddd.matches("\\d{2}")) { 
			throw new IllegalArgumentException("DDD incorreto");
		}
		
		if (!numero.matches("\\d{8}|\\d{9}")) { 
			throw new IllegalArgumentException("numero incorreto");
		}
		
		if (numero == null) {
			throw new IllegalArgumentException("Numero inexistente");
		}
		
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public String getDdd() {
		return ddd;
	}
	
	public String getNumero() {
		return numero;
	}

}
