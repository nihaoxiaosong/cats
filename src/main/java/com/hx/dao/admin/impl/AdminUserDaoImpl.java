package com.hx.dao.admin.impl;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.hx.dao.admin.AdminUserDao;
import com.hx.dao.base.BaseDao;
import com.hx.entity.admin.AdminUser;
import com.hx.enums.admin.AdminUserStatus;

@Repository("adminUserDao")
public class AdminUserDaoImpl extends BaseDao implements AdminUserDao {

	@Override
	public List<AdminUser> list(String userName, AdminUserStatus status, int startIndex, int limit) {
		Query query = new Query();
		if (!StringUtils.isEmpty(userName)) {
			query.addCriteria(new Criteria("userName").regex(userName));
		}
		if (status != null) {
			query.addCriteria(new Criteria("status").is(status.toString()));
		}
		query.skip(startIndex).limit(limit);
		return catsMongoTemplate.find(query, AdminUser.class);
	}

	@Override
	public int count(String userName, AdminUserStatus status) {
		Query query = new Query();
		if (!StringUtils.isEmpty(userName)) {
			query.addCriteria(new Criteria("userName").regex(userName));
		}
		if (status != null) {
			query.addCriteria(new Criteria("status").is(status.toString()));
		}
		return (int) catsMongoTemplate.count(query, AdminUser.class);
	}

	@Override
	public AdminUser getByUserCode(String userCode) {
		Query query = new Query();
		if (!StringUtils.isEmpty(userCode)) {
			query.addCriteria(new Criteria("userCode").is(userCode));
		}
		return catsMongoTemplate.findOne(query, AdminUser.class);
	}

	@Override
	public AdminUser getById(String id) {
		Query query = new Query();
		if (!StringUtils.isEmpty(id)) {
			query.addCriteria(new Criteria("id").is(id));
		}
		return catsMongoTemplate.findOne(query, AdminUser.class);
	}

	@Override
	public void insert(AdminUser adminUser) {
		catsMongoTemplate.insert(adminUser);
	}

	@Override
	public void update(AdminUser adminUser) {
		catsMongoTemplate.save(adminUser);
	}

	@Override
	public void updatePassword(String id, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub

	}

}
