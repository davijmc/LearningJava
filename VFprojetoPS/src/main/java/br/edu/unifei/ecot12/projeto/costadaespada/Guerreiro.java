package br.edu.unifei.ecot12.projeto.costadaespada;

public class Guerreiro extends Aventureiro{
	private String equipamento;
	private Aventureiro aventureiro;
	private Espada espada;
	private Escudo escudo;
	private Armadura armadura;
	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	public void equipar() {
		if(aventureiro.getClasse()=="Guerreiro") {
			aventureiro.setForca(aventureiro.getForca()+espada.getForca());
			aventureiro.setVitalidade(aventureiro.getVitalidade()+escudo.getVitalidade()+armadura.getVitalidade());
		}
	}

	public Aventureiro getAventureiro() {
		return aventureiro;
	}

	public void setAventureiro(Aventureiro aventureiro) {
		this.aventureiro = aventureiro;
	}

	public Espada getEspada() {
		return espada;
	}

	public void setEspada(Espada espada) {
		this.espada = espada;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
}
