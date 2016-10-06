package br.com.fiap.testes;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecao.Excecao;

public class TesteConexao3 {
	public static void main(String[] args) throws Excecao{
		Connection c = null;
		try{
			String user= JOptionPane.showInputDialog("Digite o usuário: ");
			String pass= JOptionPane.showInputDialog("Digite o senha: ");
			c = new ConexaoFactory().getConnection(user,pass);
			System.out.println("Conexão aberta!");
		}catch(Exception e){
			System.out.println("Erro de conexão");
		}finally{
			try{
				c.close();
			}catch (Exception e){
				System.out.println(e);
			}
		}
	}
}
