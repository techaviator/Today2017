package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnionBank {
	
	public static void main(String[] args) {
		
		//Open firefox
		FirefoxDriver driver1=new FirefoxDriver();
		//FirefoxDriver driver2=new FirefoxDriver();
		//FirefoxDriver driver3=new FirefoxDriver();
		
		//Open URL
		driver1.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		//Enter the loanamount
		//webpage>>findElement>>using a locator Strategy>>perform action
		driver1.findElement(By.id("loanamount")).sendKeys("1000000");
		
		//Enter the interest
		driver1.findElement(By.id("rate")).sendKeys("12");
		//Enter the tenure
		driver1.findElement(By.name("pmonths")).sendKeys("60");
		//Click on the calculate button
		driver1.findElement(By.id("Button1")).click();
		// Get the emi amount from the webapplication 
		String emi=driver1.findElement(By.name("EMI")).getAttribute("value");
		//Display it to the user 
		System.out.println("The emi is "+emi);
		//Close the browser
		//driver1.close();
		driver1.quit();
	}

}
