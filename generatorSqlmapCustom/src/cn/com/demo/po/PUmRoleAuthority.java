package cn.com.demo.po;

public class PUmRoleAuthority {
    private String id;

    private String roleid;

    private String authorityid;

    private String flaginfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getAuthorityid() {
        return authorityid;
    }

    public void setAuthorityid(String authorityid) {
        this.authorityid = authorityid == null ? null : authorityid.trim();
    }

    public String getFlaginfo() {
        return flaginfo;
    }

    public void setFlaginfo(String flaginfo) {
        this.flaginfo = flaginfo == null ? null : flaginfo.trim();
    }
}