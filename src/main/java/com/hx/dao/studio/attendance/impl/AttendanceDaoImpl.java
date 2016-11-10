package com.hx.dao.studio.attendance.impl;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.hx.dao.base.BaseDao;
import com.hx.dao.studio.attendance.AttendanceDao;
import com.hx.entity.studio.attendance.Attendance;
import com.hx.enums.studio.attendance.AttendanceType;

@Repository("attendanceDaoImpl")
public class AttendanceDaoImpl extends BaseDao implements AttendanceDao {

	@Override
	public void insert(Attendance attendance) {
		catsMongoTemplate.insert(attendance);
	}

	@Override
	public List<Attendance> getByTime(String studentCode, Date startTime, Date endTime) {
		Query query = new Query();
		query.addCriteria(new Criteria("studentCode").is(studentCode).and("attendanceTime").gt(startTime).lt(endTime));
		return catsMongoTemplate.find(query, Attendance.class);
	}

	@Override
	public Attendance getByType(String studentCode, AttendanceType type) {
		Query query = new Query();
		query.addCriteria(new Criteria("studentCode").is(studentCode).and("attendanceType").is(type.toString()));
		return catsMongoTemplate.findOne(query, Attendance.class);
	}

}
