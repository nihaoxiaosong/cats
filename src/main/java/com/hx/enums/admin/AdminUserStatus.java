package com.hx.enums.admin;

/**
 * 后台用户状态,启用停用
 * @author song
 * @date 2016年12月11日上午10:45:10
 */
public enum AdminUserStatus {
	ENABLE(0, "启用"), DISABLE(1, "停用");
	/**
	 * 值
	 */
	private int value;
	/**
	 * 描述
	 */
	private String des;

	public int getValue() {
		return value;
	}

	public String getDes() {
		return des;
	}

	/**
	 * 构造方法
	 * 
	 * @param value
	 * @param des
	 */
	private AdminUserStatus(int value, String des) {
		this.value = value;
		this.des = des;
	}

	/**
	 * 静态方法,根据值获取枚举类
	 * 
	 * @param value
	 * @return
	 */
	public static AdminUserStatus getByValue(int value) {
		if (value == 0) {
			return AdminUserStatus.ENABLE;
		} else if (value == 1) {
			return AdminUserStatus.DISABLE;
		} else {
			return AdminUserStatus.ENABLE;
		}
	}
}
