package org.sid1.dao;


import java.util.List;

import org.sid1.dao.UserDAO;
import org.sid1.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.http.inbound.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserRest {
	@Autowired
	private UserDAO userDAO;
    @RequestMapping(value="/user",method=RequestMethod.GET)
    public User getUser(){
    	List<User> users =userDAO.findAll();
    	return users.get(1);
    }
    
	
}

