package medium.dao;

import java.util.ArrayList;
import java.util.List;

import medium.model.User;

public class UserDao {
	private static List<User> userList = new ArrayList<User>();

	public void createUser(User user) {
		userList.add(user);
	}
	
	/*public void createFollowingUser(User user) {
		userList.add(user);
	}*/


}
