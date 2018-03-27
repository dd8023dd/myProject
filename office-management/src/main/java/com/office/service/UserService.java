package com.office.service;

import java.util.List;

import com.office.entity.User;

public interface UserService {
	public int insertUser(User user);
	public int delUser(int id);
	public int modifyUser(User user);
	public List<User> searchAllUser();
	public User searchUserById(int id);
	public List<User> searchUserByPage(String username,int start,int length);
	public long searchUserCount(String username);
	public long searchAllCount();
	public User searchUserByUserName(String userName);
}
