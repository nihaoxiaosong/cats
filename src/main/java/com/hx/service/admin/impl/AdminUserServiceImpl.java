package com.hx.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hx.dao.admin.AdminUserDao;
import com.hx.dto.base.Pager;
import com.hx.entity.admin.AdminUser;
import com.hx.enums.admin.AdminUserStatus;
import com.hx.service.admin.AdminUserService;

@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService {
	@Resource
	private AdminUserDao adminUserDao;

	@Override
	public Pager<AdminUser> pager(String userName, AdminUserStatus status, int startIndex, int limit) {
		List<AdminUser> list = adminUserDao.list(userName, status, startIndex, limit);
		int count = adminUserDao.count(userName, status);
		Pager<AdminUser> pager = new Pager<AdminUser>(limit, startIndex, count, list);
		return pager;
	}

	@Override
	public AdminUser getByCode(String userCode) {
		return adminUserDao.getByUserCode(userCode);
	}

	@Override
	public AdminUser getById(String id) {
		return adminUserDao.getById(id);
	}

	@Override
	public void insert(AdminUser adminUser) {
		adminUserDao.insert(adminUser);
	}

	@Override
	public void update(AdminUser adminUser) {
		adminUserDao.update(adminUser);
	}

	@Override
	public void updatePassword(String id, String oldPassword, String newPassword) {
		adminUserDao.updatePassword(id, oldPassword, newPassword);
	}

}
