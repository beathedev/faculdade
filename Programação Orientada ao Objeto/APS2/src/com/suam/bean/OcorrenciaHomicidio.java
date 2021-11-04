package com.suam.bean;

public class OcorrenciaHomicidio extends OcorrenciaPolicial implements Morte {
	private String localAssasinato;

	public String getLocalAssasinato() {
		return localAssasinato;
	}

	public void setLocalAssasinato(String localAssasinato) {
		this.localAssasinato = localAssasinato;
	}

	@Override
	public String exibeInfoOcorrencia() {
		String exibicao="OCORR�NCIA DE FURTO N�MERO: " + this.getNumero() +
				"\nNOME DA V�TIMA: " +  this.getNomeVitima() +
				"\nDESCRI��O DA OCORR�NCIA: " + this.getDescricaoOcorrencia() +
				"\nLOCAL DO ASSASSINATO: " + this.getLocalAssasinato();
		return exibicao;
	}

	@Override
	public void informaLocalAssasinato(String localAssasinato) {
		// TODO Auto-generated method stub
		
	}
}
