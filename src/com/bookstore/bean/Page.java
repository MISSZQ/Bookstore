package com.bookstore.bean;

import org.springframework.stereotype.Component;

@Component
public class Page {
	private long totalCount;//记录的总条数
	private Integer pageCount;//每页显示的记录条数
	private Integer totalPage;//总页数
	private Integer dPage;//目前所在的页数
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage() {
		this.totalPage = totalPage;
	}
	public Integer getdPage() {
		return dPage;
	}
	public void setdPage(Integer dPage) {
		this.dPage = dPage;
	}
	
	

}
