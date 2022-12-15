package medium.model;

public class Blog {
	private String title;
	private int blogNo;
	private User user;
	 
	
	
	
	public Blog() {
		super();
	}
	public Blog(String title, int blogNo, User user) {
		super();
		this.title = title;
		this.blogNo = blogNo;
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getBlogNo() {
		return blogNo;
	}
	public void setBlogNo(int blogNo) {
		this.blogNo = blogNo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
