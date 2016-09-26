package br.com.fiap.testes;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.beans.Cargo;

public class TesteMap {
	public static void main(String[] args){
		Cargo cargo1 = new Cargo("Estagiario", "Pleno", 2500);
		Cargo cargo2 = new Cargo("Estagiario", "Junior", 2000);
		Map<String, Cargo> mapaCargos = new HashMap<String, Cargo>();
		
		//Adicionando
		mapaCargos.put("1", cargo1);
		mapaCargos.put("2", cargo2);
		
		//Retornando um objeto atraves da chave
		Cargo objCargo = mapaCargos.get("1");
		System.out.println("Cargo:" + objCargo.getCargo());
		
		//Exibindo as chaves
		System.out.println("\n\n" + "Chaves:" + mapaCargos.keySet() + "\n\n");
		
		//exibindo os valores dos objetos
		for(Cargo c : mapaCargos.values()){
			System.out.println(c.getTudo() + "\n\n");
		}
		
	}
}
