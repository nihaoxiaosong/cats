package com.hx.dao.school.classes.impl;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.hx.dao.base.BaseDao;
import com.hx.dao.school.classes.ClassDao;
import com.hx.entity.base.PageBean;
import com.hx.entity.school.classes.Classes;
import com.hx.enums.school.classes.ClassStatus;

@Repository("classDao")
public class ClassDaoImpl extends BaseDao implements ClassDao {

	@Override
	public void insert(Classes classes) {
		catsMongoTemplate.insert(classes);
	}

	@Override
	public List<Classes> list(String className, String grade, ClassStatus classStatus, PageBean pageBean) {
		Query query = new Query();
		if(!StringUtils.isEmpty(className)){
	        query.addCriteria(new Criteria("name").regex(className));
		}
		if(!StringUtils.isEmpty(grade)){
	        query.addCriteria(new Criteria("grade").is(grade));
		}
		if(classStatus!=null){
			query.addCriteria(new Criteria("classStatus").is(classStatus.toString()));
		}
		query.skip(pageBean.getStart()).limit(pageBean.getPageSize());
		return catsMongoTemplate.find(query, Classes.class);
	}

	@Override
	public int count(String className, String grade, ClassStatus classStatus) {
		Query query = new Query();
		if(!StringUtils.isEmpty(className)){
	        query.addCriteria(new Criteria("name").regex(className));
		}
		if(!StringUtils.isEmpty(grade)){
	        query.addCriteria(new Criteria("grade").is(grade));
		}
		if(classStatus!=null){
			query.addCriteria(new Criteria("classStatus").is(classStatus.toString()));
		}
		return (int) catsMongoTemplate.count(query, Classes.class);
	}

}
