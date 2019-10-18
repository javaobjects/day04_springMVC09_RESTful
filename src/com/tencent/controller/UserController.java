package com.tencent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	/**
	 * 
	 * <p>Title: login</p>  
	 * <p>
	 *	Description: 
	 * 非RESTful风格
	 * 访问路径：login.action?username=tomcat&password=123456
	 *  
	 * </p> 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login")
	public String login(String username,String password)
	{
		System.out.println("非RESTful风格获取的参数：" + username + "  " + password);
		
		return "main";
	}
	
	/**
	 * 
	 * <p>Title: loginRestful</p>  
	 * <p>
	 *	Description: 
	 * RESTful风格
	 * 访问路径：loginRestful/tomcat/123456
	 *  
	 * </p> 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/loginRestful/{p_username}/{p_password}",method={RequestMethod.GET})
	public String loginRestful(@PathVariable("p_username")String username,@PathVariable("p_password")String password)
	{
		System.out.println("RESTful风格获取的参数：" + username + "  " + password);
		
		return "main";
	}
	
}
