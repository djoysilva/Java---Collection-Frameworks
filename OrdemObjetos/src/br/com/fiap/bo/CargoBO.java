package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecao.Excecao;

public class CargoBO{
	public void novoCargo(Cargo c) throws Exception{
		if(c.getCargo().length()<2){
			throw new Excecao("Caracteres insuficientes no Cargo");
		}
		if(c.getSalario()<700){
			throw new Excecao("Salário não pode ser menor que 700");
		}
		new CargoDAO().gravar(c);
	}
	public List<Cargo> listarCargos() throws Exception{
		return new CargoDAO().getLista();
	}
	
	public Cargo consultarCargo(String pCargo) throws Exception{
		return new CargoDAO().getPesquisarCargo(pCargo.toUpperCase());
	}
	
	public void deletar(String pCargo) throws Exception{
		if(pCargo.length()<2){
			throw new Excecao("Caracteres insuficientes no cargo");
		}
		new CargoDAO().deletar(pCargo);
	}
}
