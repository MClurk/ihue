package com.ihue.service;

import com.ihue.dao.UserDao;
import com.ihue.iservice.IUserService;

public class UserManager implements IUserService {
	private UserDao userDao;

	@Override
	public Boolean UserLoginCheck(String username, String password) {
		return userDao.LoginCheck(username, password);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
