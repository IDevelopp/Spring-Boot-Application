package org.sid1;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BackendOfApp1Application extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(BackendOfApp1Application.class);
	    }
	public static void main(String[] args) {
		SpringApplication.run(BackendOfApp1Application.class, args);
		/*ApplicationContext context = SpringApplication.run(BackendOfApp1Application.class, args);
		UserDAO userDAO = context.getBean(UserDAO.class);
		userDAO.save(new User("sisi","bajbouj"));
		userDAO.save(new User("sisi1","bajbouj1"));
		
		List<User> users = userDAO.findAll();
		users.forEach(u->System.out.println(u.getFirstName()));*/
	}
}
