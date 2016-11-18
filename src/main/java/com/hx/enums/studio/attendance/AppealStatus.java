package com.hx.enums.studio.attendance;

/**
 * 考勤状态枚举类
 * 
 * @author song
 * @date 2016年11月14日下午8:33:37
 */
public enum AppealStatus {
	UNAPPEAL(0, "未申诉"), APPEALING(1, "申诉处理中"), APPEALSUCCESS(2, "申诉通过"), APPEALBACK(3, "申诉退回");

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
	private AppealStatus(int value, String des) {
		this.value = value;
		this.des = des;
	}

	/**
	 * 静态方法,根据值获取枚举类
	 * 
	 * @param value
	 * @return
	 */
	public static AppealStatus getByValue(int value) {
		if (value == 0) {
			return AppealStatus.UNAPPEAL;
		} else if (value == 1) {
			return AppealStatus.APPEALING;
		} else if (value == 2) {
			return AppealStatus.APPEALSUCCESS;
		} else if (value == 3) {
			return AppealStatus.APPEALBACK;
		} else {
			return AppealStatus.UNAPPEAL;
		}
	}
}
