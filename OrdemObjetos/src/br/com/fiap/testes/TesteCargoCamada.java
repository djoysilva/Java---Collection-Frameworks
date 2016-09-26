package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.bo.CargoBOlista;
import br.com.fiap.excecao.Excecao;

public class TesteCargoCamada{
	public static void main(String[] args) throws Excecao{
		String strCargo = null, strNivel=null;
		double dblSalario = 0;
		int resp=0;
		//CargoDAO dao = new CargoDAO();
		CargoBOlista bo = new CargoBOlista();
		//List<Cargo> lstCargos = new ArrayList<Cargo>();Foi levado para o DAO
		try{
			while(resp==0){
				strCargo = JOptionPane.showInputDialog("Digite o cargo: ");
				strNivel = JOptionPane.showInputDialog("Digite o nível: ");
				dblSalario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
				//modo mais indicado de fazer:
				//instanciar o beans:
				//Cargo c = new Cargo(strCargo, strNivel, dblSalario);
				
				//Se fosse fazer direto pelo teste, teria que criar a lista (linha 17) e add aqui:
				//lstCargos.add(c); 
				
				//mas o add foi levado para o DAO, assim:
				//instancia o DAO e mandar gravar, mas traz a mensagem do return do metodo gravar pro teste:
				//CargoDAO cDAO = new CargoDAO();
				//System.out.println(cDAO.gravar(c)); 
				
				//Para mandar para o DAO tudo isso de maneira mais rapida e limpa:
				//System.out.println(new CargoDAO().gravar(c));
				
				//passando tudo direto pro DAO, inclusive o beans:
				//System.out.println(new CargoDAO().gravar(strCargo, strNivel, dblSalario));
				
				//System.out.println(dao.gravar(strCargo, strNivel, dblSalario));
				
				//Fazer tudo isso pelo bo é o jeito mais certo, pq la estao as validações:
				bo.incluir(strCargo, strNivel, dblSalario);
				resp = JOptionPane.showConfirmDialog(null,"Continuar cadastrando?", "Camadas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			}
			//mostrar o que foi gravado pela lista de cargos que esta no dao:
			//System.out.println(dao.exibir());
			//String strbusca = JOptionPane.showInputDialog("Qual cargo deseja buscar?");
			//dao.busca(strbusca);
			//mostrar tudo pelo bo:
			String strbusca = JOptionPane.showInputDialog("Qual cargo deseja buscar? ").toUpperCase();
			bo.buscar(strbusca);
			bo.exibir();
			String strcargo = JOptionPane.showInputDialog("Qual cargo deseja deletar? ").toUpperCase();
			bo.deletar(strcargo);
			
		}catch(Exception e){
			throw new Excecao("Algo deu errado!", e);
		}
	}
}
