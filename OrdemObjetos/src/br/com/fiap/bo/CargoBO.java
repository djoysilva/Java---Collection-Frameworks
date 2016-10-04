package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecao.Excecao;

public class CargoBO{
	public void novoCargo(Cargo c, String u, String p) throws Exception{
		if(c.getCargo().length()<2){
			throw new Excecao("Caracteres insuficientes no Cargo");
		}
		if(c.getSalario()<700){
			throw new Excecao("Salário não pode ser menor que 700");
		}
		new CargoDAO(u,p).gravar(c);
	}
	public List<Cargo> listarCargos(String u, String p) throws Exception{
		return new CargoDAO(u,p).getLista();
	}
	
	public Cargo consultarCargo(String pCargo, String u, String p) throws Exception{
		return new CargoDAO(u, p).getPesquisarCargo(pCargo.toUpperCase());
	}
	
	public void deletar(String pCargo, String u, String p) throws Exception{
		if(pCargo.length()<2){
			throw new Excecao("Caracteres insuficientes no cargo");
		}
		new CargoDAO(u, p).deletar(pCargo);
	}
	public int atualizarSalario(double pAumento, String u, String p) throws Exception{
		return new CargoDAO(u,p).atualizar(pAumento);
	}
}
