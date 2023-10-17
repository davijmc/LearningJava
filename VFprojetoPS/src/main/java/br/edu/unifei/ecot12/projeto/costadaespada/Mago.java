package br.edu.unifei.ecot12.projeto.costadaespada;

public class Mago {
	private Aventureiro aventureiro;
	private Feitico feitico;
	private Encantamento encantamento;
	private Mago mago;
	private String poder;
	
	public void conjurar() {
		if((aventureiro.getClasse()=="Mago")&&(mago.getPoder()=="feitico")) {
			aventureiro.setForca(aventureiro.getForca()+feitico.getForca());
		}else if((aventureiro.getClasse()=="Mago")&&(mago.getPoder()=="encantamento")) {
			aventureiro.setForca(aventureiro.getForca()+encantamento.getForca());
		}
	}

	public Aventureiro getAventureiro() {
		return aventureiro;
	}

	public void setAventureiro(Aventureiro aventureiro) {
		this.aventureiro = aventureiro;
	}

	public Feitico getFeitico() {
		return feitico;
	}

	public void setFeitico(Feitico feitico) {
		this.feitico = feitico;
	}

	public Encantamento getEncantamento() {
		return encantamento;
	}

	public void setEncantamento(Encantamento encantamento) {
		this.encantamento = encantamento;
	}

	public Mago getMago() {
		return mago;
	}

	public void setMago(Mago mago) {
		this.mago = mago;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}
	
}
