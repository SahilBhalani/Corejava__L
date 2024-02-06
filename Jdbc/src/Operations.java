import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


	public class Operations {

		Connection cn = null;
		public Operations() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahilSQL","root","");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		Scanner sc = new Scanner(System.in);
		public void addBook()
		{
			System.out.println("***********Add book**********");
			System.out.println("enter book name : ");
			String bname = sc.next();
			System.out.println("enter book price : ");
			double price = sc.nextDouble();
			System.out.println("enter qty : ");
			int qty = sc.nextInt();
			
			try {
				
				PreparedStatement ps1 = cn.prepareStatement("select * from library where bname=?");
				ps1.setString(1, bname);
				ResultSet rs = ps1.executeQuery();
				if(rs.next())
				{
					System.out.println("book exist !!!");
				}
				else
				{
				PreparedStatement ps = cn.prepareStatement("insert into library values(?,?,?,?)");
				ps.setInt(1, 0);
				ps.setString(2, bname);
				ps.setDouble(3, price);
				ps.setInt(4, qty);
				
				int i = ps.executeUpdate();
			
				if(i>0)
				{
					System.out.println("Book inserted");
				}
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public void viewBook()
		{
			System.out.println("***********View book**********");
			try {
				PreparedStatement ps = cn.prepareStatement("select * from library");
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void deleteBook()
		{
			System.out.println("***********delete book**********");
			System.out.println("enter book name : ");
			String bname = sc.next();
			
			try {
				PreparedStatement ps = cn.prepareStatement("delete from library where bname=?");
				ps.setString(1, bname);
				int i = ps.executeUpdate();
				if(i>0)
				{
					System.out.println("Book deleted");
				}
				else
				{
					System.out.println("Book not found");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Book not found");
			}
		}
		
		public void issueBook()
		{
			System.out.println("***********issue book**********");
			System.out.println("enter book name : ");
			String bname = sc.next();
			
			PreparedStatement ps1;
			try {
				ps1 = cn.prepareStatement("select * from library where bname=?");
				ps1.setString(1, bname);
				ResultSet rs = ps1.executeQuery();
				if(rs.next())
				{
					int qty = rs.getInt(4);
					if(qty==0)
					{
						System.out.println("Book is currently not available");
					}
					else
					{
						qty = qty-1;
						PreparedStatement ps = cn.prepareStatement("update library set qty=? where bname=?");
						ps.setInt(1, qty);
						ps.setString(2, bname);
						
						int i = ps.executeUpdate();
						if(i>0)
						{
							System.out.println("book issued !!!");
						}
					}
				}
				else
				{
					System.out.println("Book not found !!");
				}
			
			
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
		}
		
	}
	

			
			
			
			
