package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.suam.bean.OcorrenciaLatrocinio;
import com.suam.bean.OcorrenciaFurto;
import com.suam.bean.OcorrenciaHomicidio;
import com.suam.bean.OcorrenciaPolicial;


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MenuOcorrencia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	//Inicializando listas
			ArrayList<OcorrenciaLatrocinio> listaOL = new ArrayList<OcorrenciaLatrocinio>();
			ArrayList<OcorrenciaFurto> listaOF = new ArrayList<OcorrenciaFurto>();
			ArrayList<OcorrenciaHomicidio> listaOH = new ArrayList<OcorrenciaHomicidio>();
			
			
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuOcorrencia frame = new MenuOcorrencia();
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
	public  MenuOcorrencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLatrocinio = new JButton("Fazer um BO de um Latroc\u00EDnio");
		btnLatrocinio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistraLatrocinio tela1 = new RegistraLatrocinio();
				tela1.setVisible(true);
				dispose();
			}
		});
		
		btnLatrocinio.setBackground(SystemColor.textHighlight);
		btnLatrocinio.setForeground(SystemColor.text);
		btnLatrocinio.setBounds(122, 82, 176, 28);
		contentPane.add(btnLatrocinio);
		
		JButton btnNewButton_1 = new JButton("Fazer um BO de um Furto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistraFurto tela2 = new RegistraFurto();
				tela2.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(122, 118, 176, 28);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Fazer um BO de um Homic\u00EDdio");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistraHomicidio tela3 = new RegistraHomicidio();
				tela3.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(SystemColor.text);
		btnNewButton_1_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1_1.setBounds(122, 156, 176, 28);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("     Gerador de Ocorr\u00EAncia");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setBounds(81, 17, 237, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("O que voc\u00EA deseja fazer?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(104, 51, 208, 14);
		contentPane.add(lblNewLabel_1);
	}
	
	public void recebeOL(ArrayList<OcorrenciaLatrocinio> listaOL2) {
		listaOL = listaOL2;
	}
	
	public void recebeOF(ArrayList<OcorrenciaFurto> listaOF2) {
		listaOF = listaOF2;
	}
	
	public void recebeOH(ArrayList<OcorrenciaHomicidio> listaOH2) {
		listaOH = listaOH2;
	}

}



