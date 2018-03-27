package com.office.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.office.dao.UserMapper;
import com.office.entity.User;
import com.office.entity.UserExample;
import com.office.entity.UserExample.Criteria;
import com.office.service.LoginService;

/*
 * @author zhangmj 2018.02.01
 */
@Service
public class LoginServiceImpl implements LoginService{
	
	@Resource
	private UserMapper userMapper;
	
	/*
	 * 登录
	 * @param username,password
	 * @see com.office.service.LoginService#checkLoginService(java.lang.String, java.lang.String)
	 */
	public boolean checkLoginService(String username ,String password) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(username);
		criteria.andUserPasswordEqualTo(password);
		List<User> user = userMapper.selectByExample(example);
		return (user!= null && user.size()>0 )? true:false;
	}
	
	/*
	 * 注册
	 * @param user
	 * @see com.office.service.LoginService#registerService(com.office.entity.User)
	 */
	public boolean registerService(User user) {return false;
//		int bindEmp = user.getBindEmp();
//		Employee key = empMapper.selectByPrimaryKey(bindEmp);
//		return !StringUtils.isEmpty(key)? 
//				userMapper.insert(user) > 0:false;
	}

}
