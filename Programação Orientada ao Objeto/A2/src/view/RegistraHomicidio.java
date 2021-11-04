package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.suam.bean.OcorrenciaFurto;
import com.suam.bean.OcorrenciaHomicidio;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class RegistraHomicidio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroOcorrencia;
	private JTextField txtNomeVitima;
	private JTextField txtDescricaoOcorrencia;
	private JTextField txtLocalAssassinato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistraHomicidio frame = new RegistraHomicidio();
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
	public RegistraHomicidio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.WHITE);
		contentPane_1.setBounds(0, 0, 434, 261);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("     Gerador de Ocorr\u00EAncia");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setBounds(81, 11, 237, 40);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero da Ocorr\u00EAncia:");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(34, 66, 111, 14);
		contentPane_1.add(lblNewLabel_1);
		
		txtNumeroOcorrencia = new JTextField();
		txtNumeroOcorrencia.setColumns(10);
		txtNumeroOcorrencia.setBounds(165, 66, 195, 14);
		contentPane_1.add(txtNumeroOcorrencia);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome da V\u00EDtima:");
		lblNewLabel_1_1.setEnabled(false);
		lblNewLabel_1_1.setBounds(34, 91, 111, 14);
		contentPane_1.add(lblNewLabel_1_1);
		
		txtNomeVitima = new JTextField();
		txtNomeVitima.setColumns(10);
		txtNomeVitima.setBounds(165, 91, 195, 14);
		contentPane_1.add(txtNomeVitima);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Descri\u00E7\u00E3o da Ocorr\u00EAncia:");
		lblNewLabel_1_1_1.setEnabled(false);
		lblNewLabel_1_1_1.setBounds(34, 116, 121, 14);
		contentPane_1.add(lblNewLabel_1_1_1);
		
		txtDescricaoOcorrencia = new JTextField();
		txtDescricaoOcorrencia.setColumns(10);
		txtDescricaoOcorrencia.setBounds(165, 116, 195, 14);
		contentPane_1.add(txtDescricaoOcorrencia);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Local de Assassinato:");
		lblNewLabel_1_1_1_1.setEnabled(false);
		lblNewLabel_1_1_1_1.setBounds(34, 141, 121, 14);
		contentPane_1.add(lblNewLabel_1_1_1_1);
		
		txtLocalAssassinato = new JTextField();
		txtLocalAssassinato.setColumns(10);
		txtLocalAssassinato.setBounds(165, 141, 195, 14);
		contentPane_1.add(txtLocalAssassinato);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtNumeroOcorrencia.getText().isEmpty() || txtNomeVitima.getText().isEmpty() 
						|| txtDescricaoOcorrencia.getText().isEmpty() || txtLocalAssassinato.getText().isEmpty()){
							JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha corretamente");	
						}else {
							ArrayList<OcorrenciaHomicidio> listaOH = new ArrayList<OcorrenciaHomicidio>();
							OcorrenciaHomicidio OH = new OcorrenciaHomicidio();
							OH.setNumero(Integer.parseInt(txtNumeroOcorrencia.getText()));
							OH.setNomeVitima(txtNomeVitima.getText());
							OH.setDescricaoOcorrencia(txtDescricaoOcorrencia.getText());
							OH.setLocalAssasinato(txtLocalAssassinato.getText());
							listaOH.add(OH);
							JOptionPane.showMessageDialog(null, OH.exibeInfoOcorrencia());	
							MenuOcorrencia voltarMenu = new MenuOcorrencia();
							voltarMenu.recebeOH(listaOH);
							voltarMenu.setVisible(true);
							dispose();
						}
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBackground(SystemColor.textHighlight);
		btnCadastrar.setBounds(123, 210, 100, 23);
		contentPane_1.add(btnCadastrar);
		
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
		contentPane_1.add(btnVoltar);
	}
}
