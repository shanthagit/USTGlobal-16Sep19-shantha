package Com.ustglobal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Four {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_emp?user=root&password=swathi";
			conn = DriverManager.getConnection(url);
			
			
			
			String sql = "update employee set name = 'tanu' where id=3";
			stmt = conn.createStatement();
			
			int count = stmt.executeUpdate(sql);
			System.out.println(count+ " Row(s) effeceted");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!= null) {
					conn.close();
				}
				if(stmt!= null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
