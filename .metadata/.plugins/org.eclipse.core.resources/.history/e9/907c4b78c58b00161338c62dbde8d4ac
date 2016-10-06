package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cargo;
import br.com.fiap.conexao.ConexaoFactory;

/**
 * Na documentaçã você inicia desenvolvendo uma aplicação sucinta do se projeto. Neste espaço onde você
 * pode utilizar as tags de HTML, como por exemplo, a <code. tag </code>, ou ainda deixar em <i>itálico
 * </i> e etc.
 * Existem ainda marcas especiais como:
 * @author Joyce Mara da Silva
 * @version1.5
 * @since1.0
 * @see OutraClasseRelacionada
 * @see OutraClasseRelacionadaComEsteProjeto
 * Não deixe também de comentar os seus códigos, principalmente os métodos com a mesma
 * <b>estrutura</b>
 * */

public class CargoDAO {
	
	private Connection conexao;
	
	public CargoDAO(String user, String pass) throws Exception{
		this.conexao = new ConexaoFactory().getConnection(user, pass);
	}
	
	/**
	 * Método que <b>adiciona</b> ums tupla na tabela
	 * TB_CARGO.
	 * @param c Um objet d tipo Cargo
	 * @return sem retorno
	 * @author Joyce Silva
	 * @see Cargos
	 */
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
	
	public int atualizar(double pAumento) throws Exception{
		PreparedStatement stmt = conexao.prepareStatement("update TB_CARGO set VL_SALARIO=VL_SAARIO * ('+?)");
		stmt.setDouble(1, pAumento/100);
		int saida = stmt.executeUpdate();
		stmt.close();
		return saida;
	}
	
}