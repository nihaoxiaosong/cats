package com.hx.dto.admin;

public class CurrentUser {
	private String userCode;
	private String userName;

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "CurrentUser [userCode=" + userCode + ", userName=" + userName + "]";
	}

}
