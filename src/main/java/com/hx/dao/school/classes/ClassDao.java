package com.hx.dao.school.classes;

import java.util.List;

import com.hx.entity.base.PageBean;
import com.hx.entity.school.classes.Class;
import com.hx.enums.school.classes.ClassStatus;

public interface ClassDao {
	/**
	 * 新增班级信息
	 * @param classes
	 */
	void insert(Class classes);
	/**
	 * 根据班级名称,年级,状态分页查询
	 * @param className
	 * @param grade
	 * @param classStatus
	 * @param pageBean
	 * @return
	 */
	List<Class> list(String className, String grade, ClassStatus classStatus, PageBean pageBean);
	/**
	 * 根据班级名称,年级,状态获取总数
	 * @param className
	 * @param grade
	 * @param classStatus
	 * @return
	 */
	int count(String className, String grade, ClassStatus classStatus);
}
