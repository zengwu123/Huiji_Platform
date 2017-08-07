package cn.com.demo.po;

public class PUmAuthorityResource {
    private String authorityid;

    private String resourceId;

    private String flaginfo;

    public String getAuthorityid() {
        return authorityid;
    }

    public void setAuthorityid(String authorityid) {
        this.authorityid = authorityid == null ? null : authorityid.trim();
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getFlaginfo() {
        return flaginfo;
    }

    public void setFlaginfo(String flaginfo) {
        this.flaginfo = flaginfo == null ? null : flaginfo.trim();
    }
}