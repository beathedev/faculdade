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
			    	+ " funcionários do departamento " + departamento.nomeDep + ": "));
				quantidadeCon = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de "
				    + " contratados do departamento " + departamento.nomeDep + ": "));
				listaDepartamento.add(departamento);
				//loop com quantidade de funcionários
				for(i = 0; i < quantidadeFunc; i++) {
					// instanciando força de trabalho, funcionário e contratado
					forcatrab = new ForcaDeTrabalho();
					func = new Funcionario();
					String nome;
					int exibeNum = i + 1;
					nome = JOptionPane.showInputDialog("Entre com o nome do funcionário "+exibeNum+": ");
					func.numCracha = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de"
					+ " cracha do funcionário "+ nome +": "));
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
					cont.codContratado = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código do"
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
			 JOptionPane.showMessageDialog(null, "Usuário entrou com um dado inválido, o programa será fechado.");
			 System.exit(0);
			}
			
		}while(opcao == 1);
		
		
	}

	
	public static String getMenu() {
			String menu;
			menu =  "O que você deseja fazer?\n" + 
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
				 "	-Cód: "+listaContratado.get(y).codContratado+"\n";
			}	
			
			texto +="	FUNCIONÁRIOS: \n";
			for(x = 0; x < listaFuncionario.size(); x++) {
				texto += "-"+listaFuncionario.get(x).getNome()+"    "+
				"	-Crachá: "+ listaFuncionario.get(x).numCracha+"\n";
			}
			return texto;	
	}
	
}


