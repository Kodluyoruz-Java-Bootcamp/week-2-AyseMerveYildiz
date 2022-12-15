package medium.model;

import java.util.List;

public class User {
	private String userName;
	private String followingUser;
	
	private String userPassword;
	private String email;
	private List<Blog> bloglist;
	private List<Blog> savedBloglist;
	private List<Tag> tags;
	
	
	
	public String getFollowingUser() {
		return followingUser;
	}
	public void setFollowingUser(String followingUser) {
		this.followingUser = followingUser;
	}
	public List<Blog> getSavedBloglist() {
		return savedBloglist;
	}
	public void setSavedBloglist(List<Blog> savedBloglist) {
		this.savedBloglist = savedBloglist;
	}
	public User() {
		super();
	}
	public User(String userName, String userPassword, String email, List<Blog> bloglist) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
		this.bloglist = bloglist;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Blog> getBloglist() {
		return bloglist;
	}
	public void setBloglist(List<Blog> bloglist) {
		this.bloglist = bloglist;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

}
