package br.com.fiap.beans;

public class Cargo implements Comparable<Cargo>{
	private int codigo;
	private String cargo;
	private String nivel;
	private double salario;

	/*public int compareTo(Cargo outro){
	  if(this.salario < outro.salario) return -1;
	  else if(this.salario > outro.salario) return 1;
	  return 0;
  }*/

	//ordenar em ordem alfab�tica
	/*
  public int compareTo(Cargo outro){
	  return this.cargo.compareTo(outro.cargo);
  }*/

	//ordenar em ordem do maior para o menor
	public int compareTo(Cargo outro){
		return outro.cargo.compareTo(this.cargo);
		// return (this.cargo.comparteTo(outro.cargo)*(-1));
	}

	

	public Cargo(int codigo, String cargo, String nivel, double salario) {
		super();
		this.codigo = codigo;
		this.cargo = cargo;
		this.nivel = nivel;
		this.salario = salario;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public Cargo() {
		super();
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTudo(){
		return "Cargo: " + cargo + "\nN�vel: " + nivel + "\nSal�rio: R$" + salario;
	}
}
