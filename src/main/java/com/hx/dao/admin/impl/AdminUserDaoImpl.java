package com.hx.dao.admin.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hx.dao.admin.AdminUserDao;
import com.hx.dao.base.BaseDao;
import com.hx.entity.admin.AdminUser;
import com.hx.enums.admin.AdminUserStatus;

@Repository("adminUserDao")
public class AdminUserDaoImpl extends BaseDao implements AdminUserDao {

	@Override
	public List<AdminUser> list(String userName, AdminUserStatus status, int startIndex, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String userName, AdminUserStatus status) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int totalCount(){
		// TODO Auto-generated method stub
		return 0;
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
