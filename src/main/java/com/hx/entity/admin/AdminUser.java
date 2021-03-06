package com.hx.entity.admin;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.hx.enums.admin.AdminUserStatus;

/**
 * 后台用户
 * @author song
 * @date 2016年12月11日上午10:46:32
 */
@Document(collection = "adminUser")
public class AdminUser {
	@Id
	private String id;
	/**
	 * 用户编码
	 */
	private String code;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 用户状态
	 * 启用/停用
	 */
	private AdminUserStatus status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminUserStatus getStatus() {
		return status;
	}
	public void setStatus(AdminUserStatus status) {
		this.status = status;
	}
	
}
