package pakJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Dbutil {
	private static Connection con;
	private static final String DB_DRIVER_CLASS="con.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD= "root";
	private static final String DB_URL = "jdbc:mysql://localhost::3396/employeeDb";	
	public static Connection getConnection() {	
		try {
		    Class.forName(DB_DRIVER_CLASS);
		    System.out.println("Driver Loaded Successfully");
		    
		    con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		    System.out.println("Connection establish successfully");		   
		}		
		catch(ClassNotFoundException e) {
			System.out.println("Error....." + e.getMessage());
			//e.printStackTrace();
					
		}
		catch(SQLException e) {
			System.out.println("Error...." + e.getMessage());
			
		}
		return con;		
	}
}
