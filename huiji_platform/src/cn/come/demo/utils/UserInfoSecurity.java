package cn.come.demo.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import cn.come.demo.dto.UserInfoExtUser;

public class UserInfoSecurity {
//设置私有构造方法
	private UserInfoSecurity(){}
	/*
	 * 返回security 对象
	 */
	public static UserInfoExtUser getSecurityUser(){
		//获取springSecurity登陆安全对象
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserInfoExtUser userinfo;
		if(principal instanceof UserDetails){
			userinfo=(UserInfoExtUser) principal;
			String password=MD5Config.md5_SystemWideSaltSource(userinfo.getPassword(), userinfo.getLoginid());
			userinfo.setPassword(password);
		}else{
			userinfo=new UserInfoExtUser();
		}
		return userinfo;
		
	}
}
