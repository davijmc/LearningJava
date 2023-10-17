package br.edu.unifei.ecot12.projeto.costadaespada;

public abstract class Jogador {
	private Golpe golpe;
	protected void chamarAtacar() {
		if(golpe!=null) {
			golpe.atacar();
		}
	}
	
	public Golpe getGolpe() {
		return golpe;
	}
	public void setGolpe(Golpe golpe) {
		this.golpe = golpe;
	}
}
