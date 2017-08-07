package cn.come.demo.po;

import java.util.Date;

public class PUmResources {
    private String resource_id;

    private String resource_name;

    private String resource_type;

    private Integer priority;

    private String resource_url;

    private String resource_dec;

    private Integer enabled;

    private Date create_time;

    private Date update_time;

	public String getResource_id() {
		return resource_id;
	}

	public void setResource_id(String resource_id) {
		this.resource_id = resource_id;
	}

	public String getResource_name() {
		return resource_name;
	}

	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}

	public String getResource_type() {
		return resource_type;
	}

	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getResource_url() {
		return resource_url;
	}

	public void setResource_url(String resource_url) {
		this.resource_url = resource_url;
	}

	public String getResource_dec() {
		return resource_dec;
	}

	public void setResource_dec(String resource_dec) {
		this.resource_dec = resource_dec;
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
		return "PUmResources [resource_id=" + resource_id + ", resource_name=" + resource_name + ", resource_type="
				+ resource_type + ", priority=" + priority + ", resource_url=" + resource_url + ", resource_dec="
				+ resource_dec + ", enabled=" + enabled + ", create_time=" + create_time + ", update_time="
				+ update_time + "]";
	}



}