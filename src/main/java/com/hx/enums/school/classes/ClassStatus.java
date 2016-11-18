package com.hx.enums.school.classes;

/**
 * 班级状态, 停用启用
 * 
 * @author song
 * @date 2016年11月18日下午2:33:25
 *
 */
public enum ClassStatus {
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
	private ClassStatus(int value, String des) {
		this.value = value;
		this.des = des;
	}

	/**
	 * 静态方法,根据值获取枚举类
	 * 
	 * @param value
	 * @return
	 */
	public static ClassStatus getByValue(int value) {
		if (value == 0) {
			return ClassStatus.ENABLE;
		} else if (value == 1) {
			return ClassStatus.DISABLE;
		} else {
			return ClassStatus.ENABLE;
		}
	}
}
