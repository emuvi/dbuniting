package org.coursera.ita;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static String driver;
	public static String caminho;
	public static String usuario;
	public static String senha;

	static {
		driver = "org.postgresql.Driver";
		caminho = "jdbc:postgresql://localhost/Usuarios";
		usuario = System.getenv("QIN_AD_TEST_USER");
		senha = System.getenv("QIN_AD_TEST_PASS");
	}

	public static Connection nova() throws Exception {
		Class.forName(driver);
		return DriverManager.getConnection(caminho, usuario, senha);
	}

}
