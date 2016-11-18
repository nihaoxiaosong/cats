package com.hx.enums.school.student;

/**
 * 学生状态, 停用启用
 * 
 * @author song
 * @date 2016年11月18日下午2:33:25
 *
 */
public enum StudentStatus {
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
	private StudentStatus(int value, String des) {
		this.value = value;
		this.des = des;
	}

	/**
	 * 静态方法,根据值获取枚举类
	 * 
	 * @param value
	 * @return
	 */
	public static StudentStatus getByValue(int value) {
		if (value == 0) {
			return StudentStatus.ENABLE;
		} else if (value == 1) {
			return StudentStatus.DISABLE;
		} else {
			return StudentStatus.ENABLE;
		}
	}
}
