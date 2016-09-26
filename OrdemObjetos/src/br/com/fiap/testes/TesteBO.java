package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.bo.CargoBO;

public class TesteBO {
	public static void main(String[] args) throws Exception{
		CargoBO bo = new CargoBO();
		String nomeCargo = JOptionPane.showInputDialog("Infome o nome do cargo: ");
		bo.deletar(nomeCargo);
	}
}
