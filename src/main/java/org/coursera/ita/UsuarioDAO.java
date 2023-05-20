package org.coursera.ita;

import java.util.List;

public interface UsuarioDAO {

	// insere um novo usuário no banco de dados
	public void inserir(Usuario u) throws Exception;

	// recupera o usuário pelo seu login
	public Usuario recuperar(String login) throws Exception;

	// adiciona os pontos para o usuário no banco
	public void adicionarPontos(String login, int pontos) throws Exception;

	// retorna a lista de usuários ordenada por pontos (maior primeiro)
	public List<Usuario> ranking() throws Exception;

}
