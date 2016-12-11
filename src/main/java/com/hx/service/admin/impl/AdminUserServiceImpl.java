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
		int totalCount = adminUserDao.totalCount();
		Pager<AdminUser> pager = new Pager<AdminUser>(limit, startIndex, totalCount, list);
		return null;
	}

	@Override
	public AdminUser getByUserCode(String userCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminUser getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(AdminUser adminUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(AdminUser adminUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePassword(String id, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub

	}

}
