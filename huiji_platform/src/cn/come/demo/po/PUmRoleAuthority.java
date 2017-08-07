package cn.come.demo.po;

public class PUmRoleAuthority {
    private String id;

    private String roleid;

    private String authorityid;

    private String flaginfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getAuthorityid() {
		return authorityid;
	}

	public void setAuthorityid(String authorityid) {
		this.authorityid = authorityid;
	}

	public String getFlaginfo() {
		return flaginfo;
	}

	public void setFlaginfo(String flaginfo) {
		this.flaginfo = flaginfo;
	}

	@Override
	public String toString() {
		return "PUmRoleAuthority [id=" + id + ", roleid=" + roleid + ", authorityid=" + authorityid + ", flaginfo="
				+ flaginfo + "]";
	}

  
}