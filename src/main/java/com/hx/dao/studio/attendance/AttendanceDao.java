package com.hx.dao.studio.attendance;

import java.util.Date;
import java.util.List;

import com.hx.entity.base.PageBean;
import com.hx.entity.studio.attendance.Attendance;
import com.hx.enums.studio.attendance.AttendanceType;

public interface AttendanceDao {
	/**
	 * 新增考勤信息
	 * @param attendance
	 */
	void insert(Attendance attendance);
	/**
	 * 根据学号,考勤类型查询考勤信息
	 * @param studentCode
	 * @param type
	 * @return
	 */
	Attendance getByType(String studentCode, AttendanceType type);
	/**
	 * 根据工作室编码, 学生学号,开始时间,结束时间查询考勤信息
	 * @param studioCode
	 * @param studentCode
	 * @param pageBean
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	List<Attendance> list(String studioCode, String studentCode, PageBean pageBean, Date startTime, Date endTime);
	/**
	 * 计数
	 * @param studioCode
	 * @param studentCode
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	int count(String studioCode, String studentCode, Date startTime, Date endTime);
	
}
