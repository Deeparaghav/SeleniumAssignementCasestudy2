package com.casestudy2.db;

import java.util.List;

import com.casestudy2.beans.ComposeMessage;
import com.casestudy2.beans.User;
import com.casestudy2.db.UserDAO;

public class DBClient 
{
		UserDAO userDao = new UserDAO();
		User user = userDao.getUsers();
		public String firstname = user.getFirstName();
		public String lastname = user.getLastName();
		public String username = user.getUserName();
		public String password = user.getPassword();
		public String email = user.getEmailid();

}
