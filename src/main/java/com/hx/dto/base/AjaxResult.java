package com.hx.dto.base;

/**
 * ajax 结果返回
 * @author song
 * @date 2016年12月6日下午10:36:03
 * @param <T>
 */
public class AjaxResult<T> {
	/**
	 * 是否操作成功
	 */
	private boolean success;
	/**
	 * 数据
	 */
    private T data;
    /**
     * 错误信息
     */
    private String error;
    
	public AjaxResult(boolean success, T data) {
		super();
		this.success = success;
		this.data = data;
	}
	
	public AjaxResult(boolean success, String error) {
		super();
		this.success = success;
		this.error = error;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
    
}
