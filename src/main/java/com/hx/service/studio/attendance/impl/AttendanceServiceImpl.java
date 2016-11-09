package com.hx.service.studio.attendance.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hx.dao.studio.attendance.AttendanceDao;
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
	public List<Attendance> getByTime(String studentCode, Date startTime, Date endTime) {
		return attendanceDao.getByTime(studentCode, startTime, endTime);
	}

	@Override
	public Attendance getByType(String studentCode, AttendanceType type) {
		return attendanceDao.getByType(studentCode, type);
	}

}
