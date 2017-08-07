package cn.com.demo.po;

import java.math.BigDecimal;
import java.util.Date;

public class PUmUser {
    private String userid;

    private String loginid;

    private String username;

    private String password;

    private BigDecimal usertype;

    private BigDecimal userflag;

    private BigDecimal logincount;

    private BigDecimal enabled;

    private Date loginlasttime;

    private BigDecimal issys;

    private Date createTime;

    private Date updateTime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public BigDecimal getUsertype() {
        return usertype;
    }

    public void setUsertype(BigDecimal usertype) {
        this.usertype = usertype;
    }

    public BigDecimal getUserflag() {
        return userflag;
    }

    public void setUserflag(BigDecimal userflag) {
        this.userflag = userflag;
    }

    public BigDecimal getLogincount() {
        return logincount;
    }

    public void setLogincount(BigDecimal logincount) {
        this.logincount = logincount;
    }

    public BigDecimal getEnabled() {
        return enabled;
    }

    public void setEnabled(BigDecimal enabled) {
        this.enabled = enabled;
    }

    public Date getLoginlasttime() {
        return loginlasttime;
    }

    public void setLoginlasttime(Date loginlasttime) {
        this.loginlasttime = loginlasttime;
    }

    public BigDecimal getIssys() {
        return issys;
    }

    public void setIssys(BigDecimal issys) {
        this.issys = issys;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}