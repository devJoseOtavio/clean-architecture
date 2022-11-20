package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import escola.domain.aluno.Email;
import escola.domain.aluno.Telefone;

class EstudanteTest {

	@Test
	void naoDeveriaCriarEmailComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));	
	}

	@Test
	void naoDeveriaCriarTelefoneComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
	}
	
	@Test
	void naoDeveriaCriarTelefoneComDDDsInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("11", null));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "123"));
	}
	
	@Test
	void deveriaPermitirCriarTelefoneComDDDeNumerosValidos() {
		String ddd = "11";
		String numero = "123456789";
		Telefone telefone = new Telefone(ddd, numero);
		assertEquals(ddd, telefone.getDdd());
		assertEquals(numero, telefone.getNumero());
	}
	
}
