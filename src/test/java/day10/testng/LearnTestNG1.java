package day10.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnTestNG1 {
	
	@Test (priority = 1)
	public void signIn(){
		//Assert.fail("SignIn has failed");
		System.out.println("Sign In as User");
		
	}
	
	@Test (priority = 2, dependsOnMethods = "signIn")
	public void sendMail(){
		Assert.fail("sendemail has failed");
		System.out.println("Send Email");
	}
	
	@Test (priority = 3 , dependsOnMethods = {"signIn","sendMail"})
	public void signOut(){
		System.out.println("SignOut");
	}

}
