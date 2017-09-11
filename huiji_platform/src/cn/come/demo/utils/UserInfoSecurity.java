package cn.come.demo.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import cn.come.demo.dto.UserInfoExtUser;

public class UserInfoSecurity {
//����˽�й��췽��
	private UserInfoSecurity(){}
	/*
	 * ����security ����
	 */
	public static UserInfoExtUser getSecurityUser(){
		//��ȡspringSecurity��½��ȫ����
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