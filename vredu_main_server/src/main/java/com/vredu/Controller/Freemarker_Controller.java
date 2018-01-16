package com.vredu.Controller;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Freemarker_Controller {
	
	//登录页面
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	//注册页面
	@RequestMapping(value = {"/register"}, method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	
	//忘记密码页面
	@RequestMapping(value = {"/forgot"}, method = RequestMethod.GET)
	public String forgot() {
		return "forgot";
	}
	
	//密码重置页面
	@RequestMapping(value = {"/reset"}, method = RequestMethod.GET)
	public String reset() {
		return "reset";
	}
}