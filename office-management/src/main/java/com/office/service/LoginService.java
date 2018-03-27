package com.office.service;

import com.office.entity.User;

public interface LoginService {
	public boolean checkLoginService(String username ,String password);
	public boolean registerService(User user);
}
