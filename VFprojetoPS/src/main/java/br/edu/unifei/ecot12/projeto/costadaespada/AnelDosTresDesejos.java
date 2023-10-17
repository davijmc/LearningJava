package br.edu.unifei.ecot12.projeto.costadaespada;

public class AnelDosTresDesejos {
	private int durabilidade=3;
	private static AnelDosTresDesejos instancia = new AnelDosTresDesejos(); 
	AnelDosTresDesejos() { }
	public static AnelDosTresDesejos getInstancia() {
		return instancia;
	}
	public void desejar(int durabilidade) {
		this.durabilidade = durabilidade-1;
	}
	public static void setInstancia(AnelDosTresDesejos instancia) {
		AnelDosTresDesejos.instancia = instancia;
	}
	public int getDurabilidade() {
		return durabilidade;
	}
	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
}
