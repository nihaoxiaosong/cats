package com.hx.service.admin;

import java.util.List;

import com.hx.entity.admin.Product;
import com.hx.enums.admin.ProductStatus;

public interface ProductService {
	/**
	 * 根据产品名称和状态查询
	 * @param name
	 * @param productStatus
	 * @return
	 */
	List<Product> list(String name, ProductStatus productStatus);
	/**
	 * 计数
	 * @param name
	 * @param productStatus
	 * @return
	 */
	int count(String name, ProductStatus productStatus);
	/**
	 * 新增产品
	 * @param product
	 */
	void insert(Product product);
}