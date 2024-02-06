import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	
	ResultSet rs = null;
	
	public boolean Login()
	{
		
		boolean b = false;
		Connection cn = null;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username : ");
		String uname = sc.next();
		System.out.println("enter password");
		String password = sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahilSQL", "root", "");
			
			PreparedStatement ps1 = cn.prepareStatement("select * from login where uname=? and password=?");
		
			ps1.setString(1, uname);
			ps1.setString(2, password);
			
			rs = ps1.executeQuery();
			if(rs.next())
			{
				b = true;
				
			}
			else
			{
				b = false;
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return b;
	}
}
