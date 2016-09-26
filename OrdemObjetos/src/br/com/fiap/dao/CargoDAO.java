package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cargo;
import br.com.fiap.conexao.ConexaoFactory;

public class CargoDAO {
	
	private Connection conexao;
	
	public CargoDAO() throws Exception{
		this.conexao = new ConexaoFactory().getConnection();
	}
	
	public void gravar(Cargo c) throws Exception{
		String sql = "insert into TB_CARGO " +
					"(NM_CARGO, DS_NIVEL, VL_SALARIO) values (?, ?, ?)";
		PreparedStatement estrutura = conexao.prepareStatement(sql);
		estrutura.setString(1, c.getCargo());
		estrutura.setString(2, c.getNivel());
		estrutura.setDouble(3, c.getSalario());
		estrutura.execute();
		estrutura.close();
	}
	
	public List<Cargo> getLista() throws Exception{
		List<Cargo> lstCargos = new ArrayList<Cargo>();
		PreparedStatement estrutura = this.conexao.prepareStatement("select * from TB_CARGO");
		ResultSet resultadoDados = estrutura.executeQuery();
		while (resultadoDados.next()){
			Cargo cargo =  new Cargo();
			cargo.setCargo(resultadoDados.getString("NM_CARGO"));
			cargo.setNivel(resultadoDados.getString("DS_NIVEL"));
			cargo.setSalario(resultadoDados.getDouble("VL_SALARIO"));
			lstCargos.add(cargo);
		}
		resultadoDados.close();
		estrutura.close();
		return lstCargos;
	}
	
	public Cargo getPesquisarCargo(String strCargo)throws Exception{
		Cargo cargo = new Cargo();
		PreparedStatement estrutura = this.conexao.prepareStatement("select * from TB_CARGO where NM_CARGO = ?");
		estrutura.setString(1, strCargo);
		ResultSet resultadoDados = estrutura.executeQuery();
		if(resultadoDados.next()){
			cargo.setCargo(resultadoDados.getString("NM_CARGO"));
			cargo.setNivel(resultadoDados.getString("DS_NIVEL"));
			cargo.setSalario(resultadoDados.getDouble("VL_SALARIO"));
		}
		resultadoDados.close();
		estrutura.close();
		return cargo;
	}
	
	public void deletar(String strCargo) throws Exception{
		Cargo cargo = new Cargo();
		PreparedStatement estrutura = this.conexao.prepareStatement("delete TB_CARGO where NM_CARGO = ?");
		estrutura.setString(1, strCargo);
		estrutura.execute();
		estrutura.close();	
	}
	
}