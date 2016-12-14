package com.hx.dao.admin;

import java.util.List;

import com.hx.entity.admin.Product;
import com.hx.enums.admin.ProductStatus;

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
	/**
	 * 根据 id 查询
	 * @param id
	 * @return
	 */
	Product getById(String id);
	/**
	 * 根据产品编号查询
	 * @param code
	 * @return
	 */
	Product getByCode(String code);
	/**
	 * 修改产品信息
	 * @param p
	 */
	void save(Product p);
}
