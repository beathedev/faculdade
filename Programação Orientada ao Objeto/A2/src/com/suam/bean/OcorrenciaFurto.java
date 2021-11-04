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
		String exibicao="OCORR�NCIA DE FURTO N�MERO: " + this.getNumero() +
				"\nNOME DA V�TIMA: " +  this.getNomeVitima() +
				"\nDESCRI��O DA OCORR�NCIA: " + this.getDescricaoOcorrencia() +
				"\nVALOR ROUBADO: " + this.getValorRoubado();
		return exibicao;
	}

	@Override
	public void informaValorRoubado(int valorRoubado) {
		// TODO Auto-generated method stub
		
	}
}