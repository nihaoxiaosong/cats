package com.hx.dao.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * mongoTemplate
 * @author song
 * @date 2016年11月14日下午8:34:55
 */
public class BaseDao {
	@Autowired
	protected MongoTemplate catsMongoTemplate;
	@Autowired
	protected MongoTemplate cmacMongoTemplate;

}
