package com.hx.entity.base;

/**
 * 页码封装类
 * @author song
 * @date 2016年11月14日下午8:32:19
 */
public class PageBean {
	/**
	 * 当前页数
	 */
	private int page;
	/**
	 * 每页条数
	 */
	private int pageSize;
	/**
	 * 从第几条开始
	 */
	private int start;

	/**
	 * 构造函数
	 * @param page
	 * @param pageSize
	 */
	public PageBean(int page, int pageSize) {
		super();
		this.page = page;
		this.pageSize = pageSize;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStart() {
		return (page - 1) * pageSize;
	}

}
