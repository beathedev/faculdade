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
				 ol.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero da ocorr�ncia: ")));	
				 ol.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da v�tima: "));
				 ol.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descri��o da ocorr�ncia: "));
				 ol.setValorRoubado(Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor roubado: ")));
				 ol.setLocalAssasinato(JOptionPane.showInputDialog("Entre com o local de assassinato: "));
				 listaOL.add(ol);
				 JOptionPane.showMessageDialog(null, ol.exibeInfoOcorrencia());		
			 }else if(opcao == 2) {
				 of = new OcorrenciaFurto();
				 of.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero da ocorr�ncia: ")));	
				 of.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da v�tima: "));
				 of.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descri��o da ocorr�ncia: "));
				 of.setValorRoubado(Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor roubado: ")));
				 listaOF.add(of);
				 JOptionPane.showMessageDialog(null, of.exibeInfoOcorrencia());		
			 }else if(opcao == 3) {
				 oh = new OcorrenciaHomicidio();
				 oh.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero da ocorr�ncia: ")));	
				 oh.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da v�tima: "));
				 oh.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descri��o da ocorr�ncia: ")); 
				 oh.setLocalAssasinato(JOptionPane.showInputDialog("Entre com o local de assassinato: "));
				 listaOH.add(oh);
				 JOptionPane.showMessageDialog(null, oh.exibeInfoOcorrencia());	
				 
			 }else if(opcao < 1 || opcao > 3){JOptionPane.showMessageDialog(null, "Op��o Inv�lida"); System.exit(0);}
 
			} catch(NumberFormatException exception) {
			 JOptionPane.showMessageDialog(null, "Usu�rio entrou com um dado inv�lido, o programa ser� fechado");
			 System.exit(0);
			}
			
		}while(opcao > 1 || opcao < 4);
		
		
	}

	
	public static String getMenu() {
		String menu;
		menu =  "O que voc� deseja fazer?\n" + 
				"1 - Fazer um BO de um Latroc�nio\n" + 
				"2 - Fazer um BO de um Furto\n" + 
				"3 - Fazer um BO de um Homic�dio";
		return  menu;
	}
}
