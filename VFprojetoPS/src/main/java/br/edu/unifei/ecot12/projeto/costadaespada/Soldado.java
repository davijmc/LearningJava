package br.edu.unifei.ecot12.projeto.costadaespada;

public class Soldado {
	private int vitalidade;
	private int forca;
	private int obediencia=100;
	private Governante governante;
	private Taverna taverna;
	public void cobrarImposto() {
		if(obediencia>=100) {
			governante.setDinheiro(governante.getDinheiro()+taverna.getImposto());
		}
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
	public int getObediencia() {
		return obediencia;
	}
	public void setObediencia(int obediencia) {
		this.obediencia = obediencia;
	}
	public Governante getGovernante() {
		return governante;
	}
	public void setGovernante(Governante governante) {
		this.governante = governante;
	}
	public Taverna getTaverna() {
		return taverna;
	}
	public void setTaverna(Taverna taverna) {
		this.taverna = taverna;
	}
}
