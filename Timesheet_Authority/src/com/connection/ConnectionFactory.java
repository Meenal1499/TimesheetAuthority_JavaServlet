package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class ConnectionFactory 
{
		private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		private static final String USERNAME = "hr";
		private static final String PASSWORD = "12345";
		
		public static  Connection getConnection() 
		{
			try
			{
				DriverManager.registerDriver(new OracleDriver());
				return DriverManager.getConnection(URL, USERNAME,PASSWORD);
			}
			catch(SQLException e) 
			{
				throw new RuntimeException("Error connecting db",e);
			}
		}
		public static void main(String[] args)
		{
			Connection connection=ConnectionFactory.getConnection();
		}
}		
