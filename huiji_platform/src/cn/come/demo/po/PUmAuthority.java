package cn.come.demo.po;

import java.util.Date;

public class PUmAuthority {
    private String authorityid;

    private String authorityname;

    private String descn;

    private String function;

    private String code;

    private String functionname;

    private Integer enabled;

    private Integer issys;

    private String flaginfo;

    private Date create_time;

    private Date update_time;

	public String getAuthorityid() {
		return authorityid;
	}

	public void setAuthorityid(String authorityid) {
		this.authorityid = authorityid;
	}

	public String getAuthorityname() {
		return authorityname;
	}

	public void setAuthorityname(String authorityname) {
		this.authorityname = authorityname;
	}

	public String getDescn() {
		return descn;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFunctionname() {
		return functionname;
	}

	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Integer getIssys() {
		return issys;
	}

	public void setIssys(Integer issys) {
		this.issys = issys;
	}

	public String getFlaginfo() {
		return flaginfo;
	}

	public void setFlaginfo(String flaginfo) {
		this.flaginfo = flaginfo;
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
		return "PUmAuthority [authorityid=" + authorityid + ", authorityname=" + authorityname + ", descn=" + descn
				+ ", function=" + function + ", code=" + code + ", functionname=" + functionname + ", enabled="
				+ enabled + ", issys=" + issys + ", flaginfo=" + flaginfo + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}


}