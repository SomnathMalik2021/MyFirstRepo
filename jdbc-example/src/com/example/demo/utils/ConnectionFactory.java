package com.example.demo.utils;
import java.sql.* ;
import java.util.ResourceBundle;
import java.io.*;

public class ConnectionFactory {
	public static Connection getMySqlConnection() {
		Connection con = null ; 
		try{
			ResourceBundle bundle = ResourceBundle.getBundle("application") ;  
			String url = bundle.getString("url") ; 
			String password = bundle.getString("password") ;
			String username = bundle.getString("username") ; 
			con = DriverManager.getConnection(url, username, password) ; 
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con ; 
	}
}
