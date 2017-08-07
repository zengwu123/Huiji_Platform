package cn.come.demo.po;

import java.util.Date;

public class PUmRole {
    private String roleid;

    private String rolename;

    private String descn;

    private String code;

    private String flaginfo;

    private Integer sort;

    private Integer enabled;

    private Date create_time;

    private Date update_time;

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getDescn() {
		return descn;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFlaginfo() {
		return flaginfo;
	}

	public void setFlaginfo(String flaginfo) {
		this.flaginfo = flaginfo;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
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
		return "PUmRole [roleid=" + roleid + ", rolename=" + rolename + ", descn=" + descn + ", code=" + code
				+ ", flaginfo=" + flaginfo + ", sort=" + sort + ", enabled=" + enabled + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}


    
}