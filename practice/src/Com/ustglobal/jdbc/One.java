package Com.ustglobal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;
public class One {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?" +"user=root&password=swathi";
			conn =DriverManager.getConnection(url);
			
			String sql = "Select * from employee";
			stmt = conn.createStatement();
			
			res= stmt.executeQuery(sql);
			
			while(res.next()) {
				int id =res.getInt("id");
				String name = res.getString("name");
				int sal = res.getInt("sal");
				String gender = res.getString("gender");
				
				System.out.println("Id is : "+id);
				System.out.println("Name is : "+name);
				System.out.println("Sal is : "+sal);
				System.out.println("Gender is : "+gender);
				System.out.println("************************************");
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}// end trycatch
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(res!=null) {
					res.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	}//end of main

}
