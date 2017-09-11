package cn.come.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import cn.come.demo.po.PUmAuthority;

public class UserInfoExtUser implements Serializable,UserDetails{
	
	private String userid;

    private String loginid;

    private String username;

    private String password;
    
    private List<PUmAuthority> authoritys;
    
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public List<PUmAuthority> getAuthoritys() {
		return authoritys;
	}

	public void setAuthoritys(List<PUmAuthority> authoritys) {
		this.authoritys = authoritys;
	}
	


	@Override
	public String toString() {
		return "UserInfoExtUser [userid=" + userid + ", loginid=" + loginid + ", username=" + username + ", password="
				+ password + ", authoritys=" + authoritys + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> list=new ArrayList<>();
		for (PUmAuthority auth: authoritys) {
			GrantedAuthority ga=new SimpleGrantedAuthority(auth.getCode());
			list.add(ga);
		}
		return list;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
