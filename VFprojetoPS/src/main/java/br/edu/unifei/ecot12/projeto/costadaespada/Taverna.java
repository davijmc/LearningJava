package br.edu.unifei.ecot12.projeto.costadaespada;

public class Taverna {
	private String nome;
	private String bebida;
	private int ocupacaoMax;
	private int area;
	@SuppressWarnings("unused")
	private int imposto;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public int getOcupacaoMax() {
		return ocupacaoMax;
	}
	public void setOcupacaoMax(int ocupacaoMax) {
		this.ocupacaoMax = ocupacaoMax;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public double getImposto() {
		return area*0.33;
	}
	public void setImposto(int imposto) {
		this.imposto =  imposto;
	}
}
