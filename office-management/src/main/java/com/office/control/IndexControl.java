package com.office.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangmj
 * @date 2018年3月6日
 */
@Controller
public class IndexControl {

	@RequestMapping("toMain.do")
	public String toMain() {
		return "main";
	}
}
