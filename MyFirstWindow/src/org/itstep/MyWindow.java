package org.itstep;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow extends JFrame {

	private JTextField firstNameField;
	private JTextField secondNameField;
	private JTextField emailField;
	private JTextField passField;
	private JTextField infoField;

	public MyWindow(String title) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle(title);
		this.setSize(400, 279);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocation(300, 300);
		getContentPane().setLayout(null);

		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstName.setBounds(10, 11, 120, 30);
		getContentPane().add(lblFirstName);

		JLabel lblSecondName = new JLabel("Second name");
		lblSecondName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSecondName.setBounds(10, 52, 120, 30);
		getContentPane().add(lblSecondName);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(10, 93, 120, 30);
		getContentPane().add(lblEmail);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(10, 134, 120, 30);
		getContentPane().add(lblPassword);

		firstNameField = new JTextField();
		firstNameField.setFont(new Font("Tahoma", Font.BOLD, 14));
		firstNameField.setBounds(140, 11, 244, 30);
		getContentPane().add(firstNameField);
		firstNameField.setColumns(10);

		secondNameField = new JTextField();
		secondNameField.setFont(new Font("Tahoma", Font.BOLD, 14));
		secondNameField.setColumns(10);
		secondNameField.setBounds(140, 52, 244, 30);
		getContentPane().add(secondNameField);

		emailField = new JTextField();
		emailField.setFont(new Font("Tahoma", Font.BOLD, 14));
		emailField.setColumns(10);
		emailField.setBounds(140, 93, 244, 30);
		getContentPane().add(emailField);

		passField = new JTextField();
		passField.setFont(new Font("Tahoma", Font.BOLD, 14));
		passField.setColumns(10);
		passField.setBounds(140, 134, 244, 30);
		getContentPane().add(passField);

		JButton btnSaveAccount = new JButton("SAVE ACCOUNT");
		btnSaveAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String firstName = firstNameField.getText();
				String secondName = secondNameField.getText();
				String email = emailField.getText();
				String pass = passField.getText();

				String textToWrite = firstName + " " + secondName + " " + email + " " + pass + "\n";
				AccountSaver saver = new AccountSaver();
				saver.writeTextToFile(textToWrite);

				firstNameField.setText("");
				secondNameField.setText("");
				emailField.setText("");
				passField.setText("");

				infoField.setText("Account with E-mail " + email + " saved!");
				getContentPane().repaint();
			}
		});
		btnSaveAccount.setForeground(Color.RED);
		btnSaveAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSaveAccount.setBounds(10, 175, 374, 30);
		getContentPane().add(btnSaveAccount);

		infoField = new JTextField();
		infoField.setHorizontalAlignment(SwingConstants.CENTER);
		infoField.setToolTipText("");
		infoField.setEditable(false);
		infoField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		infoField.setBounds(10, 216, 374, 30);
		getContentPane().add(infoField);
		infoField.setColumns(10);

		this.repaint();
	}
}