package com.hx.controller.studio.attendance;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.hx.controller.base.BaseController;
import com.hx.entity.studio.attendance.Attendance;
import com.hx.enums.studio.attendance.AttendanceStatus;
import com.hx.enums.studio.attendance.AttendanceType;
import com.hx.service.studio.attendance.impl.AttendanceService;
import com.hx.util.CommonUtils;

@Controller
@RequestMapping(value = "/attendance")
public class AttendanceController extends BaseController {
	
	@Resource
	private AttendanceService attendanceService;
	
	@RequestMapping("/info")
	public ModelAndView attendanceInfo(){
		ModelAndView mav = new ModelAndView();
//		mav.addObject("user",user);
		mav.setViewName("/studio/attendance/attendanceInfo");
		return mav;
	}
	
	@RequestMapping("/sign")
	public @ResponseBody JSONObject sign(String studioCode, String studioName, String studentCode, String studentName){
		Attendance attendance = new Attendance();
		attendance.setId(CommonUtils.getUuid());
		attendance.setStudioCode(studioName);
		attendance.setStudioName(studioName);
		attendance.setStudentCode(studentCode);
		attendance.setStudentName(studentName);
		attendance.setAttendanceType(AttendanceType.SIGN_IN);
		attendance.setAttendanceTime(new Date());
		attendance.setIpAddress("127.0.0.1");
		attendance.setAttendanceStatus(AttendanceStatus.NORMAL);
		attendanceService.insert(attendance);
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}
	
}
