package com.suam.bean;

public abstract class OcorrenciaPolicial {
	private int numero;
	private String nomeVitima;
	private String descricaoOcorrencia;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomeVitima() {
		return nomeVitima;
	}
	public void setNomeVitima(String nomeVitima) {
		this.nomeVitima = nomeVitima;
	}
	public String getDescricaoOcorrencia() {
		return descricaoOcorrencia;
	}
	public void setDescricaoOcorrencia(String descricaoOcorrencia) {
		this.descricaoOcorrencia = descricaoOcorrencia;
	}
	
	public abstract String exibeInfoOcorrencia();
	
}