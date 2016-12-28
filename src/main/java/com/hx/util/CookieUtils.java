package com.hx.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
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
	 * @param maxage
	 * @param response
	 * @return
	 */
	public static void addCookie(String key, String value, int maxage, HttpServletResponse response) {
		Cookie cookie = new Cookie(key, value);
		cookie.setPath("/");
		cookie.setMaxAge(maxage);
		if (maxage != 0) {
			cookie.setMaxAge(maxage);
		} else {
			cookie.setMaxAge(COOKIE_MAX_AGE);
		}
		response.addCookie(cookie);
	}
	
	/**
	 * 查询cookie
	 * @param request
	 * @param key
	 * @return
	 */
	public static Cookie getCookie(HttpServletRequest request, String key) {
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		for (Cookie c : cookies) {
			if (key.equals(c.getName())) {
				cookie = c;
				break;
			}
		}
		return cookie;
	}

	/**
	 * 删除 cookie
	 * @param request
	 * @param response
	 * @param key
	 * @return
	 */
	public static void removeCookie(HttpServletRequest request, HttpServletResponse response, String key) {
		Cookie cookie = getCookie(request, key);
		if(null != cookie){
			cookie.setPath("/");
			cookie.setValue("");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
	}
}
