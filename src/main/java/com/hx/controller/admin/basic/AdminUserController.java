package com.hx.controller.admin.basic;

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
import com.hx.dto.base.Pager;
import com.hx.entity.admin.AdminUser;
import com.hx.enums.admin.AdminUserStatus;
import com.hx.service.admin.AdminUserService;
import com.hx.util.CommonUtils;
import com.hx.util.CookieUtils;

/**
 * 用户管理
 * @author song
 * @date 2016年12月11日上午1:47:39
 */
@Controller
@RequestMapping(value = "/adminUser")
public class AdminUserController extends BaseController {
	@Resource
	private AdminUserService adminUserService;
	
	/**
	 * 根据用户姓名,状态和页数分页查询
	 * @param userName
	 * @param adminUserStatus
	 * @param currentPage
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "adminUserName", required = false) String adminUserName,
			@RequestParam(value = "adminUserStatus", required = false) String adminUserStatus,
			@RequestParam(value = "currentPage", required = false) String currentPage) {
		if(StringUtils.isEmpty(currentPage)){
			currentPage = "1";
		}
		AdminUserStatus aus = null;
		if (!StringUtils.isEmpty(adminUserStatus)) {
			aus = AdminUserStatus.getByValue(Integer.valueOf(adminUserStatus));
		}
		CookieUtils.addCookie(HXConstants.CURRENT_URL_ID, HXConstants.ADMIN_USER, 0, response);
		ModelAndView mav = new ModelAndView();
		Pager<AdminUser> pager = adminUserService.pager(adminUserName, aus, (Integer.valueOf(currentPage) - 1) * HXConstants.PAGE_ZISE, HXConstants.PAGE_ZISE);
		mav.addObject("pager", pager);
		mav.addObject("adminUserName", adminUserName);
		mav.addObject("adminUserStatus", adminUserStatus);
		mav.setViewName("/admin/adminUser");
		return mav;
	}
	
	/**
	 * 新增后台用户
	 * @param adminUserCode
	 * @param adminUserName
	 * @param adminUserStatus
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	public AjaxResult<AdminUser> insert(@RequestParam(value = "adminUserCode", required = true) String adminUserCode,
			@RequestParam(value = "adminUserName", required = true) String adminUserName,
			@RequestParam(value = "adminUserStatus", required = true) String adminUserStatus) {
		AdminUserStatus aus = AdminUserStatus.getByValue(Integer.valueOf(adminUserStatus));
		AdminUser au = new AdminUser();
		au.setId(CommonUtils.getUuid());
		au.setCode(adminUserCode);
		au.setName(adminUserName);
		au.setPassword("123456");
		au.setStatus(aus);
		adminUserService.insert(au);
		AjaxResult<AdminUser> result = new AjaxResult<AdminUser>(true, au);
		return result;
	}
}
