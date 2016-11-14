package com.hx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.util.StringUtils;

/**
 * 时间工具类
 * 
 * @author song
 * @date 2016年11月14日下午8:42:09
 */
public class DateUtils {
	/**
	 * 根据格式转化时间字符串,返回 date 类型
	 * 
	 * @param formatStr
	 * @param dateStr
	 * @return
	 */
	public static Date convertString2Date(String formatStr, String dateStr) {
		if (StringUtils.isEmpty(formatStr) || StringUtils.isEmpty(dateStr)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据格式转化时间为字符串,返回 String 类型
	 * 
	 * @param formatStr
	 * @param date
	 * @return
	 */
	public static String convertDate2String(String formatStr, Date date) {
		if (StringUtils.isEmpty(formatStr) || date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
		return sdf.format(date);
	}
}
