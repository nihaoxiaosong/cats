package com.hx.enums.backgrount;

/**
 * 产品状态,启用停用
 * @author song
 * @date 2016年12月6日下午10:13:33
 */
public enum ProductStatus {
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
	private ProductStatus(int value, String des) {
		this.value = value;
		this.des = des;
	}

	/**
	 * 静态方法,根据值获取枚举类
	 * 
	 * @param value
	 * @return
	 */
	public static ProductStatus getByValue(int value) {
		if (value == 0) {
			return ProductStatus.ENABLE;
		} else if (value == 1) {
			return ProductStatus.DISABLE;
		} else {
			return ProductStatus.ENABLE;
		}
	}
}
