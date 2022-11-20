package escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import escola.domain.aluno.CPF;
import escola.domain.aluno.Estudante;
import escola.domain.aluno.RepositorioDeAlunos;
import escola.domain.aluno.Telefone;

public interface studentRepoJdbc extends RepositorioDeAlunos {
	
	private final Connection connection;
	
	public void studentRepo(Connection connection) {
		this.connection = connection;
	}
	
	public void matricular(Estudante estudante) {
		try {
			String sql = "INSERT INTO ESTUDANTE VALUES(?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, estudante.getCpf());
			ps.setString(2, estudante.getNome());
			ps.setString(3, estudante.getEmail());
			ps.execute();
			
			sql = "INSERT INTO TELEFONE VALUES(?, ?)";
			ps = connection.prepareStatement(sql);
			for (Telefone telefone : telefone.getTelefones()) {
				ps.setString(0, telefone.getDdd());
				ps.setString(0, telefone.getNumero());
				ps.execute();
			}

		} catch (SQLException e) {
			throw new RunTimeException(e);
		}
	}
	
	public Estudante buscarPorCpf(CPF cpf) {
		return null;
	}
	
	public List<Estudante> listarEstudantesMatriculados() {
		return null;
	}
}
