package br.edu.unifei.ecot12.projeto.costadaespada;

public class Aventureiro extends Jogador{
	private int vitalidade=200;
	private int forca=10;
	private String motivacao;
	private String classe;
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public Aventureiro getAventureiro() {
		return aventureiro;
	}
	public void setAventureiro(Aventureiro aventureiro) {
		this.aventureiro = aventureiro;
	}
	public Taverneiro getTaverneiro() {
		return taverneiro;
	}
	public void setTaverneiro(Taverneiro taverneiro) {
		this.taverneiro = taverneiro;
	}
	private Aventureiro aventureiro;
	private Taverneiro taverneiro;
	public void beber() {
		if(taverneiro.isServindo()) {
			aventureiro.setVitalidade(aventureiro.getVitalidade()+5);
		}
	}
	public void atingir() {
		chamarAtacar();
	}
	public int getVitalidade() {
		return vitalidade;
	}
	public void setVitalidade(int vitalidade) {
		this.vitalidade = vitalidade;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public String getMotivacao() {
		return motivacao;
	}
	public void setMotivacao(String motivacao) {
		this.motivacao = motivacao;
	}
	
}
