package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.suam.bean.OcorrenciaFurto;
import com.suam.bean.OcorrenciaLatrocinio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class RegistraFurto extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroOcorrencia;
	private JTextField txtNomeVitima;
	private JTextField txtDescricaoOcorrencia;
	private JTextField txtValorRoubado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistraFurto frame = new RegistraFurto();
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
	public RegistraFurto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     Gerador de Ocorr\u00EAncia");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setBounds(81, 11, 237, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero da Ocorr\u00EAncia:");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(34, 66, 111, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNumeroOcorrencia = new JTextField();
		txtNumeroOcorrencia.setColumns(10);
		txtNumeroOcorrencia.setBounds(165, 66, 195, 14);
		contentPane.add(txtNumeroOcorrencia);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome da V\u00EDtima:");
		lblNewLabel_1_1.setEnabled(false);
		lblNewLabel_1_1.setBounds(34, 91, 111, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtNomeVitima = new JTextField();
		txtNomeVitima.setColumns(10);
		txtNomeVitima.setBounds(165, 91, 195, 14);
		contentPane.add(txtNomeVitima);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Descri\u00E7\u00E3o da Ocorr\u00EAncia:");
		lblNewLabel_1_1_1.setEnabled(false);
		lblNewLabel_1_1_1.setBounds(34, 116, 121, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtDescricaoOcorrencia = new JTextField();
		txtDescricaoOcorrencia.setColumns(10);
		txtDescricaoOcorrencia.setBounds(165, 116, 195, 14);
		contentPane.add(txtDescricaoOcorrencia);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Valor Roubado:");
		lblNewLabel_1_1_1_1.setEnabled(false);
		lblNewLabel_1_1_1_1.setBounds(34, 141, 121, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtValorRoubado = new JTextField();
		txtValorRoubado.setColumns(10);
		txtValorRoubado.setBounds(165, 141, 195, 14);
		contentPane.add(txtValorRoubado);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNumeroOcorrencia.getText().isEmpty() || txtNomeVitima.getText().isEmpty() 
						|| txtDescricaoOcorrencia.getText().isEmpty() || txtValorRoubado.getText().isEmpty()){
							JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha corretamente");	
						}else {
							ArrayList<OcorrenciaFurto> listaOF = new ArrayList<OcorrenciaFurto>();
							OcorrenciaFurto OF = new OcorrenciaFurto();
							OF.setNumero(Integer.parseInt(txtNumeroOcorrencia.getText()));
							OF.setNomeVitima(txtNomeVitima.getText());
							OF.setDescricaoOcorrencia(txtDescricaoOcorrencia.getText());
							OF.setValorRoubado(Integer.parseInt(txtValorRoubado.getText()));
							listaOF.add(OF);
							JOptionPane.showMessageDialog(null, OF.exibeInfoOcorrencia());	
							MenuOcorrencia voltarMenu = new MenuOcorrencia();
							voltarMenu.recebeOF(listaOF);
							voltarMenu.setVisible(true);
							dispose();
						}
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBackground(SystemColor.textHighlight);
		btnCadastrar.setBounds(123, 210, 100, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuOcorrencia voltarMenu = new MenuOcorrencia();
				voltarMenu.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(SystemColor.textHighlight);
		btnVoltar.setBounds(238, 210, 100, 23);
		contentPane.add(btnVoltar);
	}
}
