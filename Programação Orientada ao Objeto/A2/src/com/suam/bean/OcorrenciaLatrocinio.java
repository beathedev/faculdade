package com.suam.bean;

public class OcorrenciaLatrocinio extends OcorrenciaPolicial implements Morte,Roubo {
	private int valorRoubado;
	private String localAssasinato;
	
	public int getValorRoubado() {
		return valorRoubado;
	}

	public void setValorRoubado(int valorRoubado) {
		this.valorRoubado = valorRoubado;
	}

	public String getLocalAssasinato() {
		return localAssasinato;
	}

	public void setLocalAssasinato(String localAssasinato) {
		this.localAssasinato = localAssasinato;
	}

	@Override
	public String exibeInfoOcorrencia() {
		// TODO Auto-generated method stub
		String exibicao="OCORRÊNCIA DE LATROCÍNIO NÚMERO: " + this.getNumero() +
				"\nNOME DA VÍTIMA: " +  this.getNomeVitima() +
				"\nDESCRIÇÃO DA OCORRÊNCIA: " + this.getDescricaoOcorrencia() +
				"\nLOCAL DO ASSASSINATO: " + this.getLocalAssasinato() +
				"\nVALOR ROUBADO: " + this.getValorRoubado();
		return exibicao;
	}

	@Override
	public void informaValorRoubado(int valorRoubado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informaLocalAssasinato(String localAssasinato) {
		// TODO Auto-generated method stub
		
	}
}