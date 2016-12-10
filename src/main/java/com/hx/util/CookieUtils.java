package com.hx.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
	/*
	 * 最大的时间，可认为永久登录状态
	 */
	public static final int COOKIE_MAX_AGE = Integer.MAX_VALUE;
	/*
	 * 当前窗口（随窗口关闭而删除）
	 */
	public static final int COOKIE_MAX_AGE_CURRENTSESSION = -1;

	/**
	 * 新增 cookie
	 * @param key
	 * @param value
	 * @param path
	 * @param maxage
	 * @param response
	 * @return
	 */
	public static Cookie addNewCookie(String key, String value, String path, int maxage, HttpServletResponse response) {
		Cookie cookie = createCookie(key, value, path, maxage);
		response.addCookie(cookie);
		return cookie;
	}

	public static Cookie createCookie(String key, String value, String path, int maxage) {
		Cookie cookie = new Cookie(key, value);
		cookie.setPath(path);
		cookie.setMaxAge(maxage);
		return cookie;
	}

	/**
	 * 删除 cookie
	 * @param key
	 * @param path
	 * @param response
	 * @return
	 */
	public static Cookie delCookie(String key, String path, HttpServletResponse response) {
		Cookie cookie = removeCookie(key, path);
		response.addCookie(cookie);
		return cookie;
	}
	
	public static Cookie removeCookie(String key, String path) {
		Cookie cookie = new Cookie(key, null);
		cookie.setPath(path);
		cookie.setMaxAge(0);
		return cookie;
	}
}
