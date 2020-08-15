//package com.casestudy2.beans;
//
//import java.util.Iterator;
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.casestudy2.beans.User;
//import com.casestudy2.db.UserDAO;
//
//public class ParameterizationDataproviderTestDB {
//  @Test(dataProvider = "userData")
//  public void myTest(User user) {
//	  	  
//	  System.out.println("UserName: " + user.getFirstName());
//	  System.out.println("Password: " + user.getLastName());
//  }
//  
//  // data provider is the method
//  @DataProvider(name="userData")
//  public  Iterator<User> getMyData(){
//	return new UserDAO().getUsers().iterator();
//  } 
//  
//}
