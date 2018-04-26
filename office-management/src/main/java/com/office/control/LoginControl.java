package com.office.control;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.eclipse.jetty.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.entity.Employee;
import com.office.entity.User;
import com.office.service.EmployeeService;
import com.office.service.LoginService;
import com.office.service.UserService;
import com.office.util.AjaxResult;

/*
 * 账户密码匹配，登录
 * 和注册的功能
 */
@Controller
public class LoginControl {
	
	@Autowired
	private LoginService l_s;
	@Autowired
	private UserService u_s;
	@Autowired
	private EmployeeService emps;
	
	/*
 	 * @param user_name password
	 */
	@RequestMapping("login.do")
		public String login() {
			return "login";
	}
	
	@RequestMapping("isBirthday.do")
	@ResponseBody
	public AjaxResult isBirthday(HttpServletRequest req) {
		AjaxResult ajaxResult = new AjaxResult();
		int tag = -1;
		Object attribute = req.getSession().getAttribute("emp_id");
		if(!StringUtils.isEmpty(attribute)) {
			int parseInt = Integer.parseInt(attribute.toString());
			Employee employee = emps.searchById(parseInt);
			Date birth = employee.getEmpBirth();
			SimpleDateFormat dfd = new SimpleDateFormat("MM-dd");
			Date now = new Date();
			if(dfd.format(now).equals(dfd.format(birth))){
				tag = 1;
				ajaxResult.setMessage(employee.getEmpName()+",祝您生日快乐");
			}
		}
		ajaxResult.setTag(tag);
		return ajaxResult;
	}
	
	@RequestMapping("checkLogin.do")
	@ResponseBody
	public AjaxResult checkLogin(String username,String password,
			HttpServletRequest request) {
		password = this.base64Encode(password);
		boolean f = l_s.checkLoginService(username , password);
		AjaxResult ajaxResult = new AjaxResult();
		if(f) {
			User searchUserByUserName = u_s.searchUserByUserName(username);
			Integer emp = searchUserByUserName.getBindEmp();
			HttpSession session = request.getSession();
			String id = session.getId();
			session.setAttribute("username", username);
			session.setAttribute("emp_id", emp);
			session.setAttribute("sessionId", id);
		}
		ajaxResult.setTag(f?1:0);//1成功,0失败
		ajaxResult.setMessage(f?"登录成功!":"账号名或密码错误,请重试!");
		return ajaxResult;
	}
	

	/*
	 * 注册
	 * @return boolean  
	 */
	@RequestMapping("register.do")
	public String register() {
		return "register";
	}
	
	@RequestMapping("index.do")
	public String index(HttpServletRequest req){
		//HttpSession session = req.getSession();
		//String id =(String)session.getAttribute("sessionId");
//		if( id != null && id.equals(session.getId())){
//			return "index";
//		}
//		return "login";
		return "index";
	}
	@RequestMapping("doRegister.do")
	@ResponseBody
	public AjaxResult register(User user) {
		int res = -1;
		//验证用户名密码非空
		if(user != null && user.getUserName() != null && user.getUserPassword() != null &&
				!"".equals(user.getUserName()) && !"".equals(user.getUserPassword())) {
				user.setUserPassword(base64Encode(user.getUserPassword()));
				res = u_s.insertUser(user);
			}
		AjaxResult ajaxResult = new AjaxResult();
		ajaxResult.setTag(res);
		if(res == -2) {
			ajaxResult.setMessage("绑定员工不存在!");
		}else if(res == -3) {
			ajaxResult.setMessage("用户名重复,请重试!");
		}else {
			ajaxResult.setMessage(res>0?"注册成功!":"注册失败,请重试!");
		}
		return ajaxResult;
	}
	
	/*
	 * Base64编码
	 */
	public String base64Encode(String password) {
		if(StringUtil.isNotBlank(password)) { 
			byte Bpassword[] = password.getBytes();
			password = Base64.getEncoder().encodeToString(Bpassword);
		}
		return password;
	}
}
