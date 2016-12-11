package com.hx.dao.admin;

import java.util.List;

import com.hx.entity.admin.AdminUser;
import com.hx.enums.admin.AdminUserStatus;

public interface AdminUserDao {
	/**
	 * 根据姓名和状态分页查询
	 * @param userName
	 * @param status
	 * @param startIndex
	 * @param limit
	 * @return
	 */
	List<AdminUser> list(String userName, AdminUserStatus status, int startIndex, int limit);
	/**
	 * 计数
	 * @param userName
	 * @param status
	 * @return
	 */
	int count (String userName, AdminUserStatus status);
	/**
	 * 根据用户名查找
	 * @param userCode
	 * @return
	 */
	AdminUser getByUserCode(String userCode);
	/**
	 * 根据id 查找
	 * @param id
	 * @return
	 */
	AdminUser getById(String id);
	/**
	 * 新增
	 * @param adminUser
	 */
	void insert(AdminUser adminUser);
	/**
	 * 修改
	 * @param adminUser
	 */
	void update(AdminUser adminUser);
	/**
	 * 修改密码
	 * @param id
	 * @param oldPassword
	 * @param newPassword
	 */
	void updatePassword(String id, String oldPassword, String newPassword);
}
