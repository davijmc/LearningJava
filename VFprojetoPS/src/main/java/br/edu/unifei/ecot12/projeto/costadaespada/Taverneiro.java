package br.edu.unifei.ecot12.projeto.costadaespada;

public class Taverneiro {
	private int vitalidade=50;
	private int ambicao=100;
	private String motivacao;
	private boolean servindo;
	
	public boolean isServindo() {
		return servindo;
	}

	public void setServindo(boolean servindo) {
		this.servindo = servindo;
	}

	public int getVitalidade() {
		return vitalidade;
	}

	public void setVitalidade(int vitalidade) {
		this.vitalidade = vitalidade;
	}

	public int getAmbicao() {
		return ambicao;
	}

	public void setAmbicao(int ambicao) {
		if(ambicao>=50) {
			this.servindo = true;
		}
		this.ambicao = ambicao;
	}

	public String getMotivacao() {
		return motivacao;
	}

	public void setMotivacao(String motivacao) {
		this.motivacao = motivacao;
	}
}
