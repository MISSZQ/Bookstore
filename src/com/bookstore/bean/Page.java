package com.bookstore.bean;

import org.springframework.stereotype.Component;

@Component
public class Page {
	private long totalCount;//��¼��������
	private Integer pageCount;//ÿҳ��ʾ�ļ�¼����
	private Integer totalPage;//��ҳ��
	private Integer dPage;//Ŀǰ���ڵ�ҳ��
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
