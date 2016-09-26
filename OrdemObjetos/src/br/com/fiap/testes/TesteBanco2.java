package br.com.fiap.testes;

import java.util.List;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecao.Excecao;

public class TesteBanco2 {
	public static void main(String[] args) throws Excecao{
		try{
			List<Cargo> cargos = new CargoDAO().getLista();
			for(Cargo c: cargos){
				System.out.println(c.getCargo() + "\n"
									+ c.getNivel() + "\n"
									+ c.getSalario());
			}
		}catch(Exception e){
			throw new Excecao ("Erro", e);
		}
	}
}

