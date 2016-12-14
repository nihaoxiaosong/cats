package com.hx.service.admin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hx.dao.admin.ProductDao;
import com.hx.entity.admin.Product;
import com.hx.enums.admin.ProductStatus;
import com.hx.service.admin.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductDao productDao;
	
	@Override
	public List<Product> list(String name, ProductStatus productStatus) {
		return productDao.list(name, productStatus);
	}

	@Override
	public int count(String name, ProductStatus productStatus) {
		return productDao.count(name, productStatus);
	}

	@Override
	public void insert(Product product) {
		productDao.insert(product);
	}

	@Override
	public Product getById(String id) {
		return productDao.getById(id);
	}

	@Override
	public Product getByCode(String code) {
		return productDao.getByCode(code);
	}

	@Override
	public void save(Product p) {
		productDao.save(p);
	}

}
