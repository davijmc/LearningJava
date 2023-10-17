package br.edu.unifei.ecot12.projeto.costadaespada;

public class Atingir implements Golpe{
	private Lobo lobo;
	private Aventureiro aventureiro;
	public void atacar() {
		if((aventureiro.getVitalidade()>0)&&(lobo.getVitalidade()>0)) {
			if((lobo.getVitalidade()-aventureiro.getForca())<0) {
				lobo.setVitalidade(0);
			}else {
				lobo.setVitalidade(lobo.getVitalidade()-aventureiro.getForca());
			}
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
