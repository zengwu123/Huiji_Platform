package cn.come.demo.dto;

import java.util.List;

import cn.come.demo.po.TPaper;

public class ExtendTPaper extends TPaper {
	
	private List<ExtendTPaperInfo> extendTPaperInfo;

	public List<ExtendTPaperInfo> getExtendTPaperInfo() {
		return extendTPaperInfo;
	}

	public void setExtendTPaperInfo(List<ExtendTPaperInfo> extendTPaperInfo) {
		this.extendTPaperInfo = extendTPaperInfo;
	}

	@Override
	public String toString() {
		return "ExtendTPaper [extendTPaperInfo=" + extendTPaperInfo + "]";
	}
	
}
