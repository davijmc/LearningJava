package br.edu.unifei.ecot12.projeto.costadaespada;

public class Governante {
	private float dinheiro;
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double d) {
		this.dinheiro = (float) d;
	}
}
