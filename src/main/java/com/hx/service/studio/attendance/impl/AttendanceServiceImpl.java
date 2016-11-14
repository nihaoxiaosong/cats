package com.hx.service.studio.attendance.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hx.dao.studio.attendance.AttendanceDao;
import com.hx.entity.base.PageBean;
import com.hx.entity.studio.attendance.Attendance;
import com.hx.enums.studio.attendance.AttendanceType;

@Service("attendanceService")
public class AttendanceServiceImpl implements AttendanceService {

	@Resource
	private AttendanceDao attendanceDao;
	
	@Override
	public void insert(Attendance attendance) {
		attendanceDao.insert(attendance);
	}

	@Override
	public Attendance getByType(String studentCode, AttendanceType type) {
		return attendanceDao.getByType(studentCode, type);
	}

	@Override
	public List<Attendance> list(String studioCode, String studentCode, PageBean pageBean, Date startTime, Date endTime) {
 		return attendanceDao.list(studioCode, studentCode, pageBean, startTime, endTime);
	}

	@Override
	public int count(String studioCode, String studentCode, Date startTime, Date endTime) {
		return attendanceDao.count(studioCode, studentCode, startTime, endTime);
	}

}
