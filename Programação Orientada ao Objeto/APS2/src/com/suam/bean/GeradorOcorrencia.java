package com.suam.bean;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GeradorOcorrencia {
	

	public static void main(String[] args) {
		
		//Inicializando objetos
		OcorrenciaLatrocinio ol = null;
		OcorrenciaFurto of = null;
		OcorrenciaHomicidio oh = null;
		
		//Inicializando listas
		ArrayList<OcorrenciaLatrocinio> listaOL = new ArrayList<OcorrenciaLatrocinio>();
		ArrayList<OcorrenciaFurto> listaOF = new ArrayList<OcorrenciaFurto>();
		ArrayList<OcorrenciaHomicidio> listaOH = new ArrayList<OcorrenciaHomicidio>();

		// TODO Auto-generated method stub
		int opcao  = 0;
		do {
			try {
			 opcao = Integer.parseInt(JOptionPane.showInputDialog(GeradorOcorrencia.getMenu()));
			 if(opcao == 1) {
				 ol = new OcorrenciaLatrocinio();
				 ol.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da ocorrência: ")));	
				 ol.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vítima: "));
				 ol.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descrição da ocorrência: "));
				 ol.setValorRoubado(Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor roubado: ")));
				 ol.setLocalAssasinato(JOptionPane.showInputDialog("Entre com o local de assassinato: "));
				 listaOL.add(ol);
				 JOptionPane.showMessageDialog(null, ol.exibeInfoOcorrencia());		
			 }else if(opcao == 2) {
				 of = new OcorrenciaFurto();
				 of.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da ocorrência: ")));	
				 of.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vítima: "));
				 of.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descrição da ocorrência: "));
				 of.setValorRoubado(Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor roubado: ")));
				 listaOF.add(of);
				 JOptionPane.showMessageDialog(null, of.exibeInfoOcorrencia());		
			 }else if(opcao == 3) {
				 oh = new OcorrenciaHomicidio();
				 oh.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da ocorrência: ")));	
				 oh.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vítima: "));
				 oh.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descrição da ocorrência: ")); 
				 oh.setLocalAssasinato(JOptionPane.showInputDialog("Entre com o local de assassinato: "));
				 listaOH.add(oh);
				 JOptionPane.showMessageDialog(null, oh.exibeInfoOcorrencia());	
				 
			 }else if(opcao < 1 || opcao > 3){JOptionPane.showMessageDialog(null, "Opção Inválida"); System.exit(0);}
 
			} catch(NumberFormatException exception) {
			 JOptionPane.showMessageDialog(null, "Usuário entrou com um dado inválido, o programa será fechado");
			 System.exit(0);
			}
			
		}while(opcao > 1 || opcao < 4);
		
		
	}

	
	public static String getMenu() {
		String menu;
		menu =  "O que você deseja fazer?\n" + 
				"1 - Fazer um BO de um Latrocínio\n" + 
				"2 - Fazer um BO de um Furto\n" + 
				"3 - Fazer um BO de um Homicídio";
		return  menu;
	}
}
