package com.hx.entity.school.classes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.hx.enums.school.classes.ClassStatus;

/**
 * 班级信息
 * 
 * @author song
 * @date 2016年11月18日下午2:33:25
 *
 */
@Document(collection = "classes")
public class Classes {
	/**
	 * id主键
	 */
	@Id
	private String id;
	/**
	 * 班级名称
	 */
	private String name;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 学生人数
	 */
	private String studentNum;
	/**
	 * 班级状态
	 */
	private ClassStatus classStatus;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public ClassStatus getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(ClassStatus classStatus) {
		this.classStatus = classStatus;
	}

}
