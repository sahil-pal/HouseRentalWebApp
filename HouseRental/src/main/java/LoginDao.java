import java.sql.*;  
  
public class LoginDao {  
	
public static boolean validateOwner(String name,String pass){  
		boolean status=false;  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","Admin@12345");  
      
			PreparedStatement ps=con.prepareStatement("select * from owner where id=? and password=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
      
			ResultSet rs=ps.executeQuery();  
			status=rs.next();  
			
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  
 

public static boolean validateUser(String name,String pass){  
	boolean status=false;  
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","Admin@12345");  
  
		PreparedStatement ps=con.prepareStatement("select * from user where id=? and password=?");  
		ps.setString(1,name);  
		ps.setString(2,pass);  
  
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		
	}catch(Exception e){System.out.println(e);}  
	return status;  
}  
}  