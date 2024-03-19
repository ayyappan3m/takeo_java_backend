package com.ums.dao.impl;

import java.util.Scanner;

import com.ums.dao.UserDAO;
import com.ums.model.User;

public class UserDAOImpl implements UserDAO{
	User users[] = new User[10];
	int userCounter = 0;
	Scanner sc = new Scanner(System.in);
	
	public boolean VerifyUserNameAndPassword(String userName, String passWord) {
		if(userCounter > 0) {
			for(User user: users) {
				if(user.getUserName().equals(userName) && user.getPassword().equals(passWord)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void register() {
		users[userCounter] = new User();
		System.out.print("Enter UserId(integer):");
		users[userCounter].setUserId(sc.nextInt());
		System.out.print("Enter First Name:");
		users[userCounter].setFirstName(sc.next());
		System.out.print("Enter Last Name:");
		users[userCounter].setLastName(sc.next());
		System.out.print("Enter Username:");
		users[userCounter].setUserName(sc.next());
		System.out.print("Enter Password:");
		users[userCounter].setPassword(sc.next());
		userCounter++;
	}
	
	public String forgetPassword(String email) {
		for(User user: users) {
			if(user.getEmail().equals(email)) {
				System.out.print("Enter new User Name:");
				user.setUserName(sc.next());
				System.out.print("Enter new password :");
				user.setPassword(sc.next());
				return "success";
			}
		}
		return "failed";
		
	}
}
