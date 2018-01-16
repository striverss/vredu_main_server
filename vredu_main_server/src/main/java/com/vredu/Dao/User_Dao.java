package com.vredu.Dao;

import java.util.*;

//import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.vredu.Entity.User;

@Mapper
public interface User_Dao {
	
	//查找所有用户
	@Select("select * from user")
	public List<User> selectAllUser();    
	 
	//登录验证
	@Select("select * from user where username =#{username} and password=#{password}")
	public List<User> verifyUser(@Param("username") String username, @Param("password") String password);
	
	//注册用户
	@Insert("insert into user values (null, #{username}, #{password}, #{email})")
	public void register(User user);
	
	//密码重置
	@Update("update user set password=#{newPassword} where username=#{username} and password=#{password}")
	public void reset(@Param("username") String username, @Param("password") String password, @Param("newPassword") String newPassword);
	
	
}
