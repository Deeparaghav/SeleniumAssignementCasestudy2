//package com.casestudy2.utils;
//
//import java.util.List;
//
//import org.testng.annotations.DataProvider;
//
//import com.casestudy2.beans.User;
//import com.casestudy2.db.UserDAO;
//
//
//public class LoginDataProviders {
//
//	@DataProvider(name = "db-inputs")
//	public Object [][] getDBData() {
//
//		List<User> list = new UserDAO().getUsers(); 
//		
//		Object[][] result = new Object[list.size()][]; 
//		int count = 0; 
//		for(User temp : list){
//			Object[]  obj = new Object[2]; 
//			obj[0] = temp.getUserName(); 
//			obj[1] = temp.getPassword(); 
//			
//			result[count ++] = obj; 
//		}
//		
//		
//		return result;
//	}
//	
//
//}
