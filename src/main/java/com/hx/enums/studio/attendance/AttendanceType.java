package com.hx.enums.studio.attendance;

/**
 * 考勤类型
 * 
 * @author song
 * @date 2016年11月18日下午2:33:25
 */
public enum AttendanceType {
	NORMAL(0, "正常"), OVERTIME(1, "加班"), UNNORMAL(2, "异常");

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
	private AttendanceType(int value, String des) {
		this.value = value;
		this.des = des;
	}

	/**
	 * 静态方法,根据值获取枚举类
	 * 
	 * @param value
	 * @return
	 */
	public static AttendanceType getByValue(int value) {
		if (value == 0) {
			return AttendanceType.NORMAL;
		} else if (value == 1) {
			return AttendanceType.OVERTIME;
		} else if (value == 2) {
			return AttendanceType.UNNORMAL;
		} else {
			return AttendanceType.NORMAL;
		}
	}
}
