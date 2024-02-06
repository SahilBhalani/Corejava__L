import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class J001_jdbcConnectivity 
{
	
	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver installedd.....");
			
			String url = "jdbc:mysql://localhost:3306/sahilsql";
			String user = "root";
			String pass = "";
			
			Connection cn = DriverManager.getConnection(url,user,pass);
			
			Statement st = cn.createStatement();
			
			ResultSet rs = st.executeQuery("select * from library");
			
			while(rs.next())
			{     
				int bid = rs.getInt(1);
				String bname = rs.getString(2);
				double price = rs.getDouble(3);
				int qty = rs.getInt(4);
				
				System.out.println(bid+" "+bname+" "+price+" "+qty);
			}
			
			
		}
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
	}

}
