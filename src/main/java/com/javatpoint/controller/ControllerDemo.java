package com.javatpoint.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javatpoint.DAO.UserDAO;
import com.javatpoint.model.User;
@Controller
public class ControllerDemo 
{
	
	@Autowired
	UserDAO userdao;
	
	
	@RequestMapping("/index")
	public String home()
	{
		
	    return "home.jsp";

	}	
@RequestMapping("/addUser")
public String home(User user)
{
	userdao.save(user);
    return "home.jsp";
    

}



}
