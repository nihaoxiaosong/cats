package com.hx.dao.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * mongoTemplate
 * @author song
 */
public class BaseDao {
	@Autowired
	protected MongoTemplate catsMongoTemplate;
	@Autowired
	protected MongoTemplate cmacMongoTemplate;

}
