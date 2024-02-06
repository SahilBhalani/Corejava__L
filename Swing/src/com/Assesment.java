package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Assesment {

	private JFrame frame;
	private JTextField uid;
	private JTextField fname;
	private JTextField lname;
	private JTextField mail;
	private JTextField mobile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assesment window = new Assesment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assesment() {
		initialize();
		connect();
		
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 456, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTERATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(156, 38, 138, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(29, 129, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("FIRST NAME");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(29, 168, 109, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("LAST NAME");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(29, 203, 109, 13);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("EMAIL");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(29, 240, 109, 13);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("MOBILE");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(29, 274, 109, 13);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		uid = new JTextField();
		uid.setBounds(153, 127, 209, 15);
		frame.getContentPane().add(uid);
		uid.setColumns(10);
		
		fname = new JTextField();
		fname.setColumns(10);
		fname.setBounds(153, 168, 209, 15);
		frame.getContentPane().add(fname);
		
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(153, 201, 209, 15);
		frame.getContentPane().add(lname);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(153, 238, 209, 15);
		frame.getContentPane().add(mail);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(153, 272, 209, 15);
		frame.getContentPane().add(mobile);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String f1  =fname.getText();
				String l1 = lname.getText();
				String e1 = mail.getText();
				String id = uid.getText();
				String m1 = mobile.getText();
				
				try {
					if(id.equals(null) || id.equals(""))
					{
					PreparedStatement ps1 = cn.prepareStatement("insert into std values(?,?,?,?,?) ");
					ps1.setInt(1, 0);
					ps1.setString(2, f1);
					ps1.setString(3, l1);
					ps1.setString(4, e1);
					ps1.setString(5, m1);
					
					int i = ps1.executeUpdate();
					
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame , "Data Inserted!!!");
						uid.setText("");
						fname.setText("");
						mail.setText("");
						lname.setText("");
						mobile.setText("");
						
						
						
					}
					}
					else
					{
						int uid = Integer.parseInt(id);
						PreparedStatement ps = cn.prepareStatement("update std set fname=?,lname=?,email=?,mobile=? where id=?");
						ps.setInt(5, uid);
						ps.setString(1, f1);
						ps.setString(2, l1);
						ps.setString(3, e1);
						ps.setString(4, m1);
						
						int i = ps.executeUpdate();	
						{
							JOptionPane.showMessageDialog(frame, "Data Updated !!!");
							fname.setText("");
							lname.setText("");
							mail.setText("");
							mobile.setText("");
							Assesment.this.uid.setText("");
							
						}
					}
					
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(137, 346, 96, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("SEARCH");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
int             id = Integer.parseInt(uid.getText());
				
				try {
					PreparedStatement ps = cn.prepareStatement("Select * from std where id = ?");
					ps.setInt(1, id);
					ResultSet rs = ps.executeQuery();
					
					if(rs.next())
					{
						fname.setText(rs.getString(2));
						lname.setText(rs.getString(3));
						mail.setText(rs.getString(4));
						mobile.setText(rs.getString(5));
					}
					else
					{
						JOptionPane.showMessageDialog(frame, "ID Not Found");
					}
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
			
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnDelete.setBounds(255, 347, 96, 38);
		frame.getContentPane().add(btnDelete);
		
		JButton btnNewButton_1_1 = new JButton("UPDATE");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String f1  = fname.getText();
				String l1 = lname.getText();
				String e1 = mail.getText();
				String m1 = mobile.getText();
				int id = Integer.parseInt(uid.getText());
				
				try {
					PreparedStatement ps = cn.prepareStatement("Select * from std where id = ?");
					ps.setInt(1, id);
					ResultSet rs = ps.executeQuery();
					
					if(rs.next())
					{
						fname.setText(rs.getString(2));
						lname.setText(rs.getString(3));
						mail.setText(rs.getString(4));
						mobile.setText(rs.getString(5));
					}
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1_1.setBounds(137, 428, 96, 38);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("DELETE");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String i1 = uid.getText();
				int uid = Integer.parseInt(i1);
				
				try {
					PreparedStatement ps2 = cn.prepareStatement("delete from std where id=?");
					ps2.setInt(1, uid);
					
					int i = ps2.executeUpdate();
					

					if(i>0)
					{
						JOptionPane.showMessageDialog(frame , "Data Deleted!!!");
						Assesment.this.uid.setText("");
						fname.setText("");
						lname.setText("");
						mail.setText("");
						mobile.setText("");
						
					}
					
					else
					{
						JOptionPane.showMessageDialog(frame, "ID Not Found");
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
				
			
		});
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1_1_1.setBounds(255, 428, 96, 38);
		frame.getContentPane().add(btnNewButton_1_1_1);
	}
}
