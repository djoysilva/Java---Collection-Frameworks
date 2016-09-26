package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {
	public Connection getConnection() throws Exception{
		/*Para MySQL.....
		 Class.forName("com.mysql.jdbc.Driver");
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/teste", "root","");
		 */
		return DriverManager.getConnection("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
	}
}
