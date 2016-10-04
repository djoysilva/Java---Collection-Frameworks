package br.com.fiap.conexao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {
	public Connection getConnection(String usuario, String senha) throws Exception{
		FileReader arquivo = new FileReader(System.getProperty("user.dir") + "/conexao/banco.txt");
		BufferedReader dados = new BufferedReader(arquivo);
		String url = dados.readLine();
		//String usuario = dados.readLine();
		//String senha = dados.readLine();
		if(url.indexOf("oracle")>0){
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}else if(url.indexOf("mysql")>0){
			Class.forName("com.mysql.jdbc.Driver");
		}
		dados.close();
		return DriverManager.getConnection("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL");
		
		//jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL
		//jdbc:oracle:thin:/:@oracle.fiap.com.br:1521:ORCL --> OPS$PF0709
		//jdbc:oracle:thin:/:@localhost:1521:xe --> system
		//jdbc:oracle:thin:/:@localhost:3306/teste --> root
	}
}
