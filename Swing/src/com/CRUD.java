package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;


public class CRUD {

	private JFrame frame;
	private JTextField uname;
	private JTextField email;
	private JPasswordField pass;
  
 	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUD window = new CRUD();
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
	public CRUD() {
		initialize();
		connect();
		loaddata();
	}
	
	public void loaddata()
	{
		try {
			PreparedStatement ps  =cn.prepareStatement("select * from crud");
			ResultSet rs = ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Connection cn = null;
	private JTable table;
	private JTextField uid;
	public void connect()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahilSQL","root","");
				
			
			
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
		frame.setBounds(100, 100, 1092, 749);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(33, 99, 430, 371);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel un = new JLabel("Username");
		un.setFont(new Font("Times New Roman", Font.BOLD, 15));
		un.setBounds(10, 52, 81, 20);
		panel.add(un);
		
		JLabel el = new JLabel("Email");
		el.setFont(new Font("Times New Roman", Font.BOLD, 15));
		el.setBounds(10, 101, 65, 20);
		panel.add(el);
		
		JLabel ps = new JLabel("Password");
		ps.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ps.setBounds(10, 156, 65, 20);
		panel.add(ps);
		
		uname = new JTextField();
		uname.setBounds(101, 54, 215, 18);
		panel.add(uname);
		uname.setColumns(10);
		
		email = new JTextField();
		email.setBounds(101, 103, 215, 19);
		panel.add(email);
		email.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(101, 158, 215, 19);
		panel.add(pass);
		pass.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String u1  = uname.getText();
				String e1 = email.getText();
				String p1 = pass.getText();
				String id = uid.getText();
				
				try {
					if(id.equals(null) || id.equals(""))
					{
					PreparedStatement ps1 = cn.prepareStatement("insert into crud values(?,?,?,?) ");
					ps1.setInt(1, 0);
					ps1.setString(2, u1);
					ps1.setString(3, e1);
					ps1.setString(4, p1);
					
					int i = ps1.executeUpdate();
					
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame , "Data Inserted!!!");
						uname.setText("");
						email.setText("");
						pass.setText("");
						loaddata();
						
					}
					}
					else
					{
						int uid = Integer.parseInt(id);
						PreparedStatement ps = cn.prepareStatement("update crud set uname=?,email=?,pass=? where id=?");
						ps.setInt(4, uid);
						ps.setString(1, u1);
						ps.setString(2, e1);
						ps.setString(3, p1);
						
						int i = ps.executeUpdate();	
						{
							JOptionPane.showMessageDialog(frame, "Data Updated !!!");
							uname.setText("");
							email.setText("");
							pass.setText("");
							CRUD.this.uid.setText("");
							loaddata();
						}
					}
					
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			
				 
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(101, 202, 110, 34);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				uname.setText("");
				email.setText("");
				pass.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(221, 202, 95, 34);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(384, 36, 197, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(480, 97, 486, 373);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new TitledBorder(null, "Table Data", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(33, 509, 935, 123);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnEdit = new JButton("UPDATE");
		btnEdit.setBounds(399, 39, 111, 58);
		panel_1.add(btnEdit);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String u1  = uname.getText();
				String e1 = email.getText();
				String p1 = pass.getText();
				int id = Integer.parseInt(uid.getText());
				
				try {
					PreparedStatement ps = cn.prepareStatement("Select * from crud where id = ?");
					ps.setInt(1, id);
					ResultSet rs = ps.executeQuery();
					
					if(rs.next())
					{
						uname.setText(rs.getString(2));
						email.setText(rs.getString(3));
						pass.setText(rs.getString(4));
					}
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
			}
		});
		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(543, 39, 111, 58);
		panel_1.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(uid.getText());
				
				try {
					PreparedStatement ps2 = cn.prepareStatement("delete from crud where id=?");
					ps2.setInt(1, id);
					int i = ps2.executeUpdate();
					

					if(i>0)
					{
						JOptionPane.showMessageDialog(frame , "Data Deleted!!!");
						uname.setText("");
						email.setText("");
						pass.setText("");
						loaddata();
						
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel Search = new JLabel("SEARCH");
		Search.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Search.setBounds(139, 10, 82, 30);
		panel_1.add(Search);
		
		JLabel id = new JLabel("ID");
		id.setFont(new Font("Times New Roman", Font.BOLD, 15));
		id.setBounds(77, 63, 65, 20);
		panel_1.add(id);
		
		uid = new JTextField();
		uid.setColumns(10);
		uid.setBounds(127, 65, 215, 18);
		panel_1.add(uid);
	}
}
