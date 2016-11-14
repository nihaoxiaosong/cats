package com.hx.util;

import java.util.UUID;

public class CommonUtils {
	/**
	 * 获取 UUID
	 * @return
	 */
	public static String getUuid(){
		return UUID.randomUUID().toString();
	}
}
