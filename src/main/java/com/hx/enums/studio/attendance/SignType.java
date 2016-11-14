package com.hx.enums.studio.attendance;

/**
 * 考勤类型枚举类
 * @author song
 * @date 2016年11月14日下午8:33:45
 */
public enum SignType {
	SIGN_IN(0,"签到"),
	SIGN_OUT(1,"签退");
	
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
	private SignType(int value, String des) {
		this.value = value;
		this.des = des;
	}
	
	/**
	 * 静态方法,根据值获取枚举类
	 * @param value
	 * @return
	 */
	public static SignType getByValue(int value) {
		if (value == 0) {
			return SignType.SIGN_IN;
		} else if (value == 1) {
			return SignType.SIGN_OUT;
		} else {
			return SignType.SIGN_IN;
		}
	}
	
	
}
