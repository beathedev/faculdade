package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	//Inicializando objeto
	Empresa emp = null;

	//Criando arrays lists
	ArrayList<Cliente> listaCliente = new ArrayList<Cliente>(); 
	ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>(); 

	//Inicializando contadores
	int contCliente = 0;
	int contFunc = 0;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecione uma das Op\u00E7\u00F5es");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel.setBounds(69, 24, 312, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastrar Empresa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(emp == null) {
					emp = new Empresa();
					emp.nome = JOptionPane.showInputDialog("Entre com o nome da empresa: ");
					emp.cnpj = JOptionPane.showInputDialog("Entre com o CNPJ da empresa "+emp.nome+": ");
					}else {
					JOptionPane.showMessageDialog(null, "Não é possível criar outra empresa.");
					}
			}
		});
		btnNewButton.setBounds(130, 68, 174, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar Cliente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(emp != null) {
					 if( contCliente <= listaCliente.size()) {
						 Cliente c = new Cliente();
						 c.setNome(JOptionPane.showInputDialog("Entre com o nome do cliente: "));
						 c.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade do cliente: ")));
						 listaCliente.add(c);
						 emp.cliente = c;
						 contCliente++;
					 } else {
					 JOptionPane.showMessageDialog(null, "Não é possível criar outro cliente.");		
					 }
				} else {
				JOptionPane.showMessageDialog(null, "Não é possível associar clientes, é preciso criar uma empresa primeiro.");					
				}
			}
		});
		btnNewButton_1.setBounds(130, 96, 174, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cadastrar Funcion\u00E1rio");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(emp != null) {
					 if( contFunc <= listaFuncionario.size()) {
						 Funcionario f = new Funcionario();
						 f.setNome(JOptionPane.showInputDialog("Entre com o nome do funcionário: "));
						 f.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade do funcionário: ")));
						 listaFuncionario.add(f);
						 emp.funcionario = f;
						 contFunc++;
					 } else {
					 JOptionPane.showMessageDialog(null, "Não é possível criar outro funcionário.");		
					 }
				} else {
				JOptionPane.showMessageDialog(null, "Não é possível associar funcionários, é preciso criar uma empresa primeiro.");					
				}
			}
		});
		btnNewButton_2.setBounds(130, 123, 174, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Informa\u00E7\u00F5es da Empresa");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(emp != null) {
					JOptionPane.showMessageDialog(null, listarEmpresa(emp, contCliente, contFunc));					
					} else {
					JOptionPane.showMessageDialog(null, "Nenhuma empresa encontrada");					
					}
			}
		});
		btnNewButton_3.setBounds(130, 149, 174, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(" Listar Clientes");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(emp != null) {
					if( listaCliente.size() > 0) {
						    JOptionPane.showMessageDialog(null, listarCliente(listaCliente));				
					}else {
							JOptionPane.showMessageDialog(null, "Nenhum cliente encontrado.");		
					}
				} else {
				JOptionPane.showMessageDialog(null, "Não é possível visualizar clientes, é preciso criar uma empresa primeiro.");					
				}
			}
		});
		btnNewButton_4.setBounds(130, 176, 174, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Listar Funcion\u00E1rios");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(emp != null) {
					if( listaFuncionario.size() > 0) {
						    JOptionPane.showMessageDialog(null, listarFuncionario(listaFuncionario));				
					}else {
							JOptionPane.showMessageDialog(null, "Nenhum funcionário encontrado.");		
					}
				} else {
				JOptionPane.showMessageDialog(null, "Não é possível visualizar funcionários, é preciso criar uma empresa primeiro.");					
				}
			}
		});
		btnNewButton_5.setBounds(130, 201, 174, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("Sair");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcaoSair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair? \n");
				if(opcaoSair == 0) {
					System.exit(0);
				}
			}
		});
		btnNewButton_5_1.setBounds(130, 227, 174, 23);
		contentPane.add(btnNewButton_5_1);
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

	public static String listarEmpresa(Empresa emp, int contCliente, int contFunc ){		
		String exibicao="";
		exibicao+="\n---------------------------------------\n";
		exibicao+="Nome: "+emp.nome+" | CNPJ: "+emp.cnpj+" | Nº Clientes: "+contCliente+" | Nº Funcionários: "+contFunc;
		exibicao+="\n---------------------------------------\n";
		return exibicao;
	}
}
