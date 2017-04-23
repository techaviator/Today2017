package day10.testng;

import org.testng.annotations.Test;

public class LearnTestNG {
	
	@Test
	public void signIn(){
		System.out.println("Sign In as User");
	}
	
	@Test
	public void sendMail(){
		System.out.println("Send Email");
	}
	
	@Test
	public void signOut(){
		System.out.println("SignOut");
	}

}
