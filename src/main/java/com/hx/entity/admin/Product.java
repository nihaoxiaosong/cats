package com.hx.entity.admin;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.hx.enums.admin.ProductStatus;

/**
 * 产品信息
 * @author song
 * @date 2016年12月6日下午10:14:59
 */
@Document(collection = "product")
public class Product {
	/**
	 * id 主键
	 */
	@Id
	private String id;
	/**
	 * 产品编码
	 */
	private String code;
	/**
	 * 产品名称
	 */
	private String name;
	/**
	 * 产品状态
	 */
	private ProductStatus productStatus;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductStatus getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(ProductStatus productStatus) {
		this.productStatus = productStatus;
	}
	
}
