package com.hx.dao.studio.attendance.impl;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.hx.dao.base.BaseDao;
import com.hx.dao.studio.attendance.AttendanceDao;
import com.hx.entity.base.PageBean;
import com.hx.entity.studio.attendance.Attendance;
import com.hx.enums.studio.attendance.AttendanceType;

@Repository("attendanceDaoImpl")
public class AttendanceDaoImpl extends BaseDao implements AttendanceDao {

	@Override
	public void insert(Attendance attendance) {
		catsMongoTemplate.insert(attendance);
	}

	@Override
	public Attendance getByType(String studentCode, AttendanceType type) {
		Query query = new Query();
		query.addCriteria(new Criteria("studentCode").is(studentCode).and("attendanceType").is(type.toString()));
		return catsMongoTemplate.findOne(query, Attendance.class);
	}

	@Override
	public List<Attendance> list(String studioCode, String studentCode, PageBean pageBean, Date startTime,
			Date endTime) {
		Query query = new Query();
		Criteria criteria = new Criteria();
		if(!StringUtils.isEmpty(studioCode)){
			criteria.and("studioCode").is(studioCode);
		}
		if(!StringUtils.isEmpty(studentCode)){
			criteria.and("studioCode").is(studentCode);
		}
		if(startTime != null){
			criteria.and("attendanceTime").gte(startTime);
		}
		if(endTime != null){
			criteria.and("attendanceTime").lte(endTime);
		}
		query.addCriteria(criteria);
		query.skip(pageBean.getStart()).limit(pageBean.getPageSize());
		return catsMongoTemplate.find(query, Attendance.class);
	}

	@Override
	public int count(String studioCode, String studentCode, Date startTime, Date endTime) {
		Query query = new Query();
		Criteria criteria = new Criteria();
		if(!StringUtils.isEmpty(studioCode)){
			criteria.and("studioCode").is(studioCode);
		}
		if(!StringUtils.isEmpty(studentCode)){
			criteria.and("studioCode").is(studentCode);
		}
		if(startTime != null){
			criteria.and("attendanceTime").gte(startTime);
		}
		if(endTime != null){
			criteria.and("attendanceTime").lte(endTime);
		}
		query.addCriteria(criteria);
		return (int) catsMongoTemplate.count(query, Attendance.class);
	}

}
