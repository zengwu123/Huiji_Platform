package cn.come.demo.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import cn.come.demo.dto.UserInfoExtUser;
import cn.come.demo.mapper.PUmUserMapper;
import cn.come.demo.po.PUmAuthority;

@Service
public class AuthUserInfoService implements UserDetailsService {
	
	/*
	 * spring security 安全
	 * 根据登陆的用户名查找对应的权限
	 */
	@Resource
	private PUmUserMapper pUmUserMapper;
	
	@Override
	public UserDetails loadUserByUsername(String loginid) throws UsernameNotFoundException {
		UserInfoExtUser uieu=pUmUserMapper.findUserinfoByLoginId(loginid);
		List<PUmAuthority> list = pUmUserMapper.findAuthorityByUsername(uieu.getUserid());
		uieu.setAuthoritys(list);
		return uieu;
	}

}
