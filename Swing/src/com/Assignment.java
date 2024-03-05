package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignment {

	private JFrame frmRegistrationForm;
	private JTextField sid;
	private JTextField sname;
	private JTextField scon;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment window = new Assignment();
					window.frmRegistrationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assignment() {
		initialize();
		connect();
		loaddata();
	}
	
	Connection cn = null;
	public void connect()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","");
				
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loaddata()
	{
		try {
			PreparedStatement ps  =cn.prepareStatement("select * from assign");
			ResultSet rs = ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrationForm = new JFrame();
		frmRegistrationForm.setFont(new Font("Castellar", Font.BOLD, 12));
		frmRegistrationForm.setTitle("Registration Form");
		frmRegistrationForm.setBounds(100, 100, 1142, 661);
		frmRegistrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrationForm.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 38, 414, 538);
		frmRegistrationForm.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(26, 37, 45, 13);
		panel.add(lblNewLabel);
		
		sid = new JTextField();
		sid.setBounds(122, 35, 204, 19);
		panel.add(sid);
		sid.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(26, 83, 62, 13);
		panel.add(lblName);
		
		sname = new JTextField();
		sname.setColumns(10);
		sname.setBounds(122, 81, 204, 19);
		panel.add(sname);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblGender.setBounds(26, 135, 83, 13);
		panel.add(lblGender);
		
		JRadioButton male = new JRadioButton("MALE");
		male.setFont(new Font("Times New Roman", Font.BOLD, 12));
		male.setBounds(122, 132, 83, 21);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("FEMALE");
		female.setFont(new Font("Times New Roman", Font.BOLD, 12));
		female.setBounds(220, 132, 83, 21);
		panel.add(female);
		
		ButtonGroup b1 = new ButtonGroup();
		b1.add(male);
		b1.add(female);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAddress.setBounds(26, 176, 83, 13);
		panel.add(lblAddress);
		
		JTextArea add = new JTextArea();
		add.setBounds(122, 171, 209, 19);
		panel.add(add);
		
		JLabel lblContact = new JLabel("CONTACT");
		lblContact.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblContact.setBounds(26, 218, 83, 13);
		panel.add(lblContact);
		
		scon = new JTextField();
		scon.setColumns(10);
		scon.setBounds(122, 216, 204, 19);
		panel.add(scon);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(86, 281, 100, 39);
		panel.add(btnNewButton);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String i1 = sid.getText();
				String n1 = sname.getText();
				String a1 = add.getText();
				String c1 = scon.getText();
				String gender = null;
				int sid = Integer.parseInt(i1);
				
				
				if(male.isSelected())
				{
					gender="male";
				}
				else if(female.isSelected())
				{
					gender = "female";
				}
				
				
				try {
					
					
					PreparedStatement ps = cn.prepareStatement("insert into assign values(?,?,?,?,?,?)");
					ps.setInt(1, 0);
					ps.setInt(2, sid);
					ps.setString(3, n1);
					ps.setString(4, gender);
					ps.setString(5, a1);
					ps.setString(6, c1);
					
					int i = ps.executeUpdate();
					
					if(i>0);
					{
						JOptionPane.showMessageDialog(frmRegistrationForm, "Data Registered Successfully");
						Assignment.this.sid.setText("");
						b1.clearSelection();
						sname.setText("");
						add.setText("");
						scon.setText("");
						loaddata();
					}
					}
					
					
					
					
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnRegister.setBounds(224, 281, 102, 39);
		panel.add(btnRegister);
		
		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String i1 = sid.getText(); 
				int sid= Integer.parseInt(i1);
				
				try {
					PreparedStatement ps = cn.prepareStatement("delete from assign where id = ?");
					ps.setInt(1, sid);
					
					int i = ps.executeUpdate();
					
					if(i>0)
					{
						JOptionPane.showMessageDialog(frmRegistrationForm, "Data Deleted Successfully");
						Assignment.this.sid.setText("");
						loaddata();
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1_1.setBounds(86, 357, 102, 39);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("UPDATE");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String i1  = sid.getText();
				String n1 = sname.getText();
				String a1 = add.getText();
				String c1  = scon.getText();
				String gender = null;
				if(male.isSelected())
				{
					gender = "male";
				}
				else if(female.isSelected());
				{
					gender = "female";
				}
				
				
				try {
					int sid= Integer.parseInt(i1);
					PreparedStatement ps = cn.prepareStatement("update assign set name=?,gender=?,address=?,contact=? where id=?");
					ps.setInt(5, sid);
					ps.setString(1, n1);
					ps.setString(2, gender);
					ps.setString(3, a1);
					ps.setString(4, c1);
					
					int i = ps.executeUpdate();	
					{
						JOptionPane.showMessageDialog(frmRegistrationForm, "Data Updated !!!");
						sname.setText("");
						add.setText("");
						scon.setText("");
						b1.clearSelection();
						Assignment.this.sid.setText("");
						loaddata();
						
					}
					
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1_1_1.setBounds(224, 357, 102, 39);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("RESET");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Assignment.this.sid.setText("");
				b1.clearSelection();
				sname.setText("");
				add.setText("");
				scon.setText("");
				
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1_1_1_1.setBounds(161, 417, 100, 39);
		panel.add(btnNewButton_1_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(434, 38, 664, 530);
		frmRegistrationForm.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("REFRESH TABLE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					PreparedStatement ps = cn.prepareStatement("Select * from assign");
					
					ResultSet rs = ps.executeQuery();
					
					if(rs.next())
					{
						loaddata();
					}
					
					else
					{
						JOptionPane.showMessageDialog(frmRegistrationForm, "Table Not Refreshed");
					}
					
				} 
				
				
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(544, 581, 481, 21);
		frmRegistrationForm.getContentPane().add(btnNewButton_1);
	}
}
