package cn.com.demo.po;

import java.math.BigDecimal;
import java.util.Date;

public class PUmResources {
    private String resourceId;

    private String resourceName;

    private String resourceType;

    private BigDecimal priority;

    private String resourceUrl;

    private String resourceDec;

    private BigDecimal enabled;

    private Date createTime;

    private Date updateTime;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public BigDecimal getPriority() {
        return priority;
    }

    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public String getResourceDec() {
        return resourceDec;
    }

    public void setResourceDec(String resourceDec) {
        this.resourceDec = resourceDec == null ? null : resourceDec.trim();
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