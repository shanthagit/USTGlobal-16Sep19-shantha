package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;


/*import com.mysql.jdbc.Driver;*/

public class DeleteQuery1 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName("driver-name");
			
			String url = prop.getProperty("url");
			conn= DriverManager.getConnection(url,prop);
			
			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);
				
			/*
			 * String empid = args[0]; int id = Integer.parseInt(empid); pstmt.setInt(1,id);
			 */
			
			pstmt.setInt(1,Integer.parseInt(args[0]));			
			int count =pstmt. executeUpdate();			
			System.out.println(count+ "  Row(s) effected");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
