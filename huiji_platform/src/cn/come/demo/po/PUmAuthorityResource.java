package cn.come.demo.po;

public class PUmAuthorityResource {
    private String authorityid;

    private String resourceId;

    private String flaginfo;

	public String getAuthorityid() {
		return authorityid;
	}

	public void setAuthorityid(String authorityid) {
		this.authorityid = authorityid;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getFlaginfo() {
		return flaginfo;
	}

	public void setFlaginfo(String flaginfo) {
		this.flaginfo = flaginfo;
	}

	@Override
	public String toString() {
		return "PUmAuthorityResource [authorityid=" + authorityid + ", resourceId=" + resourceId + ", flaginfo="
				+ flaginfo + "]";
	}

}