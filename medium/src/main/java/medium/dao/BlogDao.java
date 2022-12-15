package medium.dao;

import java.util.ArrayList;
import java.util.List;

import medium.model.Blog;


public class BlogDao {
	private static List<Blog> blogList = new ArrayList<Blog>();

	public void createBlog(Blog blog) {
		blogList.add(blog);
	}
	
	public List<Blog> getBlogs(){
		return blogList;
	}
	
	public void removeBlog(Blog blog) {
		blogList.remove(blog);
	}
	
}
