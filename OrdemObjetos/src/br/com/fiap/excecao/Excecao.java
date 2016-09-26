package br.com.fiap.excecao;

public class Excecao extends Exception{
	
	public Excecao(String mensagem, Exception e){
		super(mensagem, e);
		this.print();
		e.getStackTrace();
	}
	
	public void print(){
		System.out.println("Corrigindo o erro. \nCaminho: ");
	}
	
	public Excecao(String mensagem){
		super(mensagem);
	}
}
