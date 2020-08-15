package com.casestudy2.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.ArrayList;

import com.casestudy2.beans.User;

public class UserDAO {
		
		public User getUsers(){
			String sql ="select firstname,lastname,username,password,email from users"; 
			GetConnection gc = new GetConnection(); 
			User user = new User();
			try {
				gc.ps1 = GetConnection.getMySQLConnection().prepareStatement(sql);
				gc.rs = gc.ps1.executeQuery(); 
				while(gc.rs.next()) 
				{
					user.setFirstName(gc.rs.getString("firstname")); 
					user.setLastName(gc.rs.getString("lastname")); 
					user.setEmailid(gc.rs.getString("email"));
					user.setPassword(gc.rs.getString("password"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return user; 
		}
				
}
