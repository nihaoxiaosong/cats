package com.hx.dao.background.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hx.dao.background.ProductDao;
import com.hx.dao.base.BaseDao;
import com.hx.entity.background.Product;
import com.hx.enums.backgrount.ProductStatus;

@Repository("productDao")
public class ProductDaoImpl extends BaseDao implements ProductDao {

	@Override
	public List<Product> list(String name, ProductStatus productStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String name, ProductStatus productStatus) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(Product product) {
		catsMongoTemplate.insert(product);
	}

}
