package cn.com.demo.po;

public class PUmUserRole {
    private String userid;

    private String roleid;

    private String flaginfo;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getFlaginfo() {
        return flaginfo;
    }

    public void setFlaginfo(String flaginfo) {
        this.flaginfo = flaginfo == null ? null : flaginfo.trim();
    }
}