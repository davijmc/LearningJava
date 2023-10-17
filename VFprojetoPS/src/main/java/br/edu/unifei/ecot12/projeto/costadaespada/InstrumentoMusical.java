package br.edu.unifei.ecot12.projeto.costadaespada;

public class InstrumentoMusical {
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Lobo getLobo() {
		return lobo;
	}
	public void setLobo(Lobo lobo) {
		this.lobo = lobo;
	}
	private Lobo lobo;
	public void acalmar() {
		lobo.setRaiva(lobo.getRaiva()-5);
	}
}
