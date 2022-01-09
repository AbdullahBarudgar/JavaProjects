package StudentApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class successpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					successpage frame = new successpage();
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
	
	public successpage() {
	con=DBM.database();	
		setTitle("STUDENT FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 526);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                     ADD STUDENT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(43, 11, 427, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 70, 135, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ROLL NUMBER");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 120, 124, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("FATHER'S NAME");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 167, 124, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("MOTHER'S NAME");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(10, 217, 124, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("CLASS");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(10, 264, 124, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("ADDRESS");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(10, 311, 124, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("CONTACT NO:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_6.setBounds(10, 393, 124, 14);
		contentPane.add(lblNewLabel_1_6);
		
		textField = new JTextField();
		textField.setBackground(new Color(224, 255, 255));
		textField.setBounds(180, 72, 290, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(224, 255, 255));
		textField_1.setColumns(10);
		textField_1.setBounds(180, 114, 290, 25);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(224, 255, 255));
		textField_2.setColumns(10);
		textField_2.setBounds(180, 161, 290, 25);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(224, 255, 255));
		textField_3.setColumns(10);
		textField_3.setBounds(180, 211, 290, 25);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(224, 255, 255));
		textField_4.setColumns(10);
		textField_4.setBounds(180, 258, 290, 25);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(224, 255, 255));
		textField_5.setColumns(10);
		textField_5.setBounds(180, 310, 290, 48);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(224, 255, 255));
		textField_6.setColumns(10);
		textField_6.setBounds(180, 387, 290, 25);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {	
			String name=textField.getText();
			String roll=textField_1.getText();
			String father=textField_2.getText();
			String mother=textField_3.getText();
			String grade=textField_4.getText();
			String address=textField_5.getText();
			String contact=textField_6.getText();
			
			PreparedStatement pst =con.prepareStatement("insert into student_1(Student_Name,Roll_Number,Father_Name,Mother_Name,Class,Address,Contact_Number)values(?,?,?,?,?,?,?)");
			
			pst.setString(1, name);
			pst.setString(2, roll);
			pst.setString(3, father);
			pst.setString(4, mother);
			pst.setString(5, grade);
			pst.setString(6, address);
			pst.setString(7, contact);
			
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Data is successfully added");
			
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField_5.setText("");
			textField_6.setText("");
			
			
			}
			catch(Exception e1) {
			System.out.println(e1);	
			}
			}});
		btnNewButton.setBackground(new Color(255, 235, 205));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 440, 124, 36);
		contentPane.add(btnNewButton);
		
		JButton btnDone = new JButton("DONE");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();	
			}
		});
		btnDone.setBackground(new Color(255, 228, 196));
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDone.setBounds(168, 440, 124, 36);
		contentPane.add(btnDone);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Abdullah Barudgar\\Downloads\\pexels-photo-129731 n.jpeg"));
		lblNewLabel_2.setBounds(0, 0, 494, 487);
		contentPane.add(lblNewLabel_2);
	}
}
