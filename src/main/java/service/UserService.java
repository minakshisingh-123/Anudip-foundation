package service;

import java.util.List;

import DAO.UserDAO;
import model.User;

public class UserService {
	
	 private UserDAO userDao = new UserDAO();

	    public void addUser(User user) 
	    {
	        userDao.addUser(user);
	    }

		public List<User> getAllUsers()
		{
			return userDao.getAllUsers();
		}
}


