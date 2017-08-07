package cn.com.demo.po;

import java.math.BigDecimal;
import java.util.Date;

public class PUmRole {
    private String roleid;

    private String rolename;

    private String descn;

    private String code;

    private String flaginfo;

    private BigDecimal sort;

    private BigDecimal enabled;

    private Date createTime;

    private Date updateTime;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getDescn() {
        return descn;
    }

    public void setDescn(String descn) {
        this.descn = descn == null ? null : descn.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getFlaginfo() {
        return flaginfo;
    }

    public void setFlaginfo(String flaginfo) {
        this.flaginfo = flaginfo == null ? null : flaginfo.trim();
    }

    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    public BigDecimal getEnabled() {
        return enabled;
    }

    public void setEnabled(BigDecimal enabled) {
        this.enabled = enabled;
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