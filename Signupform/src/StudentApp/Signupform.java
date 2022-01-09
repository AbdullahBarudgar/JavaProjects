package StudentApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Signupform extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JTextField textField_4;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signupform frame = new Signupform();
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
	Connection con=null;
	public Signupform() {
	con=DBM.database();	
		setTitle("TEACHER SIGNUP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 509);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEACHER NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(27, 72, 123, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblClass = new JLabel("CLASS TEACHER");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClass.setBounds(27, 121, 123, 26);
		contentPane.add(lblClass);
		
		JLabel lblRollNumber = new JLabel("ID NUMBER");
		lblRollNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRollNumber.setBounds(27, 174, 141, 26);
		contentPane.add(lblRollNumber);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(27, 224, 100, 26);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(27, 273, 100, 26);
		contentPane.add(lblPassword);
		
		JLabel lblContactNo = new JLabel("CONTACT  NO:");
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContactNo.setBounds(27, 325, 123, 26);
		contentPane.add(lblContactNo);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setBackground(new Color(255, 222, 173));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		try {		
		String name=textField.getText();
		String grade=textField_1.getText();
		String id=textField_2.getText();
		String email=textField_3.getText();
		String pass=passwordField.getText();
		String contact=textField_4.getText();
		
		PreparedStatement pst=con.prepareStatement("insert into student(Name,Class,Id_Number,Email,Password,Contact)values(?,?,?,?,?,?)");
		
		pst.setString(1, name);
		pst.setString(2, grade);
		pst.setString(3, id);
		pst.setString(4, email);
		pst.setString(5, pass);
		pst.setString(6, contact);
		
		pst.executeUpdate();
		JOptionPane.showMessageDialog(null, "Data is successfully added");
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
	    passwordField.setText("");
	    textField_4.setText("");
		
		}
		catch(Exception e1) {
		System.out.println(e1);	
		}
			}});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(27, 422, 115, 37);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(new Color(224, 255, 255));
		textField.setBounds(160, 74, 272, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(224, 255, 255));
		textField_1.setColumns(10);
		textField_1.setBounds(160, 123, 272, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(224, 255, 255));
		textField_2.setColumns(10);
		textField_2.setBounds(160, 176, 272, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(224, 255, 255));
		textField_3.setColumns(10);
		textField_3.setBounds(160, 226, 272, 26);
		contentPane.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(224, 255, 255));
		passwordField.setBounds(160, 275, 272, 26);
		contentPane.add(passwordField);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(224, 255, 255));
		textField_4.setColumns(10);
		textField_4.setBounds(160, 327, 272, 26);
		contentPane.add(textField_4);
		
		JButton btnExit_1 = new JButton("EXIT");
		btnExit_1.setBackground(new Color(255, 222, 173));
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();	
			}
		});
		btnExit_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit_1.setBounds(312, 422, 123, 37);
		contentPane.add(btnExit_1);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			login l=new login();
			l.setVisible(true);
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogin.setBackground(new Color(255, 222, 173));
		btnLogin.setBounds(162, 422, 123, 37);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("                     WELCOME STUDENT DATABASE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(48, 25, 430, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("  Please signup or if already done then login");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(26, 382, 391, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Abdullah Barudgar\\Downloads\\pexels-photo-129731 n.jpeg"));
		lblNewLabel_3.setBounds(0, 0, 602, 470);
		contentPane.add(lblNewLabel_3);
	}
}
