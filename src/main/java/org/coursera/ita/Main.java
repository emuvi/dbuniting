package org.coursera.ita;

public class Main {
	public static void main(String[] args) throws Exception {
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl(Conexao.nova());
		System.out.println("Terminou a Execução da Main!");
	}
}