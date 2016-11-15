package com.hx.controller.studio.attendance;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.hx.HXConstants;
import com.hx.controller.base.BaseController;
import com.hx.entity.base.PageBean;
import com.hx.entity.studio.attendance.Attendance;
import com.hx.enums.studio.attendance.AppealStatus;
import com.hx.enums.studio.attendance.AttendanceType;
import com.hx.enums.studio.attendance.SignType;
import com.hx.service.studio.attendance.impl.AttendanceService;
import com.hx.util.CommonUtils;
import com.hx.util.DateUtils;
import com.hx.util.PageUtils;

@Controller
@RequestMapping(value = "/attendance")
public class AttendanceController extends BaseController {

	@Resource
	private AttendanceService attendanceService;

	@RequestMapping("/info")
	public ModelAndView attendanceInfo(@RequestParam(value = "studioCode", required = false) String studioCode,
			@RequestParam(value = "studentCode", required = false) String studentCode,
			@RequestParam(value = "page", required = false) String page,
			@RequestParam(value = "startTime", required = false) String startTime,
			@RequestParam(value = "endTime", required = false) String endTime) {
		if (StringUtils.isEmpty(page)) {
			page = "1";
		}
		PageBean pageBean = new PageBean(Integer.parseInt(page), HXConstants.PAGE_ZISE);
		List<Attendance> list = attendanceService.list(studioCode, studentCode, pageBean,
				DateUtils.convertString2Date(HXConstants.FORMAT_YMDHMS, startTime),
				DateUtils.convertString2Date(HXConstants.FORMAT_YMDHMS, endTime));
		int totalCount = attendanceService.count(studioCode, studentCode,
				DateUtils.convertString2Date(HXConstants.FORMAT_YMDHMS, startTime),
				DateUtils.convertString2Date(HXConstants.FORMAT_YMDHMS, endTime));
		String pageCode = PageUtils.getPagation(request.getContextPath() + "/attendance/info", totalCount,
				Integer.parseInt(page), HXConstants.PAGE_ZISE);
		ModelAndView mav = new ModelAndView();
		mav.addObject("attendanceList", list);
		mav.addObject("pageCode", pageCode);
		mav.setViewName("/studio/attendance/info");
		return mav;
	}

	@RequestMapping("/sign")
	public @ResponseBody JSONObject sign(String studioCode, String studioName, String studentCode, String studentName) {
		Attendance attendance = new Attendance();
		attendance.setId(CommonUtils.getUuid());
		attendance.setStudioCode(studioName);
		attendance.setStudioName(studioName);
		attendance.setStudentCode(studentCode);
		attendance.setStudentName(studentName);
		attendance.setSignType(SignType.SIGN_IN);
		attendance.setAttendanceTime(new Date());
		attendance.setIpAddress("127.0.0.1");
		attendance.setAppealStatus(null);
		attendance.setAttendanceType(AttendanceType.UNNORMAL);
		attendance.setAppealStatus(AppealStatus.UNAPPEAL);
		attendanceService.insert(attendance);
		JSONObject jsonObject = new JSONObject();
		return jsonObject;
	}

}
