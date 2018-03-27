package com.office.control;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.entity.User;
import com.office.service.UserService;
import com.office.util.AjaxResult;
import com.office.util.DataTables;

@Controller
@RequestMapping("user/")
public class UserControl {
	
	@Resource
	private UserService us;
	
	@RequestMapping("addUser.do")
	@ResponseBody
	public AjaxResult addUser(User user) {
		int res = -1;
		AjaxResult ajaxresult = new AjaxResult();
		res = us.insertUser(user);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"添加成功":"添加失败");
		return ajaxresult;
	}
	
	@RequestMapping("toAddUser.do")
	public String toAddUser() {
		return "user/addUser";
	}
	@RequestMapping("toMyself.do")
	public String toMyself() {
		return "user/myselfSetting";
	}
	
	@RequestMapping("searchByUserName.do")
	@ResponseBody
	public AjaxResult searchByUserName(HttpServletRequest req) {
		String userName = (String)req.getSession().getAttribute("username");
		AjaxResult ajaxresult = new AjaxResult();
		if(userName != null) {
			User user = us.searchUserByUserName(userName);
			ajaxresult.setTag((user!=null)?1:-1);
			ajaxresult.setMessage(user);
		}else {
			ajaxresult.setTag(-1);
			ajaxresult.setMessage(null);
		}
		return ajaxresult;
	}
	
	@RequestMapping("delUser.do")
	@ResponseBody
	public AjaxResult delUser(int id) {
		int res = -1;
		AjaxResult ajaxresult = new AjaxResult();
		res = us.delUser(id);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"删除成功":"删除失败");
		return ajaxresult;
	}
	
	@RequestMapping("toModifyUser.do")
	public String toModifyUser() {
		return "user/modifyUser";
	}
	
	@RequestMapping("modifyUser.do")
	@ResponseBody
	public AjaxResult modifyUser(User user) {
		int res = -1;
		AjaxResult ajaxresult = new AjaxResult();
		res = us.modifyUser(user);
		ajaxresult.setTag(res);
		ajaxresult.setMessage(res>0?"修改成功":"修改失败");
		return ajaxresult;
	}
	
	@RequestMapping("userTable.do")
	public String  userTable() {
		return "user/userTable";
	}
	
	@RequestMapping("userPage.do")
	@ResponseBody
	public DataTables userPage(User user,int start,int length) {
		DataTables dt = new DataTables();
		List<User> list = us.searchUserByPage(user.getUserName(), start, length);
		int count =(int)us.searchUserCount(user.getUserName());
		dt.setData(list);
		dt.setRecordsTotal(count);
		dt.setRecordsFiltered(count);
		return dt;
	}
	
	@RequestMapping("userList.do")
	public String userList(HttpServletRequest req){
		List<User> userList = us.searchAllUser();
		long count = us.searchAllCount();
		req.setAttribute("userList", userList);
		req.setAttribute("userCount", count); 
		return "user/userList";
	}
	
	
}
