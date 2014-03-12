package com.ihue.user.action;

import com.ihue.iservice.IUserService;
import com.ihue.util.Session;
import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
	private IUserService userManager;
	private String username;
	private String password;

	@Override
	public String execute() throws Exception {
		if (username == null || password == null)
			return Action.INPUT;
		// MD5
		/*
		 * MessageDigest digest = MessageDigest.getInstance("md5"); String md5pw
		 * = HexString.byteArrayToHexString(digest.digest(password
		 * .getBytes()));
		 */
		if (userManager.UserLoginCheck(username, password)) {
			Session.setUser(true);
			return Action.SUCCESS;
		}
		return Action.INPUT;
	}

	public IUserService getUserManager() {
		return userManager;
	}

	public void setUserManager(IUserService userManager) {
		this.userManager = userManager;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
