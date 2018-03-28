package com.office.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author zhangmj
 * @date 2018年3月28日
 */
@Component
public class GetSessionContext {

	public int getEmpId(HttpServletRequest request) {
		Object attribute = request.getSession().getAttribute("emp_id");
		if(!StringUtils.isEmpty(attribute)) {
			return Integer.parseInt(attribute.toString());
		}
		return -1;
	}
}
