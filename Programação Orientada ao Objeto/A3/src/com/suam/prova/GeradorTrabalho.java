package com.suam.prova;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.suam.prova.*;
import com.suam.prova.bean.*;

public class GeradorTrabalho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inicializando objetos
		Departamento departamento = null;
		ForcaDeTrabalho forcatrab = null;
		Funcionario func = null;
		Contratado cont = null;
		
		ArrayList<Departamento> listaDepartamento = new ArrayList<Departamento>();
		ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		ArrayList<Contratado> listaContratado = new ArrayList<Contratado>();
		ArrayList<ForcaDeTrabalho> listaForcaDeTrabalho = new ArrayList<ForcaDeTrabalho>();

		
		int opcao  = 0;
		int i = 0;
		int z = 0;
		
		int quantidadeFunc = 0;
		int quantidadeCon = 0;
		do {
			try {
			 opcao = Integer.parseInt(JOptionPane.showInputDialog(GeradorTrabalho.getMenu()));
			 if(opcao == 1) {
				 //instanciando departamento
				departamento = new Departamento();
				departamento.nomeDep = JOptionPane.showInputDialog("Entre com o nome do departamento: ");
				quantidadeFunc = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de "
			    	+ " funcion�rios do departamento " + departamento.nomeDep + ": "));
				quantidadeCon = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de "
				    + " contratados do departamento " + departamento.nomeDep + ": "));
				listaDepartamento.add(departamento);
				//loop com quantidade de funcion�rios
				for(i = 0; i < quantidadeFunc; i++) {
					// instanciando for�a de trabalho, funcion�rio e contratado
					forcatrab = new ForcaDeTrabalho();
					func = new Funcionario();
					String nome;
					int exibeNum = i + 1;
					nome = JOptionPane.showInputDialog("Entre com o nome do funcion�rio "+exibeNum+": ");
					func.numCracha = Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero de"
					+ " cracha do funcion�rio "+ nome +": "));
					forcatrab.setNome(nome);
					func.setNome(nome);
					listaFuncionario.add(func);
					listaForcaDeTrabalho.add(forcatrab);
					}
				for(z = 0; z < quantidadeCon; z++) {
					forcatrab = new ForcaDeTrabalho();
					cont = new Contratado();
					String nome;
					int exibeNum2 = z + 1;
					nome = JOptionPane.showInputDialog("Entre com o nome do contratado "+exibeNum2+": ");
					cont.codContratado = Integer.parseInt(JOptionPane.showInputDialog("Entre com o c�digo do"
							+ " contratado "+nome+": "));
					cont.setNome(nome);
					forcatrab.setNome(nome);
					listaContratado.add(cont);
					listaForcaDeTrabalho.add(forcatrab);
			 	  }
						JOptionPane.showMessageDialog(null, getResult(listaDepartamento, listaForcaDeTrabalho, 
						listaContratado, listaFuncionario));
			 	}
			} catch(NumberFormatException exception) {
			 JOptionPane.showMessageDialog(null, "Usu�rio entrou com um dado inv�lido, o programa ser� fechado.");
			 System.exit(0);
			}
			
		}while(opcao == 1);
		
		
	}

	
	public static String getMenu() {
			String menu;
			menu =  "O que voc� deseja fazer?\n" + 
					"1 - Gerenciar Departamento\n";
			return  menu;
	}
	
	public static String getResult(ArrayList<Departamento> listaDepartamento,
			ArrayList<ForcaDeTrabalho> listaForcaDeTrabalho, ArrayList<Contratado> listaContratado,
			ArrayList<Funcionario> listaFuncionario) {
			
			int y;
			int x;
			String texto = "\n DEPARTAMENTO: ";
			texto += listaDepartamento.get(0).nomeDep;
			texto += "\n~~~~~~~~~~~~~~~~~~~~~~\n";
			texto +="	CONTRATADOS: \n";
			for(y = 0; y < listaContratado.size(); y++) {
				texto+= "-"+listaContratado.get(y).getNome()+"    "+
				 "	-C�d: "+listaContratado.get(y).codContratado+"\n";
			}	
			
			texto +="	FUNCION�RIOS: \n";
			for(x = 0; x < listaFuncionario.size(); x++) {
				texto += "-"+listaFuncionario.get(x).getNome()+"    "+
				"	-Crach�: "+ listaFuncionario.get(x).numCracha+"\n";
			}
			return texto;	
	}
	
}


