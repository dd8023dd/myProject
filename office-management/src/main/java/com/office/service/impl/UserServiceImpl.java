package com.office.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.eclipse.jetty.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.office.dao.EmployeeMapper;
import com.office.dao.UserMapper;
import com.office.entity.Employee;
import com.office.entity.User;
import com.office.entity.UserExample;
import com.office.entity.UserExample.Criteria;
import com.office.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;
	@Resource
	private EmployeeMapper empMapper;
	/*
	 * 模糊查询
	 * @param username start length
	 * @return List<User>
	 * @see com.office.service.UserService#searchUserByPage(java.lang.String, int, int)
	 */
	@Override
	public List<User> searchUserByPage(String username,int start, int length) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		if(StringUtil.isNotBlank(username)) {
			criteria.andUserNameLike("%"+username+"%");
		}
		example.setStart(start);
		example.setEnd(length);
		return userMapper.selectByPage(example);
	}
	
	/*
	 * 添加用户,不可以重名
	 * @param User
	 * @return 1成功  0 or -1失败
	 * @see com.office.service.UserService#insertUser(com.office.entity.User)
	 */
	@Override
	public int insertUser(User user) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(user.getUserName());
		List<User> userList = userMapper.selectByExample(example);
		Employee key = empMapper.selectByPrimaryKey(user.getBindEmp());
		if(StringUtils.isEmpty(key)) {return -2;}
		return (userList == null || userList.size() == 0 )? 
				userMapper.insert(user):-3;
	}
	
	/*
	 * 删除用户
	 * @param id
	 * @return int 
	 * @see com.office.service.UserService#delUser(int)
	 */
	@Override
	public int delUser(int id) {
		return userMapper.deleteByPrimaryKey(id);
	}
	
	/*
	 * 修改用户
	 * @param User
	 * @see com.office.service.UserService#modifyUser(com.office.entity.User)
	 */
	@Override
	public int modifyUser(User user) {
		return userMapper.updateByPrimaryKey(user);
	}
	
	/*
	 * 查询所有用户
	 * @see com.office.service.UserService#searchAllUser()
	 */
	@Override
	public List<User> searchAllUser() {
		return userMapper.selectByExample(null);
	}
	
	/*
	 * 通过id查询用户
	 * @param id
	 * @return User
	 * @see com.office.service.UserService#searchUserById(int)
	 */
	@Override
	public User searchUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public long searchUserCount(String username) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		if(StringUtil.isNotBlank(username)) {
			criteria.andUserNameLike("%"+username+"%");
		}
		return userMapper.countByExample(example);
	}

	/*
	 * 查询所有用户
	 * @see com.office.service.UserService#searchAllCount()
	 */
	@Override
	public long searchAllCount() {
		return userMapper.countByExample(null);
	}

	/* 
	 * @parameter userName
	 * @return User
	 * @see com.office.service.UserService#searchUserByUserName(java.lang.String)
	 */
	@Override
	public User searchUserByUserName(String userName) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(userName);
		List<User> selectByExample = userMapper.selectByExample(example);
		User user = selectByExample.get(0);
		return user ;
	}

}
