package com.hx.dao.background.impl;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.hx.dao.background.ProductDao;
import com.hx.dao.base.BaseDao;
import com.hx.entity.background.Product;
import com.hx.enums.backgrount.ProductStatus;

@Repository("productDao")
public class ProductDaoImpl extends BaseDao implements ProductDao {

	@Override
	public List<Product> list(String name, ProductStatus productStatus) {
		Query query = new Query();
		if(!StringUtils.isEmpty(name)){
	        query.addCriteria(new Criteria("name").regex(name));
		}
		if(productStatus != null){
	        query.addCriteria(new Criteria("productStatus").is(productStatus.toString()));
		}
		return catsMongoTemplate.find(query, Product.class);
	}

	@Override
	public int count(String name, ProductStatus productStatus) {
		Query query = new Query();
		if(!StringUtils.isEmpty(name)){
	        query.addCriteria(new Criteria("name").regex(name));
		}
		if(productStatus != null){
	        query.addCriteria(new Criteria("productStatus").is(productStatus.toString()));
		}
		return (int) catsMongoTemplate.count(query, Product.class);
	}

	@Override
	public void insert(Product product) {
		catsMongoTemplate.insert(product);
	}

}
