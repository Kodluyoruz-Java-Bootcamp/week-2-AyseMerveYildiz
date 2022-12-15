package medium.service;

import java.util.List;


import medium.dao.BlogDao;
import medium.model.Blog;
import medium.model.User;

public class BlogService {
	private BlogDao blogDao = new BlogDao();

	public void createBlog(Blog blog) {
		
		blogDao.createBlog(blog);
		System.out.println("createBlog :: " + blog.getTitle());
	}

	public List<Blog> getBlogs() {
		return blogDao.getBlogs();

	}

	public void printBlogs(List<Blog> blogsList) {
		getBlogs().forEach(blog -> System.out.println(blog));
	}
	
	public void removeBlog(Blog blog) {
		blogDao.removeBlog(blog);
	}
	
	public List<Blog> getAllByUserName(User user){	
		return getBlogs().stream()
		.filter(realty -> realty.getUser().getEmail().equals(user.getEmail()))
		.toList();		
	}
}
