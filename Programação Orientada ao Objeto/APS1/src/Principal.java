import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		boolean sair = false;
		
		//Inicializando objeto
		Empresa e = null;
		
		//Criando arrays lists
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>(); 
		ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>(); 

		//Inicializando contadores
		int contCliente = 0;
		int contFunc = 0;
		
		//Menu
		while(!sair) {
			String op =JOptionPane.showInputDialog(montaMenu(), null);
			if(op.equals("1")) {
				if(e == null) {
				e = new Empresa();
				e.nome = JOptionPane.showInputDialog("Entre com o nome da empresa: ");
				e.cnpj = JOptionPane.showInputDialog("Entre com o CNPJ da empresa "+e.nome+": ");
				}else {
				JOptionPane.showMessageDialog(null, "Não é possível criar outra empresa.");
				}
			}//Opção 1
			
			if(op.equals("2")) {
				if(e != null) {
					 if( contCliente <= listaCliente.size()) {
						 Cliente c = new Cliente();
						 c.setNome(JOptionPane.showInputDialog("Entre com o nome do cliente: "));
						 c.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade do cliente: ")));
						 listaCliente.add(c);
						 e.cliente = c;
						 contCliente++;
					 } else {
					 JOptionPane.showMessageDialog(null, "Não é possível criar outro cliente.");		
					 }
				} else {
				JOptionPane.showMessageDialog(null, "Não é possível associar clientes, é preciso criar uma empresa primeiro.");					
				}
			}// Opção 2
			
			if(op.equals("3")) {
				if(e != null) {
					 if( contFunc <= listaFuncionario.size()) {
						 Funcionario f = new Funcionario();
						 f.setNome(JOptionPane.showInputDialog("Entre com o nome do funcionário: "));
						 f.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade do funcionário: ")));
						 listaFuncionario.add(f);
						 e.funcionario = f;
						 contFunc++;
					 } else {
					 JOptionPane.showMessageDialog(null, "Não é possível criar outro funcionário.");		
					 }
				} else {
				JOptionPane.showMessageDialog(null, "Não é possível associar funcionários, é preciso criar uma empresa primeiro.");					
				}
		  }// Opção 3
			
			if(op.equals("4")){
				if(e != null) {
				JOptionPane.showMessageDialog(null, listarEmpresa(e, contCliente, contFunc));					
				} else {
				JOptionPane.showMessageDialog(null, "Nenhuma empresa encontrada");					
				}
		  }// Opção 4	
			
		if(op.equals("5")){
				if(e != null) {
					if( listaCliente.size() > 0) {
						    JOptionPane.showMessageDialog(null, listarCliente(listaCliente));				
					}else {
							JOptionPane.showMessageDialog(null, "Nenhum cliente encontrado.");		
					}
				} else {
				JOptionPane.showMessageDialog(null, "Não é possível visualizar clientes, é preciso criar uma empresa primeiro.");					
				}
		   }// Opção 5
		
		if(op.equals("6")){
			if(e != null) {
				if( listaFuncionario.size() > 0) {
					    JOptionPane.showMessageDialog(null, listarFuncionario(listaFuncionario));				
				}else {
						JOptionPane.showMessageDialog(null, "Nenhum funcionário encontrado.");		
				}
			} else {
			JOptionPane.showMessageDialog(null, "Não é possível visualizar funcionários, é preciso criar uma empresa primeiro.");					
			}
			}//Opção 6
		if(op.equals("7")){
		int opcaoSair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair? \n");
		if(opcaoSair == 0) {
			sair = true;
		}
		}
		
		}// While - menu
		System.exit(0);
	}
	public static String montaMenu() {
		String menu="";
		menu+=" \n --------------------------------------- \n";
		menu+=" 1 - Criar Empresa\n";
		menu+=" 2 - Associar cliente à empresa \n";
		menu+=" 3 - Associar funcionário à empresa \n";
		menu+=" 4 - Informações da empresa \n";
		menu+=" 5 - Listar clientes \n";
		menu+=" 6 - Listar funcionários \n";
		menu+=" 7 - Sair \n";
		menu+=" \n --------------------------------------- \n";
		return menu;
	}

	public static String listarCliente(ArrayList<Cliente> listaCliente ){		
		String exibicao="";
		exibicao+="\n---------------------------------------\n";
		for(int y=0; y<listaCliente.size(); y++){
		exibicao+=listaCliente.get(y).getCliente();
		}
		exibicao+="\n---------------------------------------\n";
		return exibicao;
	}
	
	public static String listarFuncionario(ArrayList<Funcionario> listaFuncionario ){		
		String exibicao="";
		exibicao+="\n---------------------------------------\n";
		for(int z=0; z<listaFuncionario.size(); z++){
		exibicao+=listaFuncionario.get(z).getFuncionario();
		}
		exibicao+="\n---------------------------------------\n";

		return exibicao;
	}

	public static String listarEmpresa(Empresa e, int contCliente, int contFunc ){		
		String exibicao="";
		exibicao+="\n---------------------------------------\n";
		exibicao+="Nome: "+e.nome+" | CNPJ: "+e.cnpj+" | Nº Clientes: "+contCliente+" | Nº Funcionários: "+contFunc;
		exibicao+="\n---------------------------------------\n";
		return exibicao;
	}
	
}
