package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Model;




public class UserDao {
	
	
	Connection cn = null;
	public UserDao()
	{
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	

	public int registration(Model m) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into mockcrud values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, m.getUname());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getPass());
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	}



	public ArrayList<Model> getusrdata() {
	
		ArrayList<Model> m = new ArrayList<Model>();
		try {
			PreparedStatement ps = cn.prepareStatement("Select * from mockcrud");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
			 Model m1 = new Model();
			 m1.setId(rs.getInt(1));
			 m1.setUname(rs.getString(2));
			 m1.setEmail(rs.getString(3));
			 m1.setPass(rs.getString(4));
			 
			 m.add(m1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m;
	}
	
}	
	
	


	

