package pakJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInterfaceDemo {

	static Connection cn;
	static Statement st;
	static {
		cn = Dbutil.getConnection();
		
	}
		
		public static boolean deleteEmp(int Empid) {
		boolean status = false;
		try {
			int n = validateEmp(Empid);
			if(n ==1) {
				String query = "Delete From emp Where id=" + empId);
				status = true;
				
			}
			catch(SqlExceptio e) {
				System.out.println("Error......" e.getMeaasge());
				
			}
			return status;
			
		}
		public static int validateEmp(int empId) {
			
			int n =0;
			try {
				String query = "SELECT  Count(*) FROM emp where id=" empid;
				ResultSet rs = st.excuteQuery();
				
						
			}
			
			
			public static boolean updateEmpname(int empId, String empName) {
				boolean status = false;
				try {
				if(validateEmp(empId) ==1) {
					String query = "Update emp set name" + empName + "WHERE  id=" + empId;
					st.executeLargeUpdate(query);
					status = true;
					
				}
				else {
					System.out.println("No Such Employee recored....");
					
				}
				catch(SQLException e) {
					System.out.println("Error..." + e.getMessage());
					
					
				}
				
				return status;
				
			}
				
				public static void showeEmp() {
					try {
						String query = "SELECT * FROM emp";
						ResultSet rs = st.executeQuery(query);
						
						if(rs.next()) {
							while(rs.next()) {
								System.out.println(rs.getInt(1) + "\t" + rs.getString(2), + "\t" + rs.getDouble(3));
								
							}
							else
								System.out.println("No Employee Recorded");
							    rs.close();
							   
						}
						catch (SQLException e) {
							System.out.println("ERROR...." + e.getMessage());
							
						}
						
					}
					
					public void closeConnection() {
						st.close();
						cn.close();
						
					}
				}
				
				
		}
			
	}

	
}
