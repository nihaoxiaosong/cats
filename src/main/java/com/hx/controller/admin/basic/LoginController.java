package com.hx.controller.admin.basic;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hx.HXConstants;
import com.hx.controller.base.BaseController;
import com.hx.dto.admin.CurrentUser;
import com.hx.dto.base.AjaxResult;
import com.hx.util.CookieUtils;

/**
 * 登录
 * @author song
 * @date 2016年12月10日下午9:35:14
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController extends BaseController {
	
	@RequestMapping(value = "/index")
	public ModelAndView login(String userName, String password){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/admin/login");
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value = "/submit", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	public AjaxResult<CurrentUser> insert(@RequestParam(value = "userCode", required = true) String userCode,
			@RequestParam(value = "password", required = true) String password) {
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(userCode, password);
		AjaxResult<CurrentUser> result = null;
		try{
			subject.login(token);
			CurrentUser cu = new CurrentUser();
			cu.setUserCode(userCode);
			cu.setUserName(userCode);
			result = new AjaxResult<CurrentUser>(true, cu);
			Session session=subject.getSession();
			session.setAttribute("currentUser", cu);
		}catch(Exception e){
			result = new AjaxResult<CurrentUser>(false, "用户名或密码错误!");
		}
		return result;
	}
	
	@RequestMapping(value = "/home")
	public ModelAndView home(String userName, String password){
		CookieUtils.addCookie(HXConstants.CURRENT_URL_ID, HXConstants.HOME, 0, response);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/admin/home");
		return mav;
	}
	
	@RequestMapping(value = "/logout")
	public ModelAndView logout(){
		Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.removeAttribute("currentUser");
        CookieUtils.removeCookie(request, response, HXConstants.CURRENT_URL_ID);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/admin/login");
		return mav;
	}
}
