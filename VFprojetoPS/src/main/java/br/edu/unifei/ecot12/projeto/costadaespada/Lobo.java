package br.edu.unifei.ecot12.projeto.costadaespada;

public class Lobo extends Jogador{
	private int vitalidade=100;
	private int forca=15;
	private int raiva=0;
	public Lobo lobo;
	public void morder() {
		if(lobo.getRaiva()>=10) {
			chamarAtacar();
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
	public int getRaiva() {
		return raiva;
	}
	public void setRaiva(int raiva) {
		this.raiva = raiva;
	}
}
