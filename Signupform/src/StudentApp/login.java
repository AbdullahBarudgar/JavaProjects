package StudentApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	private JPasswordField pass;
	private JTextField id;
	public login() {
		setTitle("LOGIN PAGE");
		con=DBM.database();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 98, 151, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(22, 138, 151, 24);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("           LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(124, 11, 168, 30);
		contentPane.add(lblNewLabel_1);
		
		user = new JTextField();
		user.setBackground(new Color(224, 255, 255));
		user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		user.setBounds(134, 97, 246, 25);
		contentPane.add(user);
		user.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(new Color(255, 192, 203));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String u=user.getText();
			    String  p=String.valueOf(pass.getPassword());
			    String i=id.getText();
		
			    
			    try {
					PreparedStatement pst=con.prepareStatement("select * from student where Id_Number=? and Name=? and  Password=? ");
					pst.setString(1, i);
					pst.setString(2, u);
					pst.setString(3, p);
					ResultSet re=pst.executeQuery();
					
					if(re.next()) {
					
						successpage s=new successpage();
						s.setVisible(true);
						}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect username or Password or Id Number");
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(155, 198, 145, 38);
		contentPane.add(btnNewButton);
		
		pass = new JPasswordField();
		pass.setBackground(new Color(224, 255, 255));
		pass.setBounds(134, 137, 246, 25);
		contentPane.add(pass);
		
		JLabel lblNewLabel_2 = new JLabel("ID NUMBER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(22, 58, 151, 24);
		contentPane.add(lblNewLabel_2);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBackground(new Color(224, 255, 255));
		id.setBounds(134, 57, 246, 24);
		contentPane.add(id);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Abdullah Barudgar\\Downloads\\pexels-photo-1323550.jpeg"));
		lblNewLabel_3.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_3);
	}
}
