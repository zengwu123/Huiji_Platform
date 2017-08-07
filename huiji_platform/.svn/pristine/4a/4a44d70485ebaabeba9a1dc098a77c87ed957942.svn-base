package cn.come.demo.utils;

import java.util.List;

public class PageBeanUtil {
	private int currPage;
	private int pageSize;
	private int totalCount;
	
	private int totalPage;
	
	private List<?> list;
	
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
		
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	public PageBeanUtil(int currPage, int pageSize, int totalCount) {
		super();
		this.currPage = currPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		if(totalCount==0){
			this.totalPage=1;
		}else{
			this.totalPage=(int) Math.ceil(this.totalCount*1.0/this.pageSize);
		}
	}
	@Override
	public String toString() {
		return "PageBeanUtil [currPage=" + currPage + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", totalPage=" + totalPage + ", list=" + list + "]";
	}
	
}
