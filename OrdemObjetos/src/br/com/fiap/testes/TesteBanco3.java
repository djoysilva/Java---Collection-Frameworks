package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecao.Excecao;

public class TesteBanco3 {
	public static void main(String[] args) throws Excecao{
		try{
			CargoDAO  dao = new CargoDAO();
			Cargo c = new Cargo();
			String strSearch = JOptionPane.showInputDialog("Digite o cargo que deseja pesquisar");
			c = dao.getPesquisarCargo(strSearch);
			System.out.println(c.getCargo());
		}catch (Exception e){
			throw new Excecao("Erro", e);
		}
	}
}
