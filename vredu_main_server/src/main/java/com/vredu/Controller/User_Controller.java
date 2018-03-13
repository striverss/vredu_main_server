package com.vredu.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vredu.Config.WebSecurityConfig;
import com.vredu.Dao.User_Dao;
import com.vredu.Entity.User;

@Controller        
@CrossOrigin(origins="*")  
public class User_Controller {
	@Autowired
    User_Dao user_dao;

	Logger logger = LoggerFactory.getLogger(this.getClass());
	//用户登录处理
	@RequestMapping(value = {"/loginHandle"}, method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> loginHandle(String username, String password, HttpSession session) {
		logger.info("登录处理！");

		Map<String, Object> map = new HashMap<String, Object>();

		List<User> user = user_dao.verifyUser(username, password);
		if (user.size() == 0) {
			map.put("success", false);
			map.put("message", "登录失败");
			return map;
		}
		session.setAttribute(WebSecurityConfig.SESSION_KEY, username);

		map.put("success", true);
		map.put("message", "登录成功");
		return map;

	}
	
	
	//用户注销处理
	@RequestMapping(value = {"/logout"}, method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute(WebSecurityConfig.SESSION_KEY);
		String url = "redirect:/login";
		return url;
	}
	
	
	//用户注册处理
	@RequestMapping(value = {"/registerHandle"}, method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> register(String username, String password, String email) {
		Map<String, Object> map = new HashMap<String, Object>();
		User user = new User(username, password, email);
		user_dao.register(user);
		
		List<User> find = user_dao.verifyUser(username, password);
		if (find.size() == 0) {
			map.put("success", false);
			map.put("message", "注册失败");
			
			return map;
		}
		else {
			map.put("success", true);
			map.put("message", "注册成功");
			
			return map;
		}
	}
	 
	
	//密码重置处理
	@RequestMapping(value = {"/resetHandle"}, method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> resetHandle(String username, String password, String newPassword) {
		Map<String, Object> map = new HashMap<String, Object>();
		user_dao.reset(username, password, newPassword);
		
		List<User> find = user_dao.verifyUser(username, newPassword);
		if (find.size() == 0) {
			map.put("success", false);
			map.put("message", "修改失败");
			
			return map;
		}
		else {
			map.put("success", true);
			map.put("message", "修改成功");
			
			return map;
		}
	}
}
