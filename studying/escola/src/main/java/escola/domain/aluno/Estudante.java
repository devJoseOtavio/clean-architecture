package escola.domain.aluno;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

	private CPF cpf;

	private String nome;

	private Email email;

	private List<Telefone> telefones = new ArrayList<>();
	
	private String password;

	public Estudante(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}

	public String getCpf() {
		return cpf.getNumer();
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email.getEndereco();
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

}
