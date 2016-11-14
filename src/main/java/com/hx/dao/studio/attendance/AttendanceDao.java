package com.hx.dao.studio.attendance;

import java.util.Date;
import java.util.List;

import com.hx.entity.studio.attendance.Attendance;
import com.hx.enums.studio.attendance.AttendanceType;

public interface AttendanceDao {
	/**
	 * 新增考勤信息
	 * @param attendance
	 */
	void insert(Attendance attendance);
	/**
	 * 根据学号,开始时间,结束时间查询考勤信息
	 * @param studentCode
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	List<Attendance> getByTime(String studentCode, Date startTime, Date endTime);
	/**
	 * 根据学号,考勤类型查询考勤信息
	 * @param studentCode
	 * @param type
	 * @return
	 */
	Attendance getByType(String studentCode, AttendanceType type);
	
}
