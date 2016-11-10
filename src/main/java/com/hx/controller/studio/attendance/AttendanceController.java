package com.hx.controller.studio.attendance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hx.controller.base.BaseController;

@Controller
@RequestMapping(value = "/attendance")
public class AttendanceController extends BaseController {
	
	@RequestMapping("/info")
	public ModelAndView attendanceInfo(){
		ModelAndView mav = new ModelAndView();
//		mav.addObject("user",user);
		mav.setViewName("/studio/attendance/attendanceInfo");
		return mav;
	}
}
