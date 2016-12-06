package com.hx.service.background.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hx.dao.background.ProductDao;
import com.hx.entity.background.Product;
import com.hx.enums.backgrount.ProductStatus;
import com.hx.service.background.ProductService;

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

}
