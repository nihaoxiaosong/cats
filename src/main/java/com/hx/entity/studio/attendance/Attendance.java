package com.hx.entity.studio.attendance;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.hx.enums.studio.attendance.AppealStatus;
import com.hx.enums.studio.attendance.AttendanceType;
import com.hx.enums.studio.attendance.SignType;

/**
 * 考勤记录
 * 
 * @author song
 * @date 2016年11月14日下午8:33:25
 */
@Document(collection = "attendance")
public class Attendance {
	@Id
	private String id;
	/**
	 * 工作室编码
	 */
	private String studioCode;
	/**
	 * 工作室名称
	 */
	private String studioName;
	/**
	 * 学生编码
	 */
	private String studentCode;
	/**
	 * 学生姓名
	 */
	private String studentName;
	/**
	 * 签到签退类型
	 */
	private SignType signType;
	/**
	 * 考勤时间
	 */
	private Date attendanceTime;
	/**
	 * ip地址
	 */
	private String ipAddress;
	/**
	 * 申诉状态
	 */
	private AppealStatus appealStatus;
	/**
	 * 考勤类型
	 */
	private AttendanceType attendanceType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudioCode() {
		return studioCode;
	}

	public void setStudioCode(String studioCode) {
		this.studioCode = studioCode;
	}

	public String getStudioName() {
		return studioName;
	}

	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public AttendanceType getAttendanceType() {
		return attendanceType;
	}

	public void setAttendanceType(AttendanceType attendanceType) {
		this.attendanceType = attendanceType;
	}

	public Date getAttendanceTime() {
		return attendanceTime;
	}

	public void setAttendanceTime(Date attendanceTime) {
		this.attendanceTime = attendanceTime;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public SignType getSignType() {
		return signType;
	}

	public void setSignType(SignType signType) {
		this.signType = signType;
	}

	public AppealStatus getAppealStatus() {
		return appealStatus;
	}

	public void setAppealStatus(AppealStatus appealStatus) {
		this.appealStatus = appealStatus;
	}

}
