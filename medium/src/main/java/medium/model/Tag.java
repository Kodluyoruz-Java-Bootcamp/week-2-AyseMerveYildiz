package medium.model;

public class Tag {
	private String title;
     private User userTag;
	public Tag(String title, User userTag) {
		super();
		this.title = title;
		this.userTag = userTag;
	}

	public User getUserTag() {
		return userTag;
	}

	public void setUserTag(User userTag) {
		this.userTag = userTag;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
