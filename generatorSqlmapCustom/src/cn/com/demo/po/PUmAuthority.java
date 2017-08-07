package cn.com.demo.po;

import java.math.BigDecimal;
import java.util.Date;

public class PUmAuthority {
    private String authorityid;

    private String authorityname;

    private String descn;

    private String function;

    private String code;

    private String functionname;

    private BigDecimal enabled;

    private BigDecimal issys;

    private String flaginfo;

    private Date createTime;

    private Date updateTime;

    public String getAuthorityid() {
        return authorityid;
    }

    public void setAuthorityid(String authorityid) {
        this.authorityid = authorityid == null ? null : authorityid.trim();
    }

    public String getAuthorityname() {
        return authorityname;
    }

    public void setAuthorityname(String authorityname) {
        this.authorityname = authorityname == null ? null : authorityname.trim();
    }

    public String getDescn() {
        return descn;
    }

    public void setDescn(String descn) {
        this.descn = descn == null ? null : descn.trim();
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function == null ? null : function.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname == null ? null : functionname.trim();
    }

    public BigDecimal getEnabled() {
        return enabled;
    }

    public void setEnabled(BigDecimal enabled) {
        this.enabled = enabled;
    }

    public BigDecimal getIssys() {
        return issys;
    }

    public void setIssys(BigDecimal issys) {
        this.issys = issys;
    }

    public String getFlaginfo() {
        return flaginfo;
    }

    public void setFlaginfo(String flaginfo) {
        this.flaginfo = flaginfo == null ? null : flaginfo.trim();
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