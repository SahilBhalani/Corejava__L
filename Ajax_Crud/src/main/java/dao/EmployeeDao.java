package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Employee;

public class EmployeeDao {

	Connection cn = null;

	public EmployeeDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int registration(Employee e) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into reg values(?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, e.getFname());
			ps.setString(3, e.getLname());
			ps.setString(4, e.getEmail());
			ps.setString(5, e.getPass());
			ps.setString(6, e.getPhone());

			i = ps.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;

	}

	public String logincheck(Employee e) {
		String uname = null;

		try {
			PreparedStatement ps = cn.prepareStatement("select * from reg where email=? and pass=?");
			ps.setString(1, e.getEmail());
			ps.setString(2, e.getPass());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				uname = rs.getString(2);
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return uname;
	}

	public boolean isEmailExist(Model.Employee e) {

		boolean b = false;

		try {
			PreparedStatement ps = cn.prepareStatement("select * from reg where email=?");
			ps.setString(1, e.getEmail());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				b = true;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return b;
	}

	public ArrayList<Employee> getEmpData() {
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("select * from reg");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
			Employee e1 = new Employee();
			e1.setId(rs.getInt(1));
			e1.setFname(rs.getString(2));
			e1.setLname(rs.getString(3));
			e1.setEmail(rs.getString(4));
			e1.setPass(rs.getString(5));
			e1.setPhone(rs.getString(6));
			
			e.add(e1);
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
		return e;
	}


	public int deleteEmp(int uid) {
		int i = 0;
		
		try {
			PreparedStatement ps = cn.prepareStatement("delete from reg where id=?");
			ps.setInt(1,uid);
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return i;
	}

	public Employee GetEmpId(int uid) {
		Employee e = new Employee();
		try {
			PreparedStatement ps  =cn.prepareStatement("select * from reg where id=?");
			ps.setInt(1, uid);

			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				e.setId(rs.getInt(1));
				e.setFname(rs.getString(2));
				e.setLname(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setPass(rs.getString(5));
				e.setPhone(rs.getString(6));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
		
	}
	
	public int UpdateEmp(Employee e)
	{
		int i = 0;
		
		try {
			PreparedStatement ps = cn.prepareStatement("update reg set fname=?,lname=?,email=?,pass=?,phone=? where id=?");
			ps.setString(1, e.getFname());
			ps.setString(2, e.getLname());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getPass());
			ps.setString(5, e.getPhone());
			ps.setInt(6, e.getId());
			
			i = ps.executeUpdate();
		
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;
	}
	

}
