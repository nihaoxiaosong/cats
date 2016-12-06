package com.hx.dao.background;

import java.util.List;

import com.hx.entity.background.Product;
import com.hx.enums.backgrount.ProductStatus;

public interface ProductDao {
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
