package com.vredu.Config;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter {
	//声明一个session存储的name
	public static final String SESSION_KEY = "user";
	
	//声明一个拦截器实例
	@Bean
	public SecurityInterceptor getSecurityInterceptor() {
		return new SecurityInterceptor();
	}
	
	//在拦截器实例中添加相应的配置信息
	//问题：配置该内容不起作用。。。
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());
		//登录提交时，必须先转至loginHandle才能进行提交判断逻辑
		addInterceptor.excludePathPatterns("/loginHandle")
		.excludePathPatterns("/registerHandle")
		.excludePathPatterns("/resetHandle");
//		addInterceptor.excludePathPatterns("/registerHandle");

	}
	
	//声明一个内部类用来设置何时使用拦截器
	private class SecurityInterceptor extends HandlerInterceptorAdapter {
		//在request请求处理之前进行调用（Controller方法调用之前）
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) 
				throws Exception {
			
			String url = request.getRequestURI();
			String login = "/login";
			String register = "/register";
			String forgot = "/forgot";
			String reset = "/reset";
			ArrayList<String> allowUrls = new ArrayList<String>();
			allowUrls.add(login);
			allowUrls.add(register);
			allowUrls.add(forgot);
			allowUrls.add(reset);
			
			HttpSession session = request.getSession();
			
			for (String allowUrl : allowUrls) {
				if (url.equals(allowUrl)) {
					return true;
				}
			}
			if (session.getAttribute(SESSION_KEY) != null) {
				return true;
			}
			else {
				response.sendRedirect(login);
				return false;
			}
		}
	}
}