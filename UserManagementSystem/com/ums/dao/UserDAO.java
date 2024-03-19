package com.ums.dao;

public interface UserDAO {
	boolean VerifyUserNameAndPassword(String userName, String passWord);
	
	void register();
	
	String forgetPassword(String email);
}
