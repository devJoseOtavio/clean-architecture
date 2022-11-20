package escola.domain.aluno;

public interface EncryptPassword {

	String encryptPassword(String password);
	
	boolean validatePassword(String encryptPassword, String password);
}
