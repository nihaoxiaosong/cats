package com.hx.controller.background;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hx.controller.base.BaseController;
import com.hx.dto.base.AjaxResult;
import com.hx.entity.background.Product;
import com.hx.enums.backgrount.ProductStatus;
import com.hx.service.background.ProductService;
import com.hx.util.CommonUtils;

@Controller
@RequestMapping(value = "/product")
public class ProductController extends BaseController {

	@Resource
	private ProductService productService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "productName", required = false) String productName,
			@RequestParam(value = "productStatus", required = false) String productStatus) {
		ProductStatus ps = null;
		if (!StringUtils.isEmpty(productStatus)) {
			ps = ProductStatus.getByValue(Integer.valueOf(productStatus));
		}
		ModelAndView mav = new ModelAndView();
		List<Product> list = productService.list(productName, ps);
		mav.addObject("list", list);
		mav.addObject("productName", productName);
		mav.addObject("productStatus", productStatus);
		mav.setViewName("/background/productManager");
		return mav;
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public AjaxResult<Product> insert(@RequestParam(value = "productCode", required = true) String productCode,
			@RequestParam(value = "productName", required = true) String productName,
			@RequestParam(value = "productStatus", required = true) String productStatus) {
		System.out.println(productCode+"==="+productName+"==="+productStatus);
		ProductStatus ps = ProductStatus.getByValue(Integer.valueOf(productStatus));
		Product p = new Product();
		p.setId(CommonUtils.getUuid());
		p.setCode(productCode);
		p.setName(productName);
		p.setProductStatus(ps);
		productService.insert(p);
		AjaxResult<Product> result = new AjaxResult<Product>(true, p);
		return result;
	}

}
