package com.suam.bean;

public class OcorrenciaFurto extends OcorrenciaPolicial implements Roubo{
	private int valorRoubado;
	public int getValorRoubado() {
		return valorRoubado;
	}

	public void setValorRoubado(int valorRoubado) {
		this.valorRoubado = valorRoubado;
	}

	@Override
	public String exibeInfoOcorrencia() {
		// TODO Auto-generated method stub
		String exibicao="OCORRÊNCIA DE FURTO NÚMERO: " + this.getNumero() +
				"\nNOME DA VÍTIMA: " +  this.getNomeVitima() +
				"\nDESCRIÇÃO DA OCORRÊNCIA: " + this.getDescricaoOcorrencia() +
				"\nVALOR ROUBADO: " + this.getValorRoubado();
		return exibicao;
	}

	@Override
	public void informaValorRoubado(int valorRoubado) {
		// TODO Auto-generated method stub
		
	}
}