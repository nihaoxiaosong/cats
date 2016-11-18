package com.hx.entity.school.student;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.hx.enums.school.student.StudentLevel;
import com.hx.enums.school.student.StudentStatus;

/**
 * 学生信息
 * 
 * @author song
 * @date 2016年11月18日下午2:33:25
 *
 */
@Document(collection = "student")
public class Student {
	/**
	 * id主键
	 */
	@Id
	private String id;
	/**
	 * 学号
	 */
	private String code;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 班级Id
	 */
	private String classId;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 入学年份
	 */
	private String year;
	/**
	 * 学生状态
	 */
	private StudentStatus studentStatus;
	/**
	 * 学生级别
	 */
	private StudentLevel studentLevel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public StudentStatus getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(StudentStatus studentStatus) {
		this.studentStatus = studentStatus;
	}

	public StudentLevel getStudentLevel() {
		return studentLevel;
	}

	public void setStudentLevel(StudentLevel studentLevel) {
		this.studentLevel = studentLevel;
	}

}
