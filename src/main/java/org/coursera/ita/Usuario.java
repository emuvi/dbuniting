package org.coursera.ita;

public class Usuario {

	private String login;
	private String email;
	private String nome;
	private String senha;
	private Integer pontos;

	public Usuario() {
	}

	public Usuario(String login, String email, String nome, String senha, Integer pontos) {
		this.login = login;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.pontos = pontos;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", email=" + email + ", nome=" + nome + ", senha=" + senha + ", pontos="
				+ pontos + "]";
	}

}
