package medium.service;

import medium.dao.BlogDao;
import medium.dao.UserDao;
import medium.model.User;

public class UserService {
	private UserDao userDao= new UserDao();
	private BlogService blogService = new BlogService();
	private BlogDao blogDao= new BlogDao();
	
	
	
	public void createUser(User user) {			
		userDao.createUser(user);
		
	}

}
