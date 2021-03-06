package br.unipe.cc.mlpIII.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class TelaDeLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeLogin frame = new TelaDeLogin();
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
	public TelaDeLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(104, 111, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(104, 136, 46, 14);
		contentPane.add(lblSenha);
		
		textLogin = new JTextField();
		textLogin.setBounds(180, 108, 86, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		JButton btAcessar = new JButton("Acessar");
		btAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btAcessar.setBounds(94, 202, 89, 23);
		contentPane.add(btAcessar);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.setBounds(216, 202, 89, 23);
		contentPane.add(btCancelar);
		
		JPanel Painel = new JPanel();
		Painel.setBounds(0, 0, 434, 87);
		contentPane.add(Painel);
		
		JLabel lblBancoUnido = new JLabel("Sistema Banco do Brasil");
		lblBancoUnido.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GroupLayout gl_Painel = new GroupLayout(Painel);
		gl_Painel.setHorizontalGroup(
			gl_Painel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Painel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblBancoUnido, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
					.addGap(99))
		);
		gl_Painel.setVerticalGroup(
			gl_Painel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Painel.createSequentialGroup()
					.addGap(13)
					.addComponent(lblBancoUnido)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		Painel.setLayout(gl_Painel);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(180, 136, 86, 20);
		contentPane.add(textSenha);
	}
}
