package com.hx.controller.admin.basic;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hx.HXConstants;
import com.hx.controller.base.BaseController;
import com.hx.dto.base.AjaxResult;
import com.hx.entity.admin.Product;
import com.hx.enums.admin.ProductStatus;
import com.hx.service.admin.ProductService;
import com.hx.util.CommonUtils;
import com.hx.util.CookieUtils;

/**
 * 产品管理
 * @author song
 * @date 2016年12月9日 下午4:23:21
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController extends BaseController {

	@Resource
	private ProductService productService;

	/**
	 * 产品列表
	 * @param productName
	 * @param productStatus
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "productName", required = false) String productName,
			@RequestParam(value = "productStatus", required = false) String productStatus) {
		ProductStatus ps = null;
		if (!StringUtils.isEmpty(productStatus)) {
			ps = ProductStatus.getByValue(Integer.valueOf(productStatus));
		}
		CookieUtils.addCookie(HXConstants.CURRENT_URL_ID, HXConstants.PRODUCT, 0, response);
		ModelAndView mav = new ModelAndView();
		List<Product> list = productService.list(productName, ps);
		mav.addObject("list", list);
		mav.addObject("productName", productName);
		mav.addObject("productStatus", productStatus);
		mav.setViewName("/admin/product");
		return mav;
	}

	/**
	 * 新增产品
	 * @param productCode
	 * @param productName
	 * @param productStatus
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	public AjaxResult<Product> insert(@RequestParam(value = "productCode", required = true) String productCode,
			@RequestParam(value = "productName", required = true) String productName,
			@RequestParam(value = "productStatus", required = true) String productStatus) {
		ProductStatus ps = ProductStatus.getByValue(Integer.valueOf(productStatus));
		Product p = new Product();
		p.setId(CommonUtils.getUuid());
		p.setCode(productCode);
		p.setName(productName);
		p.setStatus(ps);
		productService.insert(p);
		AjaxResult<Product> result = new AjaxResult<Product>(true, p);
		return result;
	}
	
	/**
	 * 根据 id 获取产品信息
	 * @param productId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getById", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	public AjaxResult<Product> getById(@RequestParam(value = "productId", required = true) String productId) {
		Product p = productService.getById(productId);
		AjaxResult<Product> result = new AjaxResult<Product>(true, p);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	public AjaxResult<Product> update(@RequestParam(value = "productCode", required = true) String productCode,
			@RequestParam(value = "productName", required = true) String productName,
			@RequestParam(value = "productStatus", required = true) String productStatus) {
		ProductStatus ps = ProductStatus.getByValue(Integer.valueOf(productStatus));
		Product p = productService.getByCode(productCode);
		p.setCode(productCode);
		p.setName(productName);
		p.setStatus(ps);
		productService.save(p);
		AjaxResult<Product> result = new AjaxResult<Product>(true, p);
		return result;
	}

}
