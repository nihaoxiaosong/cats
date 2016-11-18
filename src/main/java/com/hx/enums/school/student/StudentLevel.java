package com.hx.enums.school.student;

/**
 * 学生级别
 * 
 * @author song
 * @date 2016年11月18日下午2:33:25
 *
 */
public enum StudentLevel {
	I(0, "普通级别"), II(1, "选拔中"), III(2, "工作室在职"), IV(3, "工作室毕业");
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
	private StudentLevel(int value, String des) {
		this.value = value;
		this.des = des;
	}

	/**
	 * 静态方法,根据值获取枚举类
	 * 
	 * @param value
	 * @return
	 */
	public static StudentLevel getByValue(int value) {
		if (value == 0) {
			return StudentLevel.I;
		} else if (value == 1) {
			return StudentLevel.II;
		} else if (value == 2) {
			return StudentLevel.III;
		} else if (value == 3) {
			return StudentLevel.IV;
		} else {
			return StudentLevel.I;
		}
	}
}
