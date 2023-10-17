package br.edu.unifei.ecot12.projeto.costadaespada;

public class Bardo {
	private Aventureiro aventureiro;
	private String instrumento;
	private InstrumentoMusical instrumentoMusical;

	public void tocar() {
		if(aventureiro.getClasse()=="Bardo") {
			instrumentoMusical.acalmar();
		}
	}
	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}
	public InstrumentoMusical getInstrumentoMusical() {
		return instrumentoMusical;
	}
	public void setInstrumentoMusical(InstrumentoMusical instrumentoMusical) {
		this.instrumentoMusical = instrumentoMusical;
	}
	
}
