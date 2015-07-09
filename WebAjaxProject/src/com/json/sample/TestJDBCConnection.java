/**
 * 
 */
package com.json.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author vpoli
 *
 */
public class TestJDBCConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestJDBCConnection testJDBCConnection = new TestJDBCConnection();
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection conn = testJDBCConnection.getConnection();
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from APP.FIRSTTABLE");
			while(resultSet.next()){
				int id = resultSet.getInt(1);
				System.out.println("ID : " + id);
				String name = resultSet.getString(2);
				System.out.println("Name : " + name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Connection getConnection() throws SQLException {

	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    connectionProps.put("user", "venu");
	    connectionProps.put("password", "venu");
	    
	        conn = DriverManager.getConnection(
	                   "jdbc:derby://localhost:1527/TestDB;create=true;upgrade=true",
	                   connectionProps);

	        System.out.println("Connected to database");
	    return conn;
	}


}
