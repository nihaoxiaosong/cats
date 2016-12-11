package com.hx.dto.base;

import java.util.List;

public class Pager<T> {
	/**
	 * 当前页数
	 */
	private int currentPage;
	/**
	 * 每页条数
	 */
	private int pageSize;
	/**
	 * 从第几条开始
	 */
	private int start;
	/**
	 * 总记录数。
	 */
	private int totalCount;

	/**
	 * 当前页的记录列表
	 */
	private List<T> list;
	
	public Pager() {
		super();
	}

	public Pager(int pageSize, int start, int totalCount, List<T> list) {
		super();
		this.pageSize = pageSize;
		this.start = (currentPage-1)*pageSize;
		this.totalCount = totalCount;
		this.list = list;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
