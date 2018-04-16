package com.office.service;

import java.util.List;

import com.office.entity.User;

public interface UserService {
	public int insertUser(User user);
	public int delUser(int id);
	public int modifyUser(User user);
	public List<User> searchAllUser();
	/**
	 * 通过id查询员工
	 * @parameter id
	 * @return User
	 */
	public User searchUserById(int id);
	/**
	 * 搜索员工带分页
	 * @parameter 
	 * @return
	 */
	public List<User> searchUserByPage(String username,int start,int length);
	/**
	 * 查询数量
	 * @parameter 
	 * @return
	 */
	public long searchUserCount(String username);
	public long searchAllCount();
	public User searchUserByUserName(String userName);
}
