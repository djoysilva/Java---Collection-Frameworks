package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.beans.Cargo;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cargo c1 = new Cargo("DBA", "Junior", 3500);
      Cargo c2 = new Cargo("Estagiário", "Pleno", 5500);
      Cargo c3 = new Cargo("Analista", "Júnior", 3000);
      List<Cargo> listaCargos = new ArrayList<Cargo>();
      
      listaCargos.add(c1);
      listaCargos.add(c2);
      listaCargos.add(c3);
      Collections.sort(listaCargos);
      //System.out.println(cargos); mostra o endereço de memoria
      for(Cargo c: listaCargos){
    	  System.out.println(c.getTudo());
      }
	}

}
