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
		String exibicao="OCORRÊNCIA DE FURTO NÚMERO: " + this.getNumero() +
				"\nNOME DA VÍTIMA: " +  this.getNomeVitima() +
				"\nDESCRIÇÃO DA OCORRÊNCIA: " + this.getDescricaoOcorrencia() +
				"\nLOCAL DO ASSASSINATO: " + this.getLocalAssasinato();
		return exibicao;
	}

	@Override
	public void informaLocalAssasinato(String localAssasinato) {
		// TODO Auto-generated method stub
		
	}
}
