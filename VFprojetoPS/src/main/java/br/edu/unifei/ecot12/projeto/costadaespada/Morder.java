package br.edu.unifei.ecot12.projeto.costadaespada;

public class Morder implements Golpe{
	private Lobo lobo;
	private Aventureiro aventureiro;
	public void atacar() {
		if((lobo.getVitalidade()>0)&&(aventureiro.getVitalidade()>0)&&lobo.getRaiva()>=10) {
			aventureiro.setVitalidade(aventureiro.getVitalidade()-lobo.getForca());
		}
	}
	public Lobo getLobo() {
		return lobo;
	}
	public void setLobo(Lobo lobo) {
		this.lobo = lobo;
	}
	public Aventureiro getAventureiro() {
		return aventureiro;
	}
	public void setAventureiro(Aventureiro aventureiro) {
		this.aventureiro = aventureiro;
	}
}
