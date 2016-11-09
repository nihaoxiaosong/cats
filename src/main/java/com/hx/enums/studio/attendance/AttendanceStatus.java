package com.hx.enums.studio.attendance;

/**
 * 考勤状态枚举类
 * @author song
 *
 */
public enum AttendanceStatus {
	NORMAL(0,"正常"),
	UNAPPEAL(1,"未申诉"),
	APPEALING(2,"申诉处理中"),
	APPEALBACK(3,"申诉退回"),
	APPEALSUCCESS(4,"申诉通过");
	
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
	 * @param value
	 * @param des
	 */
	private AttendanceStatus(int value, String des) {
		this.value = value;
		this.des = des;
	}
	
	/**
	 * 静态方法,根据值获取枚举类
	 * @param value
	 * @return
	 */
	public static AttendanceStatus getByValue(int value) {
		if (value == 0) {
			return AttendanceStatus.NORMAL;
		} else if (value == 1) {
			return AttendanceStatus.UNAPPEAL;
		} else if (value == 2) {
			return AttendanceStatus.APPEALING;
		} else if (value == 3) {
			return AttendanceStatus.APPEALBACK;
		} else if (value == 4) {
			return AttendanceStatus.APPEALSUCCESS;
		} else {
			return AttendanceStatus.NORMAL;
		}
	}
}
