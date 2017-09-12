package cn.come.demo.po;

import java.util.Date;

import javax.validation.constraints.Pattern;

public class PUmUser {
	
    private String userid;

    @Pattern(regexp="^[A-Za-z0-9]{6,20}$",message="数字或者字母，6-20位")
    private String loginid;

    @Pattern(regexp="(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})",
    		message="用户名可以是2-5位中文或者6-16位英文和数字的组合")
    private String username;

    @Pattern(regexp="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,21}$",
    		message="检测密码由6-21字母和数字组成，不能是纯数字或纯英文")
    private String password;

    private Integer usertype;

    private Integer userflag;

    private Integer logincount;

    private Integer enabled;

    private Date loginlasttime;

    private Integer issys;

    private Date create_time;

    private Date update_time;

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

	public Integer getUsertype() {
		return usertype;
	}

	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}

	public Integer getUserflag() {
		return userflag;
	}

	public void setUserflag(Integer userflag) {
		this.userflag = userflag;
	}

	public Integer getLogincount() {
		return logincount;
	}

	public void setLogincount(Integer logincount) {
		this.logincount = logincount;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Date getLoginlasttime() {
		return loginlasttime;
	}

	public void setLoginlasttime(Date loginlasttime) {
		this.loginlasttime = loginlasttime;
	}

	public Integer getIssys() {
		return issys;
	}

	public void setIssys(Integer issys) {
		this.issys = issys;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "PUmUser [userid=" + userid + ", loginid=" + loginid + ", username=" + username + ", password="
				+ password + ", usertype=" + usertype + ", userflag=" + userflag + ", logincount=" + logincount
				+ ", enabled=" + enabled + ", loginlasttime=" + loginlasttime + ", issys=" + issys + ", create_time="
				+ create_time + ", update_time=" + update_time + "]";
	}


    

}