package com.ums.client;

import java.util.Scanner;

import com.ums.dao.impl.UserDAOImpl;

public class UserClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAOImpl userImpl = new UserDAOImpl();
		do {
			System.out.println("1.Login ");
			System.out.println("2.Register ");
			System.out.println("3.Forget Password ");
			System.out.println("4.Exit ");
			System.out.print("Enter your option: ");
			int choice = sc.nextInt();
			if(choice == 4) {
				break;
			}
			switch(choice) {
			case 1: {
				System.out.print("Enter username :");
				String userName = sc.next();
				System.out.print("Enter password :");
				String password = sc.next();
				boolean verified = userImpl.VerifyUserNameAndPassword(userName, password);
				if(verified) {
					System.out.println(userName+" logged in successfully");
				} else {
					System.out.println(userName+" not available");
				}
					break;
					
				
			}
			case 2: userImpl.register();
					break;
			case 3: {
				System.out.print("Enter email to rest password:");
				String email = sc.next();
				String status = userImpl.forgetPassword(email);
				if(status.equals("success")) {
					System.out.println("Successfully reseted...");
				} else {
					System.out.println("Un identified email....");
				}
				break;
			}
			default: System.out.println("Invalid option please try again....\n");
			}
			
		}while(true);
		sc.close();
	}

}
