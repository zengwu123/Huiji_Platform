package cn.come.demo.dto;

import cn.come.demo.po.PUmRole;

public class UserRole extends PUmRole {
private String isrole;
private String userid;

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public String getIsrole() {
	return isrole;
}

public void setIsrole(String isrole) {
	this.isrole = isrole;
}

public UserRole() {
	super();
	// TODO Auto-generated constructor stub
}



@Override
public String toString() {
	return "UserRole [ userid=" + userid + ", getRoleid()=" + getRoleid() + "]";
}

public UserRole(String isrole, String userid) {
	super();
	this.isrole = isrole;
	this.userid = userid;
}


}
