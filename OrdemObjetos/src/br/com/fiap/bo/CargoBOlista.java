package br.com.fiap.bo;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAOlista;
import br.com.fiap.excecao.Excecao;

public class CargoBOlista {
	CargoDAOlista dao = new CargoDAOlista();
	public void incluir (String pCargo, String pNivel, double dblSalario) throws Excecao{
		if(pCargo.length()<2){
			throw new Excecao("Caracteres insuficientes no Cargo");
		}
		if(dblSalario<700){
			throw new Excecao("Salario não pode ser menor que 700");
		}
		Cargo objeto = new Cargo (pCargo.toUpperCase(), pNivel.toUpperCase(), dblSalario);
		System.out.println(dao.gravar(objeto));
	}
	
	public void buscar(String strbusca){
		dao.pesquisar(strbusca);
	}
	
	public void exibir(){
		System.out.println("Todos os cadastrados:\n" + dao.exibir());
	}
	
	public void deletar(String strcargo) throws Excecao{
		if(strcargo.length()<2){
			throw new Excecao("Caracteres insuficientes");
		}
		dao.deletar(strcargo);
	}
}
