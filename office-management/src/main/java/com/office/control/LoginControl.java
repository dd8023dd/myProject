package com.office.control;

import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.entity.User;
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
	
	/*
 	 * @param user_name password
	 */
	@RequestMapping("login.do")
		public String login() {
			return "login";
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
		user.setUserPassword(base64Encode(user.getUserPassword()));
		//验证用户名密码非空
		if(user != null && user.getUserName() != null && user.getUserPassword() != null &&
			!"".equals(user.getUserName()) && !"".equals(user.getUserPassword())) {
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
		if(!"".equals(password) && password != null) { 
			byte Bpassword[] = password.getBytes();
			password = Base64.getEncoder().encodeToString(Bpassword);
		}
		return password;
	}
}