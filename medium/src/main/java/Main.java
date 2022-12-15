import java.util.ArrayList;
import java.util.List;

import medium.dao.BlogDao;
import medium.model.Blog;
import medium.model.Tag;
import medium.model.User;
import medium.service.BlogService;
import medium.service.UserService;

public class Main {

	public static void main(String[] args) {

		User user = new User();
		user.setUserName("Merve");
		user.setEmail("merveyildiz@gmail.com");
		user.setUserPassword("123");

		UserService userService = new UserService();
		userService.createUser(user);

		BlogService blogService = new BlogService();
		
		// Bloglarımız
		Blog blog = new Blog();
		blog.setTitle("First Blog");
		blog.setBlogNo(1);
		blog.setUser(user);
		blogService.createBlog(blog);
		
		Blog blog1 = new Blog();
		blog1.setTitle("Second Blog");
		blog1.setBlogNo(2);
		blog1.setUser(user);
		blogService.createBlog(blog1);
		
		//user.setBloglist(List.of(blog, blog1));
		
		System.out.println("Bloglar");
		blogService.printBlogs(blogService.getBlogs());

		
		//Blog silme
		System.out.println("Blok silme");
		blogService.removeBlog(blog);

		//Kişilerin bloglarının Listelenemsi
		blogService.printBlogs(blogService.getAllByUserName(user));
		
		
		Tag tag = new Tag ("Tag", user);
		user.setTags(List.of(tag));
		
		


		
		
	}

}
